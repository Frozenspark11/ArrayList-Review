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
		printer(num1);
		System.out.println(removeDuplicates(num1));
	}
	public static ArrayList<Integer> combiner(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for(int i = 0; i < list2.size(); i ++)
			list1.add(list2.get(i));
		return list1;
	}
	public static void printer(ArrayList<Integer> list){
		for(int i = 0; i < list.size()-1; i++)
			System.out.print(list.get(i)+", ");
		System.out.println(list.get(list.size()-1));
	}
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
		ArrayList<Integer> finallist = new ArrayList<>();
		for(int i = 0; i < list.size(); i++){
			for(int j = list.size()-1; j>i; j--){
				if(list.get(i)==list.get(j)){
					finallist.add(list.get(i));
					list.set(i, i+2348);
				}
			}
		}
		return finallist;
	}
}