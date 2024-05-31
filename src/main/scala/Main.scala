import com.example.Service
import scala.jdk.CollectionConverters.SeqHasAsJava  

object Main extends App {
  val service = new Service()
  service.create(List("").asInstanceOf[List[Object]].asJava)
  println("Hello, World!")
}
