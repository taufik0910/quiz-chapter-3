class Controller(private val callResult: CallResult ) {
    open fun compare(data1 : String, data2 : String) {
//
    if (data1 ==data2){
        callResult.result("draw")
    }else if ((data1=="gunting" && data2=="kertas") ||(data1=="batu" && data2=="gunting")||(data1=="kertas" && data2=="batu")) {
        callResult.result("pemain 1 kalah")

    } else {
        callResult.result("pemain 1 menang")

    }

    }
}