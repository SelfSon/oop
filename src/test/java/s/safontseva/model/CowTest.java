package s.safontseva.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CowTest {
    @Test
    void shouldNotEatSelfSimilar() {
        assertThrows(RuntimeException.class, () -> new Cow().eat(new Cow()), "Animals can't eat their own kind!");
    }

    @Test
    void shouldNotEatFlesh() {
        assertThrows(RuntimeException.class, () -> new Cow().eat(new Goat()), "Herbivores do not eat flesh!");
    }

    @Test
    void shouldEatPlantFood() {
        new Cow().eat(new Grass());
    }
}