/**
* Alexander Perez Oliva - aperezoliva
* CIS175
* Sep 8, 2022
*/
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Pizza;

/**
 * @author krazy
 *
 */
public class PizzaTestLogic1 {
	Pizza pizzaTest = new Pizza("Pepperoni", 3.25, 1);
	Pizza emptyOrder = new Pizza();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrderPrice() {
		double pizzaPrice = pizzaTest.getPizzaCost() * pizzaTest.getNumberOfPizzas();
		assertEquals(pizzaTest.getPizzaCost(), pizzaPrice, 0.001);
	}
	
	@Test
	public void testNotNullOnEmptyOrder() {
		assertNotNull(emptyOrder);
	}

}
