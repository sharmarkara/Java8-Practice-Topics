package com.java.concept.parallelstream;

import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name=name;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Student> studentList= Arrays.asList(
            new Student("David",92),
            new Student("John",65),
            new Student("Bob",90),
            new Student("Smith",88),
            new Student("Scott",62)
        );

        // using stram
        studentList.stream().filter(s->s.getScore()>=60).
                limit(3).
                forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));


        // using parallel stream
        studentList.parallelStream().filter(s->s.getScore()>=60).
                limit(3).
                forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));

        // convert
        studentList.stream().parallel().filter(s->s.getScore()>=60).
                limit(3).
                forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));
    }
}
