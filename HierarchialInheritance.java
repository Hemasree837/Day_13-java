import java.util.*;
class a {
    public void p1()
    {
        System.out.println("Hello");
    }
}
class b extends a {
    public void r(){
        System.out.println("Hello Teachers");
    }
}
class c extends a {
    public void r1(){
        System.out.println("Hello Professors");
    }
}
public class HierarchialInheritance
{
    public static void main(String args[])
    {
       b h=new b();
       h.r();
       h.p1();
       c h1=new c();
       h1.p1();
       h1.r1();
    }
}
/*Hello Teachers
Hello
Hello
Hello Professors*/