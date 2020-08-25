package com.devbhave.bluspace.Service;

import com.devbhave.bluspace.Model.Hospitals;

import java.util.List;
import java.util.Optional;

public interface HospitalsService {

    Optional<Hospitals> findById(String hospital_Id);

    List<Hospitals> findAll();

    void insert(Hospitals hospital);

    void update(Hospitals hospitals);

    void deleteById(String hospital_Id);

}
