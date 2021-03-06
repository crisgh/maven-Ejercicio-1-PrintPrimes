package org.urjc.isi.travis;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.io.*;
import java.util.*;
import org.junit.*;


public class PrintPrimesTest{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void Init() {
        System.setOut(new PrintStream(outContent));
	}
	@Test					 
	public void Apartado3() {
		PrintPrimes.printPrimes(1);
		assertEquals("Prime: 2\n", outContent.toString());
	}
	@Test
	public void Apartado7_1() {
		PrintPrimes.printPrimes(3);
		assertEquals("Prime: 2\nPrime: 3\nPrime: 5\n", outContent.toString());
	}
	
	@Test
	public void Apartado7_2() {
		PrintPrimes.printPrimes(0);
		assertEquals("", outContent.toString());
	}
}
