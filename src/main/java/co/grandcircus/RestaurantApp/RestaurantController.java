package co.grandcircus.RestaurantApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestaurantController {
	@GetMapping("/homepage")
	public String homepage() {

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
	public String custom() {
		return "custom";
	}

	@PostMapping("/result")
	public String result(@RequestParam(required = false) String splinstruction,
			@RequestParam(required = false) boolean upgrade, @RequestParam String size,
			@RequestParam(required = false) String toppings, Model model) {

		model.addAttribute("toppings", toppings);
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

			if (!toppings.isEmpty() && Integer.parseInt(toppings) > 0) {
				price += ((Integer.parseInt(toppings)) * 0.50);
			}

		} else if (size.equals("Medium")) {
			price += 10;

			if (!toppings.isEmpty() && Integer.parseInt(toppings) > 0) {
				price += ((Integer.parseInt(toppings)) * 1.00);
			}

		} else if (size.equals("Large")) {
			price += 12;
			if (!toppings.isEmpty() && Integer.parseInt(toppings) > 0) {
				price += ((Integer.parseInt(toppings)) * 1.2588888888);
			}
		}
		if (upgrade) {
			price += 2;
		}
		price = Math.round(price * 100.0) / 100.0;
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
