package sp4j.tbl.model;

//컬럼 게터세터 컬럼 저장소

public class CUCUIF {
	/** 고객_아이디 */
	private String cusId;
	
	/** 고객_비밀번호 */
	private String cusPwd;

	/** 고객_이름 */
	private String cusNm;

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusPwd() {
		return cusPwd;
	}

	public void setCusPwd(String cusPwd) {
		this.cusPwd = cusPwd;
	}

	public String getCusNm() {
		return cusNm;
	}

	public void setCusNm(String cusNm) {
		this.cusNm = cusNm;
	}
}
