package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 42
  println(x)

  //  x = 2
  // VALS are IMMUTABLE
  // COMPILER can infer types

  val aString: String = "Hello"

  val aBoolean: Boolean = true
  val aChar: Char = 'd'
  val anInt: Int = x
  val aShort: Short = 5555
  val aLong: Long = 5555555555555L
  val aFloat: Float = 3.14f
  val aDouble: Double = 3.14

  //variables
  var aVariable: Int = 4
  aVariable = 5

  // variables have side effects
}
