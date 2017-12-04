package eu.bitwalker.useragentutils;

public class Utils {

    static String[] toLowerCase(String[] ary) {
        if (ary == null) return null;
        String[] res = new String[ary.length];
        for (int i = 0; i < ary.length; i++) {
            res[i] = ary[i].toLowerCase();
        }
        return res;
    }

    static boolean contains(String str, String[] ary) {
        if (ary == null) return false;
        for (String s : ary) {
            if (str.contains(s)) return true;
        }
        return false;
    }

}
