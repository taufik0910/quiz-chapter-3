interface GetResult {
    fun result(hasil: String)

    fun hasilVs(status: Boolean, p1: String, p2: String) {
        if (status) {
            println("Kamu Menang!! $p1 mengalahkan $p2")
        } else {
            println("Yah.. Kamu Kalah!! $p2 mengalahkan $p1")

        }
}
}
