package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.28u  reason: invalid class name and case insensitive filesystem */
public final class C462528u extends AnonymousClass25Z {
    public static final AnonymousClass14Y A01 = new AnonymousClass14Y(15);
    public static final AnonymousClass14Z A02 = new AnonymousClass14Z(30.0f, 1, 1);
    public static final Pattern A03 = Pattern.compile("^(\\d+) (\\d+)$");
    public static final Pattern A04 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern A05 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern A06 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern A07 = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern A08 = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public final XmlPullParserFactory A00;

    public C462528u() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.A00 = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static long A00(String str, AnonymousClass14Z r13) {
        double d;
        double d2;
        double d3;
        double d4;
        Matcher matcher = A04.matcher(str);
        if (matcher.matches()) {
            double parseLong = ((double) (Long.parseLong(matcher.group(1)) * 3600)) + ((double) (Long.parseLong(matcher.group(2)) * 60)) + ((double) Long.parseLong(matcher.group(3)));
            String group = matcher.group(4);
            double d5 = 0.0d;
            if (group != null) {
                d3 = Double.parseDouble(group);
            } else {
                d3 = 0.0d;
            }
            double d6 = parseLong + d3;
            String group2 = matcher.group(5);
            if (group2 != null) {
                d4 = (double) (((float) Long.parseLong(group2)) / r13.A00);
            } else {
                d4 = 0.0d;
            }
            double d7 = d6 + d4;
            String group3 = matcher.group(6);
            if (group3 != null) {
                d5 = (((double) Long.parseLong(group3)) / ((double) r13.A01)) / ((double) r13.A00);
            }
            return (long) ((d7 + d5) * 1000000.0d);
        }
        Matcher matcher2 = A06.matcher(str);
        if (matcher2.matches()) {
            double parseDouble = Double.parseDouble(matcher2.group(1));
            String group4 = matcher2.group(2);
            int hashCode = group4.hashCode();
            if (hashCode != 102) {
                if (hashCode != 104) {
                    if (hashCode != 109) {
                        if (hashCode != 3494) {
                            if (hashCode != 115 && hashCode == 116 && group4.equals("t")) {
                                d = (double) r13.A02;
                            }
                        } else if (group4.equals("ms")) {
                            d = 1000.0d;
                        }
                    } else if (group4.equals("m")) {
                        d2 = 60.0d;
                    }
                    return (long) (parseDouble * 1000000.0d);
                }
                if (group4.equals("h")) {
                    d2 = 3600.0d;
                }
                return (long) (parseDouble * 1000000.0d);
                parseDouble *= d2;
                return (long) (parseDouble * 1000000.0d);
            }
            if (group4.equals("f")) {
                d = (double) r13.A00;
            }
            return (long) (parseDouble * 1000000.0d);
            parseDouble /= d;
            return (long) (parseDouble * 1000000.0d);
        }
        throw new AnonymousClass14G(AnonymousClass008.A0K("Malformed time expression: ", str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b6, code lost:
        if (r7.equals("information") != false) goto L_0x01da;
     */
    @Override // X.AnonymousClass25Z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass14F A01(byte[] r38, int r39, boolean r40) {
        /*
        // Method dump skipped, instructions count: 1440
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C462528u.A01(byte[], int, boolean):X.14F");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0219, code lost:
        if (r6.equals("backgroundColor") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0224, code lost:
        if (r6.equals("fontSize") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x022f, code lost:
        if (r6.equals("color") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x023a, code lost:
        if (r6.equals("id") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0245, code lost:
        if (r6.equals("fontWeight") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0252, code lost:
        if (r6.equals("textDecoration") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x025e, code lost:
        if (r6.equals("textAlign") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0269, code lost:
        if (r6.equals("fontFamily") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0274, code lost:
        if (r6.equals("fontStyle") == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C230314d A02(org.xmlpull.v1.XmlPullParser r14, X.C230314d r15) {
        /*
        // Method dump skipped, instructions count: 734
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C462528u.A02(org.xmlpull.v1.XmlPullParser, X.14d):X.14d");
    }
}
