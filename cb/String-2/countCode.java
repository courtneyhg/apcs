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

/*
-- This didn't work because I didn't define partA and partB in the if statements.
-- Why do I have to define it in the if statements?
public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  int lengthA = a.length();
  int lengthB = b.length();
  String partA = a.substring(lengthA - lengthB, lengthA);
  String partB = b.substring(lengthB - lengthA, lengthB);
  if (lengthA == lengthB) {
    if (a.equals(b)) {
      return true;
    }
    else {
      return false;
    }
  }
  else if (lengthA > lengthB) {
    if (b.equals(partA)) {
      return true;
    }
    else {
      return false;
    }
  }
  else {
    if (a.equals(partB)) {
      return true;
    }
    else {
      return false;
    }
  }
}
*/
