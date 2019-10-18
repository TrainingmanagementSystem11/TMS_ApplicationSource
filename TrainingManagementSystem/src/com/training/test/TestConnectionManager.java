package com.training.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.virtusa.integrate.ConnectionManager;





public class TestConnectionManager {

	@Test
	public void test() {
		try {
			Connection connection=ConnectionManager.
					openConnection();
			assertEquals(true,connection!=null);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			assertTrue(false);
		}
	}

}
