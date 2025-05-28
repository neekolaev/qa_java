package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void testGetFoodPredator() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.getFood("Хищник"));
    }

    @Test
    public void testGetFoodHerbivore() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, feline.getFood("Травоядное"));
    }

    @Test(expected = Exception.class)
    public void testGetFoodUnknown() throws Exception {
        Feline feline = new Feline();
        feline.getFood("Неизвестное");
    }

    @Test
    public void testGetKittensDefault() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithCount() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}