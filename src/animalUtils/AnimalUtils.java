package animalUtils;

import animals.Animal;
import animals.comparators.AnimalComparator;

import java.util.Collections;
import java.util.List;

public class AnimalUtils{
       public static <T extends Animal> List<T> sortAnimals(List<T> animalList){
           Collections.sort(animalList, new AnimalComparator());
           return animalList;
       }
}
