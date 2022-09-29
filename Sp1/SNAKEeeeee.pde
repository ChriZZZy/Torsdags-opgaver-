PImage nokia;
float playerX = 300;
float playerY = 120;

float locationX = random(75,450);
float locationY = random(30,275);
float appleradius = 15;
int score = 0;

// max amount of snake parts
PVector[] snakepos = new PVector[1600];
float movepixels = 15;
int framecount = 0;
float snakespeed = 12;
int snakelength  = 0;
int startlength = 1;

void setup(){
  size(600, 600);
  frameRate(60);
  background(255);
  imageMode(CENTER);
  nokia = loadImage("nokia.png");
  fill(0);
  rect(locationX, locationY, 10, 10);
  // Makes the first "rect/snake" in the array
  for (int j = 0; j < startlength; j++) {
    snakepos[j] = new PVector(playerX, playerY);
  }
  snakelength += startlength;
}



void draw() {
  background(152, 190, 100);
  fill(0);
  rect(playerX, playerY, 15, 15);

  //it's checking the current snake body part, and if it doesn't exist (as in if we've looped past the length of the snake) then it stops looping
  for (int i = 0; i < snakepos.length; i++) {
    if (snakepos[i] == null)
      break;
    fill(0);
    rect(snakepos[i].x, snakepos[i].y, 15, 15);
  }
  fill(0);
  rect(locationX, locationY, 10, 10);
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
      //   // Checking if i have hit the "appel using the formular for circualar hit detection and a pref rdaius
      float distance = sq(locationX - playerX-2.5)+ sq(locationY - playerY-2.5);
      if (distance < sq(appleradius)) {
        locationX = random(75,450);
        locationY = random(30,275);


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
