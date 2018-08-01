IF WINDOWS:

1. Open CMD or PowerShell

2. Navigate to directory with .jar files

3. If .class files present, enter:

	java PaperDriver
   else:
	javac PaperDriver.java

	(the latter will compile your code to executable 	byte-code).

4. Follow instructions from command-line.


### PURPOSE ###

The intent of this app is to provide an example of a basic circular array implemented via java's ArrayList (akin to vector datastructure). As the user iterates through the list, the positions in the ArrayList circulate, maintaing order in the same way a stack of papers would remain should someone be grabbing one from the top and placing it back on the bottom.