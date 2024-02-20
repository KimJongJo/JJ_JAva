package com.hw1.model.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {
	public static void main(String[] args) {
		
		List<Friend> friendList = new ArrayList<Friend>();
		
		
		friendList.add(new Friend("짱구"));
		friendList.add(new Friend("철수"));
		friendList.add(new Friend("유리"));
		friendList.add(new Friend("훈이"));
		friendList.add(new Friend("맹구"));
		
		
		// Collections.addAll();
		
		/*
		Collections.addAll(friendList, new Friend("짱구")
				,new Friend("철수"), new Friend("유리"), new Friend("훈이"),
				new Friend("맹구"));
		*/
		
		// List.of() : Java 9 이상의 버전에서 사용
		/*
		List<Friend> friendList = List.of(new Friend("짱구")
				,new Friend("철수"), new Friend("유리"), new Friend("훈이"),
				new Friend("맹구"));
		*/
		int random = (int)(Math.random() * friendList.size());
		
		friendList.get(random).pickLeader();
		
	}
}
