public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  int lengthA = a.length();
  int lengthB = b.length();
  if (lengthA == lengthB) {
    if (a.equals(b)) {
      return true;
    }
    else {
      return false;
    }
  }
  else if (lengthA > lengthB) {
    String partA = a.substring(lengthA - lengthB, lengthA);
    if (b.equals(partA)) {
      return true;
    }
    else {
      return false;
    }
  }
  else {
    String partB = b.substring(lengthB - lengthA, lengthB);
    if (a.equals(partB)) {
      return true;
    }
    else {
      return false;
    }
  }
}
