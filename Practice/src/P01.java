
public class P01 {
    public static void main(String[] args) { 
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

        String answer = getAnswer(strArr); 
        String question = getScrambledWord(answer); 

        System.out.println("Question:"+question); 
        System.out.println("Answer:"+answer); 
  } // main 

  public static String getAnswer(String[] strArr) { 
       int idx = (int)(Math.random()*(strArr.length));
       
       return strArr[idx];
  } 
  
  public static String getScrambledWord(String str) { 
        char[] word = str.toCharArray();
        
        for(int i=0; i<word.length; i++) {	
        	int idx = (int)(Math.random()*word.length);
        	char temp = word[i];
        	word[i] = word[idx];
        	word[idx] = temp;
        }
        return new String(word);
  }
}
