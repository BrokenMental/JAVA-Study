package upCast;

public class Human {
	public static void main(String args[]) {
		
		//bap 인스턴스 생성 시 Bap 클래스의 생성자 "밥이 만들어졌다."가 출력됨
		Bap bap = new Bap(); //밥이 만들어졌다.
		bap.eat(); //밥을 먹는다.
		
		//Error, 다운캐스팅은 업캐스팅이 선행 되어야 함
		//BibimBap bibap0 = (BibimBap) bap;
		//bibap0.eat();
		
		//BockemBap 클래스의 생성자가 존재하지 않으므로 상속받은 Bap클래스의 생성자 "밥이 만들어졌다." 가 출력됨
		Bap bokbap1 = new BockemBap(); //밥이 만들어졌다.
		
		//상속한 Bap도 동일하게 eat() 메서드가 존재하지만, Override를 통해서 덮어썼기 때문에 BockemBap 클래스에 존재하는 eat() "뽀까먹어야 제맛이지~" 가 출력됨
		bokbap1.eat(); //뽀까먹어야 제맛이지~
		
		Bap bibap1 = new BibimBap(); //밥이 만들어졌다.
		bibap1.eat(); //비벼먹어야 제맛이지~
		
		bap.selctEat(bokbap1); //뽀까먹어야 제맛이지~
		bap.selctEat(bibap1); //비벼먹어야 제맛이지~
		
		BockemBap bokbap2 = new BockemBap(); //밥이 만들어졌다.
		bap.selctEat(bokbap2); //뽀까먹어야 제맛이지~
		
		BibimBap bibap2 = new BibimBap(); //밥이 만들어졌다.
		bap.selctEat(bibap2); //비벼먹어야 제맛이지~
		
		

		Drink drink0 = new Drink(); //물이 있다. 물을 마신다.
		drink0.state(); //null 시원하다!
		drink0.DrinkStr(); //null!
		
		Tansan tansan0 = new Tansan("탄산"); //물이 있다. 물 대신 탄산를(을) 마신다.
		tansan0.state(); //목이 따갑다!
		tansan0.TansanStr(); //탄산!
		
		Eon eon0 = new Eon("이온"); //물이 있다. 물 대신 이온를(을) 마신다.
		eon0.state(); //갈증이 풀린다!
		eon0.EonStr(); //이온!
		
		Drink drink1 = new Tansan("탄산"); //물이 있다. 물 대신 탄산를(을) 마신다.
		drink1.state(); //목이 따갑다!
		//drink1.TansanStr(); //찾을 수 없음
		drink1.DrinkStr(); //탄산!
		
		Drink drink2 = new Eon("이온"); //물이 있다. 물 대신 이온를(을) 마신다.
		drink2.state(); //갈증이 풀린다!
		//drink2.EonStr(); //찾을 수 없음
		drink1.DrinkStr(); //이온!
		
	}
}
