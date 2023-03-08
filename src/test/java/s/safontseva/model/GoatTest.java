package s.safontseva.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoatTest {
    @Test
    void shouldNotEatSelfSimilar() {
        assertThrows(RuntimeException.class, () -> new Goat().eat(new Goat()), "Animals can't eat their own kind!");
    }

    @Test
    void shouldNotEatFlesh() {
        assertThrows(RuntimeException.class, () -> new Goat().eat(new Cow()), "Herbivores do not eat flesh!");
    }

    @Test
    void shouldEatPlantFood() {
        new Goat().eat(new Grass());
    }
}