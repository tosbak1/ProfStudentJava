Observer Pattern
Use the Java Observer and Observable APIs to help you with the following.
1. To start off, one class will need to extend Observable and the other two classes will
need to implement Observer. Modify your code with these changes.
2. Modify the main method in Prof. Instead of having separate method to add Students
and TeachingAssistants, modify the code to use the built-in Observable function for
adding an Observer.
3. There are two areas where the Prof can be changed: setMidterm(...) and
postponeMidterm(...). First the Prof needs to indicate that it has changed in some way,
and then it needs to inform the Observers that it has changed. Modify your code to do
this using the appropriate Observable methods.
4. Finally, the Student and TeachingAssistant classes need to implement the update(...)
method. Implement this method in each class. Keep in mind that this method will be
called when the midterm is set and when it is postponed, so you will need to know
which happened so you can perform the appropriate behaviour (study/proctor or
party/postpone).
5. Verify your code outputs similar text to the console as the original Prof-Student-TA
example.
