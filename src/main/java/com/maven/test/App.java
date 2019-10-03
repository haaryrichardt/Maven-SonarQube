package com.maven.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public int add(int a, int b){
        return a+b;
    }
    public static void main( String[] args )
    {
        App ap = new App();
        int sum = ap.add(2,3);
    }
}
