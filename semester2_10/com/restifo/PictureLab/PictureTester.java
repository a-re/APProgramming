package com.restifo.PictureLab;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("resources/PicLab/img/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("resources/PicLab/img/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testNegate()
  {
    Picture beach = new Picture("resources/PicLab/img/beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
    Picture beach = new Picture("resources/PicLab/img/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture fishes = new Picture("resources/PicLab/img/water.jpg");
    fishes.explore();
    fishes.fixUnderwater();
    System.out.println("Fixed underwater");
    fishes.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("resources/PicLab/img/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("resources/PicLab/img/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("resources/PicLab/img/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
    Picture caterpillar = new Picture("resources/PicLab/img/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBottomToTop();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("resources/PicLab/img/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("resources/PicLab/img/snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("resources/PicLab/img/seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("resources/PicLab/img/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  
  public static void testCopy()
  {
    Picture canvas = new Picture("resources/PicLab/img/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("resources/PicLab/img/swan.jpg");
    swan.explore();
    swan.edgeDetection(27);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBottomToTop();
    //testMirrorDiagonal();
    ////testMirrorTemple();
    ////testMirrorArms();
    ////testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testmyCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}