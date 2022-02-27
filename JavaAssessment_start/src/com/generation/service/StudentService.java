package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;
import com.generation.model.Student;

import java.util.*;


public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();
    //private Map<String, Course> course;

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId)
    {
        if (this.students.containsKey(studentId))
        {
           return this.students.get(studentId);
        }
        return null;
    }

    //   if (this.course.containsKey(id)){
    //            return this.course.get(id); //return that one course object with javal as the key
    //        }
    //        return null;

    public boolean showSummary()
    {
        //TODO
        //for(Student student:students.values()) System.out.println(student.toString());]
        //for(Course course: course.values()) System.out.println(course.toString());
        //return false;
        if(students.isEmpty())return false;
        for (Student s : students.values()) {
            System.out.println("Enrolled Courses:");
            System.out.println(s);
            if(s.getEnrolledCourses().isEmpty()) {
                System.out.println("No course enrolled");
                continue;
            }
                System.out.println(s.getEnrolledCourses());
        }
        return true;


    }

    public void enrollToCourse( String studentId, Course course)
    {

    //Student student = this.findStudent.get(studentId);
    //Course course= this.course.get(courseId);
    //student.enrollToCourse(course);
     //   findStudent(studentId).enrollToCourse(course);
    //TODO
    }
}
