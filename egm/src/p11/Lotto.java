package p11;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	int lottoCnt;
	int joinCnt;
	int n;
	
	
	Lotto() {
		Scanner s = new Scanner(System.in);
		System.out.println("참여인원을 입력해주세요");
		joinCnt = s.nextInt();
		System.out.println("당첨인원을 입력해주세요");
		lottoCnt = s.nextInt();
		s.close();		
	}
		
	int[] getJoins() {		
		return new int[joinCnt];		
	}
	
	int[] getLottos() {		
		return new int[lottoCnt];
	}
	
	void setLottos(int[] lottos) {
		Random r = new Random();
		for(int i=0; i<lottos.length; i++) {
			n = r.nextInt(lottos.length) + 1;
			lottos[i] = n;
			if(isDupl(lottos, i)) {
				i--;				
			}					
			
		}		
	}
		
	
	boolean isDupl(int[] lottos, int maxNum) {		
		for(int j=0; j<maxNum; j++) {
			if(lottos[maxNum] == lottos[j]) {
				return true;
			}			
		}		
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Lotto l = new Lotto();
		int[] joins = l.getJoins();  // 리턴 값을 받을 때 데이터 타입은 같아야된다!!
		int[] lottos = l.getLottos();  // 리턴 값을 받을 때 데이터 타입은 같아야된다!!		
		l.setLottos(joins);
		
		System.out.print("당첨된 사람의 번호 : ");
		String str = "";
		
		for(int i=1; i<=lottos.length; i++) {
			for(int j=0; j<joins.length; j++) {
				if(i == joins[j]) {
					str += j + ", ";
				}				
			}
		}
		
		System.out.print(str.substring(0, str.length()-2));		
		
	}

}
