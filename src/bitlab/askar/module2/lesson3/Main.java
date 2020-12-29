package bitlab.askar.module2.lesson3;

import java.util.*;

public class Main {
    public static void main(String []args){
        Scanner in  = new Scanner(System.in);


//        ArrayList<String> strings = new ArrayList<>();
//
//        strings.add("name");
//        strings.add("qwe");
//        strings.add("asdh");
//        strings.add("eruru");
//
//        System.out.println(strings.size());
//
//
//        for (int i=0;i<strings.size();i++){
//            System.out.println(strings.get(i));
//        }
//
//
//        strings.remove(0);
//        strings.remove("qwe");
//        strings.set(0,"asdf");
//        strings.contains("eruru");
//
//
//        for (int i=0;i<strings.size();i++){
//            System.out.println(strings.get(i));
//        }
//
//
//        for (String s:strings){
//            System.out.println(s);
//        }


        Stack<String> stack = new Stack<>();

        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        stack.push("new item");
        System.out.println(stack.peek());











//        HashMap<String, String> map = new HashMap<>();
//
//        map.put("first","name");
//        map.put("login","password");
//        map.put("name","surname");
//        map.put("3","nameawesgwweg");
//
//
//        String login = in.next();
//        System.out.println(map.get(login));




    }
}
