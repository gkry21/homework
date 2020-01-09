package sp4j.jcp.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sp4j.tbl.dao.CEUNJIDAO;
import sp4j.tbl.model.CUCUIF;

//비즈니스 로직 입력 인터페이스의 업무를 담당

@Service("eunjiService")
public class EUNJIServiceImpl implements EUNJIService{

	@Resource(name="ceunjiDAO")
	private CEUNJIDAO ceunjiDAO;
	
	@Override
	public CUCUIF selectCusInfo(Map<String, Object> map) {
		return ceunjiDAO.selectCustInfo(map);
	}

	@Override
	public void insertCusInfo(Map<String, Object> map) {
		ceunjiDAO.insertCusInfo(map);
	}
}
