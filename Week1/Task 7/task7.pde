void setup() {


  int input = 21;

  for (int i = 0; i < input; i++) {
    if (i == 6) {
      println("six");
    } else if (i == input/2 ) {
      println("half");
    } else {
      println(i);
    }
  }
}
