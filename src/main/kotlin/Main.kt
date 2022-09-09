fun main() {
     println("==========================")
     println("GAME SUIT TERMINAL VERSION")
     println("==========================")
     println("Tekan 1 untuk main dengan Teman")
     println("Tekan 2 untuk main dengan Computer")
     print("Pilih :")
     val optional = optionPlaying()
     if (optional=="1"){
          do {
               print("1. Masukkan pemain 1 : ")
               val input1 = getReturnGame()
               print("2. Masukkan pemain 2 : ")
               val input2 = getReturnGame()

               val logic = Logic(object : GetResult {
                    override fun result(hasil: String) {
                         println(hasil)
                    }
               })

               logic.compare(input1.toString(), input2.toString())

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
     }else if (optional=="2"){

          print("1. Masukkan pilihan : ")

          val logic = Logic(object : GetResult {
               override fun result(hasil: String) {
                    println(hasil)
               }
          })

          logic.comVsCom()
     }
}

fun getReturnGame() : String? {
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







