package s.safontseva.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CowTest {
    @Test
    void shouldEatPlantFood() {
        new Cow().eat(new Grass());
    }
}