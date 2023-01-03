public class Main {
    public static void main(String[] args) {
        int[] heights = new int[3];
        for (int i : heights) {System.out.println(i);}
        heights[0]=78;
        heights[1]=72;
        heights[2]=69;
        for (int i : heights) {System.out.println(i);}



        boolean[] bools = {true,false,true,false,true,false};
        bools[0]=bools[3];
        System.out.println(bools.length);
        System.out.println(bools[0]);
        System.out.println(bools[5]);



        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[1];
        alphabeticalNames[1]=alphabeticalNames[2];
        alphabeticalNames[2]=temp;
        for (String i : alphabeticalNames) {System.out.println(i);}



        double[] array1 = {7.5,10.0};
        double[] array2 = {8.2,14.8};
        double[] array3 = {array1[0]+array2[0],array1[1]*array2[1]};
        for (double i : array3) {System.out.println(i);}



        String[] animals = new String[4];
        for (String i : animals) {System.out.println(i);}
        animals[0] = "dog";
        animals[1] = "camel";
        animals[2] = "aardvark";
        animals[3] = "bunny";
        for (String i : animals) {System.out.println(i);}
        animals[2] = animals[2]+="s";
        for (String i : animals) {System.out.println(i);}
        System.out.println(animals.length);
        System.out.println(animals[2].length());



        Dog Sparky = new Dog("Sparky",4);
        Dog Toby = new Dog("Toby",7);
        Dog Fiona = new Dog("Fiona",12);
        Dog[] dogs = {Sparky,Toby,Fiona};
        for (Dog i : dogs) {System.out.println(i.getName());}



        int[] ints1 = {2, 4, 6, 8, 10};
        int[] ints2 = ints1;
        ints2[3] = 15;
        System.out.println(ints1[3]);
        System.out.println(ints2[3]);



        String[] myStrs = {"hi", "bye", "what", "purple"};
        int arrLen = myStrs.length;
        int strLen = myStrs[3].length();
        System.out.println(arrLen + strLen);

        String str = myStrs[2].substring(1, 3);
        System.out.println(str);
    }
}