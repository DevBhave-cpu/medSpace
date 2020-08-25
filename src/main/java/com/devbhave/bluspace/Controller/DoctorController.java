package com.devbhave.bluspace.Controller;

import com.devbhave.bluspace.Controller.Exceptions.NotFoundException;
import com.devbhave.bluspace.Model.Doctor;
import com.devbhave.bluspace.Service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/all")
    public List<Doctor> getAll() {
        List<Doctor> doctorList = this.doctorService.findAll();
        if (doctorList == null) {
            throw new NotFoundException("No Doctors Found");
        }
        return doctorList;
    }

    @GetMapping("/{doctor_Id}")
    public Optional<Doctor> getById(@PathVariable("doctor_Id") String id) {
        Optional<Doctor> doctor = this.doctorService.findById(id);
        if (doctor == null) {
            throw new NotFoundException("Doctor od id " + id + " not found.");
        }
        return doctor;
    }

    @PutMapping
    public void insert(@RequestBody Doctor doctor) {
        this.doctorService.insert(doctor);
    }

    @PostMapping
    public void update(@RequestBody Doctor doctor) {
        this.doctorService.update(doctor);
    }

    @DeleteMapping("/{doctor_Id}")
    public void deleteById(@PathVariable("{doctor_Id}") String id) {
        if (id == null) {
            throw new NotFoundException("Doctor Not Found");
        } else {
            this.doctorService.deleteById(id);
        }
    }

}
