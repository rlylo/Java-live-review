package week14.language;

import java.util.ArrayList;

public class ListOfLanguages {
    public static void main(String[] args) {

        Language l1 = new Romanian();
        Language l2 = new Turkish();
        Language l3 = new Russian();


        ArrayList<Language> languages = new ArrayList<>();
        languages.add(new English());
        languages.add(new Spanish());
        languages.add(l1);
        languages.add(l2);
        languages.add(new Russian());

        System.out.println("languages.size() = " + languages.size());


        for (Language language : languages) {
            System.out.println(language.getClass().getSimpleName());
            System.out.println(language.hello());
            System.out.println(language.bye());
        }

        //instanceOf operator -> check the object type
        Language lan = new Romanian();
        if (lan instanceof Romanian){
            System.out.println("It is Romanian");
            System.out.println(lan.hello());
    }


    }
}
