package lectures.part2oop

object Notations extends App {

  class Person(val name: String, favMovie: String) {

    def likes(movie: String): Boolean = movie == favMovie

    def hangsWith(person: Person): String = s"${this.name} hangs with ${person.name}"

    def +(person: Person): String = s"${this.name} is friends with ${person.name}"
  }

  val mary = new Person("Mary", "Inception")

  println(mary.likes("Inception"))
  println(mary likes "Inception")
  // infix/operator notation

  // "operators" in Scala

  val tom = new Person("Tom", "Fight Club")
  println(mary hangsWith tom)
  println(mary + tom)
  println(mary.+(tom))
}
