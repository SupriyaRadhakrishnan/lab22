package co.grandcircus.RestaurantApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	    String[] pizzaTopping= {"Pepperoni","Sausage","Chicken","Mushroom","Olive","Green Pepper","Onion","Banana Pepper","Anchovies","Pineapple"};	
		model.addAttribute("pizzaTopping",pizzaTopping);
		return "custom";
	}
	

	@RequestMapping(value= "/result" ,method = {RequestMethod.GET,RequestMethod.POST})
	public String result(@RequestParam(required = false) String splinstruction,
			@RequestParam(required = false) boolean upgrade, @RequestParam String size,@RequestParam(required=false) String[] selected, @RequestParam(defaultValue = "", value = "selectedtopping", required = false) String[] selectedtopping, Model model) {

	
		model.addAttribute("toppings", selectedtopping.length);

		model.addAttribute("selectedtopping",selectedtopping);      
		//System.out.println(selectedtopping[0]);
		//System.out.println(selectedtopping.length);
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

			if (selectedtopping.length > 0) {
				price += (selectedtopping.length * 0.50);
			}

		} else if (size.equals("Medium")) {
			price += 10;

			if (selectedtopping.length > 0) {
				price += (selectedtopping.length * 1.00);
			}

		} else if (size.equals("Large")) {
			price += 12;
			if (selectedtopping.length >0) {
				price += (selectedtopping.length * 1.25);
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
