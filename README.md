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
 
- **Stages:**
  - Stage 1
    
    <img width="597" alt="Doge Stage 1" src="https://github.com/karen-nke/mini-game-scala/assets/103889430/18dd49e3-bb55-43a1-bdde-aa6841dd113b">

  - Stage 2
    
    <img width="596" alt="Doge Stage 2" src="https://github.com/karen-nke/mini-game-scala/assets/103889430/bf0a8079-5073-40d3-9251-9a3d3a29cf7a">
 
- **Congrats & Lose Page:**
  - When player passed the stage
    
    <img width="516" alt="Doge Congrats" src="https://github.com/karen-nke/mini-game-scala/assets/103889430/539b97e3-8f06-470b-b875-672b7c0fdc47">
    
  - When player lose the stage
    
    <img width="516" alt="Doge Lose" src="https://github.com/karen-nke/mini-game-scala/assets/103889430/be388604-94ca-48ef-a2c5-f1fe6fcce0fc">
    
- **Utilities:**
Menu bar for game control, music, and volume adjustments

<img width="473" alt="Doge General" src="https://github.com/karen-nke/mini-game-scala/assets/103889430/96bdd477-7015-4d15-90ef-ae8b2483b6f7">
<br>

<img width="445" alt="Doge Help" src="https://github.com/karen-nke/mini-game-scala/assets/103889430/1cc07dcb-47cd-4eb5-8bf1-a41cb48d23d0">

<br>

<img width="480" alt="Doge Rules" src="https://github.com/karen-nke/mini-game-scala/assets/103889430/c29d7486-92ed-47a3-8942-c11914042771">

<img width="481" alt="Doge Control" src="https://github.com/karen-nke/mini-game-scala/assets/103889430/884bca64-11d0-4f27-a305-7f731dcf6563">


## How to Run

1. Install SBT: [SBT Installation Guide](https://www.scala-sbt.org/download.html)
2. Clone the repository: `git clone https://github.com/karen-nke/mini-game-scala`
3. Navigate to the project directory: `cd FlyinDoge`
4. Run SBT: `sbt`
5. Compile the project: `compile`
6. Run the game: `run`

Enjoy playing Flyin Doge!

---

