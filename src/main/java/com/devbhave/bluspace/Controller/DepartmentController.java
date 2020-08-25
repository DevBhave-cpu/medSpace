package com.devbhave.bluspace.Controller;

import com.devbhave.bluspace.Controller.Exceptions.NotFoundException;
import com.devbhave.bluspace.Model.Department;
import com.devbhave.bluspace.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/all")
    public Set<Department> findAll() {
        Set<Department> departmentList =
                (Set<Department>) this.departmentService.findAll();

        if (departmentList == null) {
            throw new NotFoundException("Departments not found");
        }
        return departmentList;
    }

    @GetMapping("/{department_Id}")
    public Optional<Department> findById
            (@PathVariable("department_Id") String id) {

        Optional<Department> department =
                this.departmentService.findById(id);

        if (!department.isPresent()) {
            throw new NotFoundException("Department not found");
        }
        return department;
    }

    @PutMapping
    public void insert(@RequestBody Department department) {
        this.departmentService.insert(department);
    }

    @PostMapping
    public void update(@RequestBody Department department) {
        this.departmentService.update(department);
    }

    @DeleteMapping("/{department_Id}")
    public void deleteById(@PathVariable("{department_Id}") String id) {
        this.departmentService.deleteById(id);
    }
}
