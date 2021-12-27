// Простое решение — запустить два цикла. 
// Внешний цикл рассматривает каждый элемент первого массива, 
// а внутренний цикл проверяет пару во втором массиве. 
// Мы отслеживаем минимальную разницу между ar1 [i] + ar2 [j] и x.

// O(n) -> O(1)
// 1) Initialize a variable diff as infinite (Diff is used to store the 
//    difference between pair and x).  We need to find the minimum diff.
// 2) Initialize two index variables l and r in the given sorted array.
//        (a) Initialize first to the leftmost index in ar1:  l = 0
//        (b) Initialize second  the rightmost index in ar2:  r = n-1
// 3) Loop while  l = 0
//        (a) If  abs(ar1[l] + ar2[r] - sum) < diff  then 
//            update diff and result 
//        (b) If (ar1[l] + ar2[r] <  sum )  then l++
//        (c) Else r--    
// 4) Print the result. 

// Java программа для поиска ближайшей пары в массиве
class ClosestPair
{
    // ar1 [0..m-1] и ar2 [0..n-1] отсортированы по двум
    // массивы /, а x это номер. Эта функция печатает
    // пара из обоих массивов такая, что сумма
    // пара ближе всего к х.
    void printClosest(int ar1[], int ar2[], int m, int n, int x)
    {
        // Инициализируем diff между парой sum и x.
        int diff = Integer.MAX_VALUE;
        // res_l и res_r являются индексами результата из ar1 [] и ar2 []
        // соответственно
        int res_l = 0, res_r = 0;
        // Начинаем с левой стороны ar1 [] и правой стороны ar2 []
        int l = 0, r = n-1;
        while (l<m && r>=0)
        {
           // Если эта пара ближе к x, чем ранее
           // найти ближайший, затем обновить res_l, res_r и diff
           if (Math.abs(ar1[l] + ar2[r] - x) < diff)
           {
               res_l = l;
               res_r = r;
               diff = Math.abs(ar1[l] + ar2[r] - x);
           }
           // Если сумма этой пары больше чем x, перейти к меньшему
           // боковая сторона
           if (ar1[l] + ar2[r] > x)
               r--;
           else  // переместимся в большую сторону
               l++;
        }
        // Распечатать результат
        System.out.print("The closest pair is [" + ar1[res_l] +
                         ", " + ar2[res_r] + "]");
    }
    // Программа драйвера для проверки вышеуказанных функций
    public static void main(String args[])
    {
        ClosestPair ob = new ClosestPair();
        int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 30, 40};
        int m = ar1.length;
        int n = ar2.length;
        int x = 38;
        ob.printClosest(ar1, ar2, m, n, x);
    }
}
