public class Main {
    public static void main(String[] args) {
        char[] cArr = {'a', 'b', 'c'};
        System.out.print(cArr);

                int[] nArr = new int[10];
        for (int i = 0; i < nArr.length; i++) {
            nArr[i] = (int)(Math.random()*10);
        }

        for (int i = 0; i < nArr.length - 1; i++) {
            boolean changed = false;

            for (int j = 0; j < nArr.length - 1 - i; j++) {
                if (nArr[j] > nArr[j+1]) {
                    int temp = nArr[j];
                    nArr[j] = nArr[j+1];
                    nArr[j+1] = temp;
                    changed = true;
                }
            }

            if (!changed) {
                break;
            }
        }

        for (int i = 0; i < nArr.length; i++) {
            System.out.print(nArr[i]);
        }
    }
}