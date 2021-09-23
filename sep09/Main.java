class Main
{
  public static void main(String arg[])
  {
    Puppy myPuppy = new Puppy("Frank", 1, "tan");

    System.out.println("Puppy name: " + myPuppy.getName());
    System.out.println("Puppy age: " + myPuppy.getAge());
    System.out.println("Puppy color: " + myPuppy.getColor());

    myPuppy.setName("Toby");
    myPuppy.setAge(3);
    myPuppy.setColor("white");

    System.out.println("Puppy name: " + myPuppy.getName());
    System.out.println("Puppy age: " + myPuppy.getAge());
    System.out.println("Puppy color: " + myPuppy.getColor());



  }

}

class Puppy
{
  private String _name;
  private int _age;
  private String _color;


  public Puppy()
  {
    _name = "Spot";
    _age = 0;
    _color = "brown";
  }

  public Puppy(String n, int a, String c)
  {
    _name = n;
    _age = a;
    _color = c;
  }

  void setName(String n)
  {
    _name = n;
  }

  void setAge(int a)
  {
    _age = a;
  }

  void setColor(String c)
  {
    _color = c;
  }

  String getName()
  {
    return _name;
  }
  
  int getAge()
  {
    return _age;
  }

  String getColor()
  {
      return _color;
  }
}

