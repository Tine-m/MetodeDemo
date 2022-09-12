public class Main {

  public static void main(String[] args) {
    Person p1 = new Person(1.74);
    System.out.print(p1.getHøjde());
    System.out.println();

    p1.setHøjde(1.79);
    System.out.print("ny højde " + p1.getHøjde());

  }
}
