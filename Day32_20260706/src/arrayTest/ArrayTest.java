package arrayTest;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열(Array)
		// - 여러개의 값을 한번에 저장하는 공간
		// 학생 이름을 5개 저장한다. 
		// 민지, 민수 ,지수,영희 , 철수
		
		String stu1 = "민지";
		String stu2 = "민수";
		String stu3 = "지수";
		String stu4 = "영희";
		String stu5 = "철수";
		
		// 배열을 이용한다. 
		// 자바에서는 {}
		// 자바스크립트에서는 []
		// 배열 타입[]
		String[] students = {"민지","민수","지수","영희","철수"};
		
		// 민지만 출력하고 싶다! 
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
			
		
		// 정수 5개를 저장하는 배열 
		int[] nums = {1,2,3,4,5};
		
		// 피보나치 수열
		System.out.println(nums[0]);
		System.out.println(nums[0] + nums[1]);
		System.out.println(nums[0] + nums[1] + nums[2]);
		System.out.println(nums[0] + nums[1] + nums[2] + nums[3]);
		System.out.println(nums[0] + nums[1] + nums[2] + nums[3] + nums[4]);
		
		// 실수 3개 저장하는 배열 
		double[] nums2 = {1.1,2.2,3.3};
		
		// 신입 개발자들이 가장 많이 내는 에러!
		// ArrayIndexOut 정말 흔한 버그!
		// 내가 공간의 번호가 넘어갔구나!
//		System.out.println(nums2[3]);에러
		System.out.println(nums2[2]);
		
		// 자바스크립트는 하나의 공간에 숫자,문자 넣었는데? 자바는 안되나요?
		// 안됩니다!
		// 자바는 같은 타입만 저장 가능하다!
		
		
	}
}
