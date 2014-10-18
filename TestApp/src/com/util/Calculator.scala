package com.util

object Calculator{

  def sumInt(numbers:Array[Int]):Int = {
    var sum = 0;
    for(i <- numbers){
      sum += i;
    }
    return sum;
  }
  
  val increment = (x:Int) => x+1;
  
  val doubleIncrement = incrementBy(2);
  
  val tripleIncrement = incrementBy(3);
  
  val hundredIncrement = incrementBy(100);
  
  private def incrementBy(factor:Int) = (x:Int) =>{
	  x*factor;
  }
}