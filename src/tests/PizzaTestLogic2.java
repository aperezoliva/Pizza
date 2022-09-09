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
public class PizzaTestLogic2 {
	Pizza orderOne = new Pizza("Pepperoni", 3.25, 3);
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testOrderString() {
		String orderList = "Pepperoni Pizza price: $3.25, number of pizzas: 3";
		assertEquals(orderList, orderOne.printOrder());
	}
	
	@Test
	public void orderLength() {
		String orderList = "Pepperoni Pizza price: $3.25, number of pizzas: 3";
		int orderLength = orderList.length();
		assertTrue(orderLength == orderOne.printOrder().length());
	}

}
