package service;

import vo.StudentEntity;

public interface IStudentService {
//    ���ѧ����Ϣ
    boolean addStudent(StudentEntity studentEntity);

//    ͨ��ѧ��id,��ѯ�Ƿ����
    StudentEntity findStudentById(int stu_id);
}
