package interfaces.Servlets;

import interfaces.Implementation.ClientDAOImpl;
import interfaces.Manager;
import interfaces.PO.ClientPO;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by echerkas on 26.11.2015.
 */
public class MyServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {

            List<ClientPO> clientList = new ArrayList<>();

            EntityManager entityManager = Manager.openConnection();
            ClientDAOImpl clientDAO = new ClientDAOImpl(entityManager);

            ClientPO byId = clientDAO.getById(5L);
            Manager.closeConnection(entityManager);
            req.setAttribute("xx", "ремня тебе по жопе");
            req.setAttribute("name", byId.getName());
//
//                ClientPO client = new ClientPO();
//                client.setName(req.getParameter("name"));
//                clientList.add(client);

            //req.setAttribute("ClientPO.name", ClientDAOImpl.class);
            req.getRequestDispatcher("getClientName.jsp").forward(req, resp);

        }

}



//
//            RequestDispatcher dispatcher =
//                    getServletContext().getRequestDispatcher("web/getClientName.jsp");
//            dispatcher.forward(req, resp);

//                    или
//                    <jsp:useBean id='myAttribute' class='anyClass' scope='request'>

//            PrintWriter out = resp.getWriter();
//            out.print("<h1>Hello Servlet</h1>");

