class Parent {

    void Print()
    {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {

    void Print() { System.out.println("subclass1"); }
}
class subclass2 extends Parent {

    void Print()
    {
        System.out.println("subclass2");
    }
}
class different_Example {

    public static void main(String[] args)
    {
        Parent p;

        p = new subclass1();
        p.Print();

        p = new subclass2();
        p.Print();
    }
}

