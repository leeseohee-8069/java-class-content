package com.yonsai.thread.interfaceTest;

// 고객들에 대한 개발을 할 때 유저들을 가져오는 규칙을 꼭!
// 써라!
// 로그인이든 유저를 검색하는 코드는 개발자마다 각각 다 ~~~~
// 다르다!
public interface UserService {
	public void login();
	public void userSearch();
	public void userJoin();
}
