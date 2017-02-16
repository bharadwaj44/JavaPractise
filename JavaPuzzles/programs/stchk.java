

class test{
	int f=9;
	static void change(int[] i){
		i[4]=9;
		
	}
	void change_new(int[] i){
		
		
		i[2]=100;
	}
	
	
}

public class stchk {

void change_2(test t){
	
	t.f=100;
}
	
	public static void main(String[] args){
		
	/*	int[] i={1,2,3,4,5};
		test.change(i);
		test t=new test();
		t.change_new(i);
		
		stchk sc=new stchk();
		sc.change_2(t);
		
		System.out.println(t.f);
	//	for(int n:i)
		//System.out.println(n);
		
		*/
		
	System.out.println(countHi("hibyehi"));
		
		String s="hibyehi";
		
		System.out.println(s.startsWith("hi"));
		
	//	s.s
		
	}
	
	public static int countstartswith(String s){
		
		
		if(s.length()==0){return 0;}
		if(s.length()==1){return 1;}
		int count=0;
	
		if(s.startsWith("hi")){count++;}
		
		
		return count+countstartswith(s.substring(s.,));
	}
	
	
	public static  int countHi(String str) {
		  
		  if(str.length()==1){return 0;}
		  
		  int count=0;
		  if(str.length()==2){
		    
		    if(str.equals("hi")){
		      
		      return 1;
		    }
		    return count;
		  }
		  String s=str.substring(str.length()-2,str.length());
		  if(s.equals("hi")){count++;}
		  
		  return count+countHi(str.substring(0,str.length()-1));

		  
		  

		}
}





