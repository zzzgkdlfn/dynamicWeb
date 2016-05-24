package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Server
 */
@WebServlet("/Server")
public class Server extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Server() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// read form data
		String itemNum = request.getParameter("itemNum");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String middleName = request.getParameter("middleName");

		String address = request.getParameter("address");
		String cardType = request.getParameter("cardType");

		String cardNum = request.getParameter("cardNum");
		String cardNum2 = request.getParameter("cardNum2");


		String page = "/jsps/result.jsp";
		
		request.setAttribute("itemNum", itemNum);
		request.setAttribute("description", description);
		request.setAttribute("price", price);
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
		request.setAttribute("middleName", middleName);
		request.setAttribute("address", address);
		request.setAttribute("cardType", cardType);
		request.setAttribute("cardNum", cardNum);
		request.setAttribute("cardNum2", cardNum2);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);

		// Build HTML code

//		String htmlResponse = "<html>";
//
//		htmlResponse += "<head>";
//
//		htmlResponse += "<style>";
//		htmlResponse += "h1{text-align:center;}";
//		htmlResponse += "body { background:#ffffd2; }";
//		htmlResponse += "th { background-color:#ffbb00;}";
//		htmlResponse += "table{align:center;}";
//		htmlResponse += "</style>";
//
//		htmlResponse += "</head>";
//
//		htmlResponse += "<body>";
//
//		htmlResponse += "<h1> Reading All Request Parameters </h1> <br/>";
//
//		htmlResponse += "<table border=\"1\" align = center>";
//
//		// 첫 행
//		htmlResponse += "<tr>";
//		htmlResponse += "<th>Parameter Name</th>";
//		htmlResponse += "<th>Parameter Value(s)</th>";
//		htmlResponse += "</tr>";
//
//		// 두번째 행
//		htmlResponse += "<tr>";
//		htmlResponse += "<td>cardNum </td>";
//		htmlResponse += "<td>";
//		htmlResponse += "<ul>";
//		htmlResponse += "<li>" + cardNum + "</li>";
//		htmlResponse += "<li>" + cardNum2 + "</li>";
//		htmlResponse += "</ul>";
//		htmlResponse += "</td>";
//		htmlResponse += "</tr>";
//
//		htmlResponse += "<tr>";
//		htmlResponse += "<td>cardType </td>";
//		htmlResponse += "<td>" + cardType + "</td>";
//		htmlResponse += "</tr>";
//
//		htmlResponse += "<tr>";
//		htmlResponse += "<td>price </td>";
//		htmlResponse += "<td>" + price + "</td>";
//		htmlResponse += "</tr>";
//
//		htmlResponse += "<tr>";
//		htmlResponse += "<td>initial </td>";
//		htmlResponse += "<td>" + middleName + "</td>";
//		htmlResponse += "</tr>";
//
//		htmlResponse += "<tr>";
//		htmlResponse += "<td>itemNum </td>";
//		htmlResponse += "<td>" + itemNum + "</td>";
//		htmlResponse += "</tr>";
//
//		htmlResponse += "<tr>";
//		htmlResponse += "<td>address </td>";
//		htmlResponse += "<td>" + address + "</td>";
//		htmlResponse += "</tr>";
//
//		htmlResponse += "<tr>";
//		htmlResponse += "<td>firstName </td>";
//		htmlResponse += "<td>" + firstName + "</td>";
//		htmlResponse += "</tr>";
//
//		htmlResponse += "<tr>";
//		htmlResponse += "<td>descrition </td>";
//		htmlResponse += "<td>" + descrition + "</td>";
//		htmlResponse += "</tr>";
//
//		htmlResponse += "<tr>";
//		htmlResponse += "<td>lastName </td>";
//		htmlResponse += "<td>" + lastName + "</td>";
//		htmlResponse += "</tr>";
//
//		htmlResponse += "</body>";
//		htmlResponse += "</html>";
//
//		out.println(htmlResponse);
	}

}
