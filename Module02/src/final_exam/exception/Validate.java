package final_exam.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private static Matcher matcher;
    public static final String ID_SERVICE_REGEX = "SV.[VL | HO | RO].-*[0-9]{4}";
    public static final String NAME_FACILITY_REGEX = "[A-Z]{1}[a-z\\s\\W|_]{1,50}";
    public static final String ROOM_STANDART = "[A-Z]{1}[a-z\\s\\W|_]{1,50}";
    public static final String ID_REGEX = "[1-9][0-9]{3}";
    public static final String ONE_REGEX = "[1-9]";
    public static final String ID_CARD_REGEX = "([0-9]{9}|[0-9]{14})";
    public static final String DATE_REGEX = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
    public static final String NAME_REGEX = "^[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s\\W|_]+$";

    public static boolean validate(int x) {
        if (x<=0) {
            System.out.println("Du lieu ban nhap khong hop le !!!");
            return false;
        } else return true;
    }

    public static boolean validated(double x) {
        if (x<=0) {
            System.out.println("Du lieu ban nhap khong hop le !!!");
            return false;
        } else return true;
    }


}
