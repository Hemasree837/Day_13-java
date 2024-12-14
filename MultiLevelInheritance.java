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
class c extends b {
    public void r1(){
        System.out.println("Hello Professors");
    }
}
public class MultiLevelInheritance
{
    public static void main(String args[])
    {
        c f=new c();
        f.p1();
        f.r();
        f.r1();
    }
}
/*Hello
Hello Teachers
Hello Professors*/