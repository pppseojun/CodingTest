import java.util.*;
  
// String - 1.문자 찾기(for문)
// public class Main {
//   public static void main(String[] args){
//     int answer =0;
//     Scanner sc = new Scanner(System.in);
//     String str = sc.next();
//     char ch = sc.next().charAt(0);
//     str= str.toUpperCase();
//     ch = Character.toUpperCase(ch);
//     for(int i=0; i<str.length();i++){
//         if(str.charAt(i)==ch){
//             answer++;
//         }
//     }
//     System.out.println(answer);
//     return ;
//   }
// }

// String - 1.문자 찾기(for-each문)
// public class Main {
//     public static void main(String[] args) {
//         int answer =0;
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         char ch = sc.next().charAt(0);
//         str = str.toUpperCase();
//         ch = Character.toUpperCase(ch);
//         for(char i : str.toCharArray()){
//             if (i==ch) {
//                 answer++;
//             }
//         }
//         System.out.println(answer);
//         return;
//     }
// }

// String - 2.대소문자 변환
// public class Main {
//   public static void main(String[] args){
//     Scanner in = new Scanner(System.in);
//     String answer = "";
//     String str = in.next();
//     for(char i : str.toCharArray()){
//         if(Character.isUpperCase(i)){
//             answer += Character.toLowerCase(i);
//         }else{
//             answer += Character.toUpperCase(i);
//         }
//     }
//     System.out.println(answer);
//     return ;
//   }
// }

// String - 3.문장속 단어
// public class Main {
//     public static void main(String[] args){
//       Scanner in=new Scanner(System.in);
//       String str = in.nextLine();
//       int max_word = 0;
//       String answer = " ";
//       String[] word = str.split(" ");
//       for(String x : word){
//         int len = x.length();
//         if (len>max_word) {
//             max_word = x.length();
//             answer = x;
//         }
//       }
//       System.out.println(answer);
//       return ;
//     }
//   }






