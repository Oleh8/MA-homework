package hw.three;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//      Task 01 SortTwoArrays test:
        int arr[] = {1, 5, 6, 6};
        int arr1[] = {2, 5, 5, 8};
        System.out.println(Arrays.toString(SortTwoArrays.mergeArrays(arr, arr1)));

//        Task 02 SortByPart test:
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам " +
                "пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. " +
                "И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!", "Артемий Филиппович:" +
                " Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(SortByPart.printTextPerRole(roles, textLines));

//        Task 04 ComplexNumber test:
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());


    }
}
