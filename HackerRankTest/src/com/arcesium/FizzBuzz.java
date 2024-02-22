package com.arcesium;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FizzBuzz {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        FizzBuzz.fizzBuzz(n);

        bufferedReader.close();
    }

    public static void fizzBuzz(int n) {
        while (n--  > 0){
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            while(x-- > 0){
                int val = scanner.nextInt();

                if (val % 3 == 0 && val % 5 == 0) {
                    System.out.println("FizzBuzz");
                }else if (val % 3 == 0) {
                    System.out.println("Fizz");
                }else if (val % 5 == 0) {
                    System.out.println("Buzz");
                }
            }
        }
    }
}
