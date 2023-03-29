package com.knoldus

object Driver extends App {
  val testObj = new FindNthNumberFromLast
  val list = List(1, 2, 3, 4, 5, 6)
  val nthElement = 2
  val result = testObj.findNthElementFromLast(list, nthElement).getOrElse(None)
  println(result)
}
