/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookproject;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author admin
 */
public class JSONParse {
    
    public static List<String> JsonArraytoList(JSONArray ja,String key)
    {
        List<String> ArrayList1=new ArrayList();
        for(int i=0;i<ja.size();i++)
        {
           JSONObject jo1=(JSONObject)ja.get(i);
           String str=(String)jo1.get(key);
           ArrayList1.add(str);
        }
        return ArrayList1;
    }
    
     public static List<String> JsonArray_inttoList(JSONArray ja,String key)
    {
      String str;
      long value;
        List<String> ArrayList1=new ArrayList();
        for(int i=0;i<ja.size();i++)
        {
           JSONObject jo1=(JSONObject)ja.get(i);
          value=(long) jo1.get(key);
            str=Long.toString(value);
           ArrayList1.add(str);
        }
      
        return ArrayList1;
    }   
    public static String[] JsonArray_int_Count1Less_toList(JSONArray ja,String key)
    {
          String[] List1=new String[28];
        for(int i=0;i<ja.size()-1;i++)
        {
            JSONObject jo1=(JSONObject)ja.get(i);
            long value=(long)jo1.get(key);
            String str=Long.toString(value);           
            List1[i]=str;
        }
       
       return List1;
    }
    public static List<String> JsonArray_inttoList(JSONArray ja,String key1,String key2)
    {
        List<String> ArrayList=new ArrayList();
        for(int i=0;i<ja.size()-1;i++)
        {
         JSONObject jo=(JSONObject)ja.get(i);
         JSONObject jo1=(JSONObject)jo.get(key1);
         long value=(long) jo1.get(key2);
         String str=Long.toString(value);
         ArrayList.add(str);
        }
        return ArrayList;
    }
}
