fun main () {
    println("""
PIZZA MENU

(a) Margherita
(b) Quattro Stagioni
(c) Seafood
(d) Hawaiian
""")
    do {
        print("Choose your pizza (a-d): ")
        val order = readln().lowercase()
        if (order in "a".."d") println("Order Accepted") else println("Invalid Order")
    }
    while (order !in "a".."d")
}


