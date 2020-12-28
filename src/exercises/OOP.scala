package exercises

object OOP extends App {

  class Writer(first: String, last: String, val birthYear: Int) {
    def fullName(): String = this.first + " " + this.last
  }

  class Novel(val title: String, releaseYr: Int, author: Writer) {
    def authorAge(): Int = this.releaseYr - author.birthYear

    def isWrittenBy(): String = author.fullName()

    def copy(newYear: Int): Novel = new Novel(this.title, newYear: Int, this.author)
  }

  val author = new Writer("George", "Orwell", 1903)
  val book = new Novel("1984", 1949, author)

  println(s"${book.title} by ${book.isWrittenBy()}, age ${book.authorAge()}")

  val book2 = book.copy(2021)
  println(s"${book2.title} by ${book2.isWrittenBy()}, age ${book2.authorAge()}")

  class Counter(val n: Int) {

    def current(): Int = this.n

    def increment(): Counter = new Counter(this.n + 1)
    def increment(n: Int) = new Counter(n)

    def decrement(): Counter = new Counter(this.n - 1)
    def decrement(n: Int) = new Counter(n)
  }

  val x = new Counter(5)
  println(x.current())
  val y = x.increment()
  val z = x.decrement()

  println(y.current())
  println(z.current())

  val a = x.increment(25)
  val b = x.decrement(125)

  println(a.current())
  println(b.current())
}
