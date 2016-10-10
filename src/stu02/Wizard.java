package stu02;

public class Wizard implements Hero {
	public static final String JOB = "Wizard";
	public static final int HP =  150 ;
	public static final String ATTACK = "fireball";
	
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
