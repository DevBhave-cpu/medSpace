package com.devbhave.bluspace.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "doctors")
public class Doctor {

    @Id
    private String doctor_Id;
    @Field(name = "doctor_name")
    private String doctorName;
    @Field(name = "doctor_speciality")
    private String speciality;
    @Field(name = "doctor_position")
    private String doctorPosition;
    @Field(name = "doctor_image")
    private Binary doctorImage;

    public Doctor() {}

    public Doctor(String doctorName,
                  String speciality,
                  String doctorPosition,
                  Binary doctorImage) {

        this.doctorName = doctorName;
        this.speciality = speciality;
        this.doctorPosition = doctorPosition;
        this.doctorImage = doctorImage;
    }

    public Doctor(String doctorName, String speciality, String doctorPosition) {
        this.doctorName = doctorName;
        this.speciality = speciality;
        this.doctorPosition = doctorPosition;
    }

    public Binary getDoctorImage() {
        return doctorImage;
    }

    public void setDoctorImage(Binary doctorImage) {
        this.doctorImage = doctorImage;
    }
    public String getDoctor_Id() {
        return doctor_Id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDoctorPosition() {
        return doctorPosition;
    }

    public void setDoctorPosition(String doctorPosition) {
        this.doctorPosition = doctorPosition;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId='" + doctor_Id + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", doctorQualification='" + speciality + '\'' +
                ", doctorPosition='" + doctorPosition + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return doctor_Id.equals(doctor.doctor_Id) &&
                doctorName.equals(doctor.doctorName) &&
                speciality.equals(doctor.speciality) &&
                doctorPosition.equals(doctor.doctorPosition) &&
                Objects.equals(doctorImage, doctor.doctorImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                doctor_Id,
                doctorName,
                speciality,
                doctorPosition,
                doctorImage);
    }

}
