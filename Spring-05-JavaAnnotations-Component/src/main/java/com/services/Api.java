package com.services;

import com.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Api implements Course {
    @Override
    public void getTeachingHours() {

        System.out.println("Weekly teaching hours : 7");
    }
}
