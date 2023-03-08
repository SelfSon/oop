package s.safontseva.model;

public interface Animal<T extends Food> {
    default void eat(T food) {
        if (food.getClass() == this.getClass()) {
            throw new RuntimeException("I don't support cannibalism!");
        }
    }
}
