package stu02;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.text.AbstractDocument.LeafElement;

public class Character {
	String name;  //캐릭명
	private ArrayList<Hero> heroes;
	
	
	public void status(String name, String job) {
		Hero heros = null;
		heros = new Knight();
		System.out.println("<상태보기>");
		System.out.println("\t 이름: " + name);
		if(job.equals(heroes.getClass())))
	}
	
	public Character(){
		heroes = new ArrayList<Hero>();
	}

	public static void main(String[] args) throws InterruptedException {
		
		Character heroStatus = new Character();
		
		Character wizard = new Character();
		wizard.status("레오나","wizard");

		Character knight = new Character();
		knight.status("아다스","knight");

		while (knight.hp > 0 && wizard.hp > 0) {
			// 지연시간을 줘서 게임을 재밋게 만듬
			Thread.sleep(300);

			// 랜덤한 공격을 만들기위해 랜덤 클래서 사용!
			

			// 레오가 때림
			if (isWizardrandomAttack()) {
				wizard.punch(knight);
				knight.status();
			} else {
				// 아다스가 때림
				knight.punch(wizard);
				wizard.status();
			}
		}
	}

	public static boolean isWizardrandomAttack() {
		Random random = new Random();
		boolean isWizardTurn = random.nextBoolean();
		return isWizardTurn;
	}

	public void punch(Character enermy) {

		int damage = 10;

		enermy.hp -= damage;
	}
}
