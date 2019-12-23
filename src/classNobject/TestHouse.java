package classNobject;

public class TestHouse {

	public static void main(String[] args) {
		
		House myHouse = new House();
		myHouse.kitchen();
		myHouse.livingRoom();
		
		Calculator cal1 = new Calculator();
		int total = cal1.addition(100, 105);
		System.out.println(" "+total);
		
		
		Calculator cal2 = new Calculator();
		int total11 = cal2.subtraction(200, 100);
		System.out.println( " " +total11);
		
		Calculator cal3 = new Calculator();
		int total12 = cal3.multiplication(50,10);
		System.out.println( " " +total12);
		
		Calculator cal4 = new Calculator();
		int total14 = cal4.division(50,10);
		System.out.println(" "+ total14);
		System.out.println(".................");
		
		System.out.println( " " +total+ " " + total11 + " " + total12 + " " + total14);
		
		
		House yourHouse = new House();
		yourHouse.livingRoom();
	}

}
