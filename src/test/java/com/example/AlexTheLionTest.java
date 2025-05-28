package com.example;

import org.junit.Test;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AlexTheLionTest {

    @Mock
    private Feline feline;

    private AlexTheLion alex;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        alex = new AlexTheLion(feline);
    }

    @Test
    public void testGetFriends() {
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() {
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void testDoesHaveMane() {
        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedFood);

        assertEquals(expectedFood, alex.getFood());
        verify(feline, times(1)).eatMeat();
    }
}