package exercises

object FunctionsExer extends App {

  def greeting(name: String, age: Int): Unit = {
    println("Hi, my name is $name and I am $age years old")
  }

  def factorial(n: Int): Int = {

    def calculate(n: Int, acc: Int): Int = {
      if (n > 2) calculate(n - 1, n * acc)
      else acc
    }

    calculate(n, n)
  }

  println(factorial(5))

  def fibonacci(n: Int): Int = {

    def calcFibo(m: Int, o: Int, p: Int): Int = {
      if (m < n + 1) {
        calcFibo(m + 1, p, o + p)
      } else {
        p
      }
    }

    calcFibo(3, 1, 1)
  }

  println(fibonacci(25))

  def checkPrime(p: Int): Boolean = {

    var factors = 1

    def isFactor(q: Int): Int = {
      if (p % q == 0) 1
      else 0
    }

    def checkFactors(q: Int): Int = {
      if (q < p + 1) {
        factors += isFactor(q)
        checkFactors(q + 1)
      }

      factors
    }

    if (checkFactors(2) > 2) false
    else true
  }

  println(checkPrime(23))
}
