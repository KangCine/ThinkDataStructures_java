package com.example;

import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
	@SuppressWarnings("rawtypes")
	private List list;

	@SuppressWarnings("rawtypes")
	public ListClientExample() {
		list = new LinkedList();
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}

	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		@SuppressWarnings("rawtypes")
		List list = lce.getList();
		System.out.println(list);
	}
}

/*
해당 클래스는 유용한 동작을 하지는 않지만, List를 캡슐화하는 클래스의 필수요소를 가지고 있다.
즉, List형의 인스턴스 변수를 가지고 있다.
ListClientExample 클레스의 생성자는 새로운 LinkedList 객체를 만들어 리스트를 초기화한다.
getList 메서드는 게터 메서드로 List 객체에 대한 참조를 반환한다.
메인메서드는 이 메서드들을 테스트하는 코드이다.

ArrayList나 LinkedList가아닌 List인터페이스를 통해 구현한 클래스로서 이후 LinkedList가 아니라 ArrayList를 사용하고 싶다면
해당 부분만 수정해서 사용하면 된다.
-> 즉 생성자만 바꿔주면 된다.

이러한 스타일을 인터페이스 기반 프로그래밍 또는 인터페에스 프로그래밍이라고 한다.
여기서 인터페이스는 자바 interface가 아닌 일반적인 개념의 인터페이스를 말한다.
 
라이브러리를 사용할 때 코드는 오직 List와 같은 인터페이스만 의존하고 ArrayList 클래스와 같은 특정 구현에 의존해서는 안된다.
이런 방식으로 하면 나중에 구현이 변경되어도 인터페이스를 사용하는 코드는 그대로 사용할 수 있다.
반면 인터페이스가 변경되면 인터페이스를 의존하는 코드는 변경되어야 한다.
이것이 꼭 필요한 일이 아니면 라이브러리 개발자가 인터페이스를 변경하지 않는 이유이다.
*/