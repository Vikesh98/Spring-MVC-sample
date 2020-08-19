package com.vikesh;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController 
{
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HtppServletResponsse response)
	{
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		int sum=i+j;
		
		ModelAndView mv=new  ModelAndView();
		mv.setView("display.jsp");
		mv.addObject("result",sum);
		return mv;
	}
}
