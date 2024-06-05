package com.healthycoderapp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DietPlannerTest {

    private DietPlanner dietPlanner;

    @BeforeEach
    void setup() {
        this.dietPlanner = new DietPlanner(20, 30, 50);
    }

    @AfterEach
    void Setup() {
        System.out.println("will run after each test case");
    }

    @AfterAll
    static void setup1() {
        System.out.println("this will run after all test cases");
    }

    @BeforeAll
    static void setupbeforeall() {
        System.out.println("this will run before all test cases");
    }


    @Test
    @DisplayName("should return correct diet plan coder is correect")
    void test() {
        Coder c = new Coder(1.82, 75.0, 26, Gender.MALE);
        DietPlan expected = new DietPlan(2202, 110, 73, 275);
        DietPlan dp = dietPlanner.calculateDiet(c);

        assertAll(
                () -> assertEquals(expected.getCalories(), dp.getCalories())
        );

    }

    @RepeatedTest(10)
    @DisplayName("should return correct diet plan coder is correect and repeat the test for 10 times")
    void test1() {
        Coder c = new Coder(1.82, 75.0, 26, Gender.MALE);
        DietPlan expected = new DietPlan(2202, 110, 73, 275);
        DietPlan dp = dietPlanner.calculateDiet(c);

        assertAll(
                () -> assertEquals(expected.getCalories(), dp.getCalories())
        );


    }
}