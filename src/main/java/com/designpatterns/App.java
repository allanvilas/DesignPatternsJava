package com.designpatterns;

import main.java.assets.Person;
import main.java.assets.Person.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = new builder()
            .name("Allan")
            .birthDate("12/11/1996")
            .email("allanv@gmail.com")
            .doc("46845745784")
            .nickname("Wool")
            .lastName("Vilas");
        System.out.println( person.toString() );
    }
}
