package s.safontseva.model;

public interface Herbivore extends Animal {
    @Override
    default void eat(Food food) {
        Animal.super.eat(food);
        if (food instanceof Plant) {
            System.out.println(this.getClass().getName() + " is eating " + food.getClass().getName());
        } else {
            throw new RuntimeException(this.getClass().getName() + " can't eat this food. I eat only plants");
        }
    }
}
