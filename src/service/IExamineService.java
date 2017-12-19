package service;

import vo.ExamineEntity;
import vo.StudentEntity;

import java.util.List;

public interface IExamineService {
    //    ��ע��ѧ��id�浽 examine��
    void addStuIdToExam(ExamineEntity examineEntity);

    List showExam(ExamineEntity examineEntity);

    List queryStuidByExam(ExamineEntity examineEntity);

    void setExamStatus(int examStatus,int stuId);
}
