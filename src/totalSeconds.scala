object totalSeconds extends App {
  println("Enter time in Hour: Min: Second format")
  val time = scala.io.StdIn.readLine
  val firstColon = time.indexOf(":")
  val secondColon = time.lastIndexOf(":")
  val hours = time.substring(0, firstColon).toInt
  val mins = time.substring(firstColon+1, secondColon).toInt
  val seconds = time.substring(secondColon+1).toInt
  val totalSeocnds = hours * 3600 + mins * 60 + seconds
  println(totalSeocnds)
}