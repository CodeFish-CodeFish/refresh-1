package Day4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetIntro2 {


    public Set<Character> findUniqueChars(String sentence) {
        //Hello world, I love Java => //[H,e,l,o, w,r,d, I, v, J,a]
        Set<Character> uniqueChars = new HashSet<>();
        for (Character ch : sentence.toCharArray()) {
            uniqueChars.add(ch);
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        SetIntro2 setIntro2 = new SetIntro2();
        Set<Character> res = setIntro2.findUniqueChars("Hello world, I love Java");
        System.out.println(res);
    }


}
