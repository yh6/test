package p08;

public class Exam {
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,3,4};
		
		int cnt = 0;
		for(int i=0;i<nums1.length;i++) {
			int checkNums = nums1[i];
			for(int j=0;j<nums2.length;j++) {
				if(nums2[j]==checkNums) {
					cnt++;
					System.out.println(nums2[j] + "==" + checkNums + ":" + (nums2[j]==checkNums));
				}
			}
		}
		System.out.println("nums1과 num2가 같은 값을 가진 갯수는 " + cnt);;
/*		for(int i=0;i<nums1.length;i++) {
			System.out.println(nums1[i]);
			for(;;) {
				
			}
		}
		}*/
	//}
	}
}