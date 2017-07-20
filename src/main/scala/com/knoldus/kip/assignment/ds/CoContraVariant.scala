package com.knoldus.kip.assignment.ds

class CoContraQueue[-S, +T] {

  def write(x: S): T = {
    x match {
      case res: T => res
    }
  }

}


object QueueCoContra extends App {

  val mahindra = new Car(1008)
  val Tata = new Car(1064)
  val Ford = new Car(1054)
  val Maruti = new Car(2044)

  val landVehicleObject = new LandVehicle(1157)

  val nonVariantQueue = new CoContraQueue[Car, Vehicle]
  println(nonVariantQueue)
  println(nonVariantQueue.write(Tata))


}