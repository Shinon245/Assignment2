/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import static kiss.API.*;


/**
 *
 * @author Cameron
 */
public class JavaApplication2 
{
    
    public static void testArrayList(){
        ArrayList<String> names = new ArrayList<String>();
        
        names.add("Billy");
        names.add("Bob");
        names.add("Joe");
        
        for (String name: names)
        {
            println(name);
        }
        
        names.sort(new Comparator<String>()
        {
            @Override
            public int compare(String a, String b)
            {
                return -a.compareTo(b);
            }
        }
        ); //anonymous inner class
        
        names.sort((a,b) -> -a.compareTo(b)); //lambda
        
        for (String name: names)
        {
            println(name);
        }
        
    }
    
       
    public static void main(String[] args)
    {
        testArrayList();
    }
 
  
    
}
