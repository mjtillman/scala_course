package exercises

object FunctionsExer extends App {

  def greeting(name: String, age: Int): Unit = {
    println("Hi, my name is $name and I am $age years old")
  }

  def factorial(n: Int): Int = {

    def calculate(n: Int, fact: Int): Int = {
      var product = fact

      if (n > 1) {
        product *= n - 1
        calculate(n - 1, product)
      }

      product
    }

    calculate(n, n)
  }

  println(factorial(5))

  def fibonacci(n: Int): Int = {

    var a = 1
    var b = 1
    var c = 0
    var m = 3

    def calcFibo(m: Int): Int = {
      if (m < n + 1) {
        c = a + b
        a = b
        b = c
        calcFibo(m + 1)
      }

      c
    }

    calcFibo(m)
  }

  println(fibonacci(25))
//
//  def isPrint(n: Int): Int = {
//
//  }
}
