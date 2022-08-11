package ss11_DSA_Stack_Queue.baitap.data_demerging_use_queue;

import java.util.LinkedList;
import java.util.Queue;

public class DataDemergingUseQueue {
    public static void main(String[] args) {
        List list[] = new List[5];
        Queue<List> queueNu = new LinkedList<>();
        Queue<List> queueNam = new LinkedList<>();
        list[0] = new List("Vo Dinh Tuan",true,"17/04/2002");
        list[1] = new List("Le Van A",true,"15/01/2002");
        list[2] = new List("Nguyen Thi B",false,"17/09/2002");
        list[3] = new List("Ho Hoang D",false,"04/03/2002");
        list[4] = new List("Tran Van C",true,"20/04/2002");
        System.out.println("Before format: ");
        for (List list1 : list ){
            System.out.println(list1.toString());
            if (list1.isGender()){
                queueNam.add(list1);
            }else {
                queueNu.add(list1);
            }
        }
        String outPut = "";
        while (!queueNu.isEmpty()){
            outPut = outPut+queueNu.remove() + "\n";
        }
        while (!queueNam.isEmpty()){
            outPut = outPut+queueNam.remove() + "\n";
        }
        System.out.println("\n After sort: ");
        System.out.println(outPut);

    }
}
