package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Maketable")
public class Ex06maketable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		System.out.println("������");

		// ����ڰ� �Է��� ������ ��������!
		String room = request.getParameter("room");
		int roomNum = Integer.parseInt(room);
		
		System.out.println("���޹��� �� >> "+ roomNum);
		
		out.print("<html><head><title> </title></head>");
		out.print("<body><table border=\"1px solid black\"><tr>");
		for(int i=0; i<roomNum;i++) {
			out.print("<td>"+(i+1)+"</td>");
		}
		out.print("</tr></table></body></html>");
	}

}
