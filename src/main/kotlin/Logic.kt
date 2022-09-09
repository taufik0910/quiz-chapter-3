class Logic(private val getResult: GetResult) {
    open fun compare(player1: String, player2: String) {
//
        if (player1!!.lowercase().equals(player2)) {
            getResult.result("draw")
        } else if (player1.lowercase().equals("batu")) {
            if (player2.lowercase().equals("gunting")) {
                getResult.result("Player 1 Menang")
            } else {
                getResult.result("Player 2 Menang")
            }
        } else if (player1.lowercase().equals("gunting")) {
            if (player2.lowercase().equals("kertas")) {
                getResult.result("Player 1 Menang")
            } else {
                getResult.result("Player 2 Menang")
            }
        } else if (player1.lowercase().equals("kertas")) {
            if (player2.lowercase().equals("batu")) {
                getResult.result("Player 1 Menang")
            } else {
                getResult.result("Player 2 Menang")
            }
        } else {
            getResult.result("Player 2 Menang")
        }

    }

    open fun comVsCom() {
        val pilihan = arrayOf("gunting", "batu", "kertas")
        val komputer = pilihan.random()
        var player = readLine()
        var status = false

        if (player!!.lowercase().equals(komputer.lowercase())) {
            println("Seri $komputer dengan $player")
        } else if (player.lowercase().equals("batu")) {
            if (komputer.lowercase().equals("gunting")) {
                status = true
                getResult.hasilVs(status, player, komputer)
            } else {
                status = false
                getResult.hasilVs(status, player, komputer)
            }
        } else if (player.lowercase().equals("gunting")) {
            if (komputer.lowercase().equals("kertas")) {
                status = true
                getResult.hasilVs(status, player, komputer)
            } else {
                status = false
                getResult.hasilVs(status, player, komputer)
            }
        } else if (player.lowercase().equals("kertas")) {
            if (komputer.lowercase().equals("batu")) {
                status = true
                getResult.hasilVs(status, player, komputer)
            } else {
                status = false
                getResult.hasilVs(status, player, komputer)
            }
        }


    }
}