package upCast;

public class Bap {
	
	Bap(){
		System.out.println("밥이 만들어졌다.");
	}
	
	public void eat() {
		System.out.println("밥을 먹는다.\n");
	}
	
	public void selctEat(Bap bap) {
		bap.eat();
	}
}