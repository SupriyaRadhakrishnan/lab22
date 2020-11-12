package co.grandcircus.RestaurantApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestaurantController {
	@GetMapping("/homepage")
	public String homepage(Model model) {
		 List<SpecialityPizza> sp = SpecialityPizza.populatePizzas();
		 model.addAttribute("sp",sp);
		return "homepage";
	}

	@GetMapping("/review")
	public String review() {

		return "review";
	}

	@GetMapping("/speciality")
	public String speciality(@RequestParam String name, @RequestParam String price, Model model) {
				
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		return "speciality";
	}

	@GetMapping("/custom")
	public String custom(Model model) {
		List<String> pizzaTopping=new ArrayList<>();
		pizzaTopping.add("Pepperoni");
		pizzaTopping.add("Sausage");
		pizzaTopping.add("Chicken");
		pizzaTopping.add("Mushroom");
		pizzaTopping.add("Olive");
		pizzaTopping.add("Green Pepper");
		pizzaTopping.add("Onion");
		pizzaTopping.add("Banana Pepper");
		pizzaTopping.add("Anchovies");
		pizzaTopping.add("Pineapple");
		
		model.addAttribute("pizzaTopping",pizzaTopping);
		return "custom";
	}

	@PostMapping("/result")
	public String result(@RequestParam(required = false) String splinstruction,
			@RequestParam(required = false) boolean upgrade, @RequestParam String size,@RequestParam(required=false) String[] selected, @RequestParam(value = "selectedtopping", required = false) List<String> selectedtopping, Model model) {

	
		model.addAttribute("toppings", selectedtopping.size());
		model.addAttribute("selectedtopping",selectedtopping);      
		
		model.addAttribute("size", size);
		if (upgrade)
			model.addAttribute("upgrade", "Yes");
		else
			model.addAttribute("upgrade", "No");
		if (!splinstruction.isEmpty())
			model.addAttribute("splinstruction", splinstruction);
		double price = 0;

		if (size.equals("Small")) {
			price += 7;

			if (selectedtopping.size()>0) {
				price += (selectedtopping.size() * 0.50);
			}

		} else if (size.equals("Medium")) {
			price += 10;

			if (selectedtopping.size() > 0) {
				price += (selectedtopping.size() * 1.00);
			}

		} else if (size.equals("Large")) {
			price += 12;
			if (selectedtopping.size() >0) {
				price += (selectedtopping.size() * 1.25);
			}
		}
		if (upgrade) {
			price += 2;
		}
		//price = Math.round(price * 100.0) / 100.0;
		model.addAttribute("price", price);

		return "result";
	}

	@PostMapping("/reviewconfirmation")
	public String result(@RequestParam(required = false) String comment, @RequestParam String yourname,
			@RequestParam String rating, Model model) {

		model.addAttribute("rating", rating);
		model.addAttribute("yourname", yourname);
		if (!comment.isEmpty())
			model.addAttribute("comment", comment);
		return "reviewconfirmation";
	}
}
