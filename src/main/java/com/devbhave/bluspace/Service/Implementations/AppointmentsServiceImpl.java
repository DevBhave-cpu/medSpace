package com.devbhave.bluspace.Service.Implementations;

import com.devbhave.bluspace.Model.Appointments;
import com.devbhave.bluspace.Service.AppointmentsService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentsServiceImpl implements AppointmentsService {
    @Override
    public Optional<Appointments> findById(String appointmentId) {
        return Optional.empty();
    }

    @Override
    public List<Appointments> findAll() {
        return null;
    }

    @Override
    public List<Appointments> findByDateRangeSortedByPrice(LocalDate startDate, LocalDate endDate) {
        return null;
    }

    @Override
    public void create(Appointments appointment) {

    }

    @Override
    public void update(String appointmentId, Appointments appointment) {

    }

    @Override
    public void updateStatus(Long appointmentId, Appointments appointment) {

    }

    @Override
    public void deleteById(String appointmentId) {

    }
}
