package com.chuyuqiao.ssm.exceptions;

import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args){
        new ExceptionDemo().exception2();
    }

    static class ExceptionDemo{
        public void exception1() throws IOException {
            throw new IOException();
        }

        public void exception2() throws RuntimeException{
            try{
                this.exception1();
            }catch (Exception e){
                throw new RuntimeException();
            }
        }
    }
}
