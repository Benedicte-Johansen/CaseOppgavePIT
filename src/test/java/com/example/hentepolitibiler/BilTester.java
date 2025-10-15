package com.example.hentepolitibiler;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BilTester {
    @Test
    void bilNotNull(){
        Bil enBil = new Bil();
        assertNotNull(enBil, "En bil bør ikke være tom");
    }


}
