
package org.example;

import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MathUtilTest {

    @Test
    @Order(1)
    @DisplayName("shouldReturnNineWhenGivenFourAndFive")
    void shouldReturnNineWhenGivenFourAndFive() {
        //given
        int x = 5 , y =4;
        //when
        MathUtil mathUtil = new MathUtil();

        int actual = mathUtil.add(x, y);

        //then
        assertEquals(9,actual);


    }

    @Test
    @Order(2)
    @DisplayName("should return 7 when given 10 and 3")
    void shouldReturnSevenWhenGivenTenAndThree() {
        int x = 10 ,  y = 3;
        MathUtil mathUtil = new MathUtil();
        int actual = mathUtil.subtract(x, y);
        assertEquals(7, actual);



    }

    @Test
    @Order(3)
    @DisplayName("Should return 21 when given 42 and 2")
    void shouldReturnTwentyoneWhenGivenFourtytwoAndTwo() throws Exception {
        int x = 42 , y = 2;
        MathUtil mathUtil = new MathUtil();
        int acutal = mathUtil.division(x, y);
        assertEquals(21 , acutal);

    }
    @Test
    void shouldThrowExceptionWhenDivideByZero() {
        int x = 5, y = 0;
        MathUtil mathUtil = new MathUtil();
        Executable executable = () -> mathUtil.division(x, y);
        assertThrows(Exception.class,  executable);
    }


    @Test
    void shouldReturnTrueWhenDivided() throws Exception{
        int x = 6 , y = 3;
        MathUtil mathUtil = new MathUtil();
        int acutal = mathUtil.division(x,y);
        assertEquals(2,acutal);


    }


}