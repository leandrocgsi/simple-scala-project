package br.com.erudio

import org.scalatest._
import br.com.erudio._

class EchoServiceTest extends FlatSpec with Matchers {

  info("Example test with FlatSpec")

  "EchoService echo hello" should "return hello" in {
    EchoService("hello") should equal("hello")
  }
}
