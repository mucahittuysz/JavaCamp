
public class InstructorManager extends User {
String newInstructorAdd;
String newLessonAdd;
boolean yoklama;

public InstructorManager () {}

public InstructorManager (String newInstructorAdd, String newLessonAdd, boolean yoklama) {
	super();
	this.newInstructorAdd = newInstructorAdd;
	this.newLessonAdd = newLessonAdd;
	this.yoklama = yoklama;
	
}

public String getNewInstructorAdd() {
	return newInstructorAdd;
}

public void setNewInstructorAdd(String newInstructorAdd) {
	this.newInstructorAdd = newInstructorAdd;
}

public String getNewLessonAdd() {
	return newLessonAdd;
}

public void setNewLessonAdd(String newLessonAdd) {
	this.newLessonAdd = newLessonAdd;
}

public boolean isYoklama() {
	return yoklama;
}


}





