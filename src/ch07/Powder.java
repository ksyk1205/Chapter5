package ch07;

public class Powder extends Material{
	public String toString() {
		return "재료는 powder 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
		
	}
}
