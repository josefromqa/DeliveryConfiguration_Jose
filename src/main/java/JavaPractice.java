import java.util.Arrays;
import java.util.Locale;

public class JavaPractice {

    public static void main(String[] args){

            String name="npd";
            System.out.println(name);

            String name2=new String("npd");
            System.out.println(name2);

            System.out.println();

            String s1="Cat";
            String s2="Cat";
            System.out.println(s1==s2);

            String d1="Dog";
            String d2="dog";
            System.out.println(d1==d2);

            System.out.println("==================================================");

            String c1="npd";  //pool memory
            String c2=new String("npd");  //heap memory
            String c3=new String("npd");  //heap memory
            String c4="npd";  //pool memory
            String c5="npd";  //pool memory

            System.out.println(c1==c2);
            System.out.println(c2==c3);
            System.out.println(c1==c4);


            System.out.println("==================================================");
            int[]numbers={300,100,200,500,600};
            System.out.println(Arrays.toString(numbers));

            System.out.println("==================================================");

            System.out.println("A"); //will print A + new line
            System.out.println("B");

            System.out.print("A");
            System.out.print("B");
            System.out.println("==================================================");

            System.out.println("Hello \nMy name is Jose");

            System.out.println("==================================================");

            System.out.println("\tI am here");


            String[] fruits={"Apple","Banana","Kiwi","Apricot"};
            //                 0        1        2        3

            System.out.println("==================================================");

            String sentence="I am here for you";
            //               0  1  2 3 4 5 6789101112
            String word1=sentence.substring(10,17);
            System.out.println(word1);

            String name3="JoSe";
            String Character=name3.substring(0,2);
            System.out.println(Character);
            String fr=Character.toLowerCase();
            System.out.println(fr);
            String fr2=Character.toUpperCase();
            System.out.println(fr2);
            System.out.println(name3.toLowerCase());

            System.out.println("==================================================");

            String S="I love my job";
            //        01234567
            String se=S.substring(7);
            System.out.println(se);

            System.out.println("==================================================");
            for (int i = 0; i < 10; i++) {
                    System.out.println("npd");
                    System.out.print("npd");

            }

            String [] animals={"dog","cat","bear"};
            //                    0    1      2
            String size=animals[2];
            System.out.println(size);

            int[]scores={80,90,70,23};
            //            0  1  2  3
            System.out.println(scores[1]);

            System.out.println("==================================================");

            String str5[]={"Adam","John","Amy","Tony","Mike"};  //size is 5
            //               0      1      2     3      4
            for (int i = 0; i <= 2; i++) {
                    System.out.println(str5[i]);

            }

            System.out.println("==================================================");

            int[]arr1={1,2,3};
            int[]arr2={1,2,3};

            boolean r1=Arrays.equals(arr1,arr2);
            System.out.println(r1);

            System.out.println("==================================================");

            int[]arr3={3,2,1};
            Arrays.sort(arr3);  //1,2,3
            boolean r2= Arrays.equals(arr1,arr3);
            System.out.println(r2);






    }
}
