package demo2;




import demo2.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dor")
public class DorServlet extends HttpServlet {

    public static final String VIEW = "/dor.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("user",new User("Zura","Tikaradze",2));

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
        view.forward(req, resp);
    }
}
