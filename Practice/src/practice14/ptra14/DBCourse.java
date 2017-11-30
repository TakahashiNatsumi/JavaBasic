package practice14.ptra14;

import practice14.common.Course;

public class DBCourse implements Course{

	public String getCourseName() {

		return "『" + PREFIX + "DB基礎」";

	}

	public String[] getCourseUnit() {

		String[] CourseUnit = {"DB基礎", "SQL基礎", "正規化", "SQL応用"};

		for(int i = 0; i<4; i++) {

			System.out.println(CourseUnit[i]);

		}

		return CourseUnit;

	}

}
