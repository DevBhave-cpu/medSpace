package com.devbhave.bluspace.Service.Implementations;

import com.devbhave.bluspace.Model.Doctor;
import com.devbhave.bluspace.Repository.DoctorRepository;
import com.devbhave.bluspace.Service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> findAll() {
        return this.doctorRepository.findAll();
    }

    @Override
    public Optional<Doctor> findById(String id) {
        return this.doctorRepository.findById(id);
    }

    @Override
    public void insert(Doctor doctor) {
        this.doctorRepository.insert(doctor);
    }

    @Override
    public void update(Doctor doctor) {
        this.doctorRepository.save(doctor);
    }

    @Override
    public void deleteById(String id) {
        this.doctorRepository.deleteById(id);
    }
}
