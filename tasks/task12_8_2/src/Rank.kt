// Task 12.8.2: enum class for playing card ranks
enum class Rank (val symbol: Char) {
    Ace('A'), 
    One('1'), 
    Two('2'), 
    Three('3'), 
    Four('4'), 
    Five('5'), 
    Six('6'), 
    Seven('7'), 
    Eight('8'), 
    Nine('9'), 
    Ten('T'),
    Jack('J'),
    King('K'),
    Queen('Q');

    override fun toString() = "$name"
}