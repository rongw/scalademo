package com.app

import com.util.Calculator
import com.model.Person



object App {

    def main(args: Array[String]): Unit = {
      
      println(Calculator.increment(3));
      
      println(Calculator.sumInt(List(3,5,7,8).toArray));
      
      var p:Person = new Person("","",1);
      
      println(Calculator.doubleIncrement(3));

      println(Calculator.hundredIncrement(4));
      
      println(Calculator.doubleIncrement(8));
    }

	
}