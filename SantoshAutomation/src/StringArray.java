import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		
		String st[]= {"seeker", "seeked","seeking","seeks"};
		Arrays.sort(st);
		
		String s="";
		
		int n;
		if(st[0].length()<st[st.length-1].length())
			n=st[0].length();
		else
			n=st[st.length-1].length();
		
		for(int i=0; i<n; i++)
		{
			if(st[0].charAt(i)==st[st.length-1].charAt(i)) {
				s=s+st[0].charAt(i);
			}
		}
		System.out.println(s);
	}

}
