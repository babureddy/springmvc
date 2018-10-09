package com.employee.model.autowire.interfaces.impl;

import org.springframework.stereotype.Component;

import com.employee.model.autowire.interfaces.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc{
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Bearles";
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
