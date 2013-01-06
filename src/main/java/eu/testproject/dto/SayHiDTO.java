package eu.testproject.dto;

import java.io.Serializable;

public class SayHiDTO implements Serializable{

	private static final long serialVersionUID = 7185964198874923671L;
	
	/**
	 * Constructor
	 */
	public SayHiDTO() {
	}

	/**
	 * Constructor
	 */
	public SayHiDTO(String hi, boolean isTest) {
		this.hi = hi;
		this.testBoolean = isTest;
	}

	private String hi;
	
	private boolean testBoolean = Boolean.valueOf(true);

	public String getHi() {
		return hi;
	}

	public void setHi(String hi) {
		this.hi = hi;
	}

	public boolean isTestBoolean() {
		return testBoolean;
	}

	public void setTestBoolean(boolean testBoolean) {
		this.testBoolean = testBoolean;
	}
}
