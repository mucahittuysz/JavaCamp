
public class UserManager {
  public void Add (User user) {
	  System.out.println(user.getUserNumber() + "kaydedildi.");
  }
  
  public void Remove (User user) {
	  System.out.println(user.getUserNumber() + "Silindi.");
  }
  
  public void Update (User user) {
	  System.out.println(user.getUserNumber() + "G�ncellendi.");
  }
  
  public void Yoklama(StudentManager studentManager) {
	
	if(studentManager.getYoklamaKatilma() == true)
	{
		System.out.println("Yoklama al�nd�, derse d�nebilirsiz.");
	}else {
		System.out.println("Yoklama kapal�.");
	}
  }
  public void LessonAdd (InstructorManager instructorManager) {
	  System.out.println(instructorManager.getNewLessonAdd() + "Ders eklendi.");
  }
  
  public void InstructorAdd (InstructorManager instrucktorManager) {
	  System.out.println(instrucktorManager.getNewInstructorAdd() + "E�itmen eklendi.");
  }
  
}
