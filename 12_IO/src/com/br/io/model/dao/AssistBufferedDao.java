package com.br.io.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AssistBufferedDao {
	
	/*
	 * < BufferedXXX 보조스트림 >
	 * 
	 * 보조스트림 : 기반스트림만으로 부족한 성능을 향상시켜주는 스트림
	 * 				기반스트림에서 제공하지 않는 추가적인 메소드 제공
	 * 				또는 데이터 전송 속도 향상 시킨다거나 등등 
	 * 
	 * 유의사항 : 단독사용불가 (반드시 기반스트림과 함께 사용)
	 * 
	 */
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// FileWriter : 기반스트림 
		// BufferedWriter : 보조스트림 (버퍼라는 공간제공, 속도향상)
		/*
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("buffer.txt"));
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); // BufferedWriter에서 추가적으로 제공하는 메소드
			bw.write("안녕히가세요");
			// 버퍼라는 공간에 계속 데이터를 쌓아놨다가 한꺼번에 출력 => 속도향상
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		/*
		 * * try~with~resource 구문
		 * 스트림이 자동으로 반납되도록 작성가능
		 * 자바 7 이상부터 사용 가능 
		 * 
		 * try(try블럭내에서 사용할 스트림객체 생성 구문){ // try~catch다 끝나면 자동으로 스트림 반납
		 * 
		 * }catch(){
		 * 
		 * }
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("buffer.txt"))){
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("안녕히가세요");
			
		} catch (IOException e) {
			e.printStackTrace();
		} // 자원반납 구문 작성 안해도됨! 
		
		
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		// FileReader : 기반스트림
		// BufferedReader : 보조스트림
		
		try(BufferedReader br = new BufferedReader(new FileReader("buffer.txt"))){
			
			// readLine메소드를 통해서 한 줄단위로 읽어들일 수 있음
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			System.out.println(br.readLine()); // 파일의 끝을 만나는 순간 null반환 
			System.out.println(br.readLine());
			*/
			
			/*
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			*/
			
			// 최종 결과물로 하나의 String 변수에 담도록
			String value = null;
			StringBuilder sb = new StringBuilder();
			while((value = br.readLine()) != null) {
				sb.append(value);
				sb.append("\n");
			}
			
			String result = sb.toString();
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	

}
