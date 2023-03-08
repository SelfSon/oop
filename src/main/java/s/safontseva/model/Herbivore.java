package s.safontseva.model;

public interface Herbivore extends Animal {
    @Override
    default void eat(Food food) {
        Animal.super.eat(food);
        if (food instanceof Plant) {
            System.out.println(this.getClass().getSimpleName() + " is eating " + food.getClass().getSimpleName());
        } else {
            throw new RuntimeException(this.getClass().getSimpleName() + " can't eat this food. I eat only plants");
        }
    }
}
