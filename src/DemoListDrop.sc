object Demo {

	var nums = List(4, 7, 2, 3, 8, 6)         //> nums  : List#8617[Int#1107] = List(4, 7, 2, 3, 8, 6)

	//drop the first 2
	nums.drop(2)                              //> res0: List#8617[Int#1107] = List(2, 3, 8, 6)

	// drop the first 2, then take 2 from those
	nums.drop(2).take(2)                      //> res1: List#8617[Int#1107] = List(2, 3)
	
	
	// another way to code it
	nums drop 2 take 2                        //> res2: List#8617[Int#1107] = List(2, 3)
	  
  nums.foreach { i:Int => println(i) }            //> 4
                                                  //| 7
                                                  //| 2
                                                  //| 3
                                                  //| 8
                                                  //| 6

}