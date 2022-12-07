package com.kh.chap02_scheduling.run;

import com.kh.chap02_scheduling.scheduling.Car;
import com.kh.chap02_scheduling.scheduling.Plane;
import com.kh.chap02_scheduling.scheduling.Tank;

public class Run {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Car());
		Thread t2 = new Thread(new Plane());
		Thread t3 = new Thread(new Tank());
		
		t1.setName("Car");
		t2.setName("Plane");
		t3.setName("Tank");
		
		// 우선순위 변경 전
		// 스레드는 기본적으로 1~10의 우선순위 중 5의 우선순위를 가지고 있습니다.
		// 메모리가 모자랄 때 우선순위를 정할 수 있음
		// 스레드의 우선순위를 정하지 않으면 OS(운영체제)가 임의로 수행시킨다.
		System.out.println("------- 우선순위 변경 전 -------");
		System.out.println(Thread.currentThread().getName()+"의 우선순위 : "+Thread.currentThread().getPriority());
		System.out.println(t1.getName()+"의 우선순위 : "+t1.getPriority());
		System.out.println(t2.getName()+"의 우선순위 : "+t2.getPriority());
		System.out.println(t3.getName()+"의 우선순위 : "+t3.getPriority());
		
		// setPriority() : 우선순위를 지정해주는 메소드
		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t3.setPriority(Thread.MAX_PRIORITY); // 10
		
		System.out.println("------- 우선순위 변경 후 -------");
		System.out.println(Thread.currentThread().getName()+"의 우선순위 : "+Thread.currentThread().getPriority());
		System.out.println(t1.getName()+"의 우선순위 : "+t1.getPriority());
		System.out.println(t2.getName()+"의 우선순위 : "+t2.getPriority());
		System.out.println(t3.getName()+"의 우선순위 : "+t3.getPriority());
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		/*
		 * 메인 스레드가 종료되더라도 실행중인 스레드가 하나라도 있다면 프로세스는 종료되지 않는다.
		 * 해결책 : start()시키기 전에 우선순위, 주종관계를 설정해야 함
		 * 
		 * 주종관계 설정
		 * main스레드가 종료시 다른 스레드도 종료 시키기 위해 반드시 setDaemon사용
		 * 주의점은 스레드 중 하나라도 setDaemon으로 설정시 모든 스레드에 setDaemon설정을 해줘야 함
		 */
		System.out.println("메인 스레드의 끝부분");
		// 시작순서는 우선순위와 다를 수 있지만 종료순서는 우선순위(priority)가 높은 순으로 끝나게 됨(항상 그렇진 않음)
		
	}

}
