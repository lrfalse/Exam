package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import service.IUserService;
import vo.StudentEntity;
import vo.UserEntity;

import java.util.Map;

public class UserAction extends ActionSupport {
    private UserEntity userEntity;      //���յ�¼����������û���Ϣ.
    private StudentEntity studentEntity;    //���ܹ���Ա���ͨ����ѧ����Ϣ


    private IUserService userService;

    //    �û���½
    public String login() {
        UserEntity u = userService.validateUser(userEntity.getUserEmail(), userEntity.getUserPassword(), userEntity.getUserPermit());
        if (u != null) {
            Map<String, Object> session = ActionContext.getContext().getSession();

//            ����˴λỰ��Ϣ
            session.put("user", u);
            return SUCCESS;
        }
        return ERROR;
    }


    //    set��get
    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }


    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}
