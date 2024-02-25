package practice;
//ASS-36 Using  this keyword

public class Keyword_this {
	
	int roll_no;
	String name;
	String city;
	
	void add(int roll_no,String name,String city) {
		this.roll_no=roll_no;
		this.name=name;
		this.city=city;
	}

	public static void main(String[] args) {
		Keyword_this k1 = new Keyword_this();
		k1.add(45, "Sudi", "Bengaluru");
		System.out.println(k1.roll_no);
		System.out.println(k1.name);
		System.out.println(k1.city);

	}

}
