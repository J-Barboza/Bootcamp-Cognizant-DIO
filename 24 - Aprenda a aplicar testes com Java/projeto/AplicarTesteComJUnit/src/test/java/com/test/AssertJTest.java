package com.test;

import static org.junit.Assert.assertThat;

import org.junit.Test;


public class AssertJTest {
	
	@Test
	public void checkEquality() {
		Person person= new Person("Barrack", "Obama");
		Person personClone = new Person("Barrack", "Obama");
	    
		assertThat(person).isEqualTo(personClone);
	}

}