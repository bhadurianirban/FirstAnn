package org.dgrf

/**
 * @author ${user.name}
 */
object App extends App {
  import org.apache.mxnet._

  private val a = NDArray.ones(2, 3)
  println("Testing MXNet by generating an 2x3 NDArray...")
  println("Shape is: ")
  println(a.shape)
}

