package s.safontseva.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {
    @Test
    void shouldEatFlesh() {
        new Lion().eat(new Goat());
    }
}