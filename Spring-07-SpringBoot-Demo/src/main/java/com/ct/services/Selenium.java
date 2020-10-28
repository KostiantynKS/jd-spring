package com.ct.services;

import com.ct.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    public int getTeachingHours() {
        return 10;
    }
}
