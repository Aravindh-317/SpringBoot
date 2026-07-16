package Database.DBConnect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public StudentEntity save(StudentEntity student){
        return repository.save(student);
    }

    public List<StudentEntity> getAll(){
        return repository.findAll();
    }

    public StudentEntity getById(Integer id){
        return repository.findById(id).orElse(null);
    }

    public StudentEntity update(StudentEntity student){
        return repository.save(student);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}

