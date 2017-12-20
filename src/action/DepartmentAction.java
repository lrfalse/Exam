package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import service.IDepartmentService;
import service.IExamineService;
import vo.DepartmentEntity;
import vo.ExamineEntity;

import java.util.Map;

public class DepartmentAction extends ActionSupport {
    private IDepartmentService departmentService;
    private IExamineService examineService;
    private DepartmentEntity departmentEntity;
    private ExamineEntity examineEntity;

    /**
     * ������֯������Ա��Ϣ
     */
    public String addDepartment(){
        if (departmentService.addDepartment(departmentEntity)){
            Map<String, Object> map = ActionContext.getContext().getSession();
            map.put("departmentEntity",departmentEntity);

            addIdToExamine();
            return SUCCESS;
        }
        return ERROR;
    }

    //    ��ע�����֯����id ����Examine
    private void addIdToExamine(){
        Map<String, Object> session = ActionContext.getContext().getSession();
        DepartmentEntity departmentEntity= (DepartmentEntity) session.get("departmentEntity");
        int id=departmentService.findIdByDepartReg(departmentEntity);

        //����exam
        ExamineEntity examineEntity=new ExamineEntity();
        examineEntity.setDepartId(id);
        examineService.addDepartIdToExam(examineEntity);
    }

    public IDepartmentService getDepartmentService() {
        return departmentService;
    }

    public void setDepartmentService(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public DepartmentEntity getDepartmentEntity() {
        return departmentEntity;
    }

    public void setDepartmentEntity(DepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
    }

    public IExamineService getExamineService() {
        return examineService;
    }

    public void setExamineService(IExamineService examineService) {
        this.examineService = examineService;
    }

    public ExamineEntity getExamineEntity() {
        return examineEntity;
    }

    public void setExamineEntity(ExamineEntity examineEntity) {
        this.examineEntity = examineEntity;
    }
}
