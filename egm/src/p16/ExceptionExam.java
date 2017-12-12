package p16;

import java.util.Scanner;
//예외처리(Exception)처리
public class ExceptionExam {
	public void convertAndPrint(String numStr) throws Exception {
		System.out.println(Integer.parseInt(numStr)+1);
		/*try {
			System.out.println(Integer.parseInt(numStr)+1);
		}catch(Exception e) {
			System.out.println("숫자를 적어야지");
		}
		System.out.println(Integer.parseInt(numStr));*/
	}	
		public static void main(String[] args) {
			ExceptionExam ee = new ExceptionExam();
		    System.out.println("출력하실 숫자를 적어주세요");
			Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			try {
				ee.convertAndPrint(str);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("숫자를 적어달라고 햇잔나요");
				System.out.println("출력하실 숫자를 적어주세요");	
				try  {
					ee.convertAndPrint(str);
				}catch (Exception el) {
					System.out.println("숫자를 적어달라고 햇잔나요");
				}
				//e.printStackTrace();
			}
		}
	}

