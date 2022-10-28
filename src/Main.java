public class Main {
    static int[] ary1 = {1, 10, 3, 7, 15};
    static int[] ary2 = {2, 1, 20, 3};

    public static void main(String[] args) {

        int[] un = uniao(ary1, ary2);
        for (int i = 0; i < un.length; i++) {
            System.out.println(un[i]);
        }

    }

    /**
     * o array1 é copiado para o array final; depois é feita a verificação de se os
     * elementos do array2 existem no final se nao existir é colocado no array final
     *
     * @param array1
     * @param array2
     * @return
     */
    public static int[] uniao(int[] array1, int[] array2) {
        int[] aryf = new int[10];
        int cont = 0;
        int i;
        for (i = 0; i < ary1.length; i++) {
            aryf[i] = ary1[i];
        }
        cont = i;
        boolean f = false;
        int pos = 0;
        for (i = 0; i < ary2.length; i++) {
            f=false;
            for (int z = 0; z < cont; z++) {
                System.out.println("---" + aryf[z] + "array i " + ary2[i] );
                if (aryf[z] != ary2[i]) {
                    f = true;
                    pos = i;
                }
            }
            if (f == true) {
                aryf[cont++] = ary2[pos];
                System.out.println("*" + ary2[pos] + " cont " + cont);

            }
        }
        return aryf;
    }
}
