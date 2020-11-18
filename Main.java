import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {
  static ArrayList<Person> people;
  static String filename;
  static FileReader myFile;

public static void main(String[] args) {

  people = new ArrayList<Person>();
  filename = "data.txt";
  String name = "", age = "", color = "";
  
try {

myFile = new FileReader(filename);
BufferedReader reader = new BufferedReader(myFile);

while (reader.ready()) {
name = reader.readLine();
age = reader.readLine();
color = reader.readLine();
System.out.println(name + "\t" + age + "\t" + color);
Person thePerson = new Person(name, Integer.parseInt(age), color);
people.add(thePerson);
}
reader.close();
} catch (IOException exception) {
System.out.println("An error occurred: " + exception);
}


for(int i=0; i<people.size(); i++) {
System.out.printf("%-10s %-10s %-10s %n", people.get(i).getName(), people.get(i).getAge(), people.get(i).getColor());
}
System.out.printf("%-10s %-10s %-10s %n", name, age, color);
people.add(new Person("Brittany", 21, "Blue"));

FileWriter toWriteFile; 
try
{ 
toWriteFile = new FileWriter("data.txt"); 
BufferedWriter output = new BufferedWriter(toWriteFile); 
for(int i=0; i<people.size(); i++) {
output.write(people.get(i).getName()); 
output.newLine();
output.write(Integer.toString(people.get(i).getAge())); 
output.newLine();
output.write(people.get(i).getColor()); 
output.newLine();

output.write("Testing");
output.newLine();
output.write(Integer.toString(100));
output.newLine();
output.flush();
}
output.close(); 
} 
catch (IOException excpt) 
{ 
excpt.printStackTrace(); 
} 
}
}
