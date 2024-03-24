package assignments;

import java.util.ArrayList;

public class Ass_67_ArrayList {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		//ArrayList follow indexing,store heterogenous value,accept null values, accept duplicates
		//sorting is done for homo values,accept dynamic values
		a1.add(23);
		a1.add(23.4);
		a1.add("doll");
		a1.add('r');
		a1.add(true);
		a1.add(null);
		a1.add(23);
		a1.add(null);
		System.out.println(a1);

	}

}
