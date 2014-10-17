package com.app

import com.util.Calculator

object App {

    def main(args: Array[String]): Unit = {
      
      println(Calculator.increment(3));
      
      println(Calculator.sumInt(List(3,5,7,8).toArray));
      
    }

	
}