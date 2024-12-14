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
public class SingleInheritance
{
    public static void main(String args[])
    {
        a h=new a();
        h.p1();
        b y=new b();
        y.p1();
        y.r();
    }
}
/*Hello
Hello
Hello Teachers*/