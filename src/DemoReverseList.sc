object Demo {

	var nums = List(4, 7, 2, 3)               //> nums  : List[Int] = List(4, 7, 2, 3)
	
	
	
	var reverseNums = nums.reverse            //> reverseNums  : List[Int] = List(3, 2, 7, 4)

  
  
  nums.foreach { i:Int => println(i) }            //> 4
                                                  //| 7
                                                  //| 2
                                                  //| 3

  reverseNums.foreach { i:Int => println(i) }     //> 3
                                                  //| 2
                                                  //| 7
                                                  //| 4
}