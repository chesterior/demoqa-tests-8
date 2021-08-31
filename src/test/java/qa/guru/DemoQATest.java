package qa.guru;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoQATest {

    @BeforeEach
    void beforeEach() {
        System.out.println("Before test!\n");
    }

    @Test
    void firstTest() {
        System.out.println("I love you QA.GURU");
    }
}
