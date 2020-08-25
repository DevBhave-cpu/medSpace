package com.devbhave.bluspace.Repository;

import com.devbhave.bluspace.Model.Appointments;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentsRepository extends MongoRepository<Appointments, String>
{
//    List<Appointments>
//    findAllByAppointmentDateBetweenOrderByPriceAsc(
//            LocalDate startDate, LocalDate endDate
//    );
}
