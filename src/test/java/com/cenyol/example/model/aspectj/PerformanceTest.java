package com.cenyol.example.model.aspectj;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.employee.model.aspectj.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aspectj-beans.xml")
public class PerformanceTest {

    @Autowired
    private Performance performance;

    @Test
    public void testAspectj() {
        Assert.assertNotNull(performance);

        performance.perform();
    }
}
