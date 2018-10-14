public class MultplyStrings {
    public static void main(String[] args) {
        String a ="10";
        String b = "2";

        System.out.println(multply(a,b));
    }
    public static String multply (String a , String b){
      StringBuilder sb = new StringBuilder();
      int m = a.length(), n = b.length() , carry = 0;
      if(a.charAt(0)=='0' || b.charAt(0) =='0') return "0";
        for (int k = 0; k < m+n-1; k++) {
            for (int i = Math.max(0,k-n+1); i < Math.min(m,k+1); i++) {
                int j = k-i;
                carry += (a.charAt(m-i-1)-'0')*(b.charAt(n-j-1)-'0');
            }
            sb.append(carry%10);
            carry = carry/10;
        }
        if (carry > 0) sb.append(carry);
        return sb.reverse().toString();


    }
}
