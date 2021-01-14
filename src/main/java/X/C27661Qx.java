package X;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1Qx  reason: invalid class name and case insensitive filesystem */
public final class C27661Qx implements Comparator {
    public static final Pattern A00 = Pattern.compile(".*(\\d\\d\\d\\d\\d\\d\\d\\d).*");
    public static final Pattern A01 = Pattern.compile("WA(\\d\\d\\d\\d)");

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i;
        int i2;
        String str = (String) obj;
        String str2 = (String) obj2;
        Pattern pattern = A00;
        Matcher matcher = pattern.matcher(str);
        Matcher matcher2 = pattern.matcher(str2);
        int i3 = 0;
        if (matcher.find()) {
            i = Integer.parseInt(matcher.group(1));
        } else {
            i = 0;
        }
        if (matcher2.find()) {
            i2 = Integer.parseInt(matcher2.group(1));
        } else {
            i2 = 0;
        }
        if (i == i2) {
            Pattern pattern2 = A01;
            Matcher matcher3 = pattern2.matcher(str);
            Matcher matcher4 = pattern2.matcher(str2);
            if (matcher3.find()) {
                i = Integer.parseInt(matcher3.group(1));
            } else {
                i = 0;
            }
            if (matcher4.find()) {
                i3 = Integer.parseInt(matcher4.group(1));
            }
        } else {
            i3 = i2;
        }
        return -(i - i3);
    }
}
