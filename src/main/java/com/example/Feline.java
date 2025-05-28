package com.example;

import java.util.List;

public class Feline implements Animal, Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public List<String> getFood(String animalKind) throws Exception {
        if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public String getFamily() {
        return "Кошачьи";
    }
}