package it.unibo.composition;

public class Professor implements User{
    
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

    


}
