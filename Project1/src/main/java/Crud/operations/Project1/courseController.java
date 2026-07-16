 package Crud.operations.Project1;

 import java.util.List;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;

 @RestController
 public class courseController {

     final courseService cs;

      courseController(courseService cs) {
           this.cs = cs;
      }

     // Insert
     @PostMapping("/postData")
     public String addData(@RequestBody courseEntity ce) {

         cs.addCourse(ce);

         return "Course Added Successfully";
       
     }

     // Display All
     @GetMapping("/getData")
     public List<courseEntity> showData() {

         return cs.showCourse();
     }

     // Display By Id
     @GetMapping("/getData/{id}")
     public courseEntity getData(@PathVariable int id) {

         return cs.getCourse(id);
     }

     // Update
     @PutMapping("/updateData/{id}")
     public courseEntity updateData(@PathVariable int id,
                                    @RequestBody courseEntity ce) {

         return cs.updateCourse(id, ce);
         
     }

     // Delete
     @DeleteMapping("/deleteData/{id}")
     public String deleteData(@PathVariable int id) {

         return cs.deleteCourse(id);
     }

 }

