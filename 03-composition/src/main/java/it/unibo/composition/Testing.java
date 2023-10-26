package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        final String[] courses1 = {"Latino", "Greco"};
        final String[] courses2 = {"Informatica", "Analisi"};

        // 1)Creare 3 studenti a piacere

        Student student1 = new Student(1, "Giovanni", "Bianchi", "1234", 2022);
        Student student2 = new Student(2, "Giacomo", "Neri", "5678", 2023);
        Student student3 = new Student(3, "Giorgio", "Rossi", "9876", 2019);

        // 2)Creare 2 docenti a piacere

        Professor professor1 = new Professor(1, "Luigi", "Grigi", "123abc", courses1);
        Professor professor2 = new Professor(2, "Gennaro", "Esposito", "abc123", courses2);

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti

        ExamRoom room1 = new ExamRoom(100, "Aula 2.1", true, true);
        ExamRoom room2 = new ExamRoom(80, "Aula 3.3", true, true);

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2

        Exam exam1 = new Exam(1, 10, 0, "Latino", professor1, room2, null);
        Exam exam2 = new Exam(2, 2, 0, "Informatica", professor2, room1, null);

        // 5) Iscrivere tutti e 3 gli studenti agli esami

        

        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
    }
}
