package com.devbhave.bluspace.Model;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Document(collection = "departments")
public class Department {

    @Id
    private String department_Id;
    @Field(name = "department_image")
    private Binary departmentImage;
    @Field(name = "department_name")
    private String departmentName;
    @Field(name = "doctor")
    private List<Doctor> doctor;

    protected Department() {
        this.doctor = new ArrayList<>();
    }

    public Department(Binary departmentImage, String departmentName, List<Doctor> doctor) {
        this.departmentImage = departmentImage;
        this.departmentName = departmentName;
        this.doctor = doctor;
    }

    public Department(String departmentName, List<Doctor> doctor) {
        this.departmentName = departmentName;
        this.doctor = doctor;
    }

    public Binary getDepartmentImage() {
        return departmentImage;
    }

    public void setDepartmentImage(Binary departmentImage) {
        this.departmentImage = departmentImage;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + department_Id + '\'' +
                ", image=" + departmentImage +
                ", name='" + departmentName + '\'' +
                ", doctor=" + doctor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return department_Id.equals(that.department_Id) &&
                Objects.equals(departmentImage, that.departmentImage) &&
                departmentName.equals(that.departmentName) &&
                doctor.equals(that.doctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department_Id, departmentImage, departmentName, doctor);
    }
}



