package edu.kh.todolist.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.kh.todolist.model.dto.Todo;

public class TodoListDAOImpl implements TodoListDAO{

	// 필드
	private final String FILE_PATH = "/io_test/TodoList.dat";
	
	
	// 객체 입/출력 보조 스트림
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	// 파일에 입/출력되는 리스트를 참조할 변수
	private List<Todo> todoList = null;
	
	// 기본생성자
	public TodoListDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		
		// 객체 생성 시 TodoList.dat 파일 내용 읽어오기
		// -> 읽어오기 전에 있는지 검사부터!
		
		File file = new File(FILE_PATH); 
		
		if(file.exists()) { // 파일이 존재하면
			
			try {
				// 객체 입력 스트림을 이용해서 입력 받기
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				
				// 읽어온 객체를 ArrayList<Todo>로 강제 형변환(다운캐스팅)
				todoList = (ArrayList<Todo>)ois.readObject();
				
				
			} finally {
				
				if(ois != null) ois.close();
				
			}
			
		} else { // 파일이 존재하지 않으면
			
			// 폴더, 파일 만들기
			File directory = new File("/io_test");
			if(!directory.exists()) { // 폴더가 없으면 생성
				directory.mkdir();
			}
			
			
			
			// 객체 출력 스트림을 이용해서 파일 생성 + 샘플 데이터 추가
			todoList = new ArrayList<Todo>();
			
			todoList.add(new Todo("자바 공부","수업 내용 복습하기", false, LocalDateTime.now()));
			todoList.add(new Todo("DB 공부","유튜브 따라하기", false, LocalDateTime.now()));
			todoList.add(new Todo("Spring 공부","인터넷 강의 듣기", false, LocalDateTime.now()));
			
			
			try {
				// 객체 출력 스트림 생성 -> 파일이 없다면 자동 생성
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(todoList); // todoList를 파일로 출력
				
				
			} finally {
				
				if(oos != null) oos.close(); // flush() 내장되어 있어 다 밀어내고 메모리 반환(닫기)
				
			}
			
			
			System.out.println("*** TodoList.dat 파일 생성 완료 ***");
			
			
		}
		
	}
	
	
	// saveFile
	@Override
	public void saveFile() throws Exception{
		// todoList를 파일로 저장하는 메서드
		
		try {
			// FILE_PATH 경로에 있는 파일과 연결된 객체 출력 스트림 생성
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));	
			
			oos.writeObject(todoList); // todoList 출력
		} finally {

			oos.close();

		}
		
		
	}

	@Override
	public List<Todo> todoListFullView() {
		
		return todoList;
	}

	@Override
	public Todo todoDetailView(int index) {
		
		// 1. index 범위가 todoList 범위를 넘어가면 null 반환
		if( index < 0 || index > todoList.size() ) {
			return null;
		}
		
		// 2. index 가 정상 범위인 경우 index 번째 요소 반환
		return todoList.get(index);
	}

	@Override
	public int todoAdd(Todo todo) throws Exception{
		
		// todoList에 전달 받은 todo를 추가
		// -> 성공 시 파일에 저장 후 삽입된 index를 반환
		// -> 실패 시 -1 반환
		
		if(todoList.add(todo)) { // 추가성공
			
			// 파일 저장
			saveFile();
			
			
			// 삽입된 index 반환
			return todoList.size() - 1;
			
		}
		
		return -1; // 추가 실패
	}


	@Override
	public boolean todoComplete(int index) throws Exception {
		
		// 1. index 범위 초과 시 false 반환
		if(index < 0 || index >= todoList.size()) {
			return false;
		}
		
		
		// 2. index가 정상 범위인 겨우
		// index 번째 요소의 complete 값을 변경하고
		// 파일 저장 후 true 반환
		
		boolean complete = todoList.get(index).isComplete(); // flase or true
		todoList.get(index).setComplete(!complete);
		
		saveFile(); // 파일 저장
		
		return true;
	}

	
	@Override
	public boolean todoUpdate(int index, String title, String content) throws Exception{
		
		// 수정된 제목, 내용을 이용해서 Todo 객체 생성
		Todo todo = new Todo(title,content,
					todoList.get(index).isComplete(), todoList.get(index).getRegDate()
				);
		// index 번째 요소의 complete, regDate값을 얻어와 todo에 세팅
		
		// E List.set(int index, E e) : 
		// index 번째 요소를 매개변수 e로 바꾸고,
		// 이전 요소를 반환 (없으면 null)
		
		if( todoList.set(index, todo) != null ) { // 수정 성공
			// 변경된 todo 저장
			saveFile();
			return true;
		}
		
		
		
		return false;
	}


	@Override
	public Todo todoDelete(int index) throws Exception {
		
		// index 범위 검사
		if(index < 0 || index >= todoList.size()) return null;
		
		
		// todoList에서 index 번째 요소 삭제 후 파일 저장
		Todo todo = todoList.remove(index);
		
		saveFile();
		
		return todo;
	}

//	@Override
//	public List<Todo> getTodoList() {
//
//		return todoList;
//	}
//
//	@Override
//	public void addTodo(List<Object> todo) {
//		
//		todoList.add(new Todo((String)todo.get(0), (String)todo.get(1), (boolean)todo.get(2), (LocalDateTime)todo.get(3)));
//		
//		try {
//			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
//			oos.writeObject(todoList);
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				oos.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}
//	
//	@Override
//	public void complete(String title) {
//		
//		boolean flag = true;
//		
//		// 수정할 index 찾기
//		int index = 0;
//		for(Todo todo : todoList) {
//			if(title.equals(todo.getTitle())) {
//				flag = false;
//				break;
//			}
//			else {
//				index++;
//			}
//		}
//		
//		if(flag) {
//			System.out.println("입력한 제목이 존재하지 않습니다.");
//			return;
//		}
//		
//		todoList.get(index).setComplete(true);
//		
//		try {
//			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
//			oos.writeObject(todoList);
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				oos.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}
//	
//
//	@Override
//	public void update(String title, int input, String update) {
//		
//		boolean flag = true;
//		
//		// 수정할 index 찾기
//		int index = 0;
//		for(Todo todo : todoList) {
//			if(title.equals(todo.getTitle())) {
//				flag = false;
//				break;
//			}
//			else {
//				index++;
//			}
//		}
//		
//		if(flag) {
//			System.out.println("입력한 제목이 존재하지 않습니다.");
//			return;
//		}
//		
//		if(input == 3) {
//			if(update.equalsIgnoreCase("O") || update.equalsIgnoreCase("X")) {
//				todoList.get(index).setComplete(!todoList.get(index).isComplete());
//				
//				System.out.println("수정 완료");
//			}else {
//				System.out.println("O / X 중에 선택해주세요");
//				update(title, input, update);
//			}
//
//		}
//		
//		
//		if(input == 1) {
//			todoList.get(index).setTitle(update);
//			System.out.println("수정 완료");
//
//			
//		}
//		
//		if(input == 2) {
//			todoList.get(index).setDetail(update);
//			System.out.println("수정 완료");
//
//		}
//		
//		try {
//			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
//			oos.writeObject(todoList);
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				oos.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//		
//	}
//	
//	
//	@Override
//	public void delete(String title) {
//		
//		boolean flag = true;
//		
//		for(Todo obj : todoList) {
//			if(obj.getTitle().equals(title)) {
//				todoList.remove(obj);
//				flag = false;
//				System.out.println("Todo가 삭제 되었습니다.");
//				break;
//			}
//		}
//		
//		if(flag) {
//			System.out.println("일치하는 title이 존재하지 않습니다.");
//			return;
//		}
//		
//		try {
//			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
//			oos.writeObject(todoList);
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				oos.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}


}
