# Kotlin Immutability Gotcha: Unexpected Behavior with toMutableList()

This example demonstrates a common pitfall in Kotlin related to immutability and the `toMutableList()` function.  Many developers assume that calling `toMutableList()` on an immutable list directly modifies the original list.  This is incorrect. `toMutableList()` creates a *copy* of the list that is mutable. Modifying the copy does not affect the original list. 

The code in `bug.kt` showcases this behavior, while `bugSolution.kt` provides a solution.

**Key takeaway:** Always explicitly assign the result of `toMutableList()` to a new variable if you intend to modify it and keep the original list unchanged.