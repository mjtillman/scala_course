package lectures.part2oop

object OOBasics extends App {
  val person = new Person("Mindy", 36)
  person.greet("Helen")
  person.greet()
}

class Person(name: String, val age: Int) {

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  def greet(): Unit = println(s"Hello, I am $name")
}
