package dao;


import vo.ExamineEntity;

import java.util.List;

public interface IExamineDAO {
    //    ��ע��ѧ��id���� examine��
    void addStuIdToExam(ExamineEntity examineEntity);

//    ��ѯ�����д���˵�ע����Ϣ
    List showExam(ExamineEntity examineEntity);

//    ��ѯδ��˵�ѧ��id
    List queryStuidByExam(ExamineEntity examineEntity);

//  ��˲���
    void setExamStatus(int examStatus,int stuId);
}
