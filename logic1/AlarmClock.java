public String alarmClock(int day, boolean vacation) {
   boolean isWeekend = (day == 0 || day == 6); // Sunday=0, Saturday=6
  
  if (vacation) {
    if (isWeekend) {
      return "off";
    } else {
      return "10:00";
    }
  } else {
    if (isWeekend) {
      return "10:00";
    } else {
      return "7:00";
    }
  }
}
