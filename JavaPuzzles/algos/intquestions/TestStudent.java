package intquestions;
import java.util.*;
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student("sai",1,56);
		Student s2=new Student("kesava",1,26);
		Student s3=new Student("balu",1,35);
		Student s4=new Student("bhaskar",1,15);
		
		ArrayList<Student> a=new ArrayList();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		
		//Collections.sort(a);
		
		
	/*	
		Collections.sort(a,new Comparator<Student>(){
			
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub

				if(o1.age>o2.age) return 1;
				if(o1.age==o2.age) return 0;
				else {return -1;}}
			});		
		*/
	Collections.sort(a,new Comparator<Student>(){
			
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub

				return o1.name.compareTo(o2.name);}
			});	
		
		
		
for(Student s:a){
			
			System.out.println(s.name);
		}
	}
	}


