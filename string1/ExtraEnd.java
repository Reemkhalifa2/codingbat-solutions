public String extraEnd(String str) {
  String last2 = str.substring(str.length()-2,str.length());
  if (str.length()>2){
    return last2+last2+last2;
  }
  return str+str+str;
}
