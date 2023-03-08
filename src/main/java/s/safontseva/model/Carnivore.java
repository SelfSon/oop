package s.safontseva.model;

public interface Carnivore extends Animal {
    @Override
    default void eat(Food food) {
        Animal.super.eat(food);
        if (food instanceof Animal) {
            System.out.println(this.getClass().getName() + " is eating " + food.getClass().getName());
        } else {
            throw new RuntimeException(this.getClass().getName() + " can't eat this food. I eat only flesh");
        }
    }
}
