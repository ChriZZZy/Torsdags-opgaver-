PImage nokia; // importing a png

float playerX = 300;
float playerY = 120;

float appleLocationX = random(75,450);
float appleLocationY = random(30,275);
float appleradius = 15;


PVector[] snakepos = new PVector[1600]; // max amount of snake parts
float movepixels = 15;
int framecount = 0;
float snakespeed = 12;
int snakelength  = 0;
int startlength = 2;

void setup(){
  size(600, 600);
  frameRate(60);
  background(255);
  imageMode(CENTER);
  nokia = loadImage("nokia.png");
  fill(0);
  for (int j = 0; j < startlength; j++) {
    snakepos[j] = new PVector(playerX, playerY);
  }
  snakelength += startlength;
}



void draw() {
  background(152, 190, 100);
  fill(0);
  rect(playerX, playerY, 15, 15); //sets the first addition of the player

  //it's checking the current snake body part, and if it doesn't exist (as in if we've looped past the length of the snake) then it stops looping
  for (int i = 0; i < snakepos.length; i++) {
    if (snakepos[i] == null)
      break;
    fill(0);
    rect(snakepos[i].x, snakepos[i].y, 15, 15);
  }
  fill(0);
  rect(appleLocationX, appleLocationY, 10, 10); //makes the first addition of the apple 
  //snake movement speed
  if (framecount > 60/snakespeed) {
    framecount = 0;
    float lastx = playerX;
    float lasty = playerY;

    // Moving using the arrowkeys
    if (keyCode == UP) {
      playerY -= movepixels;
    } else if (keyCode == DOWN) {
      playerY += movepixels;
    }
    if (keyCode == LEFT) {
      playerX -= movepixels;
    }
    if (keyCode == RIGHT) {
      playerX += movepixels;
    }


    if (playerX != lastx || playerY != lasty) {
      //   // Checking if the snake have hit the "appel using  math to create a cirkular raidus around the apple.
      float distance = sq(appleLocationX - playerX-2.5)+ sq(appleLocationY - playerY-2.5);
      if (distance < sq(appleradius)) {
        appleLocationX = random(75,450);
        appleLocationY = random(30,275);


        // making the snake 1 "array longer
        if (snakelength < snakepos.length) {
          snakepos[snakelength] = new PVector(0, 0);
          snakelength++;
        }
      }
      // Setting the tmpXY to the current snake position to store the location and make them move.
      for (int i = 0; i < snakepos.length; i++) {
        if (snakepos[i] == null)
          break;
        float tmpx = snakepos[i].x;
        float tmpy = snakepos[i].y;
        snakepos[i] = new PVector(lastx, lasty);
        lastx = tmpx;
        lasty = tmpy;
      }
    }
  }
  //capping the speed of the snake
  framecount++;
  
  if (playerX >= 450|| playerX < 75 || playerY >= 275 || playerY < 30) {
    background(0);
    println("GAME OVER");
  }
   noFill();
  rect(75,30,450,275); 
  image(nokia,width/2,440,600,890); 
   
}
