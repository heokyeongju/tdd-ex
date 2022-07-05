package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Apptest {
    @Test
    public void 더하기_테스트(){
        int rs = Calculator.add("10+20");
        assertEquals(30,rs);
    }
    @Test
    public void 더하기_테스트_2(){
        int rs = Calculator.add("50+20");
        assertEquals(70,rs);
    }
}
