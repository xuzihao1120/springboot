package com.xuzihao.service;

import com.xuzihao.pojo.Department;

import java.util.List;

/**
 * @version : V1.0
 * @ClassName: DepartmentService
 * @Description: TODO
 * @Auther: xuzihao
 * @Date: 2020/2/25 21:36
 */
public interface DepartmentService {
    List<Department> selectAllDepartment();
}
