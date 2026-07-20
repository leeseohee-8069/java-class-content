package test;

// 에코폴더 안에 국민은행 파일이 있다.!
import echo.국민은행;

public class TestMain {

	public static void main(String[] args) {
		
		국민은행 서울지점 = new 국민은행();
		서울지점.체인점명 = "서울시 종로구지점";
		System.out.println(서울지점.체인점명);
	}

}
