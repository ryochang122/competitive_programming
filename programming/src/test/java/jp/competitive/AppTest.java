package jp.competitive;

import static org.junit.Assert.assertEquals;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
    private PrintStream _saved;
    private ByteArrayOutputStream _actual;
    private ByteArrayOutputStream _expected;
    private PrintStream _out;

    @Before
    public void setUp() {
        _saved = System.out;
        _actual = new ByteArrayOutputStream();
        _expected = new ByteArrayOutputStream();
        System.setOut(new PrintStream(new BufferedOutputStream(_actual)));
        _out = new PrintStream(new BufferedOutputStream(_expected));
    }

    @After
    public void tearDown() {
        System.setOut(_saved);
    }

    @Test
    public void test1() {
        // Expected
        _out.println("4");
        _out.flush();

        // Actual
        App.logic(1, 0);
        System.out.flush();

        // Compare
        assertEquals(_expected.toString(), _actual.toString());
    }

    @Test
    public void test2() {
        // Expected
        _out.println("213");
        _out.flush();

        // Actual
        App.logic(10, 10);
        System.out.flush();

        // Compare
        assertEquals(_expected.toString(), _actual.toString());
    }

    @Test
    public void test3() {
        // Expected
        _out.println("2471");
        _out.flush();

        // Actual
        App.logic(30, 100);
        System.out.flush();

        // Compare
        assertEquals(_expected.toString(), _actual.toString());
    }
}
