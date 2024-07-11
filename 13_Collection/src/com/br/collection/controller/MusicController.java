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
		list.add(new Music("우산", "에픽하이"));
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
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result++;
				break;
			}
		}
		
		// result = 0(수정할 곡을 찾지 못함) | 1(성공적으로 수정됨)
		return result;
		
	}
	
	public List<Music> selectMusicByKeyword(String keyword) {
		
		// 검색된 Music객체를 담기 위한 리스트 생성 
		List<Music> searchList = new ArrayList<>(); // 텅 빈 상태
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				//System.out.println(list.get(i));
				searchList.add(list.get(i));
			}
		}
		
		// searchList = 텅빈상태(검색결과가 없었음) | 텅비어있지 않음(검색결과가 있음)
		return searchList;
		
	}
	
	
	// 가수명을 통해서 검색된 곡명들 반환 
	public List<String> searchTitleByArtist(String artist) {
		
		List<String> searchTitle = new ArrayList<>(); // 텅빈상태
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getArtist().equals(artist)) {
				//System.out.println(list.get(i).getTitle());
				searchTitle.add(list.get(i).getTitle());
			}
		}
		
		return searchTitle;
		
	}
	
	/*
	 * 곡명을 전달받아 
	 * 해당 곡명이 포함되어있는게 총 몇개인지 반환 
	 */
	public int selectCountByTitle(String title) {
		
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().replace(" ", "").contains(title.replace(" ", ""))) {
				count++;
			}
		}
		
		return count;
		
	}
	
	
	
	
	
	

}
