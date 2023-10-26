package it.unibo.composition;
import java.util.Arrays;

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
        this.students = new Student[maxStudents];
    }

    /*********** SELECTORS ***********/

    public int getId(){
        return this.id;
    }

    public int getMaxStudents(){
        return this.maxStudents;
    }

    public int getRegisteredStudents(){
        return this.registeredStudents;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public Professor getProfessor(){
        return this.professor;
    }

    public ExamRoom getExamRoom(){
        return this.examRoom;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public String toString() {
        return /*"Exam{" +
                "id=" + id +
                ", maxStudents=" + maxStudents +
                ", registeredStudents=" + registeredStudents +
                ", courseName='" + courseName + '\'' +
                ", professor=" + professor +
                ", examRoom=" + examRoom +
                ", students=" +*/ Arrays.toString(students); /*+
                '}';*/
    }

    /**********************/

    public boolean verifyAvailablePlaces(){

        if(this.registeredStudents < this.maxStudents){
            return true;
        } else {
            System.out.println("Error. No available places left for the current exam.");
            return false;
        }

    }

    public void registerStudent(Student student){

        if(verifyAvailablePlaces()){
            students[registeredStudents] = student;
            registeredStudents ++;
        }

    }
}
