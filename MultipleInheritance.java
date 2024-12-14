import java.util.*;
interface a {
    public void r();
}
        
interface b  {
    public void r();}
         
class c implements a,b {
    public void r(){
        System.out.println("Hello Teachers");
    }
    public void r1(){
        System.out.println("Hello Professors");
    }
}

public class MultipleInheritance
{
    public static void main(String args[])
    {
       c h1=new c();
       h1.r();
       h1.r1();
    }
}
/*Hello Teachers
Hello Professors*/