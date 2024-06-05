package com.healthycoderapp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Executable;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Nested
    class FindCoderWithWorstBMI{

        @Test
        @DisplayName("return coder with worst bmi when coder list is not empty")
        void Test3(){
            List<Coder> lst= new ArrayList<>();
            lst.add(new Coder(1.80,60.0));
            lst.add(new Coder(1.82,98.0));
            lst.add(new Coder(1.82,64.7));

            Coder c= BMICalculator.findCoderWithWorstBMI(lst);

            assertAll(
                    ()->assertEquals(1.82,c.getHeight()),
                    ()->assertEquals(98.0,c.getWeight())


            );

        }

        @Test
        @DisplayName("return null  with worst bmi when coder list is  empty")
        void Test4(){
            List<Coder> lst= new ArrayList<>();
            Coder c= BMICalculator.findCoderWithWorstBMI(lst);

            assertNull(c);

        }

    }

    @Nested
    class DietRecommended{

        @Test
        @DisplayName("method should return true")
        void Test(){
            double weight=89.90;
            double height=1.72;

            boolean recommended=BMICalculator.isDietRecommended(weight,height);
            assertTrue(recommended);
        }


        @Test
        @DisplayName("method should return false")
        void Test1(){
            double weight=50.00;
            double height=1.92;

            boolean recommended=BMICalculator.isDietRecommended(weight,height);
            assertFalse(recommended);
        }

        @ParameterizedTest
        @ValueSource(doubles = {110.0,89.0,95.0})
        @DisplayName("method should return true with parametrised test")
        void TestDouble(Double args){
            double weight=args;
            double height=1.72;

            boolean recommended=BMICalculator.isDietRecommended(weight,height);
            assertTrue(recommended);
        }

        @ParameterizedTest(name =" weight={0} ,height={1}")
        @CsvSource(value = {"89.0,1.72","95.0,1.75","110.0,1.78"})
        @DisplayName("method should return true with csv source")
        void TestDouble2(Double args,Double argsh){
            double weight=args;
            double height=argsh;

            boolean recommended=BMICalculator.isDietRecommended(weight,height);
            assertTrue(recommended);
        }

        @ParameterizedTest(name =" weight={0} ,height={1}")
        @CsvFileSource(resources = "/diet-recommended-input-data.csv",numLinesToSkip = 1)
        @DisplayName("method should return true with csv file source")
        void TestDouble3(Double args,Double argsh){
            double weight=args;
            double height=argsh;

            boolean recommended=BMICalculator.isDietRecommended(weight,height);
            assertTrue(recommended);
        }

    }

    @Nested
    class GetBMIScore{

        @DisabledOnOs(OS.WINDOWS)
        @Test
        @DisplayName("return correct bmi array score when coder list is not empty")
        void Test5(){
            List<Coder> lst= new ArrayList<>();
            lst.add(new Coder(1.80,60.0));
            lst.add(new Coder(1.82,98.0));
            lst.add(new Coder(1.82,64.7));

            double[] expected={18.52,29.59,19.53};
            double []arr=BMICalculator.getBMIScores(lst);

            assertArrayEquals(expected,arr);
        }

    }











}