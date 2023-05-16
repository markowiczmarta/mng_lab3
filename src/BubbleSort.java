public class BubbleSort {
    static void bubblesort(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i< tab.length; i++){
            System.out.print(tab[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] tab = {1, 4, 2137, 420, 2, 68, 546423, 3, 4, 5};
        bubblesort(tab);
    }
}
