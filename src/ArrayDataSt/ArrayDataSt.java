package ArrayDataSt;

public class ArrayDataSt {

    public static void main(String[] args) {

        // pre-defined array   0   1  2  3  4
        int[] studentScore = {92, 91, 89, 95, 93};

        //size of the array
        int size = studentScore.length;
        System.out.println(size);

        //iterate over array
        int i = 0;
        while (i < studentScore.length) {
            System.out.println("index: " + i + " testScore: " + studentScore[i]);
            i++;
        }

        //not predefined and fix size
        int[] newScore = new int[3];
        System.out.println(newScore[0]);
        //[0,0,0,]
    }
}