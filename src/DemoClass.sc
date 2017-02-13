object Demo {

	case class Student(var rollno : Int = 1, var name : String = "Navin", var marks : Int = 70)
	{
		def show() = println("hii")
		
		def > (s2 : Student) : Boolean = marks > s2.marks
	}

	var s1 = Student();                       //> s1  : Demo.Student = Student(1,Navin,70)
	var s2 = Student(2, "Rahul", 88)          //> s2  : Demo.Student = Student(2,Rahul,88)
	
	s1 > (s2)                                 //> res0: Boolean = false
}