package com.devbhave.bluspace.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@Document(collection = "patients")
public class Patients {
    @Id
    private String patient_Id;
    @Field(name = "name")
    private String name;
    @Field(name = "email_address")
    private String emailAddress;
    @Field(name = "phone_number")
    private long phoneNumber;

    public Patients() {}

    public Patients(String name,
                    String emailAddress,
                    long phoneNumber) {

        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getPatient_Id() {
        return patient_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "client_Id='" + patient_Id + '\'' +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patients patients = (Patients) o;
        return phoneNumber == patients.phoneNumber &&
                patient_Id.equals(patients.patient_Id) &&
                name.equals(patients.name) &&
                emailAddress.equals(patients.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                patient_Id,
                name,
                emailAddress,
                phoneNumber
        );
    }
}
