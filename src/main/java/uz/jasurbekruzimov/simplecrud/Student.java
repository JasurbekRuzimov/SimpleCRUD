package uz.jasurbekruzimov.simplecrud;

public class Student {
    String id;
    String name;
    String surname;
    String group;
    String faculty;
    String course;


    public Student(String id, String name, String surname, String group, String faculty, String course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.faculty = faculty;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
