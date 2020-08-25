package com.devbhave.bluspace.Model;

import com.mongodb.internal.connection.Time;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Document(collection = "appointments")
public class Appointments {

    @Id
    private String appointment_Id;

    @Field(name = "appointmentStartDate")
    private LocalDate appointmentStartDate;
    @Field(name = "appointmentEndDate")
    private LocalDate appointmentEndDate;
    @Field(name = "appointmentStartTime")
    private Time appointmentStartTime;
    @Field(name = "appointmentEndTime")
    private Time appointmentEndTime;
    @Field(name = "doctor")
    private Doctor doctor;
    @Field(name = "appointmentStatus")
    private AppointmentStatus status = AppointmentStatus.Available;
    @Field(name = "price")
    private BigDecimal price;
    @Field(name = "patient")
    private Patients patient;

    public Appointments() {}

    public Appointments(LocalDate appointmentStartDate,
                        LocalDate appointmentEndDate,
                        Time appointmentStartTime,
                        Time appointmentEndTime,
                        Doctor doctor,
                        AppointmentStatus status,
                        BigDecimal price,
                        Patients patient) {

        this.appointmentStartDate = appointmentStartDate;
        this.appointmentEndDate = appointmentEndDate;
        this.appointmentStartTime = appointmentStartTime;
        this.appointmentEndTime = appointmentEndTime;
        this.doctor = doctor;
        this.status = status;
        this.price = price;
        this.patient = patient;
    }

    public Patients getPatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public Appointments(LocalDate appointmentStartDate,
                        LocalDate appointmentEndDate,
                        Time appointmentStartTime,
                        Time appointmentEndTime,
                        Doctor doctor) {

        this.appointmentStartDate = appointmentStartDate;
        this.appointmentEndDate = appointmentEndDate;
        this.appointmentStartTime = appointmentStartTime;
        this.appointmentEndTime = appointmentEndTime;
        this.doctor = doctor;

    }


    public String getAppointment_Id() {
        return appointment_Id;
    }

    public LocalDate getAppointmentStartDate() {
        return appointmentStartDate;
    }

    public void setAppointmentStartDate(LocalDate appointmentStartDate) {
        this.appointmentStartDate = appointmentStartDate;
    }

    public LocalDate getAppointmentEndDate() {
        return appointmentEndDate;
    }

    public void setAppointmentEndDate(LocalDate appointmentEndDate) {
        this.appointmentEndDate = appointmentEndDate;
    }

    public Time getAppointmentStartTime() {
        return appointmentStartTime;
    }

    public void setAppointmentStartTime(Time appointmentStartTime) {
        this.appointmentStartTime = appointmentStartTime;
    }

    public Time getAppointmentEndTime() {
        return appointmentEndTime;
    }

    public void setAppointmentEndTime(Time appointmentEndTime) {
        this.appointmentEndTime = appointmentEndTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointments that = (Appointments) o;
        return appointment_Id.equals(that.appointment_Id) &&
                appointmentStartDate.equals(that.appointmentStartDate) &&
                appointmentEndDate.equals(that.appointmentEndDate) &&
                appointmentStartTime.equals(that.appointmentStartTime) &&
                appointmentEndTime.equals(that.appointmentEndTime) &&
                doctor.equals(that.doctor) &&
                status == that.status &&
                price.equals(that.price) &&
                patient.equals(that.patient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointment_Id, appointmentStartDate, appointmentEndDate, appointmentStartTime, appointmentEndTime, doctor, status, price, patient);
    }

    @Override
    public String toString() {
        return "Appointments{" +
                "appointment_Id='" + appointment_Id + '\'' +
                ", appointmentStartDate=" + appointmentStartDate +
                ", appointmentEndDate=" + appointmentEndDate +
                ", appointmentStartTime=" + appointmentStartTime +
                ", appointmentEndTime=" + appointmentEndTime +
                ", doctor=" + doctor +
                ", status=" + status +
                ", price=" + price +
                ", patient=" + patient +
                '}';
    }
}
