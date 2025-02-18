fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val updatedList = list.toMutableList()
    updatedList.add(6)
    println(updatedList) // Output: [1, 2, 3, 4, 5, 6]

    // Correct way to modify a list while preserving the original
    val mutableList = list.toMutableList()
    mutableList.add(6)
    println(mutableList) // Output: [1, 2, 3, 4, 5, 6]
    println(list) // Output: [1, 2, 3, 4, 5] - The original list remains unchanged
} 