package protocol;

import java.io.Serializable;
import java.util.Map;

public class Message implements Serializable{
	private static final long serialVersionID = 1004;
	
	private int cood;
	private Map<String, Object> params;
	
	public int getCood() {
		return cood;
	}
	public void setCood(int cood) {
		this.cood = cood;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	
}
