package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.SQLException;

public class BaseDAO {
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    protected Session getSession() {
        return sessionFactory.openSession();
    }

    /*
    ���浥һʵ������Ϣ
     */
    protected boolean saveEntity(Object object){
        Session session=getSession();

        Transaction tx=session.beginTransaction();//��������
        try{
            session.save(object);
            tx.commit();    //�ύ����
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
