public class Person
{
  private String name;
  private int    id;
  private static int personCount = 0;

  // constructor
  public Person(String pname)
  {
    name = pname;
    personCount++;
    id = 100 + personCount;
  }

	public Person(){
		this.name = "N/A";
		this.id = -1;
		personCount++;
	}

	public void reset(int id,String name){
		this.id = id;
		this.name = name;
	}

	public String getName(){
		return name;
	}


	public int getId(){
		return id;
	}

  public String  toString()
  {
    return "name: " + name + "  id: " + id 
      + "  (Person count: " + personCount + ")";
  }

  // static/class method
  public static int getCount()
  {
    return personCount;
  }
  
}
