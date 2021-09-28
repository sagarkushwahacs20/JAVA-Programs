public class swap {
    public static void main(String[] args) {
        String str1 = "Water";
        String str2 = "Cold Drink";
        String temp;

        temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("str1 :" + str1);
        System.out.println("str2 :" + str2);

    }
}