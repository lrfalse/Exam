package dao;

import vo.ExamEntity;
import vo.SignupEntity;

import java.util.List;

public interface ISignUpDAO {

//    ��ӱ�����Ϣ
    boolean addSignUp(SignupEntity signupEntity);

//    ��ѯ���б�������
    List queryAllSignUp(SignupEntity signupEntity, ExamEntity examEntity);
}
