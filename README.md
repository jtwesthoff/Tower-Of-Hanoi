# Tower of Hanoi

The Tower of Hanoi is a mathematical puzzle where you have three rods and a number of disks of different sizes that can slide onto any rod. The puzzle starts with the disks in a neat stack in ascending order of size on one rod, with the smallest disk at the top. The objective of the puzzle is to move the entire stack to another rod, obeying the following rules:

1. Only one disk can be moved at a time.
2. Each move consists of taking the top disk from one stack and placing it on top of another stack.
3. No disk may be placed on top of a smaller disk.

## Description

This Java program implements the Tower of Hanoi puzzle solver using recursion. It allows the user to specify the number of disks they'd like to solve the puzzle for, measures the time taken to solve the puzzle in nanoseconds, and calculates the number of moves required to solve the puzzle.

## How to Use

To use the Tower of Hanoi program, follow these steps:

1. Clone or download the repository to your local machine.
2. Ensure you have Java installed on your system.
3. Open a terminal or command prompt and navigate to the directory where the Java files are located.
4. Compile the `Tower.java` file using the Java compiler:
   ```
   javac Tower.java
   ```
5. Run the compiled program:
   ```
   java Tower
   ```
6. Follow the on-screen instructions. Enter the number of rings you'd like to test when prompted.

## Example

Here's an example of how the Tower of Hanoi program works:

```
How many rings would you like to test?
5
Time in nanoseconds: 2495
Number of moves: 32
```

## Contributing

If you'd like to contribute to this project, feel free to fork the repository, make your changes, and submit a pull request.
