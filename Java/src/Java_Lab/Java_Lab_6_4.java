package Java_Lab;

import java.util.Arrays;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Java_Lab_6_4 {

    public static void main(String[] args) {
        String url = "https://google.com";
        ulrChecker(url);
    }
    public static void ulrChecker(String url) {
        String[] checkPoint = url.split("://");
        String headerChecker = checkPoint[0];
        String domainChecker = checkPoint[1];
    if (headerChecker.contains("s")){
    System.out.println("It is https");
    } else {System.out.println("It is http");}
    if (domainChecker.contains("com")){
        System.out.println("It is .com");
        String nameDomain = checkPoint[1].replaceAll(".com", "");
        System.out.printf("Domain name is %s",nameDomain);
    } else {System.out.println("It is .net");}

    }
}


