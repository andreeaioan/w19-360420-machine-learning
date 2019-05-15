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
    DataPoint dp  = fullSet.get(32);
    DataPoint p2 = fullSet.get(40);
    System.out.println(dp.getLabel());
    System.out.println(dp.getX());

    String printableX = Arrays.toString (dp.getX());
      System.out.println(printableX);

    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset
    double testPercentage = 0.3;
    double trainPercentage = 0.7;

    List<DataPoint> testSet= DataSet.getTestSet(fullSet, testPercentage);
    List<DataPoint> trainSet= DataSet.getTrainingSet(fullSet, trainPercentage);


    // TASK 3: Use the DataSet class methods to plot the 2D data (binary and multi-class)

    //DO NOT DO THIS

    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)

    System.out.println(DataSet.distanceEuclid(dp,p2));

    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label

    //DataPoint [] nearNeighbors;
    //nearNeighbors = KNNClassifier.getNearestNeighbors(fullSet, p1);

    KNNClassifier p = new KNNClassifier (5);
    String predicted = p.predict(trainSet, testSet.get(32));
    System.out.println("Predicted label: "+predicted);



    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.


    int right=0;
    int total=0;

    for (int i=0; i<1000; i++)
    {
      for (int j=0; j<testSet.length; j++)
      {
        String predict = p.predict(trainSet, testSet.get(j));
        if(predict == (testSet.get(j).getLabel(j)))
        {
          right++;
        }
        total++;

        double percentRight = (right/total)*100;
        System.out.println("Accuracy: "+ percentRight);
      }

    double [] accuracies = new double [999];
    accuracies[i] = percentRight;
  }

  double mean = mean(accuracies[]);
  System.out.println("The mean is: "+mean);

  double stdDev = standardDeviation(accuracies[]);
  System.out.println("The standard deviation is: "+stdDev);

}
  public static double mean(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: average of the elements of array, as a double
    */
    double sum = 0.0;

    for (double a : arr){
      sum += a;
    }
    return (double)sum/arr.length;
  }

  public static double standardDeviation(double[] arr){
    /*
    Method that takes as an argument an array of doubles
    Returns: standard deviation of the elements of array, as a double
    Dependencies: requires the *mean* method written above
    */
    double avg = mean(arr);
    double sum = 0.0;
    for (double a : arr){
      sum += Math.pow(a-avg,2);
    }
    return (double)sum/arr.length;
  }

}
