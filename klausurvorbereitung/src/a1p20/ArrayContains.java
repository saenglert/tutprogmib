package a1p20;

public class ArrayContains {

    public static void main(String[] args) {
        System.out.println(containsSame(new int[] {1,2,3,4}, new int[] {5,6,7,8}));
        System.out.println(containsSame(new int[] {1,2,3,4}, new int[] {5,6,1,8}));
        System.out.println(containsSame(new int[] {1,6,3,4}, new int[] {5,6,7,8}));
    }

    public static boolean containsSame(int[] input1, int[] input2) {
        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {
                if (input1[i] == input2[j])
                    return true;
            }
        }

        return false;
    }
}
