/**
* Alexander Perez Oliva - aperezoliva
* CIS175
* Sep 8, 2022
*/
package model;

/**
 * @author krazy
 *
 */
public class Pizza {
	private String topping;
	private double pizzaCost;
	private int numberOfPizzas;
	
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public double getPizzaCost() {
		return pizzaCost;
	}
	public void setPizzaCost(double pizzaCost) {
		this.pizzaCost = pizzaCost;
	}
	public int getNumberOfPizzas() {
		return numberOfPizzas;
	}
	public void setNumberOfPizzas(int numberOfPizzas) {
		this.numberOfPizzas = numberOfPizzas;
	}
	
	public double calculateCost() {
		return pizzaCost * numberOfPizzas;
	}
	
	public String printOrder() {
		return topping + " Pizza price: $" + pizzaCost + ", number of pizzas: " + numberOfPizzas;
	}
	
	public Pizza() {
		this.topping = "cheese";
		this.pizzaCost = 0;
		this.numberOfPizzas = 0;
	}
	
	public Pizza(String topping, double pizzaCost, int numberOfPizzas) {
		this.topping = topping;
		this.pizzaCost = pizzaCost;
		this.numberOfPizzas = numberOfPizzas;
	}
}
