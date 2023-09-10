package practise2.Task5;

import java.util.ArrayList;
import java.util.List;

public class DogNursery {
    private final List<Dog> dogList = new ArrayList<>();

    public void addDog(Dog dog) {
        dogList.add(dog);
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public static void main(String[] args) {
        DogNursery nursery = new DogNursery();

        Dog dog1 = new Dog("Снежок", 3);
        Dog dog2 = new Dog("Бублик", 5);
        Dog dog3 = new Dog("Белка", 2);

        nursery.addDog(dog1);
        nursery.addDog(dog2);
        nursery.addDog(dog3);

        List<Dog> dogList = nursery.getDogList();
        for (Dog dog : dogList) {
            System.out.println(dog.toString());
            System.out.println("Человеческий возраст: " + dog.getHumanAge());
        }
    }
}
