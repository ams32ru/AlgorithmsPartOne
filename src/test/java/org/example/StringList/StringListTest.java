package org.example.StringList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {
    private  StringList stringList;


    @BeforeEach
    void setUp() {
        stringList = new StringList();
        stringList.add("Test1");
        stringList.add("Test2");
        stringList.add("Test3");
    }
    @Test
    void testAdd() {
        stringList.add("Test4");
        assertArrayEquals(new String[]{"Test1", "Test2", "Test3", "Test4"}, stringList.toArray());

    }

    @Test
    void testAddOnIndeks() {
        stringList.add(3, "Test5");
        assertArrayEquals(new String[]{"Test1", "Test2", "Test3", "Test5"}, stringList.toArray());
    }

    @Test
    void set() {
        stringList.set(2, "Test2");
        assertArrayEquals(new String[]{"Test1","Test2","Test2"},stringList.toArray());
    }

    @Test
    void remove() {
        stringList.remove(2);
        assertArrayEquals(new String[]{"Test1", "Test2"}, stringList.toArray());
    }

    @Test
    void contains() {
        String test = "NoValid";
        assertFalse(stringList.contains(test));
    }

    @Test
    void indexOf() {
        String test = "Test1";
        assertEquals(0,stringList.indexOf(test));
    }

    @Test
    void lastIndexOf() {
        String test = "Test3";
        assertEquals(2,stringList.indexOf(test));
    }

    @Test
    void get() {
        assertEquals("Test1",stringList.get(0));
    }

    @Test
    void testEquals() {
    }

    @Test
    void size() {
        assertEquals(3,stringList.size());
    }

    @Test
    void isEmpty() {
        stringList.clear();
        assertTrue(stringList.isEmpty());
    }

    @Test
    void clear() {
        stringList.clear();
        assertArrayEquals(new String[]{}, stringList.toArray());
    }

    @Test
    void toArray() {
        assertArrayEquals(new String[]{"Test1", "Test2", "Test3"}, stringList.toArray());
    }
}