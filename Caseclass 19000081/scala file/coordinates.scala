object coordinates extends App {
  val p1 = Point(1,2)
  val p2 = Point(3,4)
  val p3 = p1+p2
  println("Addition of " + p1 + " and " +  p2 + " is " + p3)

  val p4 = p1.move(6,7)
  println("After moving a point by a given distance dx and dy is " + p4 )

  val a = Point(3,2)
  val b = Point(9,7)

   val e = a.distance(b)

   val p5 = p2.invert()
   println("After switching, the result is " + p5)
}

case class Point(x:Int, y:Int){
  def + = (that:Point) => (this.x + that.x, this.y + that.y)
  def move(dx:Int, dy:Int) = Point(this.x + dx, this.y + dy)

  def distance(b:Point){
    val x1 = scala.math.pow(this.x-b.x,2)
    val y1 = scala.math.pow(this.y-b.y,2)
    val result = scala.math.sqrt(x1+y1)
    println("The distance between 2 points is " + result)
  }

  def invert = () => Point(this.y, this.x)
}
