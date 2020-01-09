package sp4j.jcp.service;

import java.util.Map;

import sp4j.tbl.model.CUCUIF;

//비즈니스 로직은 자주 변한다. 변화에 대응해 확장을 즉각적으로 대처할 수 있게 인터페이스를 둔다.

public interface EUNJIService {

	public CUCUIF selectCusInfo(Map<String, Object> map);

	public void insertCusInfo(Map<String, Object> map);

}
