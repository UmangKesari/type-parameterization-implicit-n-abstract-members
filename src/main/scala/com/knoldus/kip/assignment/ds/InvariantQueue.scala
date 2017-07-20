package com.knoldus.kip.assignment.ds

/**
  * Created by knoldus on 7/19/17.
  */

class InvariantQueue[T](//Non variant , Invariant
                        private val leading: List[T],
                        private val trailing: List[T]
                       ) {

  def mirror =
    if(leading.isEmpty)
      new InvariantQueue[T](trailing.reverse, Nil)
    else
      this

  def enqueue(x: T): InvariantQueue[T] = {
    new InvariantQueue[T](leading, x :: trailing)
  }

  def dequeue: InvariantQueue[T] = {
    val q = mirror
    new InvariantQueue[T](q.leading.tail, q.trailing)
  }

  override def toString = (leading ::: trailing.reverse).toString
}


object QueueInvariant extends App {

  val mahindra = new Car(1008)
  val Tata = new Car(1064)
  val Ford = new Car(1054)
  val Maruti = new Car(2044)

  val nonVariantQueue = new InvariantQueue[Car](List(mahindra,Tata,Ford), Nil)
  println(nonVariantQueue)
  println(nonVariantQueue.enqueue(Maruti).dequeue)
  println(nonVariantQueue.dequeue)


}
