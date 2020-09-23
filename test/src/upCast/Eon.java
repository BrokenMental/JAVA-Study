package upCast;

public class Eon extends Drink {

	Eon(String obj){
		super(obj);
	}

	@Override
	public void state() {
		System.out.println("갈증이 풀린다!\n");
	}

	public void EonStr() {
		System.out.println("이온!\n");
	}
}
