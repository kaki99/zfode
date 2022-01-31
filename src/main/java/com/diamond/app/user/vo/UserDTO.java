package com.diamond.app.user.vo;

public class UserDTO {

	private String id, pwd;

	public UserDTO() {
		super();
	}

	/**
	 * @param id
	 * @param pwd
	 */
	public UserDTO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pwd=" + pwd + "]";
	}

}
