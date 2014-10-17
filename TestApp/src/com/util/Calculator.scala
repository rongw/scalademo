package com.util

object Calculator {

  def sumInt(numbers:Array[Int]):Int = {
    var sum = 0;
    for(i <- numbers){
      sum += i;
    }
    return sum;
  }
  
  val increment = (x:Int) => x+1;
}