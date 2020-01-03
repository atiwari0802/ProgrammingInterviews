package hashes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnonymousLetterConstructionTest {

    private AnonymousLetterConstruction anonymousLetterConstruction;

    @BeforeEach
    public void setup() {
        anonymousLetterConstruction = new AnonymousLetterConstruction();
    }

    @Test
    public void testIfLetterCanBeConstructed() {

        Assertions.assertTrue(anonymousLetterConstruction
                .canLetterBeConstructedFromSource("dud", "dudu"));

    }
}
