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
        
        names.sort((a,b) -> -a.compareTo(b)); 
        
        try(Close out = outExpect("Joe", EOL, "Bob", EOL, "Billy", EOL)) {
        
        for (String name: names)
        {
            println(name);
        }
        }
        
        for (String name: names)
        {
            println(name);
        }
        
    }
    
    
    
public static void testCollection()
    {
        Collection<String> c = new LinkedList<String>();
        c.add("Hello");
        c.add("Fellow");
        c.add("Human");
        
        try (Close out = outExpect(true))
        {
            println(c.contains("Human"));
        }
        c.remove("Fellow");
        try (Close out = outExpect(false))
        {
            println(c.contains("Fellow"));
        }
        
        Iterator<String> i = c.iterator();
        while (i.hasNext())
        {
            String value = i.next();
            println(value);
        }
        
        try (Close out = outExpect("Hello",EOL,"Human",EOL))
        {
            for(String value : c)
            {
                println(value);
            }
        }
    }



    public static void testMap()
    {
        Map<String, Integer> pokemonNumbers = new HashMap<String,Integer>();
  
        pokemonNumbers.put("Bulbasaur", 001);
        pokemonNumbers.put("Xerneas", 716);
        
        try (Close out = outExpect("Bulbasaur = 1", EOL, "Xerneas = 716", EOL)){
        for (String key : pokemonNumbers.keySet())
        {
            println(key + " = " + pokemonNumbers.get(key));
        }
        }
        
        for (String key : pokemonNumbers.keySet())
        {
            println(key + " = " + pokemonNumbers.get(key));
        }
        
        for (String key : pokemonNumbers.keySet())
        {
            pokemonNumbers.put(key, pokemonNumbers.get(key)+1);
        }
        
        for (String key : pokemonNumbers.keySet())
        {
            println(key + " = " + pokemonNumbers.get(key));
        }
        
    }
    
    
       
    public static void main(String[] args)
    {
        testArrayList();
        testCollection();
        testMap();
    }
 
  
    
}
