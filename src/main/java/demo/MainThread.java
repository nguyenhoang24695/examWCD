package demo;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernameUtil;

public class MainThread {
    public static void main(String[] args) {
        Session session = HibernameUtil.getSessionFactory().openSession();

        Transaction transaction = null;
        try {
            session.beginTransaction();
            session.save(Student.Builder.aStudent()
                    .addFullName("Nguyen Hoang")
                    .addEmail("hoangnguyen@gmail.com")
                    .addRollNumber("A001")
                    .addPhone("099202020")
                    .build());

            transaction.commit();

        }catch (Exception ex){
            if (transaction != null){
                transaction.rollback();
            }
        session.close();
        }

    }
}
