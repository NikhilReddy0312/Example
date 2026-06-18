import java.util.Scanner;

class Prac {
    static boolean drome(String s){
       
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
                
            }
        }
        return true;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();
        String l="";

        for(int i = 0; i < s.length(); i++) {

            for(int j = i + 1; j <= s.length(); j++) {

               String sub=s.substring(i,j);
               if(drome(sub) && sub.length()>l.length()){
                l=sub;
               }
            }
        }
        System.out.println("Longest subString is:"+l);
    }
}
