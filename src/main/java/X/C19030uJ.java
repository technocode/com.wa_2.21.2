package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.xml.sax.Attributes;

/* renamed from: X.0uJ  reason: invalid class name and case insensitive filesystem */
public class C19030uJ {
    public int A00;
    public AbstractC18840u0 A01 = null;
    public C18890u5 A02 = null;
    public EnumC19000uG A03 = null;
    public StringBuilder A04 = null;
    public StringBuilder A05 = null;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;

    public static void A0O(StringBuilder sb, char c) {
        sb.append(c);
        sb.append(" path segment");
        Log.e("SVGParser", sb.toString());
    }

    public static float A00(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return ((f2 - f) * f3) + f;
        }
        if (f3 < 3.0f) {
            return f2;
        }
        if (f3 >= 4.0f) {
            return f;
        }
        return ((4.0f - f3) * (f2 - f)) + f;
    }

    public static float A01(String str) {
        int length = str.length();
        if (length != 0) {
            return A02(str, length);
        }
        throw new C18940uA("Invalid float value (empty string)");
    }

    public static float A02(String str, int i) {
        float A002 = new C18610td().A00(str, 0, i);
        if (!Float.isNaN(A002)) {
            return A002;
        }
        throw new C18940uA(AnonymousClass008.A0K("Invalid float value: ", str));
    }

    public static int A03(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r7 <= 0.5f) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(float r5, float r6, float r7) {
        /*
            r1 = 1135869952(0x43b40000, float:360.0)
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            float r5 = r5 % r1
            if (r0 >= 0) goto L_0x0009
            float r5 = r5 + r1
        L_0x0009:
            r0 = 1114636288(0x42700000, float:60.0)
            float r5 = r5 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r0
            float r7 = r7 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            r6 = 0
        L_0x0017:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L_0x0055
            r2 = r7
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0055
        L_0x0028:
            float r6 = r6 + r1
            float r6 = r6 * r2
        L_0x002a:
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r1
            float r2 = r2 - r6
            float r0 = r5 + r1
            float r0 = A00(r2, r6, r0)
            float r4 = A00(r2, r6, r5)
            float r5 = r5 - r1
            float r3 = A00(r2, r6, r5)
            r2 = 1132462080(0x43800000, float:256.0)
            float r0 = r0 * r2
            int r0 = A03(r0)
            int r1 = r0 << 16
            float r4 = r4 * r2
            int r0 = A03(r4)
            int r0 = r0 << 8
            r1 = r1 | r0
            float r3 = r3 * r2
            int r0 = A03(r3)
            r0 = r0 | r1
            return r0
        L_0x0055:
            float r0 = r2 + r6
            float r6 = r6 * r2
            float r6 = r0 - r6
            goto L_0x002a
        L_0x005b:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19030uJ.A04(float, float, float):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0232, code lost:
        throw new X.C18940uA(X.AnonymousClass008.A0K("Invalid transform list: ", r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023c, code lost:
        throw new X.C18940uA(X.AnonymousClass008.A0K("Invalid transform list: ", r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0246, code lost:
        throw new X.C18940uA(X.AnonymousClass008.A0K("Invalid transform list: ", r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0252, code lost:
        throw new X.C18940uA(X.AnonymousClass008.A0K("Bad transform function encountered in transform list: ", r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0253, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01fc, code lost:
        throw new X.C18940uA(X.AnonymousClass008.A0K("Invalid transform list: ", r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0214, code lost:
        throw new X.C18940uA(X.AnonymousClass008.A0K("Invalid transform list: ", r20));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Matrix A05(java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 622
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19030uJ.A05(java.lang.String):android.graphics.Matrix");
    }

    public static C31901dz A06(String str) {
        long j;
        int i;
        int i2 = 4;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C18600tc r9 = null;
            if (1 < length) {
                long j2 = 0;
                int i3 = 1;
                while (true) {
                    if (i3 < length) {
                        char charAt = str.charAt(i3);
                        if (charAt < '0' || charAt > '9') {
                            if (charAt < 'A' || charAt > 'F') {
                                if (charAt < 'a' || charAt > 'f') {
                                    break;
                                }
                                j = j2 * 16;
                                i = charAt - 'a';
                            } else {
                                j = j2 * 16;
                                i = charAt - 'A';
                            }
                            j2 = j + ((long) i) + 10;
                        } else {
                            j2 = (j2 * 16) + ((long) (charAt - '0'));
                        }
                        if (j2 > 4294967295L) {
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
                if (i3 != 1) {
                    r9 = new C18600tc(j2, i3);
                }
            }
            if (r9 != null) {
                int i4 = r9.A00;
                if (i4 == 4) {
                    int i5 = (int) r9.A01;
                    int i6 = i5 & 3840;
                    int i7 = i5 & 240;
                    int i8 = i5 & 15;
                    return new C31901dz(i8 | (i6 << 8) | -16777216 | (i6 << 12) | (i7 << 8) | (i7 << 4) | (i8 << 4));
                } else if (i4 == 5) {
                    int i9 = (int) r9.A01;
                    int i10 = 61440 & i9;
                    int i11 = i9 & 3840;
                    int i12 = i9 & 240;
                    int i13 = i9 & 15;
                    return new C31901dz((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
                } else if (i4 == 7) {
                    return new C31901dz(((int) r9.A01) | -16777216);
                } else {
                    if (i4 == 9) {
                        int i14 = (int) r9.A01;
                        return new C31901dz((i14 << 24) | (i14 >>> 8));
                    }
                    throw new C18940uA(AnonymousClass008.A0K("Bad hex colour value: ", str));
                }
            } else {
                throw new C18940uA(AnonymousClass008.A0K("Bad hex colour value: ", str));
            }
        } else {
            String lowerCase = str.toLowerCase(Locale.US);
            boolean startsWith = lowerCase.startsWith("rgba(");
            if (startsWith) {
                i2 = 5;
            } else if (!lowerCase.startsWith("rgb(")) {
                boolean startsWith2 = lowerCase.startsWith("hsla(");
                if (startsWith2) {
                    i2 = 5;
                } else if (!lowerCase.startsWith("hsl(")) {
                    Number number = (Number) C18960uC.A00.get(lowerCase);
                    if (number != null) {
                        return new C31901dz(number.intValue());
                    }
                    throw new C18940uA(AnonymousClass008.A0K("Invalid colour keyword: ", lowerCase));
                }
                C19010uH r5 = new C19010uH(str.substring(i2));
                r5.A0B();
                float A012 = r5.A01();
                float A032 = r5.A03(A012);
                if (!Float.isNaN(A032)) {
                    r5.A0E('%');
                }
                float A033 = r5.A03(A032);
                boolean isNaN = Float.isNaN(A033);
                if (!isNaN) {
                    r5.A0E('%');
                }
                if (startsWith2) {
                    float A034 = r5.A03(A033);
                    r5.A0B();
                    if (!Float.isNaN(A034) && r5.A0E(')')) {
                        return new C31901dz((A03(A034 * 256.0f) << 24) | A04(A012, A032, A033));
                    }
                    throw new C18940uA(AnonymousClass008.A0K("Bad hsla() colour value: ", str));
                }
                r5.A0B();
                if (!isNaN && r5.A0E(')')) {
                    return new C31901dz(A04(A012, A032, A033) | -16777216);
                }
                throw new C18940uA(AnonymousClass008.A0K("Bad hsl() colour value: ", str));
            }
            C19010uH r52 = new C19010uH(str.substring(i2));
            r52.A0B();
            float A013 = r52.A01();
            if (!Float.isNaN(A013) && r52.A0E('%')) {
                A013 = (A013 * 256.0f) / 100.0f;
            }
            float A035 = r52.A03(A013);
            if (!Float.isNaN(A035) && r52.A0E('%')) {
                A035 = (A035 * 256.0f) / 100.0f;
            }
            float A036 = r52.A03(A035);
            if (!Float.isNaN(A036) && r52.A0E('%')) {
                A036 = (A036 * 256.0f) / 100.0f;
            }
            if (startsWith) {
                float A037 = r52.A03(A036);
                r52.A0B();
                if (!Float.isNaN(A037) && r52.A0E(')')) {
                    return new C31901dz((A03(A037 * 256.0f) << 24) | (A03(A013) << 16) | (A03(A035) << 8) | A03(A036));
                }
                throw new C18940uA(AnonymousClass008.A0K("Bad rgba() colour value: ", str));
            }
            r52.A0B();
            if (!Float.isNaN(A036) && r52.A0E(')')) {
                return new C31901dz((A03(A013) << 16) | -16777216 | (A03(A035) << 8) | A03(A036));
            }
            throw new C18940uA(AnonymousClass008.A0K("Bad rgb() colour value: ", str));
        }
    }

    public static C18700tm A07(C19010uH r1) {
        if (r1.A0F("auto")) {
            return new C18700tm(0.0f);
        }
        return r1.A05();
    }

    public static C18700tm A08(String str) {
        int length = str.length();
        if (length != 0) {
            EnumC18880u4 r3 = EnumC18880u4.px;
            int i = length - 1;
            char charAt = str.charAt(i);
            if (charAt == '%') {
                length = i;
                r3 = EnumC18880u4.percent;
            } else if (length > 2 && Character.isLetter(charAt)) {
                int i2 = length - 2;
                if (Character.isLetter(str.charAt(i2))) {
                    length = i2;
                    try {
                        r3 = EnumC18880u4.valueOf(str.substring(i2).toLowerCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        throw new C18940uA(AnonymousClass008.A0K("Invalid length unit specifier: ", str));
                    }
                }
            }
            try {
                return new C18700tm(A02(str, length), r3);
            } catch (NumberFormatException e) {
                throw new C18940uA(AnonymousClass008.A0K("Invalid length value: ", str), e);
            }
        } else {
            throw new C18940uA("Invalid length value (empty string)");
        }
    }

    public static EnumC18740tq A09(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1657669071) {
            if (hashCode != -1178781136) {
                if (hashCode != -1039745817 || !str.equals("normal")) {
                    return null;
                }
                return EnumC18740tq.Normal;
            } else if (str.equals("italic")) {
                return EnumC18740tq.Italic;
            } else {
                return null;
            }
        } else if (str.equals("oblique")) {
            return EnumC18740tq.Oblique;
        } else {
            return null;
        }
    }

    public static AbstractC18860u2 A0A(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3387192) {
            if (hashCode == 1442907498 && str.equals("currentColor")) {
                return C31911e0.A00;
            }
        } else if (str.equals("none")) {
            return C31901dz.A02;
        }
        try {
            return A06(str);
        } catch (C18940uA unused) {
            return null;
        }
    }

    public static AbstractC18860u2 A0B(String str) {
        if (!str.startsWith("url(")) {
            return A0A(str);
        }
        int indexOf = str.indexOf(")");
        AbstractC18860u2 r3 = null;
        if (indexOf == -1) {
            return new C31921e1(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            r3 = A0A(trim2);
        }
        return new C31921e1(trim, r3);
    }

    public static Float A0C(String str) {
        try {
            float A012 = A01(str);
            if (A012 < 0.0f) {
                A012 = 0.0f;
            } else if (A012 > 1.0f) {
                A012 = 1.0f;
            }
            return Float.valueOf(A012);
        } catch (C18940uA unused) {
            return null;
        }
    }

    public static String A0D(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }

    public static List A0E(String str) {
        C19010uH r3 = new C19010uH(str);
        ArrayList arrayList = null;
        do {
            String A09 = r3.A09();
            if (A09 == null && (A09 = r3.A0A(',', true)) == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(A09);
            r3.A0D();
        } while (!r3.A0C());
        return arrayList;
    }

    public static List A0F(String str) {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            C19010uH r4 = new C19010uH(str);
            r4.A0B();
            while (!r4.A0C()) {
                float A012 = r4.A01();
                if (Float.isNaN(A012)) {
                    StringBuilder A0S = AnonymousClass008.A0S("Invalid length list value: ");
                    int i = r4.A01;
                    int i2 = i;
                    while (!r4.A0C() && !C19010uH.A00(r4.A03.charAt(i2))) {
                        i2 = r4.A01 + 1;
                        r4.A01 = i2;
                    }
                    A0S.append(r4.A03.substring(i, r4.A01));
                    throw new C18940uA(A0S.toString());
                }
                EnumC18880u4 A062 = r4.A06();
                if (A062 == null) {
                    A062 = EnumC18880u4.px;
                }
                arrayList.add(new C18700tm(A012, A062));
                r4.A0D();
            }
            return arrayList;
        }
        throw new C18940uA("Invalid length list (empty string)");
    }

    public static final void A0G(AnonymousClass2BL r7, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC18990uF.A00(attributes.getLocalName(i)) == EnumC18990uF.points) {
                C19010uH r6 = new C19010uH(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                r6.A0B();
                while (!r6.A0C()) {
                    float A012 = r6.A01();
                    if (!Float.isNaN(A012)) {
                        r6.A0D();
                        float A013 = r6.A01();
                        if (!Float.isNaN(A013)) {
                            r6.A0D();
                            arrayList.add(Float.valueOf(A012));
                            arrayList.add(Float.valueOf(A013));
                        } else {
                            throw new C18940uA(AnonymousClass008.A0L("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                        }
                    } else {
                        throw new C18940uA(AnonymousClass008.A0L("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                }
                r7.A00 = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    r7.A00[i2] = ((Number) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:264:0x040d, code lost:
        if (r12.equals("visible") != false) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0414, code lost:
        if (r12.equals("auto") != false) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0416, code lost:
        r6 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0420, code lost:
        if (r12.equals("scroll") != false) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0429, code lost:
        if (r12.equals("hidden") != false) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x042b, code lost:
        r6 = java.lang.Boolean.FALSE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0H(X.C18820ty r10, java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 1696
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19030uJ.A0H(X.0ty, java.lang.String, java.lang.String):void");
    }

    public static final void A0I(AbstractC18830tz r8, Attributes attributes) {
        Set hashSet;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC18990uF.A00(attributes.getLocalName(i)).ordinal();
            if (ordinal != 73) {
                switch (ordinal) {
                    case 52:
                        C19010uH r3 = new C19010uH(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!r3.A0C()) {
                            String A0A = r3.A0A(' ', false);
                            if (A0A.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet2.add(A0A.substring(35));
                            } else {
                                hashSet2.add("UNSUPPORTED");
                            }
                            r3.A0B();
                        }
                        r8.AOy(hashSet2);
                        continue;
                    case 53:
                        r8.AOx(trim);
                        continue;
                    case 54:
                        C19010uH r2 = new C19010uH(trim);
                        HashSet hashSet3 = new HashSet();
                        while (!r2.A0C()) {
                            hashSet3.add(r2.A0A(' ', false));
                            r2.A0B();
                        }
                        r8.AP0(hashSet3);
                        continue;
                    case 55:
                        List A0E = A0E(trim);
                        if (A0E != null) {
                            hashSet = new HashSet(A0E);
                        } else {
                            hashSet = new HashSet(0);
                        }
                        r8.AOz(hashSet);
                        continue;
                }
            } else {
                C19010uH r4 = new C19010uH(trim);
                HashSet hashSet4 = new HashSet();
                while (!r4.A0C()) {
                    String A0A2 = r4.A0A(' ', false);
                    int indexOf = A0A2.indexOf(45);
                    if (indexOf != -1) {
                        A0A2 = A0A2.substring(0, indexOf);
                    }
                    hashSet4.add(new Locale(A0A2, "", "").getLanguage());
                    r4.A0B();
                }
                r8.AP9(hashSet4);
            }
        }
    }

    public static final void A0J(AbstractC31941e3 r3, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                r3.A03 = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    r3.A02 = Boolean.FALSE;
                    return;
                } else if ("preserve".equals(trim)) {
                    r3.A02 = Boolean.TRUE;
                    return;
                } else {
                    throw new C18940uA(AnonymousClass008.A0K("Invalid value for \"xml:space\" attribute: ", trim));
                }
            }
        }
    }

    public static final void A0K(AbstractC31941e3 r6, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int ordinal = EnumC18990uF.A00(attributes.getLocalName(i)).ordinal();
                if (ordinal == 0) {
                    C31821dr r3 = new C31821dr(trim);
                    ArrayList arrayList = null;
                    while (!r3.A0C()) {
                        String A0A = r3.A0A(' ', false);
                        if (A0A != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(A0A);
                            r3.A0B();
                        }
                    }
                    r6.A04 = arrayList;
                } else if (ordinal == 72) {
                    C19010uH r5 = new C19010uH(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String A0A2 = r5.A0A(':', false);
                        r5.A0B();
                        if (!r5.A0E(':')) {
                            break;
                        }
                        r5.A0B();
                        String A0A3 = r5.A0A(';', true);
                        if (A0A3 == null) {
                            break;
                        }
                        r5.A0B();
                        if (r5.A0C() || r5.A0E(';')) {
                            C18820ty r0 = r6.A01;
                            if (r0 == null) {
                                r0 = new C18820ty();
                                r6.A01 = r0;
                            }
                            A0H(r0, A0A2, A0A3);
                            r5.A0B();
                        }
                    }
                } else {
                    C18820ty r2 = r6.A00;
                    if (r2 == null) {
                        r2 = new C18820ty();
                        r6.A00 = r2;
                    }
                    A0H(r2, attributes.getLocalName(i), attributes.getValue(i).trim());
                }
            }
        }
    }

    public static void A0L(AnonymousClass2AG r5, String str) {
        C19010uH r4 = new C19010uH(str);
        r4.A0B();
        String A0A = r4.A0A(' ', false);
        if ("defer".equals(A0A)) {
            r4.A0B();
            A0A = r4.A0A(' ', false);
        }
        EnumC18620te r3 = (EnumC18620te) C18950uB.A00.get(A0A);
        EnumC18630tf r1 = null;
        r4.A0B();
        if (!r4.A0C()) {
            String A0A2 = r4.A0A(' ', false);
            int hashCode = A0A2.hashCode();
            if (hashCode != 3347527) {
                if (hashCode == 109526418 && A0A2.equals("slice")) {
                    r1 = EnumC18630tf.slice;
                }
            } else if (A0A2.equals("meet")) {
                r1 = EnumC18630tf.meet;
            }
            throw new C18940uA(AnonymousClass008.A0K("Invalid preserveAspectRatio definition: ", str));
        }
        r5.A00 = new C18640tg(r3, r1);
    }

    public static final void A0M(AnonymousClass2BN r7, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC18990uF.A00(attributes.getLocalName(i)).ordinal();
            if (ordinal == 48) {
                A0L(r7, trim);
            } else if (ordinal == 80) {
                C19010uH r0 = new C19010uH(trim);
                r0.A0B();
                float A012 = r0.A01();
                r0.A0D();
                float A013 = r0.A01();
                r0.A0D();
                float A014 = r0.A01();
                r0.A0D();
                float A015 = r0.A01();
                if (Float.isNaN(A012) || Float.isNaN(A013) || Float.isNaN(A014) || Float.isNaN(A015)) {
                    throw new C18940uA("Invalid viewBox definition - should have four numbers");
                } else if (A014 < 0.0f) {
                    throw new C18940uA("Invalid viewBox. width cannot be negative");
                } else if (A015 >= 0.0f) {
                    r7.A00 = new C18660ti(A012, A013, A014, A015);
                } else {
                    throw new C18940uA("Invalid viewBox. height cannot be negative");
                }
            } else {
                continue;
            }
        }
    }

    public static final void A0N(AnonymousClass2BR r4, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC18990uF.A00(attributes.getLocalName(i)).ordinal();
            if (ordinal == 9) {
                r4.A00 = A0F(trim);
            } else if (ordinal == 10) {
                r4.A01 = A0F(trim);
            } else if (ordinal == 82) {
                r4.A02 = A0F(trim);
            } else if (ordinal == 83) {
                r4.A03 = A0F(trim);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:? */
    /* JADX WARNING: Code restructure failed: missing block: B:1000:0x0b3e, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1021:0x0ca8, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1046:0x0ecf, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0498, code lost:
        r34.A08 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:882:0x0f77, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:912:0x026d, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:939:0x0589, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:961:0x0749, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:991:0x0a98, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x09f0  */
    /* JADX WARNING: Removed duplicated region for block: B:980:0x080a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C18890u5 A0P(java.io.InputStream r35) {
        /*
        // Method dump skipped, instructions count: 4618
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19030uJ.A0P(java.io.InputStream):X.0u5");
    }

    public final void A0Q(AbstractC453724m r5, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC18990uF.A00(attributes.getLocalName(i)).ordinal();
            if (ordinal == 23) {
                r5.A00 = A05(trim);
            } else if (ordinal != 24) {
                if (ordinal != 26) {
                    if (ordinal == 60) {
                        try {
                            r5.A01 = EnumC18680tk.valueOf(trim);
                        } catch (IllegalArgumentException unused) {
                            throw new C18940uA(AnonymousClass008.A0L("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                        }
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    r5.A03 = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                r5.A02 = Boolean.FALSE;
            } else if ("userSpaceOnUse".equals(trim)) {
                r5.A02 = Boolean.TRUE;
            } else {
                throw new C18940uA("Invalid value for attribute gradientUnits");
            }
        }
    }

    public final void A0R(AbstractC18690tl r4, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC18990uF.A00(attributes.getLocalName(i)) == EnumC18990uF.transform) {
                r4.APG(A05(attributes.getValue(i)));
            }
        }
    }

    public final void A0S(String str) {
        C18850u1 r2;
        AnonymousClass28U r1 = (AnonymousClass28U) this.A01;
        int size = r1.A01.size();
        if (size == 0) {
            r2 = null;
        } else {
            r2 = (C18850u1) r1.A01.get(size - 1);
        }
        if (r2 instanceof C31951e4) {
            C31951e4 r22 = (C31951e4) r2;
            r22.A00 = AnonymousClass008.A0O(new StringBuilder(), r22.A00, str);
            return;
        }
        this.A01.A1i(new C31951e4(str));
    }
}
