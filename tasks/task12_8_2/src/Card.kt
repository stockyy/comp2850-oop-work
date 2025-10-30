// Task 12.8.2: class to represent playing cards
class Card(val rank: Rank, val suit: Suit) {
    val fullName = "${rank.symbol} of ${suit.name}"

    override fun toString() = "${rank.symbol}${suit.symbol}"
}