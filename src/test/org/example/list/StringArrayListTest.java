package org.example.list;


import org.example.exception.MissingElementException;
import org.example.exception.NullArgumentException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayListTest {

    StringArrayList strings;

    @BeforeEach
    void setUp() {
        strings = new StringArrayList();
        strings.add("123");
        strings.add("test");
        strings.add("TEST123");
    }

    @Test
    void sizeShouldBeThree() {
        assertEquals(3, strings.size());
    }

    @Test
    void shouldBeEmptyList() {
        StringArrayList stringList = new StringArrayList();
        assertTrue(stringList.isEmpty());
    }

    @Test
    void clearTest() {
        strings.clear();
        assertTrue(strings.isEmpty());
    }

    @Test
    void addToStringListTest() {
        String s = strings.addE("hello");
        assertEquals("hello", s);
        assertEquals(4, strings.size());
    }

    @Test
    void addToStringListShouldTrowsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> strings.addE(10, "test"));
    }

    @Test
    void addNullToStringListShouldTrowsException() {
        assertThrows(NullArgumentException.class, () -> strings.addE(null));
    }

    @Test
    void getByFirstIndexShouldReturnTest() {
        assertEquals("test", strings.get(1));
    }

    @Test
    void getByTenIndexShouldThrowsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> strings.get(10));
    }


    @Test
    void shouldSetAndReturnFirstElement() {
        String s = strings.set(0, "some string");
        assertEquals("123", s);
        assertEquals("some string", strings.get(0));
    }

    @Test
    void removeTest() {
        String s = strings.removeE("TEST123");
        assertEquals("TEST123", s);
        assertEquals(2, strings.size());
    }

    @Test
    void removeNonExistStringShouldThrowsException() {
        assertThrows(MissingElementException.class, () -> strings.removeE("str"));
    }

    @Test
    void ShouldReturnTrue() {
        assertTrue(strings.contains("test"));
    }

    @Test
    void ShouldReturnFalse() {
        assertFalse(strings.contains("test232"));
    }

    @Test
    void indexOfShouldReturnZero() {
        assertEquals(0, strings.indexOf("123"));
    }

    @Test
    void indexOfShouldReturnMinusOne() {
        assertEquals(-1, strings.indexOf("hello"));
    }

    @Test
    void lastIndexOfShouldReturnZero() {
        assertEquals(0, strings.lastIndexOf("123"));
    }

}