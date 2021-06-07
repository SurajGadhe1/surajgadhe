package hello;

public class Hello2 
{ 
	public int i;
	public String name;
	public double salry;
	public Hello2(int i, String name)
	{
		this.i = i;
		this.name = name;
		System.out.println("Intenger is :" + i +" "+ "name is :"+ name);  
		
	}
	public Hello2(int i, String name, double salry)
	{
		
		this.i = i;
		this.name = name;
		this.salry = salry;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salry);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hello2 other = (Hello2) obj;
		if (i != other.i)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salry) != Double.doubleToLongBits(other.salry))
			return false;
		return true;
	}
	
	

}
