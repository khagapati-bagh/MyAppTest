package com.ofss;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ProductTest {
	private Product product = new Product();

	@Before
	public void setUp() throws Exception {
		product = new Product("Phone", "Iphone1");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Product expected = new Product("Phone", "Iphone1");
		Assert.assertEquals(expected.getpName(), product.getpName());
		Assert.assertEquals(expected.getpId(), product.getpId());
	}

}
