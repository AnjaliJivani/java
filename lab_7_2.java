// Interface A with a constant and a method declaration
interface A {
    int CONSTANT_A = 1;
    void methodA();
}

// Interface A1 extending A
interface A1 extends A {
    int CONSTANT_A1 = 2;
    void methodA1();
}

// Interface A2 extending A
interface A2 extends A {
    int CONSTANT_A2 = 3;
    void methodA2();
}

// Interface P1 with a constant and a method declaration
interface P1 {
    int CONSTANT_P1 = 4;
    void methodP1();
}

// Interface P2 with a constant and a method declaration
interface P2 {
    int CONSTANT_P2 = 5;
    void methodP2();
}

// Interface A12 inheriting from both P1 and P2
interface A12 extends P1, P2, A1, A2 {
    int CONSTANT_A12 = 6;
    void methodA12();
}

// Class B implementing interface A12
class B implements A12 {

    // Implementing methodA from interface A
    @Override
    public void methodA() {
        System.out.println("methodA: CONSTANT_A = " + CONSTANT_A);
    }

    // Implementing methodA1 from interface A1
    @Override
    public void methodA1() {
        System.out.println("methodA1: CONSTANT_A1 = " + CONSTANT_A1);
    }

    // Implementing methodA2 from interface A2
    @Override
    public void methodA2() {
        System.out.println("methodA2: CONSTANT_A2 = " + CONSTANT_A2);
    }

    // Implementing methodP1 from interface P1
    @Override
    public void methodP1() {
        System.out.println("methodP1: CONSTANT_P1 = " + CONSTANT_P1);
    }

    // Implementing methodP2 from interface P2
    @Override
    public void methodP2() {
        System.out.println("methodP2: CONSTANT_P2 = " + CONSTANT_P2);
    }

    // Implementing methodA12 from interface A12
    @Override
    public void methodA12() {
        System.out.println("methodA12: CONSTANT_A12 = " + CONSTANT_A12);
    }
}

// Main class to create and use an instance of B
public class Lab_7_2 {
    public static void main(String[] args) {
        // Instantiate class B
        B bInstance = new B();

        // Invoke each method
        bInstance.methodA();
        bInstance.methodA1();
        bInstance.methodA2();
        bInstance.methodP1();
        bInstance.methodP2();
        bInstance.methodA12();
    }
}
