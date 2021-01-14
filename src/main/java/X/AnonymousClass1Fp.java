package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: X.1Fp  reason: invalid class name */
public final class AnonymousClass1Fp extends Enum {
    public static final Map A00 = new HashMap();
    public static final Map A01 = new HashMap();
    public static final /* synthetic */ AnonymousClass1Fp[] A02;
    public static final AnonymousClass1Fp A03;
    public static final AnonymousClass1Fp A04;
    public static final AnonymousClass1Fp A05 = new AnonymousClass1Fp("Cp1250", 17, 21, "windows-1250");
    public static final AnonymousClass1Fp A06 = new AnonymousClass1Fp("Cp1251", 18, 22, "windows-1251");
    public static final AnonymousClass1Fp A07 = new AnonymousClass1Fp("Cp1252", 19, 23, "windows-1252");
    public static final AnonymousClass1Fp A08 = new AnonymousClass1Fp("Cp1256", 20, 24, "windows-1256");
    public static final AnonymousClass1Fp A09 = new AnonymousClass1Fp("Cp437", 0, new int[]{0, 2}, new String[0]);
    public static final AnonymousClass1Fp A0A;
    public static final AnonymousClass1Fp A0B;
    public static final AnonymousClass1Fp A0C = new AnonymousClass1Fp("ISO8859_1", 1, new int[]{1, 3}, "ISO-8859-1");
    public static final AnonymousClass1Fp A0D = new AnonymousClass1Fp("ISO8859_10", 10, 12, "ISO-8859-10");
    public static final AnonymousClass1Fp A0E = new AnonymousClass1Fp("ISO8859_11", 11, 13, "ISO-8859-11");
    public static final AnonymousClass1Fp A0F = new AnonymousClass1Fp("ISO8859_13", 12, 15, "ISO-8859-13");
    public static final AnonymousClass1Fp A0G = new AnonymousClass1Fp("ISO8859_14", 13, 16, "ISO-8859-14");
    public static final AnonymousClass1Fp A0H = new AnonymousClass1Fp("ISO8859_15", 14, 17, "ISO-8859-15");
    public static final AnonymousClass1Fp A0I = new AnonymousClass1Fp("ISO8859_16", 15, 18, "ISO-8859-16");
    public static final AnonymousClass1Fp A0J = new AnonymousClass1Fp("ISO8859_2", 2, 4, "ISO-8859-2");
    public static final AnonymousClass1Fp A0K = new AnonymousClass1Fp("ISO8859_3", 3, 5, "ISO-8859-3");
    public static final AnonymousClass1Fp A0L = new AnonymousClass1Fp("ISO8859_4", 4, 6, "ISO-8859-4");
    public static final AnonymousClass1Fp A0M = new AnonymousClass1Fp("ISO8859_5", 5, 7, "ISO-8859-5");
    public static final AnonymousClass1Fp A0N = new AnonymousClass1Fp("ISO8859_6", 6, 8, "ISO-8859-6");
    public static final AnonymousClass1Fp A0O = new AnonymousClass1Fp("ISO8859_7", 7, 9, "ISO-8859-7");
    public static final AnonymousClass1Fp A0P = new AnonymousClass1Fp("ISO8859_8", 8, 10, "ISO-8859-8");
    public static final AnonymousClass1Fp A0Q = new AnonymousClass1Fp("ISO8859_9", 9, 11, "ISO-8859-9");
    public static final AnonymousClass1Fp A0R = new AnonymousClass1Fp("SJIS", 16, 20, "Shift_JIS");
    public static final AnonymousClass1Fp A0S = new AnonymousClass1Fp("UTF8", 22, 26, "UTF-8");
    public static final AnonymousClass1Fp A0T = new AnonymousClass1Fp("UnicodeBigUnmarked", 21, 25, "UTF-16BE", "UnicodeBig");
    public final String[] otherEncodingNames;
    public final int[] values;

    static {
        AnonymousClass1Fp r3 = new AnonymousClass1Fp("ASCII", 23, new int[]{27, 170}, "US-ASCII");
        A03 = r3;
        AnonymousClass1Fp r18 = new AnonymousClass1Fp();
        A04 = r18;
        AnonymousClass1Fp r17 = new AnonymousClass1Fp("GB18030", 25, 29, "GB2312", "EUC_CN", "GBK");
        A0B = r17;
        AnonymousClass1Fp r14 = new AnonymousClass1Fp("EUC_KR", 26, 30, "EUC-KR");
        A0A = r14;
        A02 = new AnonymousClass1Fp[]{A09, A0C, A0J, A0K, A0L, A0M, A0N, A0O, A0P, A0Q, A0D, A0E, A0F, A0G, A0H, A0I, A0R, A05, A06, A07, A08, A0T, A0S, r3, r18, r17, r14};
        AnonymousClass1Fp[] values2 = values();
        for (AnonymousClass1Fp r5 : values2) {
            for (int i : r5.values) {
                A01.put(Integer.valueOf(i), r5);
            }
            A00.put(r5.name(), r5);
            for (String str : r5.otherEncodingNames) {
                A00.put(str, r5);
            }
        }
    }

    public AnonymousClass1Fp() {
        this.values = new int[]{28};
        this.otherEncodingNames = new String[0];
    }

    public AnonymousClass1Fp(String str, int i, int i2, String... strArr) {
        this.values = new int[]{i2};
        this.otherEncodingNames = strArr;
    }

    public AnonymousClass1Fp(String str, int i, int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }

    public static AnonymousClass1Fp valueOf(String str) {
        return (AnonymousClass1Fp) Enum.valueOf(AnonymousClass1Fp.class, str);
    }

    public static AnonymousClass1Fp[] values() {
        return (AnonymousClass1Fp[]) A02.clone();
    }
}
