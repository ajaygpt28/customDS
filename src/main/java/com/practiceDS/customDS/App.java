package com.practiceDS.customDS;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       CustomLinkedList linkedList=new CustomLinkedList();
       linkedList.insertHead(12);
       linkedList.insertHead(13);
       linkedList.insertHead(14);
       linkedList.insertHead(15);
       linkedList.insertHead(16);
       linkedList.insertTail(17);linkedList.insertTail(18);linkedList.insertTail(19);
       linkedList.printAllNode();
       
    }
}
