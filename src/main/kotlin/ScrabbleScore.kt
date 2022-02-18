class ScrabbleScore {
/* Reference: https://dnight.tistory.com/entry/Exercism-Scrabble-Score-WithKotlin*/
    fun scoreWord(input: String): Int{
        var point = 0

        val listOfPointOne = listOf('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T')
        val listOfPointTwo = listOf('D', 'G')
        val listOfPointThree = listOf('B', 'C', 'M', 'P')
        val listOfPointFour = listOf('F', 'H', 'V', 'W', 'Y')
        val listOfPointFive = listOf('K')
        val listOfPointEight = listOf('J', 'X')
        val listOfPointTen = listOf('Q', 'Z')

        input.toCharArray().map {
            when (it.toUpperCase()) {
                in listOfPointOne -> point += 1
                in listOfPointTwo -> point += 2
                in listOfPointThree -> point += 3
                in listOfPointFour -> point += 4
                in listOfPointFive -> point += 5
                in listOfPointEight -> point += 8
                in listOfPointTen -> point += 10
            }
        }
        //TODO calculate using the scoreLetter method below, the scrabble value of the word passed as a parameter
        return point
    }

    //TODO the program if the user enters in any chars other than capital letters...try fix this.
    //Reference: https://exercism.org/tracks/kotlin/exercises/scrabble-score/solutions?page=1
    private fun scoreLetter(char: Char): Int {
        return when (char) {
            in "AEIOULNRST" -> 1
            in "DG" -> 2
            in "BCMP" -> 3
            in "FHVWY" -> 4
            in "K" -> 5
            in "JX" -> 8
            in "QZ" -> 10
            else -> error("Unknown character")
        }
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