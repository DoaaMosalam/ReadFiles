package Collage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentInformationTest {
    private StudentInformation si;
    @BeforeEach
    void setUp() {
        si=new StudentInformation();
    }

    @AfterEach
    void tearDown() {
        si =null;
    }

    @Test
    void showInfo() {
        si.showInfo();
    }
}