public class Main {
    public static void main(String[] args) {
        int[] input = { 5, 1, 6, 2, 3, 4 };

        sort(input, 0, input.length - 1);
        for (int elem : input)
            System.out.format("%d ", elem);
    }

    // Main function that sorts A[l..r] using
    // merge()
    static void sort(int[] A, int l, int r)
    {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(A, l, m);
            sort(A, m + 1, r);

            // Merge the sorted halves
            merge(A, l, m, r);
        }
    }
    //Данный метод является частью алгоритма сортировки "разделяй и властвуй (Merge Sort по-английский)". Суть его в том что мы рекурсивно вызываем метод Sort() деля при каждом вызове массив пополам
    //на более мелкие подмассивы, пока их длина не будет равна 1 или 2. В массивах с длиной 2 мы сортируем их элементы от меньшего к большему, если это необходимо, а с одинарными массивами не делаем ничего.
    //Далее полученные подмассивы собираем в один большой от меньшего элемента к большему, пока не получим массив исходной длины, но уже отсортированный.
    //int[] A - текущий массив, int p - номер элемента от которого нужно выполнить сортировку (по-умолчанию = 0, т. е. первый элемент), int q - номер центрального элемента массива, int r - номер последнего элемента массива
    private static void merge(int[] A, int p, int q, int r)
    {
        //Находим размер левого и правого массивов, инициализируем и заполняем их элементами массива А
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(A, p, L, 0, n1);
        System.arraycopy(A, q + 1, R, 0, n2);

        //Объединяем оба подмассива в массив A
        int i = 0, j = 0;
        int k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }
}