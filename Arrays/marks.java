public class marks 
{
    public static void show_marks(int n[])
    {
        System.out.println("Subjects Marks :");
        for(int i=0;i<n.length;i++)
        {
            System.out.println("Subject "+i+":"+n[i]);
        }
    }
    public static void main (String arg[])
    {
        int sub_mark [] = {30,50,40,70,55,60,44};
        show_marks(sub_mark);
    }    
}
