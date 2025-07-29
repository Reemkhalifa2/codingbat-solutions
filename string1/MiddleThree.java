public String middleThree(String str) {
  int middle = (str.length()-3)/2;
  
  if(str.length()>3){
    return str.substring(middle,middle+3);
  }
  
  return str;
}
