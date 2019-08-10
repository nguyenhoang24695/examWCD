package controller;

import com.google.gson.Gson;
import entity.Phone;
import org.hibernate.Session;
import util.HibernameUtil;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListPhoneController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Session session = HibernameUtil.getSessionFactory().openSession();
//        Query q = session.createQuery("from Phone");
        List<Phone> phones = new ArrayList<>();
        phones = session.createCriteria(Phone.class).list();
        System.out.println(new Gson().toJson(phones));
        req.setAttribute("phones",phones);
//        System.out.println(new Gson().toJson(phoneList));
//        resp.getWriter().println(new Gson().toJson(phoneList));
        req.getRequestDispatcher("/phone/listphone.jsp").forward(req,resp);
    }
}
