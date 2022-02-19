class ScrabbleScore {

// score was 0 and is now = to scoreLetter which contains the values of the letters.
//  + is added to go through each char of the word and then the total score of the word is calculated and in the variable score

    fun scoreWord(word: String): Int {
        var score = 0
        for (char in word)
            score += scoreLetter(char)

        return score
    }

    //Reference: https://exercism.org/tracks/kotlin/exercises/scrabble-score/solutions?page=1
    // = is same as curly bracket and return
    // The characters entered as lowercase will be converted to uppercase to avoid case sensitivity

    private fun scoreLetter(char: Char): Int =
        when (char.uppercaseChar()) {
            in "AEIOULNRST" -> 1
            in "DG" -> 2
            in "BCMP" -> 3
            in "FHVWY" -> 4
            in "K" -> 5
            in "JX" -> 8
            in "QZ" -> 10
            in "-1" -> 0
            else -> error("Unknown character")
        }

    fun letterValues() = """Letter                           Value
           A, E, I, O, U, L, N, R, S, T       1
           D, G                               2
           B, C, M, P                         3
           F, H, V, W, Y                      4
           K                                  5
           J, X                               8
           Q, Z                               10"""

}