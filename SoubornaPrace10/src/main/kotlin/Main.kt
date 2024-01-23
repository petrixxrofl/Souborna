fun main() {
    println("Nasobek | Desitkove | Dvojkove | Sestnactkove")
    println("-------------------------------------------")

    for (nasobek in 1..10) {
        val desitkove = nasobek * 6
        val dvojkove = Integer.toBinaryString(desitkove)
        val sestnactkove = Integer.toHexString(desitkove).toUpperCase()

        println("$nasobek       | $desitkove        | $dvojkove        | $sestnactkove")
    }
}