package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	public HashSet<Member> hashSet; //ArrayList 선언
	
	public MemberHashSet() {
		hashSet = new HashSet<>(); //멤버로 선언한 ArrayList 생성
	}
	public MemberHashSet(int size) {  //ArrayList 에 멤버 추가
		hashSet = new HashSet<>(size);
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) { //멤버 아이디를 매개변수로, 삭제 여부를 반환
		
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면 
				hashSet.remove(member);           // 해당 멤버를 삭제
				return true;                   // true 반환
			}
		}


		System.out.println(memberId+"가 존재하지않습니다."); //for 가 끝날때 까지 return 이 안된경우
		return false;
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
