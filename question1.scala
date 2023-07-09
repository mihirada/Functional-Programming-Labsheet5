object question1 {
  def prime(p:Int, n:Int=2):Boolean=n match {
    case x if(p<=1) => false
    case x if(x==p) => true
    case x if(p%n ==0) => false
    case x=> prime(p,x+1)
  }
  //question2
  def primeSeq(n:Int):Unit={
    for(i <-2 to n){
      if(prime(i))
        println(i+" ");
    }
  }

  def main(args:Array[String]):Unit={
    val result1=prime(5);
    val result2=prime(8);
    println(result1);
    println(result2);

    primeSeq(10);
  }
}
