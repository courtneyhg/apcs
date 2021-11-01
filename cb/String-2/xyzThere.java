public boolean xyzThere(String str) {
  /*
  for (int y = 0; y < (str.length()); y ++) {
    if ((str.substring(y, y + 1)).equals(".")) {
      return false;
    }
    */
  /*
  for (int i = 0; i < (str.length()-3); i ++) {
    if ((str.substring(i, i + 3)).equals(".xyz")) {
      return false;
    }
    */
    //else {
      for (int z = 0; z < (str.length()-2); z ++) {
      if ((str.substring(z, z + 3)).equals("xyz")) {
         if (z == 0) {
          return true;
         }
        else if ((str.substring(z - 1, z)).equals(".")) {
          return false;
          }
          else {
            return true;
      }
    }
  }
  return false;

}
