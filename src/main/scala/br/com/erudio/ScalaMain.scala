package br.com.erudio

object ScalaMain extends App {
  println("ScalaMain starts")
  new JavaService().hello()
  println("ScalaMain ends")
}
