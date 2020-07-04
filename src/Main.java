

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        MyQueue myList = new MyQueue();
        Queue<Integer> defaultList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Элементы ввода. Если значение не int, то ввод завершен.");
        do{
            a = scanner.nextInt();
            myList.add(a);
            defaultList.add(a);
        } while (scanner.hasNextInt());
        myList.add(null);
        defaultList.add(null);

        int listSize = 0, maxElem = 0, minElem = 0;
        for(Integer i = myList.get(); i != null; myList.add(i), i = myList.get()){
            listSize++;
            if(i > maxElem)
                maxElem = i;
            if(i < minElem)
                minElem = i;
        }
        myList.add(null);
        System.out.println("Мое решение:\nразмер списка: " + listSize + ".\nМинимальный элемент: " + minElem + ". Максимальный элемент: " + maxElem +";\nСостояние очереди:");
        for(Integer i = myList.get(); i != null; myList.add(i), i = myList.get()){
            System.out.print(i);
        }
        myList.add(null);

        listSize = 0; maxElem = 0; minElem = 0;
        for(Integer i = defaultList.poll(); i != null; defaultList.add(i), i = defaultList.poll()){
            listSize++;
            if(i > maxElem)
                maxElem = i;
            if(i < minElem)
                minElem = i;
        }
        defaultList.add(null);
        System.out.println("\n\nРешение по умолчанию:\nразмер списка: " + listSize + ".\nМинимальный элемент: " + minElem + ". Максимальный элемент: " + maxElem +";\nСостояние очереди:");
        for(Integer i = defaultList.poll(); i != null; defaultList.add(i), i = defaultList.poll()){
            System.out.print(i);
        }
        defaultList.add(null);
    }
}
