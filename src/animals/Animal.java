/*
    Создать package – animals. Работу продолжаем в нем
    Создать абстрактный класс Animal с полями год рождения, вес, кол-во конечностей
    Реализовать наследников класса Animal классы Lion и Snake, добавив к
    ним по одному доп. полю объем гривы и длина тела соответственно.
    *4.  Реализовать метод  кормления void feed(int foodWeight), после которого вес животного увеличивается.

     */

package animals;

public abstract class Animal {

    protected int countExtremity;
    protected int age;
    protected int weight;

    public Animal(int countExtremity, int age, int weight) {
        this.countExtremity = countExtremity;
        this.age = age;
        this.weight = weight;
    }

    public abstract int getMaxWeight();

    public abstract String getType();

    public void feed(int foodWeight) {
        if (this.weight + foodWeight <= getMaxWeight()) {
            this.weight += foodWeight;
        } else {
            System.out.println("Животное слишком потолстело, убавьте порцию");
        }
    }


    public int getCountExtremity() {
        return countExtremity;
    }

    public void setCountExtremity(int countExtremity) {
        this.countExtremity = countExtremity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
