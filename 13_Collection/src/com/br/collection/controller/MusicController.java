package com.br.collection.controller;

import java.util.ArrayList;
import java.util.List;

import com.br.collection.model.vo.Music;

// 사용자의 특정 요청을 처리해주는 클래스
public class MusicController {
	
	private List<Music> list = new ArrayList<>();
	{ // 초기화 블럭 (샘플데이터 작성담을때)
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("술이 달다", "에픽하이"));
		list.add(new Music("밥이 달다", "강보람"));
	}
	
	// 각 요청별 실행될 메소드
	
	// 곡 추가 요청 처리해주는 메소드
	public void insertMusic(String title, String artist) {
		// 전달받은 곡명과 가수명을 가지고 
		// Music 객체 생성해서 list에 추가 
		list.add(new Music(title, artist));
		
	}
	
	// 전체 곡 조회 처리해주는 메소드
	public List<Music> selectMusicList() {
		return list;
	}
	
	public int deleteMusic(String title) {
		// list내에 있는 Music객체들 중에서
		// 전달받은 곡명과 일치하는 Music객체 삭제 
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result++;
				break;
			}
		}
		
		// result = 0(삭제할 곡을 찾지 못함) | 1(성공적으로 삭제됨)
		return result;	
		
	}
	
	
	
	
	
	
	

}
