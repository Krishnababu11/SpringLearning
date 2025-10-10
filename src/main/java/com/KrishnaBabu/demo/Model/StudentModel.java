package com.KrishnaBabu.demo.Model;
import jakarta.validation.constraints.*;

public class StudentModel {

    private int studentId;

    @NotBlank(message = "Student name must not be empty")
    @Size(max = 50, message = "Student name must not exceed 50 characters")
    private String studentName;

    @NotBlank(message = "Subject must not be empty")
    @Size(max = 30, message = "Subject name must not exceed 30 characters")
    private String subject;

    @NotBlank(message = "Department must not be empty")
    @Size(max = 20, message = "Department name must not exceed 20 characters")
    private String department;

    @Min(value = 21, message = "Age must be at least 21")
    @Max(value = 65, message = "Age must not exceed 65")
    private int age;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email must not be empty")
    private String email;

    @NotBlank(message = "College name must not be empty")
    private String collegeName;

    // ✅ Default constructor
    public StudentModel() {
    }

    // ✅ Parameterized constructor
    public StudentModel(int studentId, String studentName, String subject, String department, int age, String email, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subject = subject;
        this.department = department;
        this.age = age;
        this.email = email;
        this.collegeName = collegeName;
    }

    // ✅ Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

}