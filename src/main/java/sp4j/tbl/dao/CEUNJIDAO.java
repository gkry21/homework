package sp4j.tbl.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import sp4j.common.dao.AbstractDAO;
import sp4j.tbl.model.CUCUIF;

//SQL이랑 소통하기

@Repository("ceunjiDAO")
public class CEUNJIDAO extends AbstractDAO{

	public CUCUIF selectCustInfo(Map<String, Object> map) {
		return (CUCUIF) selectOne("cucuif.selectCusInfo", map);
	}

	public void insertCusInfo(Map<String, Object> map) {
		insert("cucuif.insertCusInfo", map);
	}
}
