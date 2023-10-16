# Flyin Doge - Scala SBT Game Project

## Overview

Flyin Doge is a single-player game developed in Scala using the SBT (Simple Build Tool) build system. The game draws inspiration from the popular mobile game Flappy Bird, adding a unique twist with the use of the iconic Doge character.

## Features

1. **Player Control:**
   - Control the Doge's height by pressing and releasing the spacebar.

2. **Game Elements:**
   - Display Doge, Obstacle, Score, Bonus, Heart, and Menu bar.
  
3. **Gameplay:**
   - Detect collisions between Doge and Obstacle.
   - Add score when Doge passes an obstacle.
   - Deduct hearts if Doge collides with obstacles.
   - Collect bonus for extra points and hearts.
   - Progress to the second round after passing the first.

4. **Game Interface:**
   - Engaging user interface with distinct stages.
   - Menu bar for game control, music, and volume adjustments.
   - Rules and controls popup for player guidance.

## Requirements

1. Player can control Doge's height with the spacebar.
2. Display Doge, Obstacle, Score, Bonus, Heart, and Menu bar.
3. Detect collision between Doge and Obstacle.
4. Add score when Doge passes an obstacle.
5. Deduct hearts if Doge collides with obstacles.
6. Add hearts and extra scores for collecting bonuses.
7. Progress to the second round after passing the first.
8. Display "lose page" if hearts are exhausted.
9. Display "congrats page" upon completing the game.

## Design

### Objects
- **Doge:** Controlled by the player.
- **Top Tube and Bottom Tube:** Obstacles in the game.
- **Heart:** Represents the player's life.
- **Bonus:** Collectible for extra points.

### Interface

-**Home Page:**

<img width="516" alt="Doge Homepage" src="https://github.com/karen-nke/mini-game-scala/assets/103889430/977fade4-a9fc-4ca9-8fda-52dfcf630fbe">

- **Menu Bar:**
  - Start Game button.
  - Music controls.
  - Help menu with rules and controls.


## How to Run

1. Install SBT: [SBT Installation Guide](https://www.scala-sbt.org/download.html)
2. Clone the repository: `git clone https://github.com/karen-nke/mini-game-scala`
3. Navigate to the project directory: `cd FlyinDoge`
4. Run SBT: `sbt`
5. Compile the project: `compile`
6. Run the game: `run`

Enjoy playing Flyin Doge!

---

