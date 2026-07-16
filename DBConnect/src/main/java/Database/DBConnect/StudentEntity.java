package Database.DBConnect;

import jakarta.persistence.*;


@Entity
@Table(name = "info")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String department;
    private String Address;

    public StudentEntity() {
    }


    public StudentEntity(Integer id, String name, String department, String Address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.Address = Address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department=department;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address=Address;
    }
}
	

