package stu01;

import java.util.Random;

import javax.swing.text.AbstractDocument.LeafElement;

public class Character {
	
	//
	String name;
	int hp;

	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void status() {
		System.out.println("<상태보기>");
		System.out.println("\t 이름: " + name);
		System.out.println("\t HP: " + hp);
	}

	public static void main(String[] args) throws InterruptedException {
		Character wizard = new Character("레오나", 200);
		wizard.status();

		Character knight = new Character("아다스", 200);
		knight.status();

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
