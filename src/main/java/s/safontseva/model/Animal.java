package s.safontseva.model;

public interface Animal {
    default void eat(Food food) {
        if (food.getClass() == this.getClass()) {
            throw new RuntimeException("I don't support cannibalism!");
        }
    }
}
