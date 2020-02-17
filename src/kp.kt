import java.util.*
import java.util.logging.Handler

fun main(){
 val ob = Timer()

 ob.schedule(object :TimerTask(){
  override fun run() {
println("iufd")  }
 },2000)


}