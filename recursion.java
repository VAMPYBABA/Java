public class recursion 
{
  public static void main(String[] args) 
    {
        recursion r = new recursion();
        int a = r.sum(3);
        System.out.println("Sum of first N numbers is : "+a);
    }

    int sum (int b)
    {
        if (b>0)
        {
        return b+sum(b-1);
        }
        else 
        {
        return 0;
        }
    }
}
