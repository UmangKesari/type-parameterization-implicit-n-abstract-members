package com.knoldus.kip.assignment.ds

/**
  * Created by knoldus on 7/19/17.
  */
  class Vehicle(id: Int)


  class FlyingVehicle(id:Int) extends Vehicle(id:Int)

  class LandVehicle(id: Int) extends Vehicle(id: Int)

  class Car(id: Int) extends LandVehicle(id: Int)

  class Bike(id: Int) extends LandVehicle(id: Int)

  class JetPlain(id: Int) extends FlyingVehicle(id: Int)

  class Aeroplane (id: Int) extends FlyingVehicle(id: Int)


  class SUV(id: Int) extends Car(id: Int)


