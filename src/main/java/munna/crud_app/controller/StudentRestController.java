package munna.crud_app.controller;


import munna.crud_app.model.Student;
import munna.crud_app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestController {
    @Autowired
    private StudentService stServ;

    @GetMapping(value = "/welcome")
//    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String hello() {
        return "Hello Sir";
    }

    @GetMapping(value = "/")

    public String root() {
        return "Root Page";
    }

    @GetMapping(value = "/studentlist")
    public List<Student> studentList() {
        return stServ.StudentList();
    }

    @PostMapping(value = "/addstudent")
    public String addStudent(
            @RequestParam(value = "roll", required = false, defaultValue = "0") Integer roll,
            @RequestParam(value = "name", required = false, defaultValue = "Blank") String name
    ) {
        Student temp = new Student(name, roll);
        return stServ.addStudent(temp);
    }


}
