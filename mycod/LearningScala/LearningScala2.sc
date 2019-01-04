object LearningScala2 {
  // Flow control
  
  // If / else syntax
  if (1 > 3) println("Impossible!") else println("The world makes sense.")
                                                  //> The world makes sense.
  
  if (1 > 3) {
  	println("Impossible!")
  } else {
  	println("The world makes sense.")
  }                                               //> The world makes sense.
  
  // Matching - like switch in other languages:
  val number = 3                                  //> number  : Int = 3
  number match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something else")
 	}                                         //> Three
 	
 	// For loops
 	for (x <- 1 to 4) {
 		val squared = x * x
 		println(squared)
 	}                                         //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16
                                                  
  // While loops
  var x = 10                                      //> x  : Int = 10
  while (x >= 0) {
  	println(x)
  	x -= 1
  }                                               //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
                                                  
  x = 0
  do { println(x); x+=1 } while (x <= 10)         //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
                                                  
   // Expressions
   // "Returns" the final value in a block automatically
   
   {val x = 10; x + 20}                           //> res0: Int = 30
                                                
	 println({val x = 10; x + 20})            //> 30
	 
	 // EXERCISE
	 // Write some code that prints out the first 10 values of the Fibonacci sequence.
	 // This is the sequence where every number is the sum of the two numbers before it.
	 // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 
	 

	 	var current: Int = 1              //> current  : Int = 1
	 	var previous: Int = 0             //> previous  : Int = 0
	 	val totalNumberToPrint = 10       //> totalNumberToPrint  : Int = 10
	 	
	 	for (x <- 0 to totalNumberToPrint - 1) {
	 		if (x == 0 || x == 1)  {
	 			println(x)
	 		} else {
	 			val newPrevious = current
	 			current = current + previous
	 			previous = newPrevious
	 			
	 			println(current)
	 		}                         //> 0
                                                  //| 1
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34
	 		
 	}
	 
	
	
	val test = List("one two", "three four four")
                                                  //> test  : List[String] = List(one two, three four four)
	val completeText = test.reduce( (x: String, y: String) => x + " " + y)
                                                  //> completeText  : String = one two three four four
	val splitUp	= 	completeText.split(" ")
                                                  //> splitUp  : Array[String] = Array(one, two, three, four, four)
  val counts =  splitUp.groupBy(x => x).map(x => (x._1, x._2.length))
                                                  //> counts  : scala.collection.immutable.Map[String,Int] = Map(one -> 1, three 
                                                  //| -> 1, four -> 2, two -> 1)
  
}