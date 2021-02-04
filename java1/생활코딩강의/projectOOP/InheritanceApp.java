class Cal{
	int v1, v2; // 변수 선언 
	Cal(int v3, int v4) { // 생성자 선언 
		System.out.println("Cal init!");
		this.v1 = v3; this.v2 = v4; // 변수에 생성자 정보 대입하기 
	}
	public int sum() {
		return this.v1+v2;
	}
}

class Cal3 extends Cal{
	Cal3(int v5, int v6) { // 생성자 선언 
		super (v5, v6); // 부모 클래스 호출하기 
// Cal3으로 받은 생성자 정보가 Cal의 생성자 정보로 들어간 후 Cal 클래스 내부 변수에 저장됨. 
		System.out.println("Cal3 init!");
	}
	public int minus() {
		return this.v1-v2;
	}
}


public class InheritanceApp {
	public static void main(String[] args) {
		
		Cal c = new Cal(2, 1); 
		Cal3 c3 = new Cal3(4, 2);
		System.out.println(c.sum()); // 3
		System.out.println(c3.sum()); // 6
		System.out.println(c3.minus()); // 2
		
	}
}
