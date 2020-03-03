class User(val firstName:String, val lastName:String){
  fun printName(): Unit {
    print(firstName + lastName)
  }
}
