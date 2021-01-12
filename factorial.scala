def factorial(n: Long, resultado: Long = 1L): Long =
    if (n == 0){
        println("terminó")
        1
    }else{
        println(s"Va calculando ${n}, resultado: ${resultado}")
        //la s es para hacer una interpolacion de strings 
        n * factorial(n-1)
    }

println(factorial(3))


def tailFactorial(n: Long, resultado: Long = 1L): Long =
    """recibe un long, un long que por defecto tiene el valor 1
    y retorna un long"""
    if (n == 0){
        println("terminó")
        resultado
    }else{
        println(s"Va calculando ${n}, resultado: ${resultado}")
        //la s es para hacer una interpolacion de strings 
        factorial(n-1, n * resultado)
    }

"""Ejemplo de metodos de scala que permiten acumular valor sin declarar
variables externas"""
val resultado = (1 to 3).foldLeft(1L)((r, n)=> r * n)
//(1 to 3) => se hace una lista en scala así
//este metodo necesita un valor inicial y la operacion que se va a hacer en cada uno de los elementos de la lista


