boolean button = false;

float posX = 40;
float posY = 400;

float rectSpeedX = 8;
float rectSpeedY = 5;


void setup(){
  size(800,800);
  background(255);
  
}

void draw(){
  color aColor = (int) random(#000000);
  fill(aColor);
  rectMode(CENTER);
  float jens=random(0.5,2);
  if (mousePressed){
    button= !button;
  
  
  posX= posX+ rectSpeedX;
  if (posX > width-10 || posX < 0) {   
  rectSpeedX= rectSpeedX* -jens;
} else if (rectSpeedX>=70){
rectSpeedX= -+10;
}
rectSpeedX = constrain(rectSpeedX,-80,80);

posY = posY+ rectSpeedY;
if (posY > height || posY <0) {
  rectSpeedY *=-1;
}
float sizeX= random(60,100);
float sizeY= random(30,70);
float corner= random(90);

rect(posX,posY,sizeX,sizeY,corner);
}
}
void mousePressed(){
  button = !button;
}
