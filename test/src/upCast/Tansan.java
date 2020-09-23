package upCast;

public class Tansan extends Drink {

	Tansan(String obj) {
		super(obj);
	}

	@Override
	public void state() {
		System.out.println("목이 따갑다!\n");
	}

	public void TansanStr() {
		System.out.println("탄산!\n");
	}
}
