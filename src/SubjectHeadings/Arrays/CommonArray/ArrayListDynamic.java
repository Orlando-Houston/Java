package SubjectHeadings.Arrays.CommonArray;

import java.util.ArrayList;

public class ArrayListDynamic {
    public static void main(String[] args) {


    ArrayList<String> lessonList = new ArrayList<String>();
    lessonList.add("math");
    lessonList.add("ceog");
    lessonList.add("Language");
    lessonList.add("phs");

    for (String lesson:lessonList){
        System.out.println(lesson);
    }
        lessonList.remove(1);
        System.out.println("......");
        for (int i=0;i<lessonList.size();i++){
            System.out.println(lessonList.get(i));
        }

}
}
