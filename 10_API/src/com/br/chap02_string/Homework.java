package com.br.chap02_string;

import com.br.chap02_string.model.vo.Shop;

public class Homework {

	// split 연습 
	public static void main(String[] args) {

		// csv파일 : 데이터 형식이 ,로 나열되어있음 / 여러줄로도 되어있음
		String shopCsv =  "1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11\n"
						+ "2,옛날밥상,광주광역시 남구 용대로119번길 6,062-653-7337,향토맛집,2022-01-11\n"
						+ "3,송정떡갈비,광주광역시 광산구 광산로29번길 1,062-944-1439,향토맛집,2022-01-11\n"
						+ "4,홍춘이,광주광역시 북구 무등로180번길 9-18,062-521-7733,향토맛집,2022-01-11\n"
						+ "5,종가집떡갈비,광주광역시 광산구 상무대로 226,062-943-8282,향토맛집,2022-01-11\n"
						+ "6,광신보리밥,광주광역시 북구 두리봉길 2-1(두암동),062-264-1811,향토맛집,2022-01-11\n"
						+ "7,조선옥,광주광역시 남구 효덕로 103,062-654-3322,한상맛집,2022-01-11\n"
						+ "8,송원회관,광주광역시 북구 경양로135번길 29(신안동),062-529-3250,한상맛집,2022-01-11\n"
						+ "9,만선당어부의밥상,광주광역시 광산구 수완로11번길 3,062-955-5595,한상맛집,2022-01-11\n"
						+ "10,백년미가(유촌점),광주광역시 서구 유덕로28번길 18,062-946-3392,한상맛집,2022-01-11";
		
		// 위의 shopCsv 문자열을 적절하게 분리해서 
		// 모든 맛집에 대한 정보를 Shop[] 로 담아내기
		// Hint. 먼저 \n 분리하고 => 반복문으로 접근하면서 다시 ,로 분리해야됨
		
		String[] shops = shopCsv.split("\n"); // {"1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11", "2,옛날밥상,\"광주광역시 남구 용대로119번길 6(봉선동, 1층)\",062-653-7337,향토맛집,2022-01-11" ..}
		
		Shop[] shopArr = new Shop[shops.length];
		
		for(int i=0; i<shops.length; i++) { // shops[i] == "맛집정보,로 연결"
			
			String[] arr = shops[i].split(","); // {"1", "맘스쿡", "광주광역시~~~", "062~~", ...}
			shopArr[i] = new Shop(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
			
		}
		
		for(Shop s : shopArr) {
			System.out.println(s);
		}
		
	}

}
