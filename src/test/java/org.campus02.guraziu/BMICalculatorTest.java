package org.campus02.guraziu;

import org.campus02.guraziu.BMICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BMICalculatorTest {

    private BMICalculator bmiCalculator;
    @BeforeEach
    void setUp() {
    bmiCalculator = new BMICalculator(180,1.0);

    }

    @Test
    @DisplayName(("Konstruktor Test"))
    void voidtestconstructor() {
        double expectedWeight = 180;
        Assertions.assertEquals(expectedWeight,bmiCalculator.getWeightInKG());
        Assertions.assertEquals(1.0,bmiCalculator.getHeightInMeters());
    }

    @Test
     void result() {


    }
}