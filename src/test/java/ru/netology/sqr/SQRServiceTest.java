package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void ShouldCount (){

        SQRService service = new SQRService();

        int actual = service.countSqr(200 , 300);

        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldCount2 () {

        SQRService service = new SQRService();

        int actual = service.countSqr(200 , 200);

        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

}
