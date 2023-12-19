package it.betacom.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExample
 */
@WebServlet(description = "Servlet di esempio", urlPatterns = { "/ServletExample" })
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recupera i parametri dalla richiesta
        String nome = request.getParameter("nome");
        String cognome = request.getParameter("cognome");
        String sesso = request.getParameter("sesso");
        String luogoNascita = request.getParameter("luogo-nascita");
        String citta = request.getParameter("citta");
        String dataNascita = request.getParameter("data-nascita"); 
        String codiceFiscale = request.getParameter("codice-fiscale");
        String password = request.getParameter("password");
        String fonte = request.getParameter("fonte");

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("Nome: " + nome);
            out.println("Cognome: " + cognome);
            out.println("Sesso: " + sesso);
            out.println("Luogo di Nascita: " + luogoNascita);
            out.println("Città: " + citta);
            out.println("Data di Nascita: " + dataNascita);
            out.println("Codice Fiscale: " + codiceFiscale);
            out.println("Password: " + password);
            out.println("Fonte: " + fonte);
        }
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
