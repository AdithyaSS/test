package com.cricket.player;

public class Player {
	private int playerNo;
	private String firstName;
	private String lastName;
	private String roleInTeam;
	private String belongToIplTeam;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int playerNo, String firstName, String lastName, String roleInTeam, String belongToIplTeam) {
		super();
		this.playerNo = playerNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roleInTeam = roleInTeam;
		this.belongToIplTeam = belongToIplTeam;
	}

	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRoleInTeam() {
		return roleInTeam;
	}

	public void setRoleInTeam(String roleInTeam) {
		this.roleInTeam = roleInTeam;
	}

	public String getBelongToIplTeam() {
		return belongToIplTeam;
	}

	public void setBelongToIplTeam(String belongToIplTeam) {
		this.belongToIplTeam = belongToIplTeam;
	}

	@Override
	public String toString() {
		return new StringBuilder(String.valueOf(playerNo)).append("\t").append(firstName).append("\t").append(lastName)
				.append("\t").append(roleInTeam).append("\t").append(belongToIplTeam).toString();
	}

}
