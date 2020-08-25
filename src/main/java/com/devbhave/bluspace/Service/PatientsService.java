package com.devbhave.bluspace.Service;

import com.devbhave.bluspace.Model.Patients;

import java.util.List;
import java.util.Optional;

public interface PatientsService {

    List<Patients> findAll();

    Optional<Patients> findById(String patient_Id);

    void insert(Patients patient);

    void update(Patients patient);

    void deleteById(String patient_Id);
}
