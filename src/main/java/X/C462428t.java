package X;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.28t  reason: invalid class name and case insensitive filesystem */
public final class C462428t extends AnonymousClass25Z {
    public static final Pattern A02 = Pattern.compile("\\{\\\\.*?\\}");
    public static final Pattern A03 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    public final StringBuilder A00 = new StringBuilder();
    public final ArrayList A01 = new ArrayList();

    public static long A00(Matcher matcher, int i) {
        long parseLong = Long.parseLong(matcher.group(i + 2)) * 60 * 1000;
        long parseLong2 = Long.parseLong(matcher.group(i + 3)) * 1000;
        return (Long.parseLong(matcher.group(i + 4)) + parseLong2 + parseLong + (Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000)) * 1000;
    }
}
