public class server {
    //For Example, if n = 5(101) & pos = 1, then answer should be 7(111)
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int newnumber=bitmask ^ n;
        System.out.println(newnumber);
    }
}