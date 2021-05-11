package L15HW14;

public class Generics<A, B, C> {
    private A var1;
    private B var2;
    private C var3;

    public Generics(A one, B two, C three) {
        this.var1=one;
        this.var2=two;
        this.var3=three;
    }

    public void printTyypes() {
        System.out.println("A type" + this.var1.getClass().getName());
        System.out.println("B type" + this.var2.getClass().getName());
        System.out.println("C type" + this.var3.getClass().getName());
    }

}
