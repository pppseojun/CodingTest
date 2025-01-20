package baekjoon;

import java.util.*;

// 10988 - 팰린드롭 확인하기
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         char[] c = str.toCharArray();
//         int lt = 0;
//         int rt = str.length() -1;
//         while(lt<rt){
//             if(!Character.isAlphabetic(c[lt])){
//                 lt++;
//             }else if(!Character.isAlphabetic(c[rt])){
//                 rt--;
//             }else{
//                 if(c[lt]!=c[rt]){
//                     System.out.println("0");
//                     return;
//                 }else{
//                     lt++;
//                     rt--;
//                 }
//             }
//         }
//         System.out.println("1");
//     }
// }

// 1157 - 단어 공부
public class Main{
    public static void main(String[] args) {
        int[] alphabet = new int[26]; 
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        int max = -1;
        char ch = '?';
        
        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i)-97]++;
        }

        
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i]>max){
                max = alphabet[i];
                ch = (char)(i+65);
            }else if(alphabet[i]==max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
