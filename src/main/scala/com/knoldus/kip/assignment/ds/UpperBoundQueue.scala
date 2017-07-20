package com.knoldus.kip.assignment.ds

/**
  * Created by knoldus on 7/19/17.
  */
class UpperBoundQueue[T](private val leading: List[T], private val trailing: List[T])  {

  def mirror =
    if(leading.isEmpty)
      new UpperBoundQueue[T](trailing.reverse, Nil)
    else
      this

  def enqueue[U <: T](x: T): UpperBoundQueue[T] = {
    new UpperBoundQueue[T](leading, x :: trailing)
  }

  def dequeue: UpperBoundQueue[T] = {
    val q = mirror
    new UpperBoundQueue[T](q.leading.tail, q.trailing)
  }

  override def toString = (leading ::: trailing.reverse).toString
}

object QueueUpper extends App {

  val mahindra = new Car(1008)
  val Tata = new Car(1064)
  val Ford = new Car(1054)
  val Maruti = new Car(2044)

  val vehicleObject = new Vehicle(1001)
  val quanto = new SUV(3306)

  val quantoQueue: UpperBoundQueue[Car] = new UpperBoundQueue[Car](List(mahindra,Tata,Ford), Nil)
  println(quantoQueue.enqueue(quanto))


}