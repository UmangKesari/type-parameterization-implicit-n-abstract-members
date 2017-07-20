package com.knoldus.kip.assignment.ds

/**
  * Created by knoldus on 7/19/17.
  */
class LowerBoundQueue[T]( val leading: List[T],  val trailing: List[T]) {

  def mirror =
    if(leading.isEmpty)
      new LowerBoundQueue[T](trailing.reverse, Nil)
    else
      this

  def enqueue[U >: T](x: U) = {
    new LowerBoundQueue(leading, x :: trailing)
  }

  def dequeue: LowerBoundQueue[T] = {
    val deq = mirror
    new LowerBoundQueue[T](deq.leading.tail, deq.trailing)
  }

  override def toString: String = (leading ::: trailing.reverse).toString

}

object QueueLower extends App {

  val mahindra = new Car(1008)
  val Tata = new Car(1064)
  val Ford = new Car(1054)
  val Maruti = new Car(2044)

  val vehicleObject = new Vehicle(1001)
  val quanto = new SUV(3306)

  val carQueue: LowerBoundQueue[Car] = new LowerBoundQueue[Car](List(mahindra,Tata,Ford), Nil)

  val carQuantity = carQueue.enqueue(vehicleObject)
  println(carQueue.enqueue(vehicleObject))
  println(carQueue.enqueue(quanto))

}