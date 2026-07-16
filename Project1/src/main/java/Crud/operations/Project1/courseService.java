package Crud.operations.Project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class courseService {

    @Autowired
    courseRepository cr;

    // Create
    public courseEntity addCourse(courseEntity data) {
        return cr.save(data);
    }

    // Read
    public List<courseEntity> showCourse() {
        return cr.findAll();
    }

    // Read By Id
    public courseEntity getCourse(int id) {
        return cr.findById(id).orElse(null);
    }

    // Update
    public courseEntity updateCourse(int id, courseEntity data) {

        courseEntity c = cr.findById(id).orElse(null);

        if(c != null) {

            c.setCourse(data.getCourse());
            c.setTrainer(data.getTrainer());
            c.setDuration(data.getDuration());
            c.setFee(data.getFee());

            return cr.save(null);
        }

        return null;
    }

    // Delete
    public String deleteCourse(int id) {
        cr.deleteById(id);
        return "Course Deleted Successfully";
    }


}
