package com.bitbucket.learningjava

import org.scalatest._

class FizzBuzzSpec extends UnitSpec {
  // Your tests here
  "A FizzBuzz" should " return Fizz Buzz " in {
    var fizzBuzz: FizzBuzz = new FizzBuzz()
    assert ( fizzBuzz.getFizzBuzz( 15 ) === "fizz buzz")
  }
}