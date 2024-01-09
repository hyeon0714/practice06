package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User c01=new Customer("jws", "j1234", "정우성", 1000);
		User c02=new Customer("yjs", "y2345", "이효리", 2000);
		Employee e01=new Employee("master", "m7788", "운영자", 500);
		
		User[] u01=new User[3];
		
		u01[0]=c01;
		u01[1]=c02;
		u01[2]=e01;
		
		for(int i=0; i<u01.length; i++) {
			u01[i].showInfo();
		}
		System.out.println(u01[2].getName()+"의 월급은 "+(e01.getSalary()*10000)+"원 입니다");
	}

}
