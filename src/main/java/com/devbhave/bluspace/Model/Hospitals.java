package com.devbhave.bluspace.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "hospitals")
public class Hospitals {

    @Id
    private String hospital_Id;
    @Field(name = "hospital_name")
    private String hospitalName;
    @Field(name = "hospital_address")
    private String hospitalAddress;
    @Field(name = "hospital_city")
    private String hospitalCity;
    @Field(name = "hospital_phone")
    private long hospitalPhone;
    @Field(name = "departments")
    private Set<Department> departments;
    @Field(name = "hospital_image")
    private Binary hospitalImage;

    protected Hospitals() {
        this.departments = new HashSet<>();
    }

    public Hospitals(String hospitalName,
                     String hospitalAddress,
                     String hospitalCity,
                     long hospitalPhone,
                     Set<Department> departments,
                     Binary hospitalImage) {

        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.hospitalCity = hospitalCity;
        this.hospitalPhone = hospitalPhone;
        this.departments = departments;
        this.hospitalImage = hospitalImage;
    }

    public Hospitals(String hospitalName,
                     String hospitalAddress,
                     String hospitalCity,
                     long hospitalPhone,
                     Set<Department> departments) {

        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.hospitalCity = hospitalCity;
        this.hospitalPhone = hospitalPhone;
        this.departments = departments;
    }

    public String getHospital_Id() {
        return hospital_Id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public long getHospitalPhone() {
        return hospitalPhone;
    }

    public void setHospitalPhone(long hospitalPhone) {
        this.hospitalPhone = hospitalPhone;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    public Binary getHospitalImage() {
        return hospitalImage;
    }

    public void setHospitalImage(Binary hospitalImage) {
        this.hospitalImage = hospitalImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospitals hospitals = (Hospitals) o;
        return hospitalPhone == hospitals.hospitalPhone &&
                hospital_Id.equals(hospitals.hospital_Id) &&
                hospitalName.equals(hospitals.hospitalName) &&
                hospitalAddress.equals(hospitals.hospitalAddress) &&
                hospitalCity.equals(hospitals.hospitalCity) &&
                departments.equals(hospitals.departments) &&
                Objects.equals(hospitalImage, hospitals.hospitalImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hospital_Id,
                hospitalName,
                hospitalAddress,
                hospitalCity,
                hospitalPhone,
                departments,
                hospitalImage);
    }

    @Override
    public String toString() {
        return "Hospitals{" +
                "hospital_Id='" + hospital_Id + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                ", hospitalCity='" + hospitalCity + '\'' +
                ", hospitalPhone=" + hospitalPhone +
                ", departments=" + departments +
                '}';
    }
}
