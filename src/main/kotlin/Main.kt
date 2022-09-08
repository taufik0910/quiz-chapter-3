fun main() {
     println("==========================")
     println("GAME SUIT TERMINAL VERSION")
     println("==========================")
     println("Tekan 1 untuk main dengan teman")
     println("Tekan 2 untuk main dengan computer")
     print("Pilih :")
     val optic = optionPlaying()
     if (optic=="1"){
          do {
               print("1. Masukkan pemain 1 : ")
               val input1 = getInputUser()
               print("2. Masukkan pemain 2 : ")
               val input2 = getInputUser()

               val controller = Controller(object : CallResult {
                    override fun result(hasil: String) {
                         println(hasil)
                    }
               })

               controller.compare(input1.toString(), input2.toString())

               print("Lanjut Game ? (ya / tidak) ")
               var input : String?
               val posibleInput = listOf("ya", "tidak")
               do {
                    input = readLine()!!.trim().lowercase()
                    if (!posibleInput.contains(input)) {
                         print("Lanjut Game ? (ya / tidak) ")
                    }
               } while (!posibleInput.contains(input))


          } while (input == "ya")
     }else if (optic=="2"){

          println("==========================")
          println("GAME SUIT TERMINAL VERSION")
          println("==========================")

          print("1. Masukkan pemain 1 : ")
          val input1 = getInputUser()
          print("2. Masukkan pemain 2 : ")
          val input2 = getInputUser()

          val controller = Controller(object : CallResult {
               override fun result(hasil: String) {
                    println(hasil)
               }
          })

          controller.compare(input1.toString(), input2.toString())


     }
}

fun getInputUser() : String? {
     var input : String?
     val posibleInput = listOf("kertas", "gunting", "batu")
     do {
          input = readLine()!!.trim().lowercase()
          if (!posibleInput.contains(input)) {
               println("Masukkan dengan benar")
          }
     } while (!posibleInput.contains(input))
     return input
}

fun optionPlaying(): String?{
     var options :String?
     var  listGameOption = listOf("1","2")
     do {
          options = readLine()!!.trim().lowercase()
          if (!listGameOption.contains(options)){

          }
     }while (!listGameOption.contains(options))

     return options
}







