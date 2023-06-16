package com.myuniversity;

import com.myuniversity.courses.CourseService;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService(5);
        courseService.run();
    }
}
