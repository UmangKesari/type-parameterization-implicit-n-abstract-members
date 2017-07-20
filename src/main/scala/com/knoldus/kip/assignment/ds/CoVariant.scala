package com.knoldus.kip.assignment.ds


  class CoVariantQueue[+T](
                            private val leading: List[T],
                            private val trailing: List[T]
                          ) {

    override def toString = (leading ::: trailing.reverse).toString

  }

  object Queue extends App {
    val mahindra = new Car(1008)
    val Tata = new Car(1064)
    val Ford = new Car(1054)
    val Maruti = new Car(2044)

    val vehicleObject = new Vehicle(1001)

    val vehicleObject1 = new Vehicle(1103)

    val covariantQueue = new CoVariantQueue[Car](List(mahindra,Tata,Ford), Nil)
    val vehicleQueue: CoVariantQueue[Vehicle] = covariantQueue
    println(vehicleQueue)

  }

