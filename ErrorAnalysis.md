# Error Analysis Report
## Introduction to Computer Science in Engineering and Science
## Andreea Ioan and Amanda Tanguay

## Distributions of Model Accuracy
Each time the model is ran, the full data set need to be split into a Training set (70%) and a Test set (30%). Before splitting the full set into two different sets, the shuffle method is called in order to mix the points in the data set. Each time getTestSet is ran, a different set of points are randomly chosen to be apart of this set. Same thing goes for the Training set. The accuracy results will therefore slightly differ from one run to the other.

// run 1000 times results

// discuss how much performance varies

// sensible  baseline against which we compare model (idk whats on line 200 of DataSet) :(



## Analysis of different error types
#False positive
A false positive is an instance in which the program assigns a certain data point as malignant, when it's real value is benign. The program makes a false prediction in this case, returning that a set of points in the Test category is more similar to sets of points in the Training category that had the malignant label rather than the benign label.

#False Negative
A false negative occurs when the program labels a given point as negative to being a malignant tumor (it is therefore labeling it a benign) when it is in fact malignant. The data from this data point is closer in distance to the benign-labeled points in the Training Set than the malignant-labeled ones.

#Precision versus recall
The precision of the results refers to the fraction of the points selected to be malignant which are actually malignant. It conveys how many of the selected elements are rightfully selected. Recall refers to the fraction of data points that were selected as being malignant from the entirety of the malignant data set. Precision indicates how often a result deemed true is actually true, while recall indicates how many of the true points get labeled as true in a given run.

//sensible baseline for each of these measures

//ow do the above results change with the **hyperparameter** *k*?
