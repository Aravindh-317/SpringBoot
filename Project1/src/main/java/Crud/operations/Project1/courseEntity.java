package Crud.operations.Project1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course_entity")

public class courseEntity {


    @Id
    private int id;

    private String course;
    private String trainer;
    private String duration;
    private int fee;

    public courseEntity() {
    }

    public courseEntity(int id, String course, String trainer, String duration, int fee) {
        this.id = id;
        this.course = course;
        this.trainer = trainer;
        this.duration = duration;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }


}
