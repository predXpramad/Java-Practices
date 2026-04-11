// package Sealed Class;

sealed class A extends Thread implements Cloneable permits B,C,D{

}
// Class B and C Should be mentioned as sealed/non-sealed/final
non-sealed class B extends A{

}

sealed class C extends A permits E{

}
final class D extends A{

}

final class E extends C{

}

// Sealed for interface
sealed interface X permits Y{

}

non-sealed interface Y extends X{

}



public class SealedEX {
    public static void main(String[] args) {
        
    }
}
