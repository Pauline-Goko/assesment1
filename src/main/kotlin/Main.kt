fun main() {
cities("Nairobi", "Manila")

    sentence("My favourite food is rice")

    var calculate = Calculator(7,12,4.5,5)
    calculate.addition()
    calculate.subtraction()
    calculate.division()
    calculate.multiply()



}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun cities(city1: String, city2: String): String{
   var cities = "Nairobi" ;"Manila"
    val firstChar = "Nairobi"
    for (x in city1)
        println(firstChar)
    return firstChar


}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun numerics(arrayOf: Int){
var number = arrayOf(5,8,2)






}
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
fun sentence(words: String) {
    var words = "My favourite food is rice"
    println(words)


}

//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions

class Calculator(var addition: Int, var subtraction: Int, var division: Double, var multiply: Int){
    fun addition(){
    var sum = addition + addition
        println(sum)
    }
    fun subtraction(){
      var minus = subtraction - subtraction
        println(minus)
    }
    fun division(){
    var divide = division / division
        println(divide)
    }
    fun multiply(){
     var product = multiply * multiply
        println(product)
    }


}