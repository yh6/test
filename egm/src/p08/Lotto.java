package p08;

import java.util.Random;

public class Lotto {
	private int[] lottoNums;
	private int lottoMaxNum;
	private int checkRandomNum;
	private int checkLottoNums;
	public Lotto() {
		//this.lottoNums = new int[6];
		//his.lottoMaxNum = 45;
		this(6,45);
		//this(6;)
	}
	public Lotto(int lottoNumslength) {
		this(LottoNumsLength,45);
	} // 오버로딩
	public Lotto(int lottoNumsLength, int lottoMaxNum) {
		this.lottoNums = new int[lottoNumsLength];
		this.lottoMaxNum = lottoMaxNum;
	}
	void setchackLootoNums(int[] checkLottoNums) {
	 this.checkLottoNums = checkLottoNums;
	}
	
	void printMachLottoNums() {
		
	}
	void makeLottoNums() {
		Random r = new Random();
		for(int i=0;i<lottoNums.length;i++) {
			checkRandomNum = r.nextInt(lottoMaxNum)+1;
		    if(isDupl()) {
		    	i--;
			}else {
				lottoNums[i] = checkRandomNum;
	}
		}
	}
	private boolean isDupl() { 
		for(int i=0;i<lottoNums.length;i++) {
			if(lottoNums[i]==checkRandomNum) {
				return true;			
			}
		}
		return false;
	}	
	void printLottoNums() {
		for(int i=0;i<lottoNums.length;i++) {
			System.out.print(lottoNums[i] + ",");
		}
	}
	
	public static void main(String[] args) {
		int[] lottoNums = new int[6];
	    Lotto lt = new Lotto();
	    //로또추첨
	    lt.makeLottoNums();
	    
	    //추첨된 로또가 출력
	    lt.printLottoNums();
	    
	    int[] nums = {2,4,5};
	    
	    //내가 입력한 로또번호를 Lotto 변수의 checkLottoNums에 대입
	    lt.setCheckLottoNums(nums);
	    
	    //추첨된 로또 번호의 내가 입력한 로또번호를 비교하여
	    //같은 번호가 있는 갯수를 
	}
      
	}