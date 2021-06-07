package hello;

public class Hello
{
  public int i;
  public String name ;
	
  public  Hello(int i1 ,String name1) 
  {
	i=i1;
	name=name1;
	System.out.println("Intenger is :" + i +" "+ "name is :"+ name);  

 }
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;      
	result = prime * result + i;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj)
{
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Hello other = (Hello) obj;
	if (i != other.i)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
@Override
	public String toString() 
	{
		return "Hello []";
	}
	
 }
