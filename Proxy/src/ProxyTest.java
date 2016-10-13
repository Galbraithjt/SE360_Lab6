/**
 * Created by Joshua on 10/13/2016.
 */
public class ProxyTest
{
    public static void main(String[] args)
    {
        //Create a new document
        TextDocument text = new TextDocument();
        // insert it into the proxy
        text.Insert(new ImageProxy('f'));
    }
}
