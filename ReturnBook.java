class library{
    String name;
    int bb;
    library(String name)
    {
      this.name=name;
      this.bb=0;
    }
    public boolean cb()
    {
      return false;
    }
    public void bob()
    {
      if(cb())
      {
        bb++;
        System.out.println(name+" You borrowed "+bb+" book ");
      }else{
        System.out.println("Your Limit Exceeded!");
      }
    }
    public void rb()
    {
        if(bb>0)
        {
            bb--;
            System.out.println(name+ "you returned books and remaining books are "+bb);
        }
        else{
            System.out.println(name+ "you did not took any book from library");
        }
    }
  }
  class students extends library
  {
    students(String name)
    {
      super(name);
    }
    public boolean cb()
    {
      return bb<3;
    }
  }
  class teachers extends library
  {
    teachers(String name)
    {
      super(name);
    }
    public boolean cb()
    {
      return bb<10;
    }
  }
  public class ReturnBook {
    public static void main(String[] args) {
        library a = new students("Hema");
        library b = new students("Enola");
        library c = new teachers("Dr.Alla Bakash");
        c.bob();
        a.bob();
        a.bob();
        b.bob();
        a.bob();
        a.bob();
        a.rb();
    }
  }
