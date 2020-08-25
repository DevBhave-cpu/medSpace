package com.devbhave.bluspace.Controller;

import com.devbhave.bluspace.Controller.Exceptions.NotFoundException;
import com.devbhave.bluspace.Model.Appointments;
import com.devbhave.bluspace.Service.AppointmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/appointments")
public class AppointmentsController {

    private AppointmentsService appointmentsService;

    @Autowired
    public AppointmentsController(AppointmentsService appointmentsService) {
        this.appointmentsService = appointmentsService;
    }

    @GetMapping("/all")
    public List<Appointments> getAppointments() {
        List<Appointments> appointments = this.appointmentsService.findAll();
        if (appointments == null) {
            throw new NotFoundException("No new Appointments");
        }
        return appointments;
    }

    @GetMapping("/{appointment_Id}")
    public Optional<Appointments>
    findById(@PathVariable("appointment_Id") String id) {
        return this.appointmentsService.findById(id);
    }


    /** GET request to return all appointments based on a date range and ordered by price **/
    @GetMapping
    public List<Appointments> findByDateRangeSortedByPrice(
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            @RequestParam("appointmentStartDate") LocalDate startDate,
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            @RequestParam("appointmentEndDate") LocalDate endDate) {
        return appointmentsService.findByDateRangeSortedByPrice(startDate, endDate);
    }

    /** POST request to add new appointments **/
    @PostMapping( produces = "application/json",
            consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Appointments appointment) {
         appointmentsService.create(appointment);
    }

    @PutMapping(path = "{appointment_Id}", produces = "application/json",
            consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("appointment_Id") String id,
                       @RequestBody Appointments appointment) {
        this.appointmentsService.update(id, appointment);
    }

    /** PATCH request to update status of an appointment **/
    @RequestMapping(path = "/{appointmentId}", method = RequestMethod.PATCH, produces = "application/json", consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateStatus(@PathVariable Long appointmentId, @RequestBody Appointments appointment) {
        this.appointmentsService.updateStatus(appointmentId, appointment);
    }

    /** DELETE request to delete specific appointments **/
    @DeleteMapping("/{appointment_Id}")
    @ResponseStatus(HttpStatus.OK)
    void deleteById(@PathVariable("/{appointment_Id}") String id) {
        appointmentsService.deleteById(id);
    }
}
