/*Создать package – cage. Работу продолжаем в нем
Создать интерфейс AnimalCage, который содержит абстрактные методы для:
добавления в клетку животного
передачи корма в клетку
очистку клетки
Создать для сущности Lion отдельный LionCage, реализующий интерфейс AnimalCage. В клетке должна хранится информация о находящихся в ней львах и объем загрязнения клетки.
*/

package cage;

import animals.Animal;
import animalUtils.comparators.AnimalComparator;

import java.util.Collections;
import java.util.List;

/**
 * The cage contains one sort of animal
 */

public interface AnimalCage<T extends Animal> {

    /**
     * Add animal to cage
     */
    void addToCage(T animal);

    /**
     * Feed animals in cage with equal portions
     */
    void giveFood(int weightFood);

    /**
     * Clean the cage
     */
    public abstract void cleaning();

    /**
     * Pick one random animal from cage
     */
    T pickAnimalFromCage();

    /**
     * To avoid bulling young animals you can take older animals out from this cage
     */
    void deleteOlderThan(int limitAge);

    /**
     * @return Current number of animals living in this cage
     */
    int countInCage();

    default void sortByAge(List<T> animalList) {
        Collections.sort(animalList, new AnimalComparator());
    }
}
