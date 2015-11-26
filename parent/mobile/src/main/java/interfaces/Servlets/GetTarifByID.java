package interfaces.Servlets;

import interfaces.PO.TarifPO;
import interfaces.Services.ClientService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by echerkas on 26.11.2015.
 */
public class GetTarifByID extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getParameter("id");
        long id = ClientService.getTarif();
        req.setAttribute("id", TarifPO.class);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
