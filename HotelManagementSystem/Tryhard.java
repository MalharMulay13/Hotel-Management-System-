package HotelManagementSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
public class Tryhard {
public static void main(String[] args) {

ArrayList<String> al = new ArrayList<String>();
List<String>aa=new ArrayList<>();
List<String>a1=new LinkedList<>();
List<String>a2=new Vector<>();
List<String> a3=new Stack<>();
al.add("this");
al.add("is");
al.add("lots");
al.add("of");
al.add("fun");
al.add("for");
al.add("every");
al.add("Java");
al.add("programmer");
ArrayList<String> newl = new ArrayList<String>();
System.out.println(al);
System.out.println(al.get(0).length());
for (int i = 0; i < al.size(); i++) {

if(al.get(i).length()==4){
newl.add(al.get(i)+",****");

}
else
newl.add(al.get(i));
}
System.out.println(newl);
}
}
