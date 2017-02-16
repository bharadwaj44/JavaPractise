
public class replacespaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	char[] c=	"hi how u doing bye bye idiot".toCharArray();
		System.out.println(replspace(c);
	}
	
	
	static  char[] replspace(char[] str){
		
		int count=0;
	int newLength=0;
		
	for(int i=0;i<str.length;i++){
		
		
		if(Character.isWhitespace(str[i])){
			
			count++;
		}
		
	}
	int length=str.length;
	newLength = str.length + count * 2;
 str[newLength] = '\0';
	 for (int i = length - 1; i >= 0; i--) {
		if (Character.isWhitespace(str[i])) {
	str[newLength - 1] = '0';
	str[newLength - 2] = '2';
	str[newLength - 3] = '%';
 newLength = newLength - 3;
	} else {
str[newLength - 1] = str[i];
newLength = newLength - 1;
	}
	}
	 
		
		return str;
	}

}
