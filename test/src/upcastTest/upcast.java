package upcastTest;

//참조1 : https://www.inflearn.com/course/%EC%9E%90%EB%B0%94-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%EC%9E%85%EB%AC%B8/lecture/18034?tab=curriculum
//참조2 : https://madplay.github.io/post/java-upcasting-and-downcasting
public class upcast {
	public static void main(String[] args) {
		Student student = new Student("start");
		
		//super class upcast
		Person person1 = student;
		//person class에는 없는 name에 값을 집어넣을 수 있음
		student.name = "hi";
		
		System.out.println("first student.name : " + student.name);		//hi
		System.out.println("first person1.name : " + person1.name);		//hi

		//새로운 인스턴스 생성
		Person person2 = new Customer("end");
		System.out.println("\nsecond student.name : " + student.name);	//hi
		System.out.println("second person1.name : " + person1.name);	//hi
		System.out.println("second person2.name : " + person2.name);	//end 신규 추가
		
		person2.name = "bye";

		System.out.println("\nthird student.name : " + student.name);	//hi
		System.out.println("third person1.name : " + person1.name);		//hi
		System.out.println("third person2.name : " + person2.name);		//bye 변경됨+++++++

		Customer customer = new Customer("and");
		
		//새로운 인스턴스 생성
		Person person3 = customer; 
		System.out.println("\nfourth student.name : " + student.name);	//hi 변화없음
		System.out.println("fourth customer.name : " + customer.name);	//and 신규 추가
		System.out.println("fourth person1.name : " + person1.name);	//hi 변화없음
		System.out.println("fourth person2.name : " + person2.name);	//bye 변화없음
		System.out.println("fourth person3.name : " + person3.name);	//and 신규 추가
		
		//upcast를 통해 super class의 변수에 접근 할 경우, 변수의 값은 공유되지 않고 생성된 인스턴스에 따라 나뉜다.
		person3.name = "good";

		System.out.println("\nfifth student.name : " + student.name);	//hi 변화없음
		System.out.println("fifth customer.name : " + customer.name);	//good 변경됨+++++++
		System.out.println("fifth person1.name : " + person1.name);		//hi 변화없음
		System.out.println("fifth person2.name : " + person2.name);		//bye 변화없음
		System.out.println("fifth person3.name : " + person3.name);		//good 변경됨+++++++
		
		customer.name = "night";
		
		System.out.println("\nfifth student.name : " + student.name);	//hi 변화없음
		System.out.println("fifth customer.name : " + customer.name);	//night 변경됨+++++++
		System.out.println("fifth person1.name : " + person1.name);		//hi 변화없음
		System.out.println("fifth person2.name : " + person2.name);		//bye 변화없음
		System.out.println("fifth person3.name : " + person3.name);		//night 변경됨+++++++
	}
	
}