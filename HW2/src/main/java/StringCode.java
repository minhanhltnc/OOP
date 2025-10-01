import java.sql.Struct;
import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {
    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     * @param str
     * @return max run length
     */
    public static int maxRun(String str) {
        int current=1;
        int max=1;
        if(str.length()==0)return 0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1))current++;
            else current=1;
            if(current>max)max=current;
        }
        return max; // YOUR CODE HERE
    }

    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     * @param str
     * @return blown up string
     */
    public static String blowup(String str) {
        int n=str.length();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                int k=ch-'0';
                if(i+1<n){
                    for(int j=0;j<k;j++)
                    {
                        result.append(str.charAt(i+1));
                    }
                }

            }
            else result.append(ch);
        }

        return result.toString(); // YOUR CODE HERE
    }

    /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     */
    public static boolean stringIntersect(String a, String b, int len) {
        HashSet<String> set=new HashSet<String>();
        for(int i=0;i<=a.length()-len;i++){
            String sub_a=a.substring(i,i+len);//lay substring tu i den i+len-1
            set.add(sub_a);
        }
        for(int i=0;i<=b.length()-len;i++){
            String sub_b=b.substring(i,i+len);
            if(set.contains(sub_b))return true;
        }
        return false;
    }
}
