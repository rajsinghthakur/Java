import java.util.Scanner;

class Test19 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a vowel: ");
        char c = sc.nextLine().charAt(0);
        String C = (c=='a')?"It is vowel":(c=='e')?"It is vowel":(c=='i')?"It is vowel":(c=='o')?"It is vowel":(c=='u')?"It is vowel":"It is not vowel";
        System.out.println(C);
    }
}
