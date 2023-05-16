fun bubblesort(tab: IntArray) {
    for (i in tab.indices) {
        for (j in 0 until tab.size - 1) {
            if (tab[j] > tab[j + 1]) {
                val temp = tab[j]
                tab[j] = tab[j + 1]
                tab[j + 1] = temp
            }
        }
    }
    for (i in tab.indices) {
        print(tab[i].toString() + " ")
    }
}

fun main() {
    val tab = intArrayOf(1, 4, 2137, 420, 2, 68, 546423, 3, 4, 5)
    bubblesort(tab)
}