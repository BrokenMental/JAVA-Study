package upCast;

public class Drink {
	
	private String obj;

	Drink(){
		System.out.println("물이 있다. 물을 마신다");
	}
	
	Drink(String obj){
		System.out.println("물이 있다. 물 대신 "+obj+"를(을) 마신다.");
		this.obj = obj;
	}
	
	public void state() {
		System.out.println(obj+" 시원하다!\n");
	}

	public void DrinkStr() {
		System.out.println(obj+"!\n");
	}
}