package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	public ArrayList<Member> arrayList; //ArrayList ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<>(); //����� ������ ArrayList ����
	}
	public MemberArrayList(int size) {  //ArrayList �� ��� �߰�
		arrayList = new ArrayList<>(size);
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) { //��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		
//		for(int i=0; i<arrayList.size(); i++) { // �ش� ���̵� ���� ����� ArrayList���� ã��
//			Member member = arrayList.get(i);
//			
//			int tempId = member.getMemberId();
//			if(tempId == memberId) { // ������̵� �Ű������� ��ġ�ϸ� 
//				arrayList.remove(i);           // �ش� ����� ����
//				return true;                   // true ��ȯ
//
//			}
//		}
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){            // ������̵� �Ű������� ��ġ�ϸ� 
				arrayList.remove(member);           // �ش� ����� ����
				return true;                   // true ��ȯ
			}
		}


		System.out.println(memberId+"�� ���������ʽ��ϴ�."); //for �� ������ ���� return �� �ȵȰ��
		return false;
	}
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
