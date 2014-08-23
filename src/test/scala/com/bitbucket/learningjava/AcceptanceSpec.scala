package com.bitbucket.learningjava


import org.scalatest._

abstract class AcceptanceSpec extends FeatureSpec with Matchers with
OptionValues with Inside with Inspectors with GivenWhenThen