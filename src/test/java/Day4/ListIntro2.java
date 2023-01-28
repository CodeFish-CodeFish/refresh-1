package Day4;

import java.util.ArrayList;
import java.util.List;

public class ListIntro2 {

    //access modifier + return type + methodName(){}

    public List<Character> breakString(String word) {
        //table -> [t, a, b, l, e]
        //1. iterate over given string and retrieve every
        //character one by one
        //2. store every character in ArrayList
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            Character ch = word.charAt(i); // t, a, b, l, e
            characters.add(ch);
        }
        return characters;
    }

    public String buildString(List<Character> chars) {
        System.out.println("Beginning of buildString method");
        //Iterate over every element in chars list
        //append chars to string
        String result = "";
        for (int i = 0; i < chars.size(); i++) {
            Character tempChar = chars.get(i);
            result += tempChar; //result = result + tempChar;
        }
        System.out.println("About to return following values: "+result);
        return result;
    }

    public static void main(String[] args) {
        ListIntro2 listIntro2 = new ListIntro2(); //create object
        System.out.println(listIntro2.breakString("table"));
        List<Character> list = listIntro2.breakString("table");
        // [t, a, b, l, e]
        String str = listIntro2.buildString(list);
        System.out.println("Built string: " + str);

//        System.out.println(list.get(30));
    }


}
