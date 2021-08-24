import java.util.Arrays;

public class Java2 {

    public static void main(String[] args) {

 /*       for (int i = 0; i <= 5 ; i++) { //i:0, 1, 2, 3, 4, 5
            if (i == 3) {
                continue; //jumps to the next iteration
            }

            System.out.print(i + " ");

        }

            System.out.println();

            System.out.println("===============================================");

            for (int i = 0; i < 5; i++) {
                if(i==3){
                    break;  //exits the loop
                }
                System.out.print(i+ " ");
            }

        System.out.println();
        System.out.println();

        String str="NPDNPDNPD";
        //          012345678

        //substring(0,3) //NPD
        System.out.println(str.substring(0,3));
        //substring(3,6) //NPD
        //substring(6,9) //NPD

int count=0;
        for (int i = 0; i <= str.length()-1; i++) {
            String s = str.substring(i, i + 3);
            if (s.equals("NPD")) {
                count++;

            }
        }
            System.out.print(count);
        System.out.println();
        System.out.println("===============================================");
*/

        String [] arr={"Java","C#","Python","Java","jAvA"};

        String word="java";

        int count2=0;

        for(String each: arr){
            if(word.equals(each)){
                count2++;
            }
        }
        System.out.println(count2);
        System.out.println();
        System.out.println("===============================================");

        String str="Summer"; //remmus

        String reverse="";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str+ " ");
        }

        for(int j=str.length()-1; j>=0; j--){
            reverse+=str.toCharArray()[j];

        }
        System.out.println(reverse+ " ");

        System.out.println();
        System.out.println("===============================================");

        String str2="AAAABBBBCC";
        String result="";

        for (int i = 0; i <=str2.length()-1; i++) {
            if (!result.contains(" "+str2.charAt(i))){
                result+=" "+str2.charAt(i);
            }
        }
        System.out.println(result);
        System.out.println();
        System.out.println("===============================================");


        int [] arr2={10,20,30,40,50};
        //            0  1  2  3  4

        for (int i = 0; i <=arr2.length-1; i++) {
            System.out.println(arr2[i]+ " ");
            //System.out.println(Arrays.toString(arr2));

        }

        for (int each:arr2){
            System.out.println(each+" ");
        }

        System.out.println();
        System.out.println("===============================================");

        String [] names={"NPD","Group","Washington","NY","Chicago"};
        // index:          0       1        2         3      4

        System.out.println(names[1]);
        System.out.println(names[4]);











        }
    }

