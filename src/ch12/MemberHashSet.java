package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	public HashSet<Member> hashSet; //ArrayList ����
	
	public MemberHashSet() {
		hashSet = new HashSet<>(); //����� ������ ArrayList ����
	}
	public MemberHashSet(int size) {  //ArrayList �� ��� �߰�
		hashSet = new HashSet<>(size);
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) { //��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){            // ������̵� �Ű������� ��ġ�ϸ� 
				hashSet.remove(member);           // �ش� ����� ����
				return true;                   // true ��ȯ
			}
		}


		System.out.println(memberId+"�� ���������ʽ��ϴ�."); //for �� ������ ���� return �� �ȵȰ��
		return false;
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
