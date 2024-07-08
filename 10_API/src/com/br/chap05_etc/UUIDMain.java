package com.br.chap05_etc;

import java.util.UUID;

public class UUIDMain {

	public static void main(String[] args) {
		
		/*
		 * < java.util.UUID >
		 * 
		 * 1. Universal Unique IDentifier
		 * 2. 전역 고유 식별자 (한 프로그램 내에서 절대적으로 고유한 값)
		 * 3. 형식
		 * 	  1) 16진수 32개와 하이픈(-) 4개로 구성
		 * 	  2) 8자리-4자리-4자리-4자리-12자리
		 * 
		 * ex) 사용자가 업로드한 첨부파일명 => 수정작업해서 저장 
		 */
		
		UUID uuid = UUID.randomUUID();
		String result = uuid.toString();
		System.out.println(result);
		
		String originFilename1 = "te.st.jpg"; // a사용자가 업로드 요청한 파일의 원본명
		String originFilename2 = "te.st.zip"; // b사용자가 업로드 요청한 파일의 원본명
		
		// 파일명 수정 작업 : 고유한문자열(UUID) + 기존의확장자(.txt)
		String originFileExt1 = originFilename1.substring(originFilename1.lastIndexOf("."));
		String originFileExt2 = originFilename2.substring(originFilename2.lastIndexOf("."));
		
		String changeFilename1 = UUID.randomUUID().toString().replace("-", "") + originFileExt1;
		String changeFilename2 = UUID.randomUUID().toString().replace("-", "") + originFileExt2;
		
		System.out.println(changeFilename1);
		System.out.println(changeFilename2);
		

	}

}
