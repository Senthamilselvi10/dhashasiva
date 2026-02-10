
class C implements A, B {

    public void showA() {
        System.out.println("This is A");
    }

    public void showB() {
        System.out.println("This is B");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}
