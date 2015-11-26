package interfaces.Servlets;

import interfaces.PO.ClientPO;
import interfaces.Services.OperatorService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by echerkas on 25.11.2015.
 */

public class GetClients extends HttpServlet {

    private OperatorService operatorService;


        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {
            req.getParameter("clients");
            List <ClientPO> clients = operatorService.getClients();
            req.setAttribute("clients", clients);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("getClients.jsp");
            dispatcher.forward(req, resp);



//            req.setAttribute("name", "Hell");
//            req.getRequestDispatcher("index.jsp").forward(req, resp);
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
