# Homework_Object_Relations_Extra2
Homework in university.</br>
</br>
Task 1:</br>
➔ Create classes 'Student' and 'Lecturer'</br>
➔ The 'Student' has a supervisor (Lecturer) and a reviewer (Lecturer). These are a 'private' parameters</br>
➔ In the methods that set the supervisor and the reviewer for the 'Student', it should not be set as one person. These methods do not create a relation from the 'Lecturer' side</br>
➔ Every 'Lecturer' has minGrade and maxGrade</br>
➔ Create 'Student'(minimum 10) and 'Lecturer'(minimum 2) objects</br>
➔ 'Students' and 'Lecturers' are placed in globally accessible lists in the main class</br>
</br>
Task 2:</br>
➔ 'Lecturer' has 2 student lists:</br>
 - those who defend works to him</br>
 - those for whom he is a reviewer</br>
➔ Assign a lecturer and a reviewer to each 'Student'</br>
➔ Iterate through the 'Student' list and add it to the corresponding 'Lecturer's' list (Student X's lecturer is Lecturer Y, then Student X is added to Lecturer Y's list of defended students)</br>
</br>
Task 3:</br>
➔ Iterate through all 'Students'</br>
➔ Assign 'Student' a random grade (as an object parameter) between reviewer's minGrade and maxGrade</br>
➔ If the 'Lecturer's' maxGrade is higher than the reviewer's maxGrade, the grade of the work is increased by 1</br>
</br>
Task 4:</br>
➔ Print all 'Student' information in the following format: Bill Gates defended thesis on ‘Microsoft Excel’. His supervisor 
was Jim Carrey. Reviewer graded Bill Gates with 8.</br>
➔ Print all 'Lecturers' information in the following format:</br>
Jim Carrey supervised 2 students:</br>
 Bill Gates on ‘Microsoft Excel’ got 8</br>
 Stephen Hawking on ‘Magic’ got 5</br>
Jim Carrey reviewed 3 students’ thesis and graded them:</br>
 8, 4, 9
