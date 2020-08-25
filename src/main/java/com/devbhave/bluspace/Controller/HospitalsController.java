package com.devbhave.bluspace.Controller;

import com.devbhave.bluspace.Controller.Exceptions.NotFoundException;
import com.devbhave.bluspace.Model.Hospitals;
import com.devbhave.bluspace.Service.HospitalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospitals")
public class HospitalsController {

    private HospitalsService hospitalsService;

    @Autowired
    public HospitalsController(HospitalsService hospitalsService) {
        this.hospitalsService = hospitalsService;
    }

    @GetMapping("/all")
    public List<Hospitals> getHospitals() {
        List<Hospitals> hospitalsList = this.hospitalsService.findAll();
        if (hospitalsList == null) {
            throw new NotFoundException("Nothing to show.");
        }
        return hospitalsList;
    }

    @GetMapping("/{hospital_id}")
    public Optional<Hospitals> getHospitalsById
            (@PathVariable("hospital_id") String id) {
        Optional<Hospitals> hospital = this.hospitalsService.findById(id);
        if (hospital == null) {
            throw new NotFoundException("Hospital of id " + "id " + "not Found.");
        }
        return hospital;
    }

    @PutMapping
    public void insert(@RequestBody Hospitals hospital) {
        this.hospitalsService.insert(hospital);
    }

    @PostMapping
    public void update(@RequestBody Hospitals hospital) {
        this.hospitalsService.update(hospital);
    }

    @DeleteMapping("/{hospital_id}")
    public void delete(@PathVariable("hospital_id") String id) {
        if (id == null) {
            throw new NotFoundException("Nothing to delete");
        }
        this.hospitalsService.deleteById(id);
    }

}

/*   Even though @PathVariable and @RequestParam are both used to extract values
     from the URL, their usage is largely determined by how a site is designed.
        The @PathVariable annotation is used for data passed in the URI
        (e.g. RESTful web services) while @RequestParam is used to extract the
        data found in query parameters.
*/
