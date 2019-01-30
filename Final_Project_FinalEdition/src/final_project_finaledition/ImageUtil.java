package final_project_finaledition;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class ImageUtil {
    private static ImageUtil imageUtil = null;
    private int width = 28;
    private int height = 28;

    private ImageUtil(){}

    public static ImageUtil getInstance(){
        if(imageUtil == null){
            imageUtil = new ImageUtil();
        }
        return imageUtil;
    }

    //list all jpg file in train\test folder
    public List<String> getImageList(String type){
        File file = null;
        if(type.equals("train")) {
  //          file = new File("D:\\download\\Train");
           file = new File("C:\\Users\\JIN\\Documents\\Algorithm_Assignment\\Algorithm_Project\\Final_Project_FinalEdition\\Train");
        }
        if(type == "test") {
   //         file = new File("D:\\download\\Test");}
           file = new File("C:\\Users\\JIN\\Documents\\Algorithm_Assignment\\Algorithm_Project\\Final_Project_FinalEdition\\test");}
        
        List<String> fileList = new ArrayList<String>();
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File fileItem:files){
//                if(fileItem.isFile() && fileItem.getAbsolutePath().endsWith(".png")){
//                    fileList.add(fileItem.getAbsolutePath());
//                }
                if(fileItem.isFile()){
                    fileList.add(fileItem.getAbsolutePath());
                }
            }
        }
        //System.out.println("Read " + fileList.size() + " images for " + type + "ing");
        return fileList;
    }

    //create image model list to record(number and gray value matrix)
    public List<ImageModel> getImageModel(List<String> imageList){
        List<ImageModel> list = new ArrayList<ImageModel>();
        for(String item:imageList){
            try {
                BufferedImage bimage = ImageIO.read(new File(item));
                //resize to 28*28
                Image smallImage = bimage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                BufferedImage bSmallImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
                Graphics graphics1 = bSmallImage.getGraphics();
                graphics1.drawImage(smallImage, 0, 0, null);
                graphics1.dispose();

                //get gray value
                int[] pixes = new int[width*height];
                double[] grayMatrix = new double[width*height];
                int index = -1;
                pixes = (int[])bSmallImage.getRaster().getDataElements(0,0,width,height,pixes);
                for(int i=0;i<width;i++){
                    for(int j=0;j<height;j++){
                        int rgb = pixes[i*width+j];
                        int r = (rgb & 0xff0000) >> 16;
                        int g = (rgb & 0xff00) >> 8;
                        int b = (rgb & 0xff);
                        double gray = Double.valueOf(r * 299 + g * 587 + b * 114 + 500)/255000.0;

                        grayMatrix[++index] = gray;
                    }
                }

                Integer digit = Integer.parseInt(new File(item).getName().split("_")[0]);
                ImageModel curModel = new ImageModel(grayMatrix, digit);
                list.add(curModel);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

}
