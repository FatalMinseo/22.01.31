package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberOp")
public class Ex04NUmberPlus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		System.out.println("계산시작");

		// 사용자가 입력한 데이터 가져오기!
		String snum1 = request.getParameter("num1");
		String snum2 = request.getParameter("num2");
		String op = request.getParameter("op");
		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		int rs = 0;

		if (op.equals("+")) {
			rs = num1 + num2;
		} else if (op.equals("-")) {
			rs = num1 - num2;
		} else if (op.equals("*")) {
			rs = num1 * num2;
		} else if (op.equals("/")) {
			rs = num1 / num2;
		}
		System.out.println("전달받은 값 >> " + num1 + op + num2 + "=" + rs);

		out.print("<html><head><title>응답결과</title></head>");
		out.print("<body>" + num1 + op + num2 + "=" + rs + "</body></html>");
	}

}
