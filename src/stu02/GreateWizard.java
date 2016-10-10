package stu02;

public class GreateWizard implements Hero {
	public static final String JOB = "GreateWizard";
	public static final int HP =  300 ;
	public static final String ATTACK = "tornado";
	
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
