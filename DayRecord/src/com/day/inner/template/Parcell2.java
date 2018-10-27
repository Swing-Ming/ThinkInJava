package com.day.inner.template;

/**
 * ÄÚ²¿Àà
 * @author 80021392
 *
 */
public class Parcell2 {
	
	class Content{
		
	}
	class Destination{
		
	}
	
	public Content content(){
		return new Content();
	}
	
	public Destination to(){
		return new Destination();
	}
	
	public  void ship() {
		Content content = content();
		Destination des = to();
	}
	
	public static void main(String[] args) {
		Parcell2 par2 = new Parcell2();
		Parcell2.Content content = par2.new Content();
		content = par2.content();
		Parcell2.Destination des = par2.to();
		des = par2.new Destination();
	}
	
	
	
	

}
