package dao;

import vo.ExamineEntity;
import vo.StudentEntity;

import java.util.List;

public interface IStudentDAO {
    //    ���ѧ����Ϣ
    boolean addStudent(StudentEntity studentEntity);

//    ����ѧ����Ϣ

    //    ���ѧ�������Ϣ
    ExamineEntity addStudentToExamine(ExamineEntity examineEntity);

    //      ͨ��ѧ��id,��ѯ�Ƿ����
    StudentEntity findStudentById(int stu_id);


    //    ͨ��ѧ��ע��ʱ��������֤�Ų�ѯѧ��id
    void findStuIdByRegister(StudentEntity studentEntity);

//    ��ʾѧ����Ϣ
    List showStu(StudentEntity studentEntity);
}
