public String notString(String str) {
  String[] l = str.split(" ");
  if (l[0].equals("not")){
    return str;
  }
  else{
    return "not"+" "+str;
  }
}
