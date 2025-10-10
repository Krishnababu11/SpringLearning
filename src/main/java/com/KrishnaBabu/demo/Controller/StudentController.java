package com.KrishnaBabu.demo.Controller;
import com.KrishnaBabu.demo.Model.StudentModel;
import com.KrishnaBabu.demo.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public ResponseEntity<String> createStudent(@Valid @RequestBody StudentModel student) {
        boolean created = studentService.createStudent(student);
        return created
                ? ResponseEntity.ok("Student added successfully: " + student.getStudentName())
                : ResponseEntity.badRequest().body("Failed to add student");
    }
    @GetMapping("/all")
    public List<StudentModel> getAllStudents() {
        return studentService.retrieveAll();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {
        boolean removed = studentService.removeStudent(id);
        return removed
                ? ResponseEntity.ok("Student deleted successfully")
                : ResponseEntity.status(404).body("Student not found with ID: " + id);
    }
}