package com.pet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pet.dao.PetDAO;
import com.pet.dto.PetDTO;

@WebServlet(name = "ViewDetails", urlPatterns = { "/details" })
public class view_details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("디테일!!");
		int seq = Integer.parseInt(request.getParameter("seq"));
		int pg = Integer.parseInt(request.getParameter("pg"));
		
		System.out.println("seq: "+seq);
		System.out.println("pg: "+pg);
		
		PetDAO dao = new PetDAO();
		PetDTO dto = dao.details(seq);

		if(dto != null) {
			System.out.println("ok");
			request.setAttribute("dto", dto);
			RequestDispatcher rd = request.getRequestDispatcher("imgboard/details.jsp");
			rd.forward(request, response);
		}else{
			System.out.println("fail");
		}
		
	}
}
