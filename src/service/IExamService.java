package service;

import vo.ExamEntity;

import java.util.List;

public interface IExamService {
    //����������Ϣ
    boolean addExam(ExamEntity examEntity);

    //    ��ѯ���п���
    List queryAllExamName(ExamEntity examEntity);
}