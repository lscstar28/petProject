package com.pet.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pet.dao.ImageBoardPaging;
import com.pet.dao.PetDAO;
import com.pet.dto.PetDTO;


@WebServlet(name = "Paging", urlPatterns = { "/paging" })
public class PetPaging extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("페이지이이잉");
		
		int pg=Integer.parseInt(request.getParameter("pg"));
		System.out.println("페이지이잉 pg: "+pg);
		
		//DB-Select
//		System.out.println("스테틱 동기화 해야징");
		PetDAO dao=PetDAO.getInstance();
		
		int endNum=pg*3;
		int startNum=endNum-2;
		
		Map<String,Object> map=new HashMap<>();
		map.put("startNum", startNum);
		map.put("endNum", endNum);
//		System.out.println("리스트 해야징");
		List<PetDTO> list=dao.getImageBoardList(map);
		
		//페이징처리                                                       현재페이지,표시할 페이지수,출력할게시물의갯수
		ImageBoardPaging paging=new ImageBoardPaging(pg ,3,3);
		paging.makePagingHTML();                 // pg를 1 2 3으로 수정해 볼것
		
		
		System.out.println("pg: "+pg);
		
		//request객체에 등록
		request.setAttribute("list", list);
		request.setAttribute("pg", pg);
		request.setAttribute("imageBoardPaging", paging);
		
		RequestDispatcher rd = request.getRequestDispatcher("imgboard/imageBoardList.jsp");
		rd.forward(request, response);
	}
}
