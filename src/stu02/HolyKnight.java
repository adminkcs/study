package stu02;

public class HolyKnight implements Hero {
	public static final String JOB = "HolyKnight";
	public static final int HP =  350 ;
	public static final String ATTACK = "vampireBlood";
	
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
