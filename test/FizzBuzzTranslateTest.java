import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    @Test
    @DisplayName("Test 3")
    void testdiv3(){
        int number =3;
        String expected= "Fizz";
        String result= FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);

    }
    @Test
    @DisplayName("Test 4")
    void testdiv4(){
        int number =4;
        String expected= "Bon";
        String result= FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test 5")
    void testdiv5(){
        int number =5;
        String expected= "Buzz";
        String result= FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test 15")
    void testdiv15(){
        int number =15;
        String expected= "FizzBuzz";
        String result= FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test 23")
    void testdiv23(){
        int number =23;
        String expected= "Fizz";
        String result= FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test 123")
    void testdiv123(){
        int number =123;
        String expected= "Fizz";
        String result= FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test 71")
    void testdiv71(){
        int number =71;
        String expected= "Bay muoi mot";
        String result= FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test 11")
    void testdiv11(){
        int number =11;
        String expected= "Muoi mot";
        String result= FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test 91")
    void testdiv91(){
        int number =91;
        String expected= "Chin muoi mot";
        String result= FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

}