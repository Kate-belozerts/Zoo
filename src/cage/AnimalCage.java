/*Создать package – cage. Работу продолжаем в нем
Создать интерфейс AnimalCage, который содержит абстрактные методы для:
добавления в клетку животного
передачи корма в клетку
очистку клетки
Создать для сущности Lion отдельный LionCage, реализующий интерфейс AnimalCage. В клетке должна хранится информация о находящихся в ней львах и объем загрязнения клетки.
*/

package cage;

import animals.Animal;
import animals.comparators.AnimalComparator;

import java.util.Collections;
import java.util.List;


public interface AnimalCage<T extends Animal> {


    void addToCage(T animal);

    void giveFood(int weightFood);

    public abstract void cleaning();

    abstract T pickAnimalFromCage();

    void deleteOlderThan(int limitAge);
    int countInCage();

    default void sortByAge(List<T> animalList){
        Collections.sort(animalList, new AnimalComparator());
    }
}
