package sp4j.common.utility;

public class StringUtil {
	/** null �����͸� string���� ��ȯ */
	public static String isNullStr(Object str){
		String result = "";
		if(str == null){
			result = "";
		}else{
			result = str.toString();
		}
		return result;
	}
}
