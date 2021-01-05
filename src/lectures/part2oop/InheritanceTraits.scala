package lectures.part2oop

object InheritanceTraits extends App {

  class Animal {
    protected def eat= println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val kitty = new Cat
  kitty.crunch

  //constructor
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age) {

  }

  class Dog extends Animal {
    override def eat = println("chew chew")
  }

  val puppy = new Dog
  puppy.eat

}
