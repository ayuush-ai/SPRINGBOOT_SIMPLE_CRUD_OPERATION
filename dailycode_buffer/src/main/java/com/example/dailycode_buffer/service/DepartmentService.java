package com.example.dailycode_buffer.service;

import com.example.dailycode_buffer.entity.Department;

import java.util.List;

public interface DepartmentService {
   public  Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId);

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);
}
