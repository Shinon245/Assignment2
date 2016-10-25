/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.*;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


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
        
        String str = "";
        
        for (String name: names)
        {
            System.out.println(name);
        }
        
        names.sort((a,b) -> -a.compareTo(b)); 
        
        for (String name: names)
        {
            str += name;
            str += " ";
        }
        
        System.out.println(str);
        
       assertTrue("Joe Bob Billy ".equals(str));

        
        for (String name: names)
        {
            System.out.println(name);
        }
        
    }
    
    
    
public static void testCollection()
    {
        String str = "";
        Collection<String> c = new LinkedList<String>();
        c.add("Hello");
        c.add("Fellow");
        c.add("Human");
        
        assertTrue(c.contains("Human"));

        c.remove("Fellow");
        assertFalse(c.contains("Fellow"));
        
        Iterator<String> i = c.iterator();
        while (i.hasNext())
        {
            String value = i.next();
            System.out.println(value);
        }
        
        for(String value : c)
        {
            str += value;
            str += " ";
        }
        
        System.out.print(str);
        assertTrue("Hello Human ".equals(str));
    }



    public static void testMap()
    {
        Map<String, Integer> pokemonNumbers = new HashMap<String,Integer>();
  
        pokemonNumbers.put("Bulbasaur", 001);
        pokemonNumbers.put("Xerneas", 716);
        
        for (String key : pokemonNumbers.keySet())
        {
            System.out.println(key + " = " + pokemonNumbers.get(key));
        }
        
        for (String key : pokemonNumbers.keySet())
        {
            System.out.println(key + " = " + pokemonNumbers.get(key));
        }
        
        for (String key : pokemonNumbers.keySet())
        {
            pokemonNumbers.put(key, pokemonNumbers.get(key)+1);
        }
        
        for (String key : pokemonNumbers.keySet())
        {
            System.out.println(key + " = " + pokemonNumbers.get(key));
        }
        
    }
    
    
       
    public static void main(String[] args)
    {
        testArrayList();
        testCollection();
        //testMap();
    }
 
  
    
}
