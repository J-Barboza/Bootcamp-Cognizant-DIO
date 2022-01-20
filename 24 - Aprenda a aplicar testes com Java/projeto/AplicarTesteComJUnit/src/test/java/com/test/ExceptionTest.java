package com.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

	
	@Test(expected = IndexOutOfBoundsException.class) 
	public void empty() { 
	     List<String> lista = new ArrayList<String>();
	     //lista.add("Barboza");  //For�ando erro
	     lista.get(0); 
	}
	

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
	    List<Object> list = new ArrayList<Object>();
	 
	    thrown.expect(IndexOutOfBoundsException.class);
	    thrown.expectMessage("Index 0 out of bounds for length 0"); // mensagem diferente da mostrada pelo professor
	    list.get(0); 
	}
	
	
	@Test
	public void testExceptionMessage() {
	    try {
	        new ArrayList<Object>().get(0);
	        fail("Esperado que IndexOutOfBoundsException seja lan�ada");
	    } catch (IndexOutOfBoundsException ex) {
	        assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0" // mensagem diferente da mostrada pelo professor
	        		+ ""));
	    }
	}
	
}