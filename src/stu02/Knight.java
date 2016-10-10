package stu02;

public class Knight implements Hero {
	public static final String JOB = "Knight";
	public static final int HP =  200 ;
	public static final String ATTACK = "bash";
	
	@Override
	public String getJob() {
		return JOB;
	}

	@Override
	public int getHp() {
		return HP;
	}

	@Override
	public String getAttack() {
		return ATTACK;
	}
}
