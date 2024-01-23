package stringstest;

import junit.framework.TestCase;
import junit.framework.Assert;
import strings.CheckRotation;

public class RotateStringTest extends TestCase {
    public void rotationTest(){

        //Assert.assertFalse(CheckRotation.isRotation(null, null));
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        Assert.assertTrue(CheckRotation.isRotation(str1, str2));
    }
}
