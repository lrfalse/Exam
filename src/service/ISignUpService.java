package service;

import vo.ExamEntity;
import vo.SignupEntity;

import java.util.List;

public interface ISignUpService {

    //    ��ӱ�����Ϣ
    boolean addSignUp(SignupEntity signupEntity);

    //    ��ѯ���б�������
    List queryAllSignUp(SignupEntity signupEntity, ExamEntity examEntity);
}
