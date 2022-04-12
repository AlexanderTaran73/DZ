package com.company;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

    private static Object Type;

    public static void main(String[] args) {
        System.out.println("\n Discriminant");

        Discriminant discriminant = (a, b, c) -> b*b-4*a*c;

        System.out.println(discriminant.calculate(1.0, 2.0, 1.0));


        System.out.println("\n \n Sort");

        Stream<Log> stream = Stream.generate(() -> new Log(com.company.Type.values()[new Random().nextInt(com.company.Type.values().length)])).limit(10);

        Comparator<Log> comparator = Comparator.comparingInt(Log::getCount).reversed();

        stream.sorted(comparator).forEach(v -> System.out.println(v.getType()));


        System.out.println("\n \n Filter");

        Stream<Log> stream2 = Stream.generate(() -> new Log(com.company.Type.values()[new Random().nextInt(com.company.Type.values().length)])).limit(10);

        stream2.filter(v -> v.getCount()==2).forEach(v -> System.out.println(v.getType()));


    }

}
