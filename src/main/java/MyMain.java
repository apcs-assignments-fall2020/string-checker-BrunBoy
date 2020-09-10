import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count=0;
        for(int i=0; i<str.length(); i++){
            if (str.substring(i, i+1).equals("a")||(str.substring(i, i+1).equals("b"))||(str.substring(i, i+1).equals("c"))){
                count++;
            }
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        for(int i=0; i<str.length()-2; i++){
            if (str.substring(i,i+3).equals("the")||(str.substring(i,i+3).equals("The"))){
                return true;
            }
        }
        return false;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String yucky="";
        for(int i=str.length()-1; i>=0; i--){
            yucky+=str.substring(i,i+1);
        }
        if (str.equals(yucky)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str=scan.nextLine();
        int answer=countABC(str);
        boolean answer2=containsThe(str);
        boolean answer3=isPalindrome(str);
        System.out.println("Your string contains "+answer+" a's b's or c's");
        if (answer2==true){
            System.out.println("Your string DOES contain the or The");
        }
        else{
            System.out.println("Your string DOES NOT contain the or The");
        }
        if (answer3==true){
            System.out.println("Your string IS a palindrome");
        }
        else{
            System.out.println("Your string IS NOT a palindrome");
        }



        // YOUR CODE HERE
    }
}
