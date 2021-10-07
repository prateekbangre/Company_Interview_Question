package company_interview_questions;

/**
 * @author prateek.bangre on 08/10/21.
 * @Project Company_Interview_Question
 */
//Question1.implement singleton class
//next -> make sure it will be safe for clone
//next -> how do you make it thread safe.
public class Common_Question1 implements Cloneable{

    private static Common_Question1 obj;

    private Common_Question1(){}

    public static Common_Question1 getInstance(){

        synchronized (Common_Question1.class) {
            if (obj == null)
                obj = new Common_Question1();
        }
        return obj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}

