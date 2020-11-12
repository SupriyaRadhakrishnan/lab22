package co.grandcircus.RestaurantApp;

import java.util.ArrayList;
import java.util.List;

public class SpecialityPizza {

	public static List<SpecialityPizza> sp = populatePizzas();
	private String name;
	private double price;
	private String img;

	public SpecialityPizza(String name, double price,String img) {
		super();
		this.img=img;
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public static List<SpecialityPizza> populatePizzas()
	{
		List<SpecialityPizza> sp = new ArrayList<SpecialityPizza>();
				
			sp.add(new SpecialityPizza("Chicken Cordon Bleu Pizza",18.9,"ChickenCordon.jpg"));
			sp.add(new SpecialityPizza("Berry Patch Brownie Pizza",17,"BerryPatch.jpg"));
			sp.add(new SpecialityPizza("Refried Bean Taco Pizza",22.23,"RefriedBean.jpg"));
			sp.add(new SpecialityPizza("Bacon Breakfast Pizza",15,"BaconBreakfast.jpg"));
			sp.add(new SpecialityPizza("Baked Potato Pizza",13,"BakedPotato.jpg"));
			sp.add(new SpecialityPizza("Fast Philly Cheesesteak Pizza",14.32,"FastPhilly.jpg"));
			sp.add(new SpecialityPizza("Shrimp And Crab Pizza",24.33,"ShrimpCrab.jpg"));
			sp.add(new SpecialityPizza("Dill Pickle Hamburger Pizza",20,"DillPickle.jpg"));
			sp.add(new SpecialityPizza("Spinach and Artichoke Pizza",12,"SpinachArtichoke.jpg"));
			sp.add(new SpecialityPizza("Greek Style Pizza",18.8,"GreekStyle.jpg"));
		return sp;
		
	}

}
