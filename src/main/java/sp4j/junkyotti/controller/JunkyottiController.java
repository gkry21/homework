package sp4j.junkyotti.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sp4j.common.model.CommandMap;

@Controller
public class JunkyottiController {
	
	@RequestMapping(value = "/junkyotti/login.do")
	public ModelAndView login(CommandMap commandMap,HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		return null;
	}
		
}
