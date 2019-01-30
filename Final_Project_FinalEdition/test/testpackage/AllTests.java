package testpackage;


import final_project_finaledition.Neural_Network;
import final_project_finaledition.ImageModel;
import final_project_finaledition.ImageUtil;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;

public class AllTests {


    @Test public void test1(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        network.SGD(modelList, 100, 0.5);
        assertTrue(network.isTrain());
    }
   
    
    @Test public void test2(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
         List<String> fileList = ImageUtil.getInstance().getImageList("train");
         List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(3,network.getLayerNum());
    }
    
    @Test public void test3(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
         List<String> fileList = ImageUtil.getInstance().getImageList("train");
         List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(3,network.getSizes().length);
    }
    
        //Test the Training ratio list size
        @Test public void test4(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(500,modelList.size());
    }
       
        
        @Test public void test5(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(0,modelList.get(20).getDigit());
    }
            
        @Test public void test6(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(1,modelList.get(91).getDigit());
        }
  
        @Test public void test7(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(2,modelList.get(108).getDigit());
    }
        
        
         @Test public void test8(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(3,modelList.get(156).getDigit());
    }
        
        @Test public void test9(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(4,modelList.get(252).getDigit());
    }
        
        @Test public void test10(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(5,modelList.get(276).getDigit());
        }
        
        @Test public void test11(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(6,modelList.get(350).getDigit());
    }
         @Test public void test12(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(7,modelList.get(372).getDigit());
    }
        
        @Test public void test13(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(8,modelList.get(432).getDigit());
    }
        
        @Test public void test14(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(9,modelList.get(480).getDigit());
    }
                       
        @Test public void test15(){
        final Neural_Network network = new Neural_Network(new int[]{28*28,30,10});
        List<String> fileList = ImageUtil.getInstance().getImageList("train");
        List<ImageModel> modelList = ImageUtil.getInstance().getImageModel(fileList);
        assertEquals(10,modelList.get(490).getDigit());
    }        
}
