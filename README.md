# 🎮 Tic-Tac-Toe Game

## 🖙️ Overview
A simple command-line Tic-Tac-Toe game implemented in Java. This application allows two players to play the classic Tic-Tac-Toe game in a turn-based manner.

## 🚀 Features
- **Two-Player Gameplay**: Supports two human players.
- **Input Validation**: Ensures players enter valid moves.
- **Game State Display**: Continuously updates and displays the game board after each move.
- **Win Detection**: Identifies and announces the winner or if the game ends in a draw.

## 🛠️ Installation and Setup
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/parisppdo/Tic-Tac-Toe-Game.git
   ```
2. **Compile the Application**:
   ```bash
   cd Tic-Tac-Toe-Game/src
   javac tictactoe.java
   java tictactoe
   ```

## 📋 How to Play
1. **Start the Game**: Run the application as described above.
2. **Gameplay**:
    - The game will display the board with numbered positions.
    - Players take turns entering the number corresponding to the position where they want to place their mark (X or O).
    - The game checks for a win or draw after each move and displays the result accordingly.

## ❗ Known Issues
- **Score Display Overflow**: When a player wins, the victory message accumulates with each game. Over multiple games, these messages exceed the console window, causing earlier results to be hidden.
    - 🔹 A better system for handling and displaying scores is needed to prevent overflow.
