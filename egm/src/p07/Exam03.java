package p07;

import java.util.Random;

public class Exam03 {
	
	public static void main(String[] args) {
		int[] nums = new int[5];
		Random random = new Random(); //import를 시커줘야함
		for(int i=0;i<nums.length;i++) {
			nums[i] = random.nextInt(101);		
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
					
				}
			}
		}
		}
		
	

}
