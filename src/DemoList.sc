object Demo {

	var nums = List(4, 7, 2, 3)               //> nums  : List[Int] = List(4, 7, 2, 3)
	
	for (n <- nums) println(n)                //> 4
                                                  //| 7
                                                  //| 2
                                                  //| 3
  nums.foreach { i:Int => println(i) }            //> 4
                                                  //| 7
                                                  //| 2
                                                  //| 3
}