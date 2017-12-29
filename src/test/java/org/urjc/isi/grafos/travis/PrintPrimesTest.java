package org.urjc.isi.travis;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
}
