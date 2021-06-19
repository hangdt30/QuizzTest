package string;

import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class StringExample {

    // You Only Live Once. But if You do it right. once is Enough
    public static void example() {
        System.out.println("----- Nhap chuoi -----");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(countUpperCase(str));
        System.out.println(uppercase1stCharacters(str));
        System.out.println(standardized(str));
    }

//    private static long countUpperCaseWords(String str) {
//        System.out.println("----- Count -----");
//        String newString = str.replace(".", " ");
//        long count = Stream.of(newString.split(" "))
//                .filter(item -> item != null
//                        && !item.equalsIgnoreCase(" ")
//                        && !item.equalsIgnoreCase("")
//                )
//                .map(item -> {
//                    char chatAt = item.charAt(0);
//                    if (Character.isUpperCase(chatAt)) {
//                        return item;
//                    } return null;
//                })
//                .filter(Objects::nonNull)
//                .count();
//
//        return count;
//    }

    public static int countUpperCase(String str) {
        System.out.println("----- Count -----");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (Character.isUpperCase(character)) {
                count++;
            }
        }
        return count;
    }

    public static String uppercase1stCharacters(String str) {
        System.out.println("----- Upper case -----");
        String newStr1 = str;
        for (int i = 0; i < newStr1.length() - 1; i++) {
            char charAt = newStr1.charAt(i);
            if (i == 0) {
                newStr1 = String.valueOf(Character.toUpperCase(charAt)) + newStr1.substring(1, newStr1.length());
            } else if (Character.isWhitespace(charAt) || charAt == '.') {
                char next = newStr1.charAt(i + 1);
                newStr1 = newStr1.substring(0, i + 1) + String.valueOf(Character.toUpperCase(next)) + newStr1.substring(i + 2, newStr1.length());
            }
        }
        return newStr1;
    }

    public static String standardized(String str) {
        System.out.println("----- Standardized String-----");
        String newStr1 = str.toLowerCase();
        StringBuilder stb = new StringBuilder();
        String[] arrayStr = newStr1.split("\\s");
        for (int i=0;i<arrayStr.length;i++){
            if (!Character.isUpperCase(arrayStr[0].charAt(0))){
              arrayStr[0]=arrayStr[0].substring(0,1).toUpperCase()+arrayStr[0].substring(1,arrayStr[0].length());

            }
            if(arrayStr[i].endsWith(".")){
                arrayStr[i+1]=arrayStr[i+1].substring(0,1).toUpperCase()+arrayStr[i+1].substring(1,arrayStr[i+1].length());
            }
            stb.append(arrayStr[i]);
            stb.append(' ');
        }


        return stb.toString().trim();
    }



}
