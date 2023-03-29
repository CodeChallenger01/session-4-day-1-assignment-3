package com.knoldus

class FindNthNumberFromLast {
  /*
      *findNthElementFromLast method is polymorphic method that is used to find the nth Element from last
      *It can contains any kind of data such as String, Int, Long etc
  */
  def findNthElementFromLast[T](list: List[T], nthElement: Int): Option[T] = {
    try {
      if (list.isEmpty) throw new NullPointerException("List is Empty")
      else if (list.size < nthElement) throw new IndexOutOfBoundsException("Index Out of bound")
      else {
        val indexValue: Int = list.size - nthElement
        val kthElement: T = list(indexValue)
        Some(kthElement)
      }
    }
    catch {
      case ex: NullPointerException => None
      case ex: IndexOutOfBoundsException => None
    }
  }
}

