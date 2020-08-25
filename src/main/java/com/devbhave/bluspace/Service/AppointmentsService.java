package com.devbhave.bluspace.Service;

import com.devbhave.bluspace.Model.Appointments;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AppointmentsService {

    Optional<Appointments> findById(String appointmentId);

    List<Appointments> findAll();

    List<Appointments> findByDateRangeSortedByPrice(LocalDate startDate, LocalDate endDate);

    void create(Appointments appointment);

    void update(String appointmentId, Appointments appointment);

    void updateStatus(Long appointmentId, Appointments appointment);

    void deleteById(String appointmentId);

}
