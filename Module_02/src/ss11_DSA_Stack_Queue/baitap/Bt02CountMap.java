package ss11_DSA_Stack_Queue.baitap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bt02CountMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> treeMap = new TreeMap<Character, Integer>();
        System.out.println("In put below here: ");
        String string = scanner.nextLine();

        for(int i=0; i<string.length();i++){
            char charAt = string.toUpperCase().charAt(i);
            if (treeMap.get(charAt) !=null){
                int count = treeMap.get(charAt);
                treeMap.put(charAt, count +1);
            }else
                treeMap.put(charAt,1);
        }
        System.out.println(treeMap);

    }

}
