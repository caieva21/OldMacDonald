class Chick implements Animal 
{
  private String myType, mySound;
  int chickSound;
  public Chick (String type, String soundA, String soundB)
  {
    myType = type;
    
    chickSound = (int)(Math.random()*2);
    if (chickSound == 0)
    {
      mySound = soundA;
    }else
    mySound = soundB;
    
  }
  public Chick ()
  {
    myType = "unknown";
    mySound = "unknown";
  }
  public String getSound () {return mySound;}
  public String getType() { return myType;}
  
}
