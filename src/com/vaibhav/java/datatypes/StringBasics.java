package com.vaibhav.java.datatypes;

public class StringBasics {
    public static void main(String[] args){
        String name="Vipul";
        String name2="Vaibhav";
        String name3="vaiBhav";
        String name4="Vaibhav Singh";
        String name5="    ";
        System.out.println(name);
        int length = name.length();
        System.out.println(length);
        System.out.println("Char at 3: "+name.charAt(3));
        System.out.println(name.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name2.equalsIgnoreCase(name3));
        System.out.println(name.compareTo(name2));
        System.out.println(name2.compareTo(name3));
        System.out.println(name2.compareToIgnoreCase(name3));
        //Substring
        System.out.println(name2.substring(2,5));
        System.out.println(name2.substring(2));
        System.out.println(name3.toLowerCase());
        //Replace
        System.out.println(name4.replace("Singh", "Pratap Singh"));
        System.out.println(name.startsWith("Vai"));
        System.out.println(name.endsWith("ul"));
        System.out.println(name.isEmpty());
        System.out.println(name5.isBlank());
        System.out.println(name.indexOf('v'));
        System.out.println(name.indexOf('l'));
        System.out.println(name4.lastIndexOf('i'));
        //Methods which are accessed from a class are called as static methods
        System.out.println(String.format("My name is %s and I'm %d years old.", name4, 24));
    }
}
