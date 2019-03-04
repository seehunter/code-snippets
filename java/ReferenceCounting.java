//: polymorphism/ReferenceCounting.java
// Cleaning up shared member objects.
 
class Shared {
	//共享对象的引用计数成员 是has-a的关系
  private int refcount = 0;
  private static long counter = 0;
  private final long id = counter++;
  public Shared() {
    System.out.print("Creating " + this);
  }
  public void addRef() { refcount++; }
  protected void dispose() {
	  //dispose该共享对象时，确定指向该对象的引用计数为0
    if(--refcount == 0)
      System.out.print("Disposing " + this);
  }
  public String toString() { return "Shared " + id; }
}
 
class Composing {
  private Shared shared;
  private static long counter = 0;
  private final long id = counter++;
  public Composing(Shared shared) {
    System.out.println("Creating " + this);
    //使引用指向共享对象，同时是共享对象的引用计数增加1
    this.shared = shared;
    this.shared.addRef();
  }
  protected void dispose() {
    System.out.print("disposing " + this);
    shared.dispose();
  }
  public String toString() { return "Composing " + id; }
}
 
public class ReferenceCounting {
  public static void main(String[] args) {
    Shared shared = new Shared();
    Composing[] composing = { new Composing(shared),
      new Composing(shared), new Composing(shared),
      new Composing(shared), new Composing(shared) };
    for(Composing c : composing)
      c.dispose();
  }
} /* Output:
Creating Shared 0
Creating Composing 0
Creating Composing 1
Creating Composing 2
Creating Composing 3
Creating Composing 4
disposing Composing 0
disposing Composing 1
disposing Composing 2
disposing Composing 3
disposing Composing 4
Disposing Shared 0
*///:~