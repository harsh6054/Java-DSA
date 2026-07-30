public class revStringArray {
    public static void revString(String[] s)
    {
        int n = s.length;
        for(int i =0; i<n/2;i++)
        {
            String temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] =temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
    public static void main(String arg[])
    {
        String str[]={"H","S","P","K","R","A"};
        revString(str);
    }
    
}
