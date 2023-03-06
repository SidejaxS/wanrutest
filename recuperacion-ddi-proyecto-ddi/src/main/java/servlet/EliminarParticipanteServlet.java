package servlet;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import model.Equipos;
import repository.EquiposRepository;
import repository.IntegranteRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EliminarParticipante")
public class EliminarParticipanteServlet extends BaseServlet{
    
    IntegranteRepository repositoryIntegrante = new IntegranteRepository();
    EquiposRepository repository = new EquiposRepository();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("id participante: " + req.getParameter("idParticipante"));
        repositoryIntegrante.delete(Integer.parseInt(req.getParameter("idParticipante")));
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DetallesEquipos");
		dispatcher.forward(req, resp);
    }
}
