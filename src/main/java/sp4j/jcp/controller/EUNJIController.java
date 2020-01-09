package sp4j.jcp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sp4j.common.model.CommandMap;
import sp4j.jcp.service.EUNJIService;
import sp4j.tbl.model.CUCUIF;

@Controller
public class EUNJIController {

	@Resource(name="eunjiService")
	private EUNJIService eunjiService;
	
	@RequestMapping(value = "/jcp/eunjilogin.do")
	public ModelAndView login(CommandMap commandMap, HttpServletRequest requset) throws Exception{
		 ModelAndView mv = new ModelAndView("/jcp/EUNJI"); 
		 CUCUIF cusInfo = eunjiService.selectCusInfo(commandMap.getMap());
		 if(cusInfo == null) {
			 mv.addObject("result","제대로 입력해!");
			/*
			 * }else { mv.setViewName("/jcp/EUNJI");
			 */
		 }
		return mv;
	}
	
	@RequestMapping(value = "/jcp/eunjijoin.do")
	public ModelAndView join(CommandMap commandMap) throws Exception{
	 	ModelAndView mv = new ModelAndView("/jcp/EUNJI");
	 	Map<String, Object> map = new HashMap<String, Object>();
	 	map.put("cusId",commandMap.getMap().get("cusId"));
	 	map.put("cusPwd","");
	 	CUCUIF cusInfo = eunjiService.selectCusInfo(map);
	 	
	 	if(cusInfo == null) {
	 		map.put("cusPwd", commandMap.getMap().get("cusPwd"));
	 		map.put("cusNm","앙중고띠");
	 		mv.addObject("result", "가입이 완료되었습니다."	);
	 		eunjiService.insertCusInfo(map);
	 	}else {
	 		mv.addObject("result", "이미 있는 아이디입니다.");
	 	}
	 	
		return mv;
	}
}