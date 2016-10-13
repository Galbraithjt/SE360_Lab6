/**
 * Created by Joshua on 10/13/2016.
 */
public class ImageProxy extends Graphic
{
    Image _image;
    char _fileName;
    //Set the file name and a blank image
    public ImageProxy(char imageFile)
    {
        _fileName = 'a';
        _image = null;
    }//End
    //Return the image or a new image with the file name
    protected Image getImage()
    {
        if(_image == null)
        {
            _image = new Image(_fileName);
        }
        return _image;
    }
}
