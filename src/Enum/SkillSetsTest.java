package Enum;

public class SkillSetsTest {
    public static void main(String[] args) {
        SkillSets mySkills=SkillSets.JAVA;
        switch (mySkills){
            case SQL:
                System.out.println ("Practice Relaotinal Database");
                break;
            case SELENIUM:
                System.out.println ("prepare your framework");
                break;
            case JAVA:
                System.out.println ("solved problem a lot");
                break;
        }

    }
}
