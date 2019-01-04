object LearningScala2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(141); 
  // Flow control
  
  // If / else syntax
  if (1 > 3) println("Impossible!") else println("The world makes sense.");$skip(96); 
  
  if (1 > 3) {
  	println("Impossible!")
  } else {
  	println("The world makes sense.")
  };$skip(68); 
  
  // Matching - like switch in other languages:
  val number = 3;System.out.println("""number  : Int = """ + $show(number ));$skip(146); 
  number match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something else")
 	};$skip(87); 
 	
 	// For loops
 	for (x <- 1 to 4) {
 		val squared = x * x
 		println(squared)
 	};$skip(81); 
                                                  
  // While loops
  var x = 10;System.out.println("""x  : Int = """ + $show(x ));$skip(47); 
  while (x >= 0) {
  	println(x)
  	x -= 1
  };$skip(59); 
                                                  
  x = 0;$skip(42); 
  do { println(x); x+=1 } while (x <= 10);$skip(154); val res$0 = 
                                                  
   // Expressions
   // "Returns" the final value in a block automatically
   
   {val x = 10; x + 20};System.out.println("""res0: Int = """ + $show(res$0));$skip(82); 
                                                
	 println({val x = 10; x + 20});$skip(280); 
	 
	 // EXERCISE
	 // Write some code that prints out the first 10 values of the Fibonacci sequence.
	 // This is the sequence where every number is the sum of the two numbers before it.
	 // So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 
	 

	 	var current: Int = 1;System.out.println("""current  : Int = """ + $show(current ));$skip(25); 
	 	var previous: Int = 0;System.out.println("""previous  : Int = """ + $show(previous ));$skip(31); 
	 	val totalNumberToPrint = 10;System.out.println("""totalNumberToPrint  : Int = """ + $show(totalNumberToPrint ));$skip(233); 
	 	
	 	for (x <- 0 to totalNumberToPrint - 1) {
	 		if (x == 0 || x == 1)  {
	 			println(x)
	 		} else {
	 			val newPrevious = current
	 			current = current + previous
	 			previous = newPrevious
	 			
	 			println(current)
	 		}
	 		
 	};$skip(64); 
	 
	
	
	val test = List("one two", "three four four");System.out.println("""test  : List[String] = """ + $show(test ));$skip(72); 
	val completeText = test.reduce( (x: String, y: String) => x + " " + y);System.out.println("""completeText  : String = """ + $show(completeText ));$skip(40); 
	val splitUp	= 	completeText.split(" ");System.out.println("""splitUp  : Array[String] = """ + $show(splitUp ));$skip(70); 
  val counts =  splitUp.groupBy(x => x).map(x => (x._1, x._2.length));System.out.println("""counts  : scala.collection.immutable.Map[String,Int] = """ + $show(counts ))}
  
}
