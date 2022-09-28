package specialTask;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class specialTask 
{
	public static void main(String args[]) throws IOException   
    {   
        File file = new File("\\Special Task\\duom.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int total = 0;
        String newline = System.getProperty("line.separator");
        while ((st = br.readLine()) != null)
        {
        	String cur2 = "";
        	for(int i=0; i < st.length(); i++) 
        	{
        		char cur = st.charAt(i);
                Boolean isNumber = Character.isDigit(st.charAt(i));
        
                if(isNumber) 
                {
                	cur2 = cur2 + cur;  
                	if (i == st.length()-1)
	                {
	                	for(int j=0; j < cur2.length(); j++) 
			        	{
		                	total = Integer.parseInt(cur2);
			                if (total >= 10)
			                {
			                	System.out.println(st);
			                	break;
			                }
			                else
			                {
			                	total = 0;
			                }
			        	}
	                }
                }
                	
                else 
                {
	                for(int j=0; j < cur2.length(); j++) 
		        	{
	                	total = Integer.parseInt(cur2);
		                if (total >= 10)
		                {
		                	System.out.println(st);
		                	break;
		                }
		                else
		                {
		                	total = 0;
		                }
		        	}
		        	
                	cur2 = "";
                }
    	
        	}
        	
        }
    }

}
