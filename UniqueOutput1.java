package practiceprogramsforjavadsa;

public class UniqueOutput1 {

    public static void main(String[] args) {

        String str = "a" + 2 + "b" + 3 + "c" + 4;

        StringBuilder sb = new StringBuilder(str);

        sb.replace(1,1,"a");

        sb.replace(2,3,"bb");

        sb.replace(5,5,"c");

       sb.setCharAt(8,'c');

       sb.setCharAt(6,'c');

        str = sb.toString();

        System.out.println(str);

    }

}
