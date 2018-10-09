package com.employee.model.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;


public class Audience {

    public void silenceCellPhones() {
        System.out.println("Silencing cell phone");
    }

    public void takeSeats() {
        System.out.println("Taking seats");
    }

    public void applause() {
        System.out.println("CLAP CLAP CLAP !!!");
    }

    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        System.out.println("Silencing cell phone");
        System.out.println("Taking seats");
        try {
            joinPoint.proceed();
            System.out.println("CLAP CLAP CLAP !!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }
}
