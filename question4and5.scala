object question4and5 {
  def isEven(n:Int):Boolean= n match {
    case 0 =>true
    case _=> isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !(isEven(n))
  var sum =0;

  //question5
  def additionEven(n:Int):Int={;
    if(n>1){
      if(isEven(n)) {
        sum=sum+n;
      }
      additionEven(n-1);
    }
    return sum;
  }

  def main(args: Array[String]): Unit = {
    val result = isEven(12);
    println(result);

    val result2 =additionEven(10);
    println("Addition : "+result2);
  }
}

