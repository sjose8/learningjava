package com.bitbucket.learningjava

import org.scalatest._

class FizzBuzzSpec extends UnitSpec {
  // Your tests here
  "A FizzBuzz" should " return Fizz Buzz " in {
    var fizzBuzz: FizzBuzz = new FizzBuzz()
    assert ( fizzBuzz.getFizzBuzz( 15 ) === "fizz buzz")
  }

  "A FizzBuzz" should " return Fizz " in {
    var fizzBuzz: FizzBuzz = new FizzBuzz()
    assert ( fizzBuzz.getFizzBuzz( 3 ) === "fizz")
  }

  "A FizzBuzz" should " return  Buzz " in {
    var fizzBuzz: FizzBuzz = new FizzBuzz()
    assert ( fizzBuzz.getFizzBuzz( 5 ) === "buzz")
  }

  "A FizzBuzz" should " return Number " in {
    var fizzBuzz: FizzBuzz = new FizzBuzz()
    assert ( fizzBuzz.getFizzBuzz( 7 ) === "7")
  }
}