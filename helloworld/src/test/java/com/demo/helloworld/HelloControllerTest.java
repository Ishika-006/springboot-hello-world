package com.demo.helloworld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    void testHello() {
        HelloController controller = new HelloController();
        String result = controller.hello();

        assertEquals("Hello World", result);
    }
}
