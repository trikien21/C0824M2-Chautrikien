package SS7;
import SS7.animal.Animal;
import SS7.animal.Tiger;
import SS7.animal.Chicken;
import SS7.edible.Edible;
import SS7.fruit.Fruit;
import SS7.fruit.Orange;
import SS7.fruit.Apple;

public class AbstractAndInterfaceTests {
    public static void main(String[] args){
        Animal[] animals= new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for(Animal animal: animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edibler= (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits= new Fruit[2];
        fruits[0]= new Orange();
        fruits[1]= new Apple();
        for(Fruit fruit: fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
