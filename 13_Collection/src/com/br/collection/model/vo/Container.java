package com.br.collection.model.vo;

/*
 * < 제네릭 Generics >
 * 클래스 내부에 사용할 타입을 클래스 외부에서 지정하는 기법
 */
public class Container<T> {
	
	private T item;  // T 타입의 item을 가질수 있는 필드 
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}

	public String toString() {
		return String.valueOf(item);
	}
}
