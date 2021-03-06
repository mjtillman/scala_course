package exercises

import scala.annotation.tailrec

object TailRecursion extends App {

  def strConcat(str: String, x: Int): String = {

    @tailrec
    def concat(acc: String, x: Int): String = {
      if (x > 0) concat(acc + str, x - 1)
      else acc
    }

    concat(str, x - 1)
  }

//  println(strConcat("Hello", 13))

  def isPrime(x: Int): Boolean = {

    @tailrec
    def checkPrime(x: Int, n: Int): Boolean = {
      if (n < x) {
        if (x % n == 0) false
        else checkPrime(x, n + 1)

      } else {
        true
      }
    }

    checkPrime(x, 2)
  }

//  println(isPrime(29))
//  println(isPrime(25))

  def isPrime2(x: Int): Boolean = {
    def checkPrime2(n: Int, stillPrime: Boolean): Boolean = {
      if (!stillPrime) false
      else if (n == x) true
      else checkPrime2(n + 1, x % n != 0 && stillPrime)
    }

    checkPrime2(3, true)
  }

  println(isPrime2(29))
  println(isPrime2(25))

  def fibonacci(x: Int): Int = {

    @tailrec
    def checkFibo(x: Int, y: Int, z: Int): Int = {
      if (x > 0) {
        checkFibo(x - 1, z, y + z)
      } else x + y
    }

    checkFibo(x - 1, 1, 1)
  }

//  println(fibonacci(16))
}
