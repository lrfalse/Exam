package service;

import vo.StudentEntity;

import java.util.List;

public interface IStudentService {
    //    ���ѧ����Ϣ
    boolean addStudent(StudentEntity studentEntity);

    //    ͨ��ѧ��id,��ѯ�Ƿ����
    StudentEntity findStudentById(int stu_id);

    void findStuIdByRegister(StudentEntity studentEntity);

    List showStu(StudentEntity studentEntity);
}
