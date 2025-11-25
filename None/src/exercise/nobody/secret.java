package exercise.nobody;



class Parent {
    void m() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void m() throws RuntimeException {
        System.out.println("Child");
    }
}

public class secret {
	 public static void main(String[] args) {
	        Parent p = new Child();
	        p.m();
	    }
}