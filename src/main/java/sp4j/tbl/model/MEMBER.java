package sp4j.tbl.model;

public class MEMBER {
	/**고객 아이디*/
	private String memid;
	/**고객 비밀번호*/
	private String memPwd;
	/**고객 이름*/
	private String memNm;
	
	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {
		this.memid = memid;
	}
	public String getMemPwd() {
		return memPwd;
	}
	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}
	public String getMemNm() {
		return memNm;
	}
	public void setMemNm(String memNm) {
		this.memNm = memNm;
	}
}
