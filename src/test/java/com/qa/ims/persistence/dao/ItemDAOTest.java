package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class ItemDAOTest {

	
private final ItemDAO DAO = new ItemDAO();
@Before
public void setup() {
	DBUtils.connect();
	DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	
}

@Test
public void testCreate() {
	final Item created = new Item(2L, "Jacket", 999);
	assertEquals(created, DAO.create(created));
}

@Test
public void testReadLatest() {
	assertEquals(new Item(1L, "Shoe", 100), DAO.readLatest());
}

@Test
public void testRead() {
	final long ID = 1L;
	assertEquals(new Item(ID, "Shoe", 100), DAO.read(ID));
}

@Test
public void testUpdate() {
	final Item updated = new Item(1L, "Shoe", 100);
	assertEquals(updated, DAO.update(updated));

}

@Test
public void testDelete() {
	assertEquals(1, DAO.delete(1));
}
	

	@Test
	public void testReadAll() {
		List<Item> expected = new ArrayList<>();
		expected.add(new Item(1L, "Shoe", 100));
		assertEquals(expected, DAO.readAll());
	}
			
	
}
