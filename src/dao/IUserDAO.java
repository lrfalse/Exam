package dao;

import vo.UserEntity;

public interface IUserDAO {

    //    �û���½ʱ����֤�û���Ϣ
    UserEntity validateUser(String userName, String password, int permit);

    UserEntity addUser(UserEntity userEntity);
}
