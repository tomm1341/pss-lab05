package it.unibo.composition;

public class Exam {

    private final int id;
    private int maxStudents;
    private int registeredStudents;
    private String courseName;
    private Professor professor;
    private ExamRoom examRoom;
    private Student[] students;


    public Exam(
        final int id,
        final int maxStudents,
        final int registeredStudents,
        final String courseName,
        final Professor professor,
        final ExamRoom examRoom,
        final Student[] students
    ) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.registeredStudents = registeredStudents;
        this.courseName = courseName;
        this.professor = professor;
        this.examRoom = examRoom;
        this.students = students;
    }

    
    
}
