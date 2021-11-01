public String doubleChar(String str) {
  String answer = "";
  for (int length = 0; length < str.length(); length ++) {
  	answer += str.substring(length, length + 1);
    answer += str.substring(length, length + 1);
  }
  return answer;
}
