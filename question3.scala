object question3 {
  var sum =0;
  def addition(n:Int):Int={
    if(n>=1){
      sum=n+addition(n-1);
    }
    return sum;
  }

  def main(args: Array[String]):Unit={
   val result =addition(20);
    println(result);
  }

}
