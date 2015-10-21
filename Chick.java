class Chick implements Animal 
{
  private String myType, mySound;
  int chickSound;
  public Chick (String type, String sound)
  {
    myType = type;
    mySound = sound;
    chickSound = (int)(Math.random()*2);
    if (chickSound == 0)
    {
      mySound = "cluck";
    }else
    mySound = "cheep";
    
  }
  public Chick ()
  {
    myType = "unknown";
    mySound = "unknown";
  }
  public String getSound () {return mySound;}
  public String getType() { return myType;}
  
}
