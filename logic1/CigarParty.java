public boolean cigarParty(int cigars, boolean isWeekend) {
  if (isWeekend && cigars >= 40) {
    return true ;
  } else {
    return cigars >= 40 && cigars <= 60;
  }
}
