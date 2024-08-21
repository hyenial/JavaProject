package course.stringpkg;

public class StringSample {
	public static void main(String[] args) {
	String s1= "text1 :: welcome to java!";
	s1 = s1.concat("lalallalala");
	System.out.println(s1);
		
	StringBuffer s2= new StringBuffer("text2 :: welcomed java");
	s2.append("lilililili ");
	s2.charAt(2);
	s2.insert(33, "NEW TEXT");
	System.out.println(s2);
		
		
	}
	



}
