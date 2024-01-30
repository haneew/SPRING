package p2;

import java.util.Scanner;

public class Toy {
	private Battery battery;
	private String text;
	private Scanner sc;
	
	public Toy(Battery battery) {
		this.battery = battery;
		text = "뚠뚠따라뚠뚜뚜뚠 챱!";
		sc= new Scanner(text);
	}
	
	public void run() {
		if(sc.hasNextLine() && battery.getEnergy() >= 15) {
			String line = sc.nextLine();
			System.out.println(line);
			battery.useEnergy();
		}
		else if(sc.hasNextLine() == false) {
			sc = new Scanner(text);
		}
		else {
			System.out.println("에너지가 없습니다.");
		}
	}
}
