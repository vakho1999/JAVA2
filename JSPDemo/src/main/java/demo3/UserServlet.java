package demo3;




import demo2.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userservlet")
public class UserServlet extends HttpServlet {

    public static final String VIEW = "/showUser.jsp";
    User user=new User();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user",user);

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        user.setName(req.getParameter("name"));
        user.setSurname(req.getParameter("surname"));

        System.out.println(user.getName());
        System.out.println(user.getSurname());

    }
}
