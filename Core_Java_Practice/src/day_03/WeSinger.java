package day_03;

public class WeSinger {
	String artist;
	
	String title;
	void play() {
		System.out.println(artist+" is singing "+title);
	}
	public static void main(String[] args) {
		WeSinger s1=new WeSinger();
		s1.artist="lata";
		s1.title="wa";
		s1.play();
		WeSinger s2= new WeSinger();
		s2.artist="s";
		s2.title="j";
		s2.play();
		
		
}

}
