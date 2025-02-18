fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val updatedList = list.toMutableList()
    updatedList.add(6)
    println(updatedList) //Output: [1, 2, 3, 4, 5, 6]

    // The potential issue happens here if the list is not copied before modification
    val anotherList = list
    anotherList.toMutableList().add(6)
    println(anotherList) // Output: [1, 2, 3, 4, 5] - The original list was not modified!
    println(list) // Output: [1, 2, 3, 4, 5]
}