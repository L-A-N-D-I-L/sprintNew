package croupG119.sprintTask.sprintTask3_1.db;

public class Student {
    private long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public Student(long id, String name, String surname, int exam, String mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        this.mark = mark;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark){
        this.mark = mark;
    }
    public Student(){

    }

    public String markOfExam(int exam){
        String mark = "";
        if(exam>=90){
            mark = "A";
        }else if(exam>=75){
            mark = "B";
        }else if(exam>=60){
            mark = "C";
        }else if(exam>=50){
            mark = "D";
        }else{
            mark = "F";
        }

        return mark;
    }
}
