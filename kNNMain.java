import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;



public class kNNMain{

  public static void main(String... args) throws FileNotFoundException{

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label
    String PATH_TO_DATA = args[0];
    System.out.println(PATH_TO_DATA);
    List<DataPoint> fullSet = DataSet.readDataSet(PATH_TO_DATA);
    DataPoint givenDataPoint  = fullSet.get(32);
    System.out.println(givenDataPoint.getLabel());

    String printableX = Arrays.toString (givenDataPoint.getX());

    System.out.println(printableX);

    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset
    double testPercentage = 0.3;
    double trainPercentage = 0.7;
    List<DataPoint> testSet= DataSet.getTestSet(fullSet, testPercentage);
    List<DataPoint> trainSet= DataSet.getTrainingSet(fullSet, trainPercentage);
    //System.out.println(trainSet);
    //System.out.println(testSet);

    // TASK 3: Use the DataSet class methods to plot the 2D data (binary and multi-class)

    //DO NOT DO THIS

    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)



    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label



    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.


  }

}
