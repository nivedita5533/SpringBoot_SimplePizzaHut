package com.example.demo;

public class Pizza {
	
	private String pizzasize;
	private int pizzasizecost;
	private int pizzasizeqty;
	
	private String colddrinks;
	public String getColddrinks() {
		return colddrinks;
	}
	public void setColddrinks(String colddrinks) {
		this.colddrinks = colddrinks;
	}
	public int getColddrinkscost() {
		return colddrinkscost;
	}
	public void setColddrinkscost(int colddrinkscost) {
		this.colddrinkscost = colddrinkscost;
	}
	public int getColddrinksqty() {
		return colddrinksqty;
	}
	public void setColddrinksqty(int colddrinksqty) {
		this.colddrinksqty = colddrinksqty;
	}

	private int colddrinkscost;
	private int colddrinksqty;
	
	private String pizzatoppings;
	public String getPizzatoppings() {
		return pizzatoppings;
	}
	public void setPizzatoppings(String pizzatoppings) {
		this.pizzatoppings = pizzatoppings;
	}
	public int getPizzatoppingscost() {
		return pizzatoppingscost;
	}
	public void setPizzatoppingscost(int pizzatoppingscost) {
		this.pizzatoppingscost = pizzatoppingscost;
	}
	public int getPizzatoppingqty() {
		return pizzatoppingqty;
	}
	public void setPizzatoppingqty(int pizzatoppingqty) {
		this.pizzatoppingqty = pizzatoppingqty;
	}

	private int pizzatoppingscost;
	private int pizzatoppingqty;
	
	public String getPizzasize() {
		return pizzasize;
	}
	public void setPizzasize(String pizzasize) {
		this.pizzasize = pizzasize;
	}
	public int getPizzasizecost() {
		return pizzasizecost;
	}
	public void setPizzasizecost(int pizzasizecost) {
		this.pizzasizecost = pizzasizecost;
	}
	public int getPizzasizeqty() {
		return pizzasizeqty;
	}
	public void setPizzasizeqty(int pizzasizeqty) {
		this.pizzasizeqty = pizzasizeqty;
	}
	
	

	@Override
	public String toString() {
		return "Pizza [pizzasize=" + pizzasize + ", pizzasizecost=" + pizzasizecost + ", pizzasizeqty=" + pizzasizeqty
				+ ", colddrinks=" + colddrinks + ", colddrinkscost=" + colddrinkscost + ", colddrinksqty="
				+ colddrinksqty + ", pizzatoppings=" + pizzatoppings + ", pizzatoppingscost=" + pizzatoppingscost
				+ ", pizzatoppingqty=" + pizzatoppingqty + "]";
	}



	
	public int fun() {
		
		return (pizzasizecost*pizzasizeqty)+ (pizzatoppingscost*pizzatoppingqty)+(colddrinkscost*colddrinksqty);
	}

}
