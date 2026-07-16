package Database.DBConnect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	    @Autowired
	    StudentService service;

	    @PostMapping("/save")
	    public StudentEntity save(@RequestBody StudentEntity student){
	        return service.save(student);
	    }

	    @GetMapping("/all")
	    public List<StudentEntity> getAll(){
	        return service.getAll();
	    }

	    @GetMapping("/{id}")
	    public StudentEntity getById(@PathVariable Integer id){
	        return service.getById(id);
	    }

	    @PutMapping("/update")
	    public StudentEntity update(@RequestBody StudentEntity student){
	        return service.update(student);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String delete(@PathVariable Integer id){
	        service.delete(id);
	        return "Employee Deleted Successfully";
	    }
	}
