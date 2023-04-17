package me.vital1ks.lab2;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 2L;
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext sc = getServletContext();
        sc.getRequestDispatcher("/jsp/read.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathStr = "C:\\Users\\Vitalya\\eclipse-workspace\\lab2\\src\\main\\webapp\\datadata.json";
		Path path = Paths.get(pathStr);
		response.setContentType("application/json");
		String jsonArrayString="1";
		System.out.println(Files.exists(path));
		if(Files.exists(path)) {
			jsonArrayString = Files.readString(path);
		}
		PrintWriter out = response.getWriter();
		System.out.println(jsonArrayString);
		out.print(jsonArrayString);
		out.close();
	}

}
