package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueUserDefinedDemo {

	static class Person{
		String name;
		int age;
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "{" + this.name+ ", " + this.age + "}";
		}
	}
	
	public static void main(String[] args) {
		PriorityQueue<Person> pq = new PriorityQueue<>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.age - o2.age;
			}
		});
		
		pq.add(new Person("A",10));
		pq.add(new Person("B",20));
		pq.add(new Person("C",30));
		pq.add(new Person("D",5));
		pq.add(new Person("E",3));
		
		System.out.println(pq);
	}
}
