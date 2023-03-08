package s.safontseva.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {
    @Test
    void shouldNotEatPlantFood() {
        assertThrows(RuntimeException.class, () -> new Lion().eat(new Grass()), "Carnivores do not eat plants!");
    }

    @Test
    void shouldEatFlesh() {
        new Lion().eat(new Goat());
    }
}