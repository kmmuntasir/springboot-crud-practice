package munna.crud_app.service;

import munna.crud_app.Repository.StudentRepository;
import munna.crud_app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository stRepo;

    @Override
    public List<Student> StudentList() {
        return stRepo.findAll();
    }

    @Override
    public String addStudent(Student std) {
        Student st = stRepo.save(std);
        String message;
        if (st.getId() != null){
            message = "Success";
        }
        else message = "Failure";
        return message;
    }
}
