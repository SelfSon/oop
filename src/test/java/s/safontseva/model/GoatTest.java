package s.safontseva.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoatTest {
    @Test
    void shouldEatPlantFood() {
        new Goat().eat(new Grass());
    }
}