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

// String - 4. 단어 뒤집기기
// 입력받을 횟수(정수) 입력받고
// 횟수만큼 문자열 입력받고
// 입력받은 문자열들 배열에 담아주고 (cat, dog, caw)
// 배열 각 요소를 뒤집어 주어 cat -> tac, dog ->god, caw -> wac
// 다시 배열에 담에 출력
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.nextLine();
//         String[] str = new String[n];
//         for(int i =0; i<n;i++){
//             str[i] = sc.nextLine();
//             char[] arr = str[i].toCharArray();
//             char[] revArr = new char[arr.length];
//             for (int j=0;j<arr.length;j++){
//                 revArr[arr.length-1-j] = arr[j];
//             }
//             String revString = new String(revArr);
//             str[i] = revString;
//         }
//         for (int i=0; i<n;i++){
//             System.out.println(str[i]);
//         }
//         return ;
//     }
// }

// String - 5. 특정문자 뒤집기
// 문자열 입력받으면
// 각 문자 배열로만들고
// 배열 위치에 영어면 다른 빈 함수에 위치 값 저장
// 빠진 영어도 빈 배열에 저장해놓고
// 원래 문자 배열에 위치값 반복문으로 넣고 넣을때 빠진 곳에 뒤집어서 삽입
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char[] arr = str.toCharArray();
//         char[] result = new char[arr.length];
//         int j = arr.length - 1; 
//         for (int i = 0; i < arr.length; i++) {
//             if (Character.isAlphabetic(arr[i])) {
//                 while (!Character.isAlphabetic(arr[j])) {
//                     j--;
//                 }
//                 result[i] = arr[j];
//                 j--;
//             } else {
//                 result[i] = arr[i];
//             }
//         }
//         System.out.println(new String(result));
//     }
// }





