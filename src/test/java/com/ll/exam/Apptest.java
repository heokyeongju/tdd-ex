package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Apptest {
    @Test
    public void 더하기_테스트(){
        int rs = Calculator.calc("10 + 20");
        assertEquals(30, rs);
    }
    @Test
    public void 더하기_테스트_2(){
        int rs = Calculator.calc("50 + 20");
        assertEquals(70,rs);
    }

    @Test
    public void 더하기_테스트_3(){
        int rs = Calculator.calc("100 + 20");
        assertEquals(120,rs);
    }

    @Test
    public void 빼기_테스트_1(){
        int rs = Calculator.calc("100 - 20");
        assertEquals(80,rs);
    }
    @Test
    public void 곱하기_테스트_1(){
        int rs = Calculator.calc("10 * 20");
        assertEquals(200,rs);
    }
}
