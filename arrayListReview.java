import java.util.*;
public class arrayListReview{
	public static void main(String[]args){
		ArrayList<Integer> num1 = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			num1.add(i+1);
			num2.add(i+1);
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(combiner(num1, num2));

	}
	public static ArrayList<Integer> combiner(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for(int i = 0; i < list2.size(); i ++)
			list1.add(list2.get(i));
		return list1;
	}
}