import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] a=new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        int b=a[0];
        int c=a[1];
        int d=a[2];
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        double[] e = {1.57, 7.654, 9.986};
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }

        float[] arr = {32.234f, 40.678f, 12f, 5f};
        for (int l = 0; l < arr.length; l++) {
            System.out.println(arr[l]);
        }

        System.out.println(a[0]+", "+a[1]+", "+a[2]);
        System.out.println(e[0]+", "+e[1]+", "+e[2]);
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr.length);



        for (int k = a.length-1; k >=0 ; k--) {
            if(k==0)
                System.out.printf("%s ",a[k]);
            else
                System.out.printf("%s, ",a[k]);
        }

        System.out.println();
        for (int j=e.length-1; j>=0;j--) {
            if(j==0)
                System.out.printf("%s ",e[j]);
            else
                System.out.printf("%s, ",e[j]);

        }


        System.out.println();
        for (int l = arr.length-1; l >=0 ; l--) {
            if(l==0)
                System.out.printf("%s ",arr[l]);
            else
                System.out.printf("%s, ",arr[l]);
        }

        System.out.println();
        for (int k=0;k<a.length;k++){
            if (a[k]%2!=0){
                a[k]+=1;
                System.out.print(a[k]+" ");
            }
        }

    }
}