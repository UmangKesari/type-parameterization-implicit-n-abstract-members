package com.knoldus.kip.assignment.ds

/**
  * Created by knoldus on 7/20/17.
  */
class ContraVariantQueue[-T]{

  def write(x: T) = println(x)

}

object QueueContra extends App {

  val contravariantQueue = new ContraVariantQueue[Vehicle]
  val carQueue: ContraVariantQueue[Car] = contravariantQueue

  println(carQueue)

}