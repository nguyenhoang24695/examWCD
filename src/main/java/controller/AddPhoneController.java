package controller;

import com.google.gson.Gson;
import entity.Phone;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernameUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddPhoneController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/phone/addphone.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String brand = req.getParameter("brand");
        Long price = Long.parseLong(req.getParameter("price"));
        Phone phone = Phone.Builder.aPhone()
                .withName(name)
                .withBrand(brand)
                .withDescription(description)
                .withPrice(price)
                .build();

        System.out.println(name);
        System.out.println(brand);
        System.out.println(description);
        System.out.println(price);
        Session session = HibernameUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
           transaction =  session.beginTransaction();
            session.save(phone);
            transaction.commit();

        }catch (Exception ex){
            System.out.println(ex);
            if (transaction != null){
                transaction.rollback();
            }

        }

        session.close();
        resp.sendRedirect("/phone/list");

    }
}
