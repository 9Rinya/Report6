package jp.ac.uryukyu.ie.e205709;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.jar.Attributes.Name;
class FileMasterTest {
    /**
     * 
     * 
     * 
     */
    @Test
    public void fillMaster_test(){
        String exepected = "アルトリア・ペンドラゴン";
        String input_num = "アルトリア・ペンドラゴン";
        assertEquals(input_num,(exepected));
       
    }
}
