package com.br.io.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.br.io.model.vo.Phone;

public class AssistObjectDao {
	
	/*
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// 출력할 데이터 
		Phone ph = new Phone("아이폰", 1300000);
		
		// FileOutputStream : 기반스트림
		// ObjectOutputStream : 보조스트림 (객체 단위로 출력할 수 있도록 메소드 제공)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))){
			
			oos.writeObject(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// FileInputStream
		// ObjectInputStream
		
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))){
			
			//Phone ph = (Phone)ois.readObject(); // readObject가 Object타입으로 반환 
			//System.out.println(ph);
			
			System.out.println(ois.readObject());
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
	*/
	
	public void fileSave() {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("갤럭시", 1200000);
		arr[1] = new Phone("아이폰", 1300000);
		arr[2] = new Phone("플립", 1500000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phones.txt"))){
			
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))){
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject());
			*/
			
			while(true) {
				System.out.println(ois.readObject());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { // End Of File의 약자
			System.out.println("파일을 다 읽어들였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		System.out.println("프로그램을 종료합니다.");
		
	}

	
	
	
	
	
	
}
