package dao;

import vo.ExamineEntity;
import vo.StudentEntity;

public interface IStudentDAO {
//    ���ѧ����Ϣ
    boolean addStudent(StudentEntity studentEntity);

//    ����ѧ����Ϣ

//    ���ѧ�������Ϣ
    ExamineEntity addStudentToExamine(ExamineEntity examineEntity);

//      ͨ��ѧ��id,��ѯ�Ƿ����
    StudentEntity findStudentById(int stu_id);
}
