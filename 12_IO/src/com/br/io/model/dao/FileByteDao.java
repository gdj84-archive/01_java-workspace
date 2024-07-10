package com.br.io.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO (Data Access Object) : 데이터가 보관되어있는 보관함과 직접적으로 연결해서 데이터 주고받는 코드의 클래스

public class FileByteDao {
	
	/*
	 * * "바이트 기반 스트림" 을 통해 파일에 데이터 입출력
	 * 
	 * - 바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로 (좁은 통로, 한글데이터 깨짐)
	 * - 기반 스트림 : 외부매체와 직접적으로 연결된 통로 
	 * 
	 * XXXInputStream  : XXX매체로부터 데이터를 입력받는 통로
	 * XXXOutputStream : XXX매체로 데이터를 출력하는 통로
	 */
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 데이터를 출력시키는 스트림
		
		// 1. 스트림 객체 생성 (== 통로를 만들기)
		// 2. 스트림을 통해서 데이터를 출력 (메소드 호출)
		// 3. 다 사용한 후 스트림 반납
		
		FileOutputStream fout = null;
		try {
			// 1. FileOutputStream 객체 생성 => 해당 파일과의 연결통로가 만들어짐
			/*
			 * false : 해당 파일이 존재할 경우 기존의 데이터에 덮어씌워짐 (기본값)
			 * true : 해당 파일이 존재할 경우 기존의 데이터에 이어서 작성 
			 */
			fout = new FileOutputStream("byte.txt"/*, true*/); // 해당 파일이 없으면 새로 만들어서 연결 | 있으면 그냥 연결
		
			// 2. 스트림을 통해 데이터 출력 (write메소드 사용)
			//    숫자(0~127) 
			fout.write(97);  // 'a' 문자가 저장
			fout.write('b'); // 'b' 문자가 저장
			//fout.write('핳');// 한글은 2byte짜리기 때문에 깨져서 저장됨 
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); // 'c' 'd' 'e' 순차적으로 저장
			
			fout.write(arr, 1, 2); // 'd' 'e' 순차적으로 저장
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // finally 블럭 내에 작성된 코드는 중간에 어떤 예외가 발생하든
					// 해당 catch블럭을 실행하고 반드시 finally 블럭을 실행하고 빠져나감
			
			// 3. 스트림 다 이용했으면 반납
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		
		FileInputStream fin = null;
		try {
			// 1. FileInputStream 객체 생성 == 해당 파일과 연결통로가 만들어짐
			fin = new FileInputStream("byte.txt");
			
			// 2. 스트림을 통해 데이터 입력받기 (read메소드)
			//    1byte단위로 하나씩 읽어옴 
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			
			System.out.println(fin.read()); // 파일의 끝을 만나는 순간 (즉, 더이상 읽을 데이터가 없을경우) -1반환
			System.out.println(fin.read());
			*/
			
			/*
			while(fin.read() != -1) { // 퐁당퐁당 읽어들여짐
				System.out.println(fin.read());
			}
			*/
			
			// 해결방법1. 무한반복
			/*
			while(true) {
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
			
			// 해결방법2. 
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.print((char)value);
			}
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 스트림 반납
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
	

}
