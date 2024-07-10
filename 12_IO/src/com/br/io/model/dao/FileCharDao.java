package com.br.io.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	/*
	 * "문자 기반 스트림" 
	 * 
	 * - 문자 스트림 : 데이터를 2바이트 단위로 전송가능한 스트림
	 * - 기반 스트림 : 외부매체와 직접 연결되는 스트림 
	 * 
	 * XXXReader : 입력용 스트림
	 * XXXWriter : 출력용 스트림
	 */
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// FileWriter : 파일로 데이터를 2바이트 단위로 출력할 수 있는 스트림
		
		FileWriter fw = null;
		
		try {
			// 1. FileWriter 스트림 객체 생성 
			fw = new FileWriter("char.txt");
			
			// 2. write 메소드로 출력
			//    2byte 단위로 데이터 전송
			fw.write("와! IO 재밌다..");
			fw.write('A');
			fw.write("\n");
			
			char[] arr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(arr);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 스트림 반납
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		// FileReader : 파일로부터 데이터를 2바이트 단위로 입력받을 수 있는 스트림
		
		FileReader fr = null;
		
		try {
			// 1. 스트림 객체 생성
			fr = new FileReader("char.txt");
			
			// 2. read 메소드 이용해서 읽어들이기
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 스트림 반납
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	

}
