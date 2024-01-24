package service;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.member_dao;
import DTO.member;

public class member_service implements member_action {
	private member_dao mdao = new member_dao();

	public String emailList() {
		public String action(HttpServletRequest request, HttpServletResponse response) throws IOException  {
			
		if(request.getParameter("cmd") == null) {
		   request.setAttribute("prt", "member/signup");
		   request.setAttribute("emailList", emailList());
		   return "/";
		} else {
			String email = request.getParameter("email");
			String pw  = request.getParameter("pin");
			String name = request.getParameter("name");
			String tel = request.getParameter("tel");
			
			mdao.insert(new member(email, pw, name, tel));
			
			response.sendRedirect("/members/signIn");
			
			return null;
		}
	}
	

	
	
}
}