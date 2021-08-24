

import java.util.*;

public class DataPractice2 {


    public static void main(String[] args) {

        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,9,10,1,2,3,4));
        System.out.println(list1);
       /* for (int i = 0; i < list1.size() ; i++) {
            if(list1.get(i)<5){
                list1.remove(i);
            }


        }
        System.out.println(list1); */

        //removal with condition
        list1.removeIf(each -> each < 5);
        System.out.println(list1);
        System.out.println("====================================================");


        Map<String,Integer> map1=new HashMap<>();//random
        Map<String,Integer> map2=new TreeMap<>();//always sorted
        Map<String,Integer> map3=new LinkedHashMap<>(); //keeps the insertion order as it is
        Map<String,Integer> map4=new Hashtable<>();  //thread safe

        System.out.println("====================================================");

        Map<String,Double>employees=new LinkedHashMap<>();
        employees.put("John",200.00);
        employees.put("Tony",300.00);
        employees.put("Maria",400.00);
        employees.put("Roman",500.00);
        System.out.println(employees);
        System.out.println(employees.size());//returns how many pairs of data
        System.out.println("Salary of Maria : $" + employees.get("Maria"));
        employees.remove("Roman");
        System.out.println(employees);
        System.out.println(employees.size());

        System.out.println("====================================================");

        LinkedHashMap<String,Integer> name=new LinkedHashMap<>();
        name.put("Jesus",89);
        name.put("Alan",90);
        name.put("Adam",55);
        name.put("Arya",44);
        name.put("Adam",22);

        System.out.println(name);

        System.out.println("====================================================");

        Map<String,String> countries=new LinkedHashMap<>();
        countries.put("Spain","Madrid");
        countries.put("Ukraine","Kiev");
        countries.put("Turkey","Ankara");

        System.out.println(countries);

        for(String eachCountry : countries.keySet()) {
            String eachCity = countries.get(eachCountry);
            System.out.println(eachCountry+"'s capital is: " + eachCity);

            System.out.println("====================================================");

            List<Integer> list=new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));

            LinkedHashSet<Integer> set= new LinkedHashSet<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,12,22,22,33));
            list.clear();
            System.out.println(list);

        }




    }
}
