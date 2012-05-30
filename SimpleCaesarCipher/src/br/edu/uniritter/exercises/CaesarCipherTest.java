package br.edu.uniritter.exercises;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaesarCipherTest {

	private CaesarCipher cipher;
	
	@Before
	public void setUp() throws Exception {
		cipher = new CaesarCipher();
	}

	@Test
	public void test1() {
		assertEquals("AiB", cipher.encrypt("ZhA", 1));
	}
	
	@Test
	public void test2() {
		assertEquals("B", cipher.encrypt("A", 1));
	}
	
	@Test
	public void test3() {
		assertEquals("i", cipher.encrypt("h", 1));		
	}
	
	@Test
	public void test4() {
		assertEquals("B", cipher.encrypt("Z", 2));
	}
	
}
