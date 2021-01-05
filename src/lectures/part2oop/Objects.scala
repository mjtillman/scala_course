package lectures.part2oop

object Objects extends App {

  object Person {
    val N_EYES = 2
    def canFly: Boolean = false
  }

  println(Person.N_EYES)
  println(Person.canFly)

  //Scala object = SINGLETON instance




}
