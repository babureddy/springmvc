package com.employee.model.aspectj;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance{
    public void perform() {
        System.out.println("beginning perform...");
    }
}
