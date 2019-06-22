package munna.crud_app.service;

import munna.crud_app.model.Student;

import java.util.List;

public interface StudentService {

    public List<Student> StudentList();
    public String addStudent(Student std);
}
