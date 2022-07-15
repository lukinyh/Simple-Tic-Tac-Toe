class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        this.name = name;
        this.age = age;
        counter += 1;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }

    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }


}

class SuperClass {

    public static void staticMethod(int i) { }

    public void method1(int i) { }

    public void method2(int i, String s) { }

    private void method3(int i) { }
}

class SubClass extends SuperClass {

    public static void staticMethod(int i) { }

    public void method1(int i) { }

    public void method2(String s) { }

    public void method3(int i) { }
}