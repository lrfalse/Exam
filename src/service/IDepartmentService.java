package service;

import vo.DepartmentEntity;

public interface IDepartmentService {
    //������֯������Ա��Ϣ
    boolean addDepartment(DepartmentEntity departmentEntity);

    //ͨ����֯������Աע��ʱ����������͹��Ų�ѯ id
    int findIdByDepartReg(DepartmentEntity departmentEntity);
}
