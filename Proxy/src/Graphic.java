/**
 * Created by Joshua on 10/13/2016.
 */
public abstract class Graphic
{
    //Dummy methods (do nothing but be place holders for functionality
    public void Draw()
    {

    }
    public void HandleMouse()
    {

    }

    public void GetExtent()
    {

    }
    public void Load()
    {
        throw new UnsupportedOperationException();
    }
    public void Save()
    {
        throw new UnsupportedOperationException();
    }

    protected Graphic()
    {

    }
}
