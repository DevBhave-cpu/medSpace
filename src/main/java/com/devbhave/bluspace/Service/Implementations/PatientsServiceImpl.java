package com.devbhave.bluspace.Service.Implementations;

import com.devbhave.bluspace.Controller.Exceptions.NotFoundException;
import com.devbhave.bluspace.Model.Patients;
import com.devbhave.bluspace.Repository.PatientsRepository;
import com.devbhave.bluspace.Service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientsServiceImpl implements PatientsService {

    private PatientsRepository patientsRepository;

    @Autowired
    public PatientsServiceImpl(PatientsRepository patientsRepository) {
        this.patientsRepository = patientsRepository;
    }

    @Override
    public List<Patients> findAll() {
        List<Patients> patientsList = this.patientsRepository.findAll();
        if (patientsList == null) {
            throw new NotFoundException("Nothing to show");
        }
        return patientsList;
    }

    @Override
    public Optional<Patients> findById(String patient_Id) {
        Optional<Patients> patient = this.patientsRepository.findById(patient_Id);
        if (patient == null) {
            throw new NotFoundException("Patient not found");
        }
        return patient;
    }

    @Override
    public void insert(Patients patient) {
        this.patientsRepository.insert(patient);
    }

    @Override
    public void update(Patients patient) {
        this.patientsRepository.save(patient);
    }

    @Override
    public void deleteById(String patient_Id) {
        if (patient_Id == null) {
            throw new NotFoundException("Patient not found");
        }
        this.patientsRepository.deleteById(patient_Id);
    }
}
