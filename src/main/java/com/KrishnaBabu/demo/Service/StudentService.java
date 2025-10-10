package com.KrishnaBabu.demo.Service;
import com.KrishnaBabu.demo.Model.StudentModel;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class StudentService {

    private final List<StudentModel> database = new ArrayList<>(
        Arrays.asList(
                new StudentModel(101,"Deva","Maths","MCA", 23, "Deva@gmail.com", "Anna University"),
                new StudentModel(102,"Krishna Babu","Maths","MCA", 22, "Babu@gmail.com", "Anna University")
        )
    );

     private int nextId = 1;
     public boolean createStudent(StudentModel student) {
        if (student.getStudentId() == 0) {  // auto-generate ID
            student.setStudentId(nextId++);
        }
        return database.add(student);
    }
    public List<StudentModel> retrieveAll() {
        return new ArrayList<>(database);
    }

    public boolean removeStudent(int id) {
        return database.removeIf(s -> s.getStudentId() == id);
    }
}

