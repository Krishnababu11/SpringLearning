package com.KrishnaBabu.demo.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee/")
public class GetEmployeeController {

    @GetMapping("allEmployees")
    public String getAllEmployees() {
        return "All Employee Data will be displayed soon...";
    }

    @GetMapping("employee/{id:[0-9]+}")
    public String getEmployeeById(@PathVariable long id) {
        return "Employee ID is = " + id;
    }


    @GetMapping("employee/{name:[a-zA-Z]+}")
    public String getEmployeeByName(@PathVariable String name) {
        return "Employee Name you searched for is = " + name;
    }

    @GetMapping("employee/{id}/{name}")
    public String getEmployeeByIdAndName(
            @PathVariable String id,
            @PathVariable String name
    ) {
        return "Employee ID = " + id + ", Employee Name = " + name;
    }

    @GetMapping("searchEmployee")
    public String searchEmployeeWithQueryParam(
            @RequestParam("id") long employeeId,
            @RequestParam("ename") String employeeName
    ) {
        return "Query Param Employee ID = " + employeeId + ", Employee Name = " + employeeName;
    }
}



