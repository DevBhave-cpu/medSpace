package com.devbhave.bluspace.Service.Implementations;

import com.devbhave.bluspace.Controller.Exceptions.NotFoundException;
import com.devbhave.bluspace.Model.Department;
import com.devbhave.bluspace.Repository.DepartmentRepository;
import com.devbhave.bluspace.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Set<Department> findAll() {
        Set<Department> departmentList =
                (Set<Department>) this.departmentRepository.findAll();
        if (departmentList == null) {
            throw new NotFoundException("Nothing to show.");
        }
        return departmentList;
    }

    @Override
    public Optional<Department> findById(String id) {
        Optional<Department> department =
                this.departmentRepository.findById(id);
        if (!department.isPresent()) {
            throw new NotFoundException("Department not found");
        }
        return department;
    }

    @Override
    public void insert(Department department) {
        this.departmentRepository.insert(department);
    }

    @Override
    public void update(Department department) {
        this.departmentRepository.save(department);
    }

    @Override
    public void deleteById(String id) {
        this.departmentRepository.deleteById(id);
    }
}
