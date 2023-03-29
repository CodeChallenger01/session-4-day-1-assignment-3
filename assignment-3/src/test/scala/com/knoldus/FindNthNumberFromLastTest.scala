package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.language.postfixOps

class FindNthNumberFromLastTest extends AnyFlatSpec with Matchers {

  val testObj = new FindNthNumberFromLast

  "it" should "match with None if empty list is passed" in {
    val list = List().empty
    val nthElement = 2
    val result = testObj.findNthElementFromLast(list, nthElement)
    val expectedOutput = None
    expectedOutput shouldBe result
  }

  "it" should "return the nth Element if Integer List is passed" in {
    val list = List(1, 2, 3, 4, 5, 6)
    val nthElement = 2
    val result = testObj.findNthElementFromLast(list, nthElement)
    val actualOutput = result.getOrElse(result, None)
    val expectedOutput = 5
    expectedOutput shouldBe actualOutput
  }

  "it" should "match with None if nthTerm is larger than list size" in {
    val list = List(1, 2, 3, 4, 5, 6)
    val nthElement = 7
    val result = testObj.findNthElementFromLast(list, nthElement)
    val expectedOutput = None
    expectedOutput shouldBe result
  }

  "it" should "not return the different nth Element if Integer List is passed" in {
    val list = List(1, 2, 3, 4, 5, 6)
    val nthElement = 2
    val result = testObj.findNthElementFromLast(list, nthElement)
    val actualOutput = result.getOrElse(result, None)
    val expectedOutput = 10
    assert(expectedOutput != actualOutput)
  }

  "it" should "return the 6 position value of list from last" in {
    val list = List(1, 2, 3, 4, 5, 6)
    val nthElement = 6
    val result = testObj.findNthElementFromLast(list, nthElement)
    val actualOutput = result.getOrElse(result, None)
    val expectedOutput = 1
    assert(expectedOutput == actualOutput)
  }

  /* Checking with String Type List */
  "it" should "return the 4 element of string from last " in {
    val stringList = List("Manish", "Rahul", "Akhil", "Jitendra")
    val nthElement = 4
    val result = testObj.findNthElementFromLast(stringList, nthElement)
    val actualOutput = result.getOrElse(result, None)
    val expectedOutput = "Manish"
    expectedOutput shouldBe actualOutput
  }

  "it" should "return the 2 element of string from last " in {
    val stringList = List("Manish", "Rahul", "Akhil", "Jitendra")
    val nthElement = 2
    val result = testObj.findNthElementFromLast(stringList, nthElement)
    val actualOutput: String = result.getOrElse(result, None)
    val expectedOutput = "Akhil"
    assert(expectedOutput == actualOutput)
  }

  /*Checking with long type list*/
  "it" should "return the 4 element of long integer from last " in {
    val longList = List(4121l, 21212l, 121221l, 2112l)
    val nthElement = 4
    val result = testObj.findNthElementFromLast(longList, nthElement)
    val actualOutput = result.getOrElse(result, None)
    val expectedOutput = 4121l
    expectedOutput shouldBe actualOutput
  }

  "it" should "return the 1 element of long integer from last " in {
    val longList = List(4121l, 21212l, 121221l, 2112l)
    val nthElement = 1
    val result = testObj.findNthElementFromLast(longList, nthElement)
    val actualOutput = result.getOrElse(result, None)
    val expectedOutput = 2112l
    assert(expectedOutput == actualOutput)
  }
  "it" should "not return the 1 element of long integer from last if searched for 3rd" in {
    val longList = List(4121l, 21212l, 121221l, 2112l)
    val nthElement = 3
    val result = testObj.findNthElementFromLast(longList, nthElement)
    val actualOutput = result.getOrElse(result, None)
    val expectedOutput = 2112l
    assert(expectedOutput != actualOutput)
  }

}
