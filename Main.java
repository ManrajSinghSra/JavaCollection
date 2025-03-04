import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        //after java 7 <Integer> can be omitted
        // List is an INTERFACE
        //IT EXTENDS COLLECTION INTERFACE

        list.add(1);
        list.add(23);
        list.add(24);
        for(int x: list){
            System.out.println(x);
        }
        System.out.println(list.contains(3));// for check if something contains or not
    }

}
