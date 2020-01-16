package LeetCode.StringNote;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1,c=0;
        while(i>=0 || j>=0 || c !=0) {
            if(i>=0) c+=num1.charAt(i--)-'0';
            if(j>=0) c+=num2.charAt(j--)-'0';
            stringBuilder.append(c%10);
            c /= 10;
        }
        return stringBuilder.reverse().toString();
    }
}
