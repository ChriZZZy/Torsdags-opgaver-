 // 6a

/*int a = 4;
int b = 5;


if ( a == 10 || b == 10 || a + b == 10 ) {
  println("Success!!!!");
}else ( a != 10 || b != 10 || a + b != 10 ){
  println("Failure!!!");
}
*/

// 6b 

int x = 12;
int y = 11;
int z = 13;
int value;
value = x + y + z;
if (x == 10 || x == 0 || y == 10 || y == 0 || z == 10 || z == 0 || x + y + z != 30){
  println("Failure!!!");
  println("value doesnt add up or variable is either 10  or 0");
}
else if (x + y + z == 30){
  println("sucess!!!");
  println(value);
}
