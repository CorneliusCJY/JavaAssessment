package com.generation.model;

import java.util.Date;
import java.util.List;
import java.util.HashMap;


public class Student
        extends Person
        implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;
    //private HashMap<String,Course>enrolledCourses = new HashMap<String, Course>();


    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    //public void enrollToCourse();
    //{
        //TODO
       // enrolledCourses.put(Course.getCode());
   //    return null;
   // }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        return null;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
        return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
     //   return enrolledCourses;
        return null;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}