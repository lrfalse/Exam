package dao;

import vo.ExamEntity;

import java.util.List;

public interface IExamDAO {
    //����������Ϣ
    boolean addExam(ExamEntity examEntity);

//    ��ѯ���п�����Ϣ
    List queryAllExam(ExamEntity examEntity);
}
