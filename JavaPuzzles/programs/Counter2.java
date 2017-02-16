class Counter2{  
static int count=0;//will get memory only once and retain its value  
  int i=0;
  int a;
public Counter2(){  
count++;   
}  
public static int count(int d){
	disp();
	return count;
}
  
public static void main(String args[]){  
  
Counter2 c1=new Counter2();  
Counter2 c2=new Counter2();  
Counter2 c3=new Counter2(); 
//System.out.println(c.count());


  
 }  


static void disp(){
	int a=0;
	
	count(a);
	

}
}  