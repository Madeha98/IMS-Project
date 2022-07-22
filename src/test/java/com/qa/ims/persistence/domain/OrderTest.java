package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import nl.jqno.equalsverifier.EqualsVerifier;

public class OrderTest {
	
	Order order;
	Item item;
	Long customerId = (long) 1;
	Long id = (long) 2;
	String date = "2022/10/25";
	List<Item> orderItems = new ArrayList<Item>();
	
	
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Order.class).verify();
	}
	
	@Test
	public void toStringTest() {
		order = new Order(id,customerId, date, orderItems);
		assertEquals("Order [id=" + id + ", customerId=" + customerId + ", date=" + date + ", orderItems="
				+ orderItems,order.toString());

}
	
	@Test
	public void constructorOne() {
		order = new Order(id, customerId, date, orderItems);
	}

	@Test
	public void constructorTwo() {
		order = new Order(id, customerId, date, orderItems);
	}
	
	@Test
	public void ContructorThree() {
		order = new Order(customerId, date);
	}


	@Test
	public void testGetCustomerId() {
		order = new Order(id, customerId, date, orderItems);
		assertEquals(customerId, order.getCustomer_id());
	}
	

	@Test
	public void testGetid() {
		order = new Order(id, customerId, date, orderItems);
		assertEquals(id, order.getId());
	}
	
	@Test
	public void testGetOrderDate() {
		order = new Order(id, customerId, date, orderItems);
		assertEquals(date, order.getDate());
	}

	@Test
	public void testGetOrderItems() {
		order = new Order(id, customerId, date, orderItems);
		assertEquals(orderItems, order.getOrderItems());
	}

	@Test
	public void testSetCustomerId() {
		order = new Order(id, customerId, date, orderItems);
		order.setCustomer_id((long) 12);
		assertEquals((long) 12, order.getCustomer_id(), 499);

	}

	@Test
	public void testSetOrderId() {
		order = new Order(id, customerId, date, orderItems);
		order.setId((long) 12);
		assertEquals((long) 12, order.getId(), 499);

	}
	
	@Test
	public void testSetOrderDate() {
		order = new Order(id, customerId, date, orderItems);
		order.setDate("2022/07/18");
		assertEquals("2022/07/18", order.getDate());

	}

	@Test
	public void testSetOrderItems() {
		order = new Order(id, customerId, date, orderItems);
		order.setOrderItems(orderItems);
		assertEquals(orderItems, order.getOrderItems());

	}
	
	@Test
	public void testHashCodeAndEquals() {
		Order a = new Order((long) 23, "2022/07/08");
		Order b = new Order((long) 22, "2022/07/05");
		
		Assert.assertFalse(a.equals(b) && b.equals(a));
		Assert.assertFalse(a.hashCode() == b.hashCode());
	}
}
