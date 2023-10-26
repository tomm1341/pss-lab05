package it.unibo.composition;

public class Professor implements User{
    
    private static final String DOT = ".";
    private final int id;
    private String name;
    private String surname;
    private String password;
    public String[] courses;

    public Professor(final int id, String name, String surname, String password, String[] courses){

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;

    }

    public String toString() {
        return "Student ["
            + "name=" + this.name
            + ", surname=" + this.surname
            + ", id=" + this.id
            + ", courses=" + this.courses
            + "]";
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getPassword(){
        return this.password;
    }

    public String[] getCourses(){
        return this.courses;
    }

    public int getId(){
        return this.id;
    }

    public String getUsername(){
        return this.name + Professor.DOT + this.surname;
    }

    public String getDescription(){
        return this.toString();
    }


    //sostituisce il corso all'indice `index` con quello fornito in input

    public void replaceCourse(String newCourse, int index){

        if(index > 0 && index < courses.length){

            courses[index] = newCourse;

        } else {
            System.out.println("Error. Invalid index.");
        }

    }

    public void repalceAllCourses(String[] newCourses){

        this.courses = newCourses;

    }



}
