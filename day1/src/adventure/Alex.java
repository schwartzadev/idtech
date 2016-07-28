package adventure;

import java.util.Scanner;
import java.util.Random;


public class Alex {
	public int health = 150;
	public int damage = 15;
	public int recharge = 10;
	public int multiplier = 1;

	// stats method: prints player stats
	public static void stats (Alex x) {
		if (x.health <= 0) {
		System.out.println("    " + Main.compId + " is dead");
		}
		else {
			System.out.println("    Your health: " + x.health);
		}
	}

	// battle methods below (4x): loops until one player is dead
	
	// Alex v Alex
		public static void battle (Alex player, Alex comp) { 
			boolean continueBattle = true;
			int move = 0;
			while (continueBattle == true){
				System.out.println("Do you want to (1) attack or (2) recharge?");
				Scanner scanner = new Scanner(System.in);
				move = scanner.nextInt();
				Random random = new Random();
				int multi=random.nextInt(5);
				if (move == 1) {
					if (multi > 0) {
						player.health = player.health - comp.damage;
						System.out.println("You attacked. The computer lost " + comp.damage + " health.");
					}
					else if (multi == 0) {
						player.health = player.health - ((2) * comp.damage);
						System.out.println("You attacked and got a critical hit. The computer lost " + (comp.damage * 2) + " health.");
					}
					comp.stats(comp);
					player.stats(player);
				}
				else if (move == 2) {
					player.health = player.health + player.recharge;
					System.out.println("You recharged " + player.recharge + " health.");
					if (player.health <= 0 || comp.health <= 0) {
						continueBattle = false;
					}
					comp.stats(comp);
					player.stats(player);
				}
				if (player.health <= 0 || comp.health <= 0) {
					continueBattle = false;
				}
				else {
					Random randomTwo = new Random();
					int compTurn=randomTwo.nextInt(2);
					int compMulti=randomTwo.nextInt(12);
					if (compTurn == 0) {
						if (compMulti > 0) {
							player.health = player.health - comp.damage;
							System.out.println("The computer attacked. You lost " + comp.damage + " health.");
						}
						else if (compMulti == 0) {
							player.health = player.health - ((2) * comp.damage);
							System.out.println("The computer got a critical hit. You lost " + (comp.damage * 2) + " health.");
						}
						if (player.health <= 0 || comp.health <= 0) {
							continueBattle = false;
						}
						comp.stats(comp);
						player.stats(player);
					}
					else if (compTurn == 1) {
						comp.health = comp.health + comp.recharge;
						System.out.println("The computer recharged " + comp.recharge + " health.");
						if (player.health <= 0 || comp.health <= 0) {
							continueBattle = false;
						}
						comp.stats(comp);
						player.stats(player);

					}
				}
			}
			if (comp.health <= 0 && player.health <= 0) {
				System.out.println("It's a tie!");
			}
			else if (player.health <= 0) {
				System.out.println("You lose!");
			}
			else if (comp.health <= 0) {
				System.out.println("You win!");
			}
		}





		// Alex v Jane
		public static void battle (Alex player, Jane comp) { 
			boolean continueBattle = true;
			int move = 0;
			while (continueBattle == true){
				System.out.println("Do you want to (1) attack or (2) recharge?");
				Scanner scanner = new Scanner(System.in);
				move = scanner.nextInt();
				Random random = new Random();
				int multi=random.nextInt(5);
				if (move == 1) {
					if (multi > 0) {
						player.health = player.health - comp.damage;
						System.out.println("You attacked. The computer lost " + comp.damage + " health.");
					}
					else if (multi == 0) {
						player.health = player.health - ((2) * comp.damage);
						System.out.println("You attacked and got a critical hit. The computer lost " + (comp.damage * 2) + " health.");
					}
					comp.stats(comp);
					player.stats(player);
				}
				else if (move == 2) {
					player.health = player.health + player.recharge;
					System.out.println("You recharged " + player.recharge + " health.");
					if (player.health <= 0 || comp.health <= 0) {
						continueBattle = false;
					}
					comp.stats(comp);
					player.stats(player);
				}
				if (player.health <= 0 || comp.health <= 0) {
					continueBattle = false;
				}
				else {
					Random randomNew = new Random();
					int compTurn=randomNew.nextInt(2);
					if (compTurn == 0) {
						if (multi > 0) {
							player.health = player.health - comp.damage;
							System.out.println("The computer attacked. You lost " + comp.damage + " health.");
						}
						else if (multi == 0) {
							player.health = player.health - ((2) * comp.damage);
							System.out.println("The computer attacked and got a critical hit. You lost " + (comp.damage * 2) + " health.");
						}
						comp.stats(comp);
						player.stats(player);
					}
					else if (compTurn == 1) {
						comp.health = comp.health + comp.recharge;
						System.out.println("The computer recharged " + comp.recharge + " health.");
						if (player.health <= 0 || comp.health <= 0) {
							continueBattle = false;
						}
						comp.stats(comp);
						player.stats(player);
					}
				}
			}
		}

		// Alex v Ned
		public static void battle (Alex player, Ned comp) { 
			boolean continueBattle = true;
			int move = 0;
			while (continueBattle == true){
				System.out.println("Do you want to (1) attack or (2) recharge?");
				Scanner scanner = new Scanner(System.in);
				move = scanner.nextInt();
				Random random = new Random();
				int multi=random.nextInt(5);
				if (move == 1) {
					if (multi > 0) {
						player.health = player.health - comp.damage;
						System.out.println("You attacked. The computer lost " + comp.damage + " health.");
					}
					else if (multi == 0) {
						player.health = player.health - ((2) * comp.damage);
						System.out.println("You attacked and got a critical hit. The computer lost " + (comp.damage * 2) + " health.");
					}
					comp.stats(comp);
					player.stats(player);
				}
				else if (move == 2) {
					player.health = player.health + player.recharge;
					System.out.println("You recharged " + player.recharge + " health.");
					if (player.health <= 0 || comp.health <= 0) {
						continueBattle = false;
					}
					comp.stats(comp);
					player.stats(player);
				}
				if (player.health <= 0 || comp.health <= 0) {
					continueBattle = false;
				}
				else {
					Random randomNew = new Random();
					int compTurn=randomNew.nextInt(2);
					if (compTurn == 0) {
						if (multi > 0) {
							player.health = player.health - comp.damage;
							System.out.println("The computer attacked. You lost " + comp.damage + " health.");
						}
						else if (multi == 0) {
							player.health = player.health - ((2) * comp.damage);
							System.out.println("The computer attacked and got a critical hit. You lost " + (comp.damage * 2) + " health.");
						}
						comp.stats(comp);
						player.stats(player);
					}
					else if (compTurn == 1) {
						comp.health = comp.health + comp.recharge;
						System.out.println("The computer recharged " + comp.recharge + " health.");
						if (player.health <= 0 || comp.health <= 0) {
							continueBattle = false;
						}
						comp.stats(comp);
						player.stats(player);
					}
				}
			}
		}
}
