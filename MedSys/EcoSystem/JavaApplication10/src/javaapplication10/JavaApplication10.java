/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sanjeev MD
 */
class Base {

    Base() {
        System.out.println("base");
    }
}

class Inherited extends Base {

    private Base base;

    Inherited(String name) {
        base = new Base();
        System.out.println(name);
    }
}

public class JavaApplication10 {

    public static void main(String[] args) {

        int[] c = new int[]{0, 0, 0, 1,0,0};
        int counter = 0;
        int nextEle = 0;

        for (int i = nextEle; i < c.length; i++) {
            if (c[i] == 0) {
                if ((i + 2) < c.length && c[i + 2] == 0) {
                    counter++;
                    i = i + 1;
                } else if ((i + 1) < c.length && c[i + 1] == 0) {
                    counter++;
                    i = i + 0;
                }
            }
        }
        
        
    }
}
