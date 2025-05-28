package com.example;

import java.util.List;

public interface Animal {
    List<String> getFood(String animalKind) throws Exception;
}