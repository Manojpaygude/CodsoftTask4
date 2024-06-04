package com.example.myquiz;

import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private static List<QuestionsList> javaQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 =new QuestionsList("Who invented Java Programming?","Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup","James Gosling","");
        final QuestionsList question2 =new QuestionsList("Which statement is true about Java?","Java is a sequence-dependent programming language"," Java is a code dependent programming language","Java is a platform-dependent programming language"," Java is a platform-independent programming language"," Java is a platform-independent programming language","");
        final QuestionsList question3 =new QuestionsList("Which component is used to compile, debug and execute the java programs?","JRE","JIT","JDK","JVM","JDK","");
        final QuestionsList question4 =new QuestionsList("Which one of the following is not a Java feature?","Object-oriented","Use of pointers","Portable","Dynamic and Extensible","Use of pointers","");
        final QuestionsList question5 =new QuestionsList("Which of these cannot be used for a variable name in Java?","identifier & keyword","identifier","keyword","none of the mentioned","keyword","");
        final QuestionsList question6 =new QuestionsList("What is the extension of java code files?",".js",".java",".php",".html",".java","");
        final QuestionsList question7 =new QuestionsList("Which environment variable is used to set the java path?","MAVEN_Path","JavaPATH","JAVA","JAVA_HOME","JAVA_HOME","");
        final QuestionsList question8 =new QuestionsList("Which of the following is not an OOPS concept in Java?","Polymorphism","Inheritance","Compilation","Encapsulation","Compilation","");
        final QuestionsList question9 =new QuestionsList("Which of the following is a type of polymorphism in Java Programming?","Multiple polymorphism","Compile time polymorphism","Multilevel polymorphism"," Execution time polymorphism","Compile time polymorphism","");
        final QuestionsList question10 =new QuestionsList("Which exception is thrown when java is out of memory?","MemoryError","OutOfMemoryError","MemoryOutOfBoundsException","MemoryFullException","OutOfMemoryError","");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        return questionsLists;
    }

    private static List<QuestionsList> pythonQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 =new QuestionsList("What is the result of 3 + 4?", "5", "6", "7", "8", "7", "");
        final QuestionsList question2 =new QuestionsList("Which of the following is not a valid variable name in Python?", "my_var", "_myvar", "2myvar", "myVar", "2myvar", "");
        final QuestionsList question3 =new QuestionsList("What is the output of the following code?\n\nprint('Hello' * 3)", "HelloHelloHello", "Hello 3 times", "HelloHello", "3Hello", "HelloHelloHello", "");
        final QuestionsList question4 =new QuestionsList("How do you comment multiple lines in Python?", "/* ... */", "<!-- ... -->", "# ... #", "''' ... '''", "''' ... '''", "");
        final QuestionsList question5 =new QuestionsList("What method is used to add an element to the end of a list in Python?", "add()", "insert()", "append()", "extend()", "append()", "");
        final QuestionsList question6 =new QuestionsList("Which data type is ordered and immutable in Python?", "List", "Tuple", "Dictionary", "Set", "Tuple", "");
        final QuestionsList question7 =new QuestionsList("How do you convert a string to uppercase in Python?", "str.upper()", "str.toUpper()", "str.upperCase()", "str.caseUpper()", "str.upper()", "");
        final QuestionsList question8 =new QuestionsList("What is the correct way to open a file named 'data.txt' in Python for reading?", "file = open('data.txt', 'r')", "file = open('data.txt')", "file = open('data.txt', 'read')", "file = open('data.txt', 'read-only')", "file = open('data.txt', 'r')", "");
        final QuestionsList question9 =new QuestionsList("Which loop in Python is used to iterate over a sequence of elements?", "for loop", "while loop", "do-while loop", "foreach loop", "for loop", "");
        final QuestionsList question10 =new QuestionsList("What is the output of the following code?\n\nx = 5\nprint(x > 3 and x < 10)", "true", "false", "error", "unknown", "true", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        return questionsLists;
    }

    private static List<QuestionsList> javascriptQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 =new QuestionsList("What is the result of 3 + 4 in JavaScript?", "5", "6", "7", "8", "7", "");
        final QuestionsList question2 =new QuestionsList("What is the output of the following JavaScript code?\n\nconsole.log('Hello' + 3)", "Hello3", "Hello + 3", "Error", "Hello3Error", "Hello3", "");
        final QuestionsList question3 =new QuestionsList("Which method is used to add an element to the end of an array in JavaScript?", "add()", "push()", "append()", "extend()", "push()", "");
        final QuestionsList question4 =new QuestionsList("Which of the following is not a valid JavaScript variable name?", "myVar", "_myVar", "2myVar", "myVar2", "2myVar", "");
        final QuestionsList question5 =new QuestionsList("How do you comment a single line in JavaScript?", "//", "/* */", "#", "##", "//", "");
        final QuestionsList question6 =new QuestionsList("What is the result of '5' + 3 in JavaScript?", "8", "53", "Error", "53Error", "53", "");
        final QuestionsList question7 =new QuestionsList("Which operator is used to compare both value and type in JavaScript?", "==", "===", "=", "!=", "===","");
        final QuestionsList question8 =new QuestionsList("What method is used to join elements of an array into a string in JavaScript?", "concat()", "join()", "merge()", "implode()", "join()", "");
        final QuestionsList question9 =new QuestionsList("What is the output of the following JavaScript code?\n\nconsole.log(typeof([]))", "array", "object", "undefined", "arrayobject", "object", "");
        final QuestionsList question10 =new QuestionsList("What is the correct way to declare a JavaScript variable?", "variable x;", "var x;", "x = variable;", "x;", "var x;", "");
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        return questionsLists;
    }

    private static List<QuestionsList> phpQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("What does PHP stand for?", "Personal Home Page", "PHP: Hypertext Preprocessor", "Pretext Hyperprocessor", "Private Hypertext Processor", "PHP: Hypertext Preprocessor", "");
        final QuestionsList question2 = new QuestionsList("How do you start a PHP block?", "<?php", "<?", "<?=", "<%=", "<?php", "");
        final QuestionsList question3 = new QuestionsList("What function is used to get the length of a string in PHP?", "len()", "strlen()", "length()", "str.length()", "strlen()", "");
        final QuestionsList question4 = new QuestionsList("What is the result of the following PHP code?\n\necho 5 + 3;", "5", "8", "53", "Error", "8", "");
        final QuestionsList question5 = new QuestionsList("Which of the following is not a valid way to start a PHP variable name?", "$myVar", "_myVar", "2myVar", "$my_Var", "2myVar", "");
        final QuestionsList question6 = new QuestionsList("How do you comment multiple lines in PHP?", "/* ... */", "<!-- ... -->", "# ... #", "// ... //", "/* ... */", "");
        final QuestionsList question7 = new QuestionsList("What is the correct way to open a file named 'data.txt' in PHP for reading?", "$file = fopen('data.txt', 'r');", "$file = open('data.txt')", "$file = fopen('data.txt', 'read')", "$file = fopen('data.txt', 'read-only')", "$file = fopen('data.txt', 'r');", "");
        final QuestionsList question8 = new QuestionsList("What is the output of the following PHP code?\n\nfor ($i = 0; $i < 5; $i++) {\n  echo $i;\n}", "01234", "43210", "54321", "12345", "01234", "");
        final QuestionsList question9 = new QuestionsList("Which PHP function is used to redirect the user to another web page?", "redirect()", "header()", "forward()", "location()", "header()", "");
        final QuestionsList question10 = new QuestionsList("Which PHP superglobal array contains information about form variables?", "$_GET", "$_POST", "$_REQUEST", "$_SERVER", "$_POST", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        return questionsLists;
    }
    public static List<QuestionsList>getQuestions(String selectedTopicName){

        switch (selectedTopicName){
            case "java":
                return javaQuestions();

            case "python":
                return pythonQuestions();

            case "javascript":
                return javascriptQuestions();

            default:
                return phpQuestions();

        }
    }
}
