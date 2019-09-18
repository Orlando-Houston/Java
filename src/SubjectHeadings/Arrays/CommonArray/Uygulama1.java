package SubjectHeadings.Arrays.CommonArray;

import java.util.ArrayList;

public class Uygulama1 {
    public static void main(String[] args) {

        ArrayList<String>coursList=new ArrayList<>();
        ArrayList<String>englishLessonStudentList=new ArrayList<>();
        ArrayList<String>mathLessonStudentList=new ArrayList<>();

        englishLessonStudentList.add("altun");
        englishLessonStudentList.add("ahmet");
        englishLessonStudentList.add("afet");

        mathLessonStudentList.add("hamide");
        mathLessonStudentList.add("rana");
        mathLessonStudentList.add("Recep");

        coursList.addAll(englishLessonStudentList);
        coursList.addAll(mathLessonStudentList);

        System.out.println("student list in cours:");
        for (String student:coursList){
            System.out.println(student);
        }
        System.out.println();
        System.out.println("list of students taking english course:");
        for (String student:englishLessonStudentList){

            System.out.println(student);
        }

        System.out.println();
        System.out.println("list of students taking math course:");
        for (String student:mathLessonStudentList){

            System.out.println(student);

    }
}}
