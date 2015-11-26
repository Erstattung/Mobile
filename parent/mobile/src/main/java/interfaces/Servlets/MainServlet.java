package interfaces.Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by echerkas on 25.11.2015.
 */

public class MainServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {
            req.setAttribute("name", "Hell");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
//            PrintWriter out = resp.getWriter();
//            out.print("<h1>Hello Servlet</h1>");
//            super.doGet(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {

            super.doPost(req, resp);
        }

    }
