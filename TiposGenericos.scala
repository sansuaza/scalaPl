def funcion[A](x: A): 
    String = s"$x"
//para tipos genericos la convencion es una sola letra mayuscula
""" con los corchetes el compilador sabe que es un tipo de dato " +
    generico y se va a adaptar a lo que se necesite"""
//La x la lado del signo de peso, es un llamado al metodo .toString()

trait ejemplo[A, B]{
    def g(x: A, f:A => B): 
        B = f(x)
}

object ejemplo extends ejemplo[Int, String]

// de la siguiente manera se puede hacer uso de todo lo anterior.
ejemplo.g(3, f)
