package com.day.inner.sequence;

public class Sequence {
	private Object[] item ;
	private int  next = 0;
	public Sequence(int size){
		item = new Object[size];
	}
	public void add(Object x ){
		if(next < item.length){
			item[next ++ ] = x; 
		}
	}
	class SequenceSelector implements Selector{
		private int i = 0;
		
		@Override
		public Object curent() {
			return item[i];
		}
		@Override
		public boolean end() {
			return i == item.length;
		}
		@Override
		public void next() {
			if(i < item.length)
				i++;
		}
	}
	public Selector Selector(){
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i = 0 ;i<10 ;i++){
			sequence.add(i);
		}
		Selector selector = sequence.Selector();
		while (!selector.end()){
			selector.next();
			System.out.println(selector.curent());
		}
		
		
		
	}
	
	

}
