public boolean mixStart(String str) {
  String [] l = str.split(" ");
  if (l[0].length() >= 3){
  return (str.substring(1,3).equals("ix"));}
  else{return false;}
  
}
