package cl.fbd

import scalanative.native._
import scalanative.runtime.GC

object Main {
  def main (args : Array [String]) = {
    import scalanative.runtime
    
    val ptrBytes = GC.malloc (100).cast[Ptr[Byte]]
      
    val ptrInt = ptrBytes.cast[Ptr[Int]]
    
    !ptrInt = 1
    
    ()
  }
}
