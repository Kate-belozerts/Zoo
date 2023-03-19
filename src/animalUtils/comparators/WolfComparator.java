/*Создать класс WolfComparator, реализующий сравнение волков по их весу и возрасту.*/
package animalUtils.comparators;

import animals.Wolf;

import java.util.Comparator;

/**
 * Compare wolves with their age, then with their weight
 */
public class WolfComparator implements Comparator<Wolf> {
    @Override
    public int compare(Wolf o1, Wolf o2) {
        if (o1.getAge() == o2.getAge()) {
            return Integer.compare(o1.getWeight(), o2.getWeight());
        } else return Integer.compare(o1.getAge(), o2.getAge());
    }

    public Comparator<Wolf> comparing() {
        return Comparator.comparing(Wolf::getAge)
                .thenComparing(Wolf::getWeight);
    }
}


//        Comparator<Wolf> comparator = // todo (функциональные интерфейсы и стримы) был в WolfCage. Оставила код ниже для себя)
//                Comparator.comparing(Wolf::getAge)
//                        .thenComparing(Wolf::getWeight);
//        return comparator;
////        Collections.sort(wolves, comparator);
