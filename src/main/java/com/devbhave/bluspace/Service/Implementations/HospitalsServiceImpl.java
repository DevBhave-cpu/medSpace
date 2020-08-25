package com.devbhave.bluspace.Service.Implementations;

import com.devbhave.bluspace.Controller.Exceptions.NotFoundException;
import com.devbhave.bluspace.Model.Hospitals;
import com.devbhave.bluspace.Repository.HospitalsRepository;
import com.devbhave.bluspace.Service.HospitalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component("hospitalsService")
public class HospitalsServiceImpl implements HospitalsService {

    private HospitalsRepository hospitalsRepository;
    @Autowired
    public HospitalsServiceImpl(HospitalsRepository hospitalsRepository) {
        this.hospitalsRepository = hospitalsRepository;
    }

    @Override
    public Optional<Hospitals> findById(String hospital_Id) {
        Optional<Hospitals> hospital = this.hospitalsRepository.findById(hospital_Id);
        if (hospital_Id == null) {
            throw new NotFoundException("No hospital found");
        }
        return hospital;
    }

    @Override
    public List<Hospitals> findAll() {
        List<Hospitals> hospitalsList = this.hospitalsRepository.findAll();
        if (hospitalsList == null) {
            throw new NotFoundException("Nothing to show");
        }
        return hospitalsList;
    }

    @Override
    public void insert(Hospitals hospital) {
        this.hospitalsRepository.insert(hospital);
    }

    @Override
    public void update(Hospitals hospital) {
        this.hospitalsRepository.save(hospital);
    }

    @Override
    public void deleteById(String hospital_Id) {
        if (hospital_Id == null) {
            throw new NotFoundException("Hospital Not Found");
        }
        this.hospitalsRepository.deleteById(hospital_Id);
    }
}
