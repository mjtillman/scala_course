package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract classes can have abstract and non-abstract members
  // only 1 abstract class can be inherited by child classes
  // abstract classes are things
  abstract class Animal{
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit = println("munch crunch")
  }

  // traits can have abstract and non-abstract members
  // cannot have constructor parameters
  // multiple traits can be inherited by child classes
  // traits are behaviors
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "Meat"
  }

  class Crocodile extends Animal with Carnivore {
    val creatureType: String =  "Croc"
    def eat: Unit = "nom"
    def eat(animal: Animal): Unit = s"I'm a croc and I'm eating ${animal.creatureType}"
  }

}
