package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;


public class ItemTest {
	
	Item Item;
	Long id = (long) 1;
	String Name = "Shoe";
	Double price = 100.99;
	
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Item.class).verify();
	}
	
	@Test
	public void oneConstructor() {
		Item = new Item(id, Name, price);
	}
	
	@Test
	public void twoConstructor() {
		Item = new Item(Name, price);
	}

	
	@Test
	public void testGetName() {
		Item = new Item(id, Name, price);
		assertEquals(Name, Item.getName());
	}
	
	
	
	@Test
	public void testSetId() {
		Item = new Item(id, Name, price);
		Item.setId((long)6);
		assertEquals(6, Item.getId(), 6);
	}
	
	@Test
	public void testSetName() {
		Item = new Item(id, Name, price);
		Item.setName("Apple Charger");
		assertEquals("Apple Charger", Item.getName());
		
	}
	
	@Test
	public void testSetPrice() {
		Item = new Item(id, Name, price);
		Item.setPrice((double) 200);
		assertEquals(200, Item.getPrice(), 200);
	}
	
	

}
