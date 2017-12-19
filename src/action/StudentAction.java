package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.http.HttpRequest;
import service.IExamineService;
import service.IStudentService;
import vo.ExamineEntity;
import vo.StudentEntity;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public class StudentAction extends ActionSupport {
    private StudentEntity studentEntity;//ѧ��ע��ݽ�����Ϣ
//    private ExamineEntity examineEntity;

    private IStudentService studentService;
    private IExamineService examineService;


    //    ѧ��ע������
    public String apply() {
//        ����ѧ����Ϣ
        boolean addResult = studentService.addStudent(studentEntity);
        if (addResult) {
            studentService.findStuIdByRegister(studentEntity);
            addStuIdToExam();
//            examineEntity.setStuId(stu_id);
//            addStuIdToExam(examineEntity);
            return SUCCESS;
        }
        return ERROR;
    }

    //    ��ע���ѧ��id ����Examine
    private void addStuIdToExam() {
        Map session = ActionContext.getContext().getSession();
        int stu_id = (int) session.get("stu_id");
        ExamineEntity examineEntity = new ExamineEntity();
        examineEntity.setStuId(stu_id);
        examineService.addStuIdToExam(examineEntity);
    }

    //    ��ʾѧ����Ϣ
    public String showStu(){
        StudentEntity studentEntity=new StudentEntity();
        List result=studentService.showStu(studentEntity);
        HttpServletRequest request= ServletActionContext.getRequest();
        request.setAttribute("stuList",result);
        if (result.size()!=0){
            return SUCCESS;
        }
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

    public IExamineService getExamineService() {
        return examineService;
    }

    public void setExamineService(IExamineService examineService) {
        this.examineService = examineService;
    }


}
