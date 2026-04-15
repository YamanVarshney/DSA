public class ReverseWord {
    public static void main(String[] args) {
        String s = "we are coding ";
        int n = s.length();
        String ans=" ";
        String word=" ";
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(ch!=' '){
            word +=ch; 
            } else{
                ans = word + " " + ans ;
                word=" ";
            }
        }
        ans = word + " " + ans;
        System.err.println(ans.trim());
    }
}
