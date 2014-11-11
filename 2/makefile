JCC = javac


default: Factorial.class FTest.class

Factorial.class: Factorial.java
	$(JCC) -cp . Factorial.java

FTest.class: FTest.java
	$(JCC) -cp .:junit-4.11.jar FTest.java

clean:
	rm *.class
	
test:default
	java -cp .:hamcrest-core-1.3.jar:junit-4.11.jar org.junit.runner.JUnitCore FTest