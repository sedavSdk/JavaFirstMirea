package tasks.task10;

public class Task1
{
    public static void triangle(int n, int k, int i, int cur)
    {
        if (i == n)
            return;
        if (cur == k)
            triangle(n, 0, i, cur + 1);
        else
        {
            System.out.print(cur + " ");
            triangle(n, k + 1, i + 1, cur);
        }
    }

    public static void main(String[] args)
    {
        triangle(11, 0, 0, 1);
    }
}