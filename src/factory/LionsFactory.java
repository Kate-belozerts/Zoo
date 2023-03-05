/*Создать package – factory. Работу продолжаем в нем
Создать класс LionsFactory
Реализовать в нем статический метод для создания коллекции львов с определенным кол-вом в ней:
ArrayList<Lion> createLions (int lionCount)
В методе main создать коллекцию львов и положить её содержимое в клетку. Посмотрите
состояние львов, покормите львов в клетке, проверьте изменился ли у них вес.
 */

package factory;

import animals.Lion;

import java.util.ArrayList;
import java.util.Random;

public class LionsFactory {
    static public ArrayList<Lion> createLions(int lionCount) {
        ArrayList<Lion> lionInCage = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++) {
            Lion lion = new Lion(new Random().nextInt(2, 15), new Random().nextInt(200),
                    new Random().nextInt(50), 4);
            lionInCage.add(lion);
        }
        return lionInCage;
    }
}
