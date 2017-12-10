package action;

import com.opensymphony.xwork2.ActionSupport;
import service.IStudentService;
import vo.StudentEntity;

public class StudentAction extends ActionSupport {
    private StudentEntity studentEntity;//ѧ��ע��ݽ�����Ϣ

    private IStudentService studentService;


    //    ѧ��ע������
    public String apply() {
//        ����ѧ����Ϣ
        boolean addResult = studentService.addStudent(studentEntity);
        if (addResult)
            return SUCCESS;
        return ERROR;
    }

//    getting��setting

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public IStudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }
}
