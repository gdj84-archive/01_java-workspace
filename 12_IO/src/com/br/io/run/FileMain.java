package com.br.io.run;

import java.io.File;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) {
		
		/*
		 * < java.io.File >
		 * 
		 * 1. 디렉토리 및 파일을 관리하는 클래스
		 * 2. 특정 디렉토리 및 파일을 만들고 삭제할 수 있음
		 * 3. 특정 디렉토리 및 파일의 정보를 확인할 수 있음 
		 * 
		 * * 윈도우환경 	: \ 로 디렉토리 구분 
		 * * 리눅스|Mac환경 : / 로 디렉토리 구분 
		 * 
		 */
		
		
		
		try {
			
			// 1. 경로 지정하지 않고 파일명 제시해서 생성 => 현재 project폴더 내에 파일생성
			File file1 = new File("test.txt");
			file1.createNewFile(); // 메소드 호출해야만 파일 실제 만들어짐
			System.out.println("test.txt파일이 성공적으로 만들어졌습니다.");
			
			// 2. 존재하는 디렉토리내에 파일 생성 => 경로지정하면됨
			File file2 = new File("D:\\test.txt");
			file2.createNewFile();
			System.out.println("D드라이브 내에 test.txt파일이 성공적으로 만들어졌습니다.");
			
			// * 존재하지 않는 디렉토리 경로 제시시 => IOException 발생됨
			/*
			File file3 = new File("D:\\temp\\test.txt");
			file3.createNewFile();
			System.out.println("D:\\temp 내에 test.txt파일이 성공적으로 만들어졌습니다.");
			*/
			
			// 3. 폴더 먼저 생성하고 그 안에 파일까지 생성되도록 
			File dirTemp = new File("D:\\temp");
			dirTemp.mkdir();
			System.out.println("D드라이브 내에 temp폴더가 생성되었습니다.");
			
			File file3 = new File("D:\\temp\\test.txt");
			file3.createNewFile();
			System.out.println("D:\\temp 내에 test.txt파일이 만들어졌습니다.");
			
			System.out.println("파일명 : " + file3.getName());
			System.out.println("절대경로 : " + file3.getAbsolutePath());
			System.out.println("파일용량 : " + file3.length()); // 바이트단위
			System.out.println("상위폴더 : " + file3.getParent());
			System.out.println("파일이냐 : " + file3.isFile());
			System.out.println("폴더냐 : " + file3.isDirectory());
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램을 종료합니다.");
		
		
		/*
		 * < 스트림 >
		 * 
		 * 1. 자바프로그램과 외부매체(키보드,모니터,파일,프로그램)와 
		 *    입출력을 하기 위한 통로같은 개념
		 * 2. 단방향의 특징을 가지고 있음 (입력용 스트림, 출력용 스트림)
		 * 3. 선입선출(FIFO)의 특징을 가지고 있음 => 시간지연이 발생될 수 있음 
		 * 4. 구분
		 *    1) 통로의 사이즈 (1byte짜리 / 2byte짜리)
		 *       ㄴ 바이트 스트림 : 1byte짜리만 입출력할 수 있는 좁은통로     => 입력(InputStream) | 출력(OutputStream)
		 *       ㄴ 문자 스트림   : 2byte짜리까지도 입출력할 수 있는 넓은통로 => 입력(Reader) | 출력(Writer)
		 *       
		 *    2) 외부매체와 직접 연결 유무
		 *    	 ㄴ 기반 스트림 : 외부 매체와 직접적으로 연결되는 통로 (필수)
		 *    	 ㄴ 보조 스트림 : 기반스트림의 부족한 성능을 보조해주는 역할의 스트림 
		 *     					  => 보조스트림 단독으로는 사용 불가 (기반스트림과 함께 사용)
		 * 
		 */

	}

	
	
	
	
	
	
	
	
	
	
}
