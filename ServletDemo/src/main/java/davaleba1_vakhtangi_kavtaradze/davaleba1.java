package davaleba1_vakhtangi_kavtaradze;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/showpet"})
public class davaleba1_vakhtangi_kavtaradze extends HttpServlet {
    public static final String VIEW = "/showpet.jsp";
    User user=new User();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user",user);

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String race = req.getParameter("race");
	String gender = req.getParameter("gender");
	String age = req.getParameter("age");

        System.out.println(name);
        System.out.println(race);
        System.out.println(gender);
        System.out.println(age);

    }
}
