package company.lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogicalOp op=new LogicalOp();
        System.out.println(op.getListHundred());

        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(31);
        list.add(18);
        list.add(34);
        op.displayList(list);


        List<Double> myList= new ArrayList<>();
        myList.add(3.7);
        myList.add(5.5);
        myList.add(9.3);
        myList.add(2.1);
        op.addToList(myList,8.5);

        List<Integer>myList=new ArrayList<>();
        myList.add(14);
        myList.add(19);
        myList.add(11);
        myList.add(18);
        myList.add(13);
        myList.add(30);
        op.printList(myList,30);

        op.printBackwards(myList);

        op.printList(myList);

        List<Integer> myListB=new ArrayList<>();
        myListB.add(57);
        myListB.add(70);
        myListB.add(63);
        myListB.add(99);
        myListB.add(72);
        System.out.println("Cel mai mare numar din lista este "+ op.checkMaxList(myListB));


    }
}
