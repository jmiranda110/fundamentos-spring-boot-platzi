package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean {

    @Override
    public void print() {
        System.out.println("Hola desde my implementacin propia del bean ");
    }
}
