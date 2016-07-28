package br.com.erudio;

public class JavaMain {
    public static void main(String[] args) {
        System.out.println("JavaMain starts");
        new ScalaService().hello();
        System.out.println("JavaMain ends");
    }
}
