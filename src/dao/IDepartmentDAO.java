package dao;

import vo.DepartmentEntity;

public interface IDepartmentDAO {

    //������֯������Ա��Ϣ
    boolean addDepartment(DepartmentEntity departmentEntity);

    //ͨ����֯������Աע��ʱ����������͹��Ų�ѯ id
    int findIdByDepartReg(DepartmentEntity departmentEntity);


}
