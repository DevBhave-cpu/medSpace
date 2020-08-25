package com.devbhave.bluspace.Controller;

import com.devbhave.bluspace.Controller.Exceptions.NotFoundException;
import com.devbhave.bluspace.Model.Patients;
import com.devbhave.bluspace.Service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class PatientsController {

private PatientsService patientsService;

    @Autowired
    public PatientsController(PatientsService patientsService) {
        this.patientsService = patientsService;
    }

    @GetMapping("/all")
    public List<Patients> getAll() {
            List<Patients> patientsList = this.patientsService.findAll();
            if (patientsList == null) {
                throw new NotFoundException("Nothing to show.");
            }
            return patientsList;
    }

    @GetMapping("/{patient_Id}")
    public Optional<Patients> getPatientById(
            @PathVariable("patient_Id") String id) {
        Optional<Patients> patient = this.patientsService.findById(id);
        if (patient == null) {
            throw new NotFoundException("Patient id not found -> " + id);
        }
        return patient;
    }

    @PutMapping
    public void insertPatient(@RequestBody Patients patient) {
        this.patientsService.insert(patient);
    }

    @PostMapping
    public void updatePatient(@RequestBody Patients patient) {
        this.patientsService.update(patient);
    }

    @DeleteMapping("/{patient_id}")
    public void  deletePatient(@PathVariable("patient_id") String id) {
        this.patientsService.deleteById(id);
    }
}
