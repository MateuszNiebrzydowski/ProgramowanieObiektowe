package healthcare;

public class Hospital implements Cloneable {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity)
    {
        if (name == null || name.isEmpty())
        {
            this.name = "";
        }
        else
        {
            this.name = name;
        }

        if (capacity <= 0)
        {
            this.capacity = 50.0;
        }
        else
        {
            this.capacity = capacity;
        }
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + ": Name: " + name + ", Capacity: " + capacity;
    }

    @Override
    public Hospital clone() throws CloneNotSupportedException {
        return (Hospital) super.clone();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (name == null || name.isEmpty())
        {
            this.name = "";
        }
        else
        {
            this.name = name;
        }
    }
}
