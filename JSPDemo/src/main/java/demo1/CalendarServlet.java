package demo1;

import demo1.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;



@WebServlet("/calendar")
public class CalendarServlet extends HttpServlet {

    public static final String VIEW = "/calendar.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GregorianCalendar currentDate = new GregorianCalendar();
        int currentYear = currentDate.get(Calendar.YEAR);
        req.setAttribute("currentYear", currentYear);


        req.setAttribute("user",new User("Zura","Tikaradze"));

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
         // System.out.println("ააა");
        // https://stackoverflow.com/questions/29695918/intellij-idea-console-issue
        // https://seunggabi.tistory.com/entry/IntelliJ-set-UTF-8-in-Tomcat-console-log
        view.forward(req, resp);
    }
}
