package com.devbhave.bluspace.Service;

import com.devbhave.bluspace.Model.Department;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface DepartmentService {

    Set<Department> findAll();

    Optional<Department> findById(String id);

    void insert(Department department);

    void update(Department department);

    void deleteById(String id);

}
