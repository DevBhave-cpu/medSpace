package com.devbhave.bluspace.Service;

import com.devbhave.bluspace.Model.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {

    List<Doctor> findAll();

    Optional<Doctor> findById(String id);

    void insert(Doctor doctor);

    void update(Doctor doctor);

    void deleteById(String id);

}
