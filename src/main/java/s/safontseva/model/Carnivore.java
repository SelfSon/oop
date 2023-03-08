package s.safontseva.model;

public interface Carnivore extends Animal {
    @Override
    default void eat(Food food) {
        Animal.super.eat(food);
        if (food instanceof Animal) {
            System.out.println(this.getClass().getSimpleName() + " is eating " + food.getClass().getSimpleName());
        } else {
            throw new RuntimeException(this.getClass().getSimpleName() + " can't eat this food. I eat only flesh");
        }
    }
}
