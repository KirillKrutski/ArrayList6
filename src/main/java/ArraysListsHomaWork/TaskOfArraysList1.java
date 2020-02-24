package ArraysListsHomaWork;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskOfArraysList1 {
    public static void main(String[] args) {
        int k = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to HELL");
        System.out.println();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        System.out.println("Задаем размер листа");
        int sizeOfList = scanner.nextInt();
        System.out.println("Заполняем третий лист");
        for (int i = 0; i < sizeOfList; i++) {
            Integer var2 = scanner.nextInt();
            list3.add(var2);

        }
        for (int i = 0; i < sizeOfList; i++) {
            System.out.print(list3.get(i) + " ");
        }
        System.out.println();
        System.out.println("Пропускаем первые три элемента");
        for (int i = 0; i < sizeOfList; i++) {
            if (i>2){
                System.out.print(list3.get(i) + " ");
            }
        }
        System.out.println();
        System.out.println("Пропустить первые 2 элемента, которые равные '****' ");
        System.out.println("Введите '****' ");
        int var = scanner.nextInt();
        for (int i = 0; i < sizeOfList; i++) {
            if (list3.get(i) == var){
                    list3.remove(i);
                    k++;
                }
            System.out.print(list3.get(i) + " ");
        }
    }
}
