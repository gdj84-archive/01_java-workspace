package com.br.collection.run;

import com.br.collection.view.MusicView;

public class MusicProgram {
	
	/*
	 * * MVC 패턴 : 각 클래스마다 역할(데이터담당, 화면담당, 요청처리담당)을 부여해서 작업 
	 * 				=> 후에 유지보수 용이 함! 
	 * 
	 * ㄴ M(Model)		: 데이터를 담당하는 역할 
	 * 					  > 데이터들을 담기위한 클래스 vo
	 * 					  > 비즈니스 로직을 처리하기 위한 클래스 service
	 * 					  > 데이터 보관함과 직접 접근해서 입출력 하는 클래스 dao
	 * 
	 * ㄴ V(View)		: 화면을 담당하는 역할 (즉, 사용자에게 보여지는 시각적인 요소)
	 * 					  출력문(print), 입력문(scanner)
	 * 
	 * ㄴ C(Controller)	: 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할 
	 * 
	 * 
	 *   실행용클래스 --실행--> 화면(View) --요청(메소드호출)--> 컨트롤러(Controller)
	 *   						결과출력   <-----결과반환-------  요청처리 결과 반환
	 * 
	 * 
	 */
	

	public static void main(String[] args) {
		
		MusicView mv = new MusicView();
		mv.mainMenu();

	}

}
