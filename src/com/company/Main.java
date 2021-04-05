package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[]array1 = {"a1", "b2", "c3"};
//#1
//        for(int i = 0; i < array1.length; i++){
//            System.out.println(array1[i] += "number");
//        }
//#2
//        for(String s1 : array1){
//           s1 +="number";
//        }
//#3
        Stream<String>streamOfStrings = Arrays.stream(array1);
        streamOfStrings.map(x->{
            x += " number";
            return x;
        }).map(x ->{
            x+= ".";
            return x;
        }).forEach(x -> System.out.println(x));
        System.out.println();

        Integer[]array2 = {1, 2, 3, 4, 5 ,6, 2, 53, 98};
        Stream<Integer>numberStream = Arrays.stream(array2);

        numberStream.map(x ->{
            x+=10;                                 //прибавляем на каждую цирфу по 10
            return x;
        }).filter(x -> x >30).forEach(x -> System.out.println(x));
        System.out.println();

        List<Integer>List2 = Arrays.asList(array2);
        List<Integer>ListSorted = List2.stream().filter(x -> x<4).collect(Collectors.toList());
        for(Integer i :ListSorted){
            System.out.println(i);
        }

        }
    }

