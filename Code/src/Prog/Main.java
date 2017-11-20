//Ввести с клавиатуры 5 строк, записать их в массив строк.
// Отсортировать массив по возрастанию длины строк и вывести на экран.

package Prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter line");
        String str1 = in.nextLine();
        System.out.println("Enter line two");
        String str2 = in.nextLine();
        System.out.println("Enter line three");
        String str3 = in.nextLine();
        System.out.println("Enter line four");
        String str4 = in.nextLine();
        System.out.println("Enter line more");
        String str5 = in.nextLine();
        String[] strwin = { str1, str2, str3, str4, str5 };
        for(int i = 0; i < strwin.length; i++){
            for(int j = 0; j < strwin.length - 1 - i; j++){
                if(strwin[j].length() > strwin[j + 1].length()){
                    String str = strwin[j];
                    strwin[j] = strwin[j + 1];
                    strwin[j + 1] = str;
                }
            }
        }
        for(String s : strwin){
            System.out.println(s);
        }
    }
}
