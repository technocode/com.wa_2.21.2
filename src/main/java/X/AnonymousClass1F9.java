package X;

import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1F9  reason: invalid class name */
public final class AnonymousClass1F9 implements Iterator {
    public static final Pattern A08;
    public static final Pattern A09;
    public static final Pattern A0A;
    public static final Pattern A0B;
    public static final Pattern A0C = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    public static final Pattern A0D = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    public static final Pattern A0E = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d [0-2]\\d$");
    public static final Pattern A0F = Pattern.compile(":[0-5]\\d");
    public int A00 = 0;
    public long A01;
    public AnonymousClass1F6 A02 = null;
    public AnonymousClass1F8 A03 = AnonymousClass1F8.NOT_READY;
    public final AnonymousClass1FA A04;
    public final C12440i6 A05;
    public final CharSequence A06;
    public final String A07;

    static {
        String A012 = A01(0, 3);
        StringBuilder A0a = AnonymousClass008.A0a("(?:[", "(\\[（［", "])?", "(?:", "[^(\\[（［)\\]）］]");
        AnonymousClass008.A1Y(A0a, "+", "[", ")\\]）］", "])?");
        AnonymousClass008.A1Y(A0a, "[^(\\[（［)\\]）］]", "+", "(?:[", "(\\[（［");
        AnonymousClass008.A1Y(A0a, "]", "[^(\\[（［)\\]）］]", "+[", ")\\]）］");
        A0a.append("])");
        A0a.append(A012);
        A0a.append("[^(\\[（［)\\]）］]");
        A0a.append("*");
        A0A = Pattern.compile(A0a.toString());
        String A013 = A01(0, 2);
        String A014 = A01(0, 4);
        String A015 = A01(0, 19);
        String A0K = AnonymousClass008.A0K("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]", A014);
        StringBuilder A0S = AnonymousClass008.A0S("\\p{Nd}");
        A0S.append(A01(1, 19));
        String obj = A0S.toString();
        String A0L = AnonymousClass008.A0L("[", "(\\[（［+＋", "]");
        A09 = Pattern.compile(A0L);
        StringBuilder sb = new StringBuilder("\\p{Z}[^");
        sb.append("(\\[（［+＋");
        sb.append("\\p{Nd}]*");
        A08 = Pattern.compile(sb.toString());
        StringBuilder A0a2 = AnonymousClass008.A0a("(?:", A0L, A0K, ")", A013);
        AnonymousClass008.A1Y(A0a2, obj, "(?:", A0K, obj);
        A0a2.append(")");
        A0a2.append(A015);
        A0a2.append("(?:");
        A0a2.append(C12440i6.A0A);
        A0a2.append(")?");
        A0B = Pattern.compile(A0a2.toString(), 66);
    }

    public AnonymousClass1F9(C12440i6 r4, CharSequence charSequence, String str, AnonymousClass1FA r7) {
        this.A05 = r4;
        this.A06 = charSequence == null ? "" : charSequence;
        this.A07 = str;
        this.A04 = r7;
        this.A01 = Long.MAX_VALUE;
    }

    public static CharSequence A00(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    public static String A01(int i, int i2) {
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder("{");
            sb.append(i);
            sb.append(",");
            sb.append(i2);
            sb.append("}");
            return sb.toString();
        }
        throw new IllegalArgumentException();
    }

    public static boolean A02(char c) {
        if (!Character.isLetter(c) && Character.getType(c) != 6) {
            return false;
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        if (of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
            return true;
        }
        return false;
    }

    public static boolean A03(C12490iB r5, C12440i6 r6) {
        C12530iF A0D2;
        C12540iG A0A2;
        if (!(r5.countryCodeSource_ != EnumC12500iC.FROM_DEFAULT_COUNTRY || (A0D2 = r6.A0D(r6.A0F(r5.countryCode_))) == null || (A0A2 = r6.A0A(A0D2.numberFormat_, C12440i6.A01(r5))) == null)) {
            String str = A0A2.nationalPrefixFormattingRule_;
            if (str.length() <= 0 || A0A2.nationalPrefixOptionalWhenFormatting_ || C12440i6.A02(str.substring(0, str.indexOf("$1")), false).toString().length() == 0) {
                return true;
            }
            return r6.A0M(new StringBuilder(C12440i6.A02(r5.rawInput_, false).toString()), A0D2, null);
        }
        return true;
    }

    public static boolean A04(C12490iB r7, String str, C12440i6 r9) {
        int i = 0;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt == 'X') {
                int i2 = i + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'x' || charAt2 == 'X') {
                    if (r9.A08(r7, str.substring(i2)) != AnonymousClass1FB.NSN_MATCH) {
                        return false;
                    }
                    i = i2;
                } else if (!C12440i6.A02(str.substring(i), false).toString().equals(r7.extension_)) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.C12490iB r9, java.lang.String r10, X.C12440i6 r11, X.AnonymousClass1F7 r12) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1F9.A05(X.0iB, java.lang.String, X.0i6, X.1F7):boolean");
    }

    public static String[] A06(C12440i6 r4, C12490iB r5, C12540iG r6) {
        EnumC12560iI r1 = EnumC12560iI.RFC3966;
        if (r6 != null) {
            return r4.A0H(C12440i6.A01(r5), r6, r1).split("-");
        }
        String A0G = r4.A0G(r5, r1);
        int indexOf = A0G.indexOf(59);
        if (indexOf < 0) {
            indexOf = A0G.length();
        }
        return A0G.substring(A0G.indexOf(45) + 1, indexOf).split("-");
    }

    public final AnonymousClass1F6 A07(String str, int i) {
        char charAt;
        char charAt2;
        try {
            if (!A0A.matcher(str).matches()) {
                return null;
            }
            AnonymousClass1FA r3 = this.A04;
            if (r3.compareTo((Enum) AnonymousClass1FA.A04) >= 0) {
                if (i > 0 && !A09.matcher(str).lookingAt() && ((charAt2 = this.A06.charAt(i - 1)) == '%' || Character.getType(charAt2) == 26 || A02(charAt2))) {
                    return null;
                }
                int length = str.length() + i;
                CharSequence charSequence = this.A06;
                if (length < charSequence.length() && ((charAt = charSequence.charAt(length)) == '%' || Character.getType(charAt) == 26 || A02(charAt))) {
                    return null;
                }
            }
            C12440i6 r5 = this.A05;
            String str2 = this.A07;
            C12490iB r10 = new C12490iB();
            r5.A0J(str, str2, true, true, r10);
            if (r3.A00(r10, str, r5)) {
                r10.hasCountryCodeSource = false;
                r10.countryCodeSource_ = EnumC12500iC.FROM_NUMBER_WITH_PLUS_SIGN;
                r10.hasRawInput = false;
                r10.rawInput_ = "";
                r10.hasPreferredDomesticCarrierCode = false;
                r10.preferredDomesticCarrierCode_ = "";
                return new AnonymousClass1F6(i, str, r10);
            }
            return null;
        } catch (AnonymousClass1F5 unused) {
        }
    }

    public boolean hasNext() {
        AnonymousClass1F6 r0;
        AnonymousClass1F8 r6 = AnonymousClass1F8.READY;
        AnonymousClass1F8 r1 = this.A03;
        boolean z = false;
        z = false;
        if (r1 == AnonymousClass1F8.NOT_READY) {
            int i = this.A00;
            Pattern pattern = A0B;
            CharSequence charSequence = this.A06;
            Matcher matcher = pattern.matcher(charSequence);
            while (true) {
                if (this.A01 <= 0 || !matcher.find(i)) {
                    r0 = null;
                } else {
                    int start = matcher.start();
                    CharSequence A002 = A00(C12440i6.A0O, charSequence.subSequence(start, matcher.end()));
                    if (!A0C.matcher(A002).find() && !A0D.matcher(A002).find()) {
                        if (A0E.matcher(A002).find()) {
                            if (A0F.matcher(charSequence.toString().substring(A002.length() + start)).lookingAt()) {
                                continue;
                            }
                        }
                        String charSequence2 = A002.toString();
                        r0 = A07(charSequence2, start);
                        if (r0 != null) {
                            break;
                        }
                        Matcher matcher2 = A08.matcher(charSequence2);
                        if (matcher2.find()) {
                            int start2 = matcher2.start();
                            int i2 = z ? 1 : 0;
                            int i3 = z ? 1 : 0;
                            int i4 = z ? 1 : 0;
                            int i5 = z ? 1 : 0;
                            int i6 = z ? 1 : 0;
                            int i7 = z ? 1 : 0;
                            int i8 = z ? 1 : 0;
                            String substring = charSequence2.substring(i2, start2);
                            Pattern pattern2 = C12440i6.A0Q;
                            CharSequence A003 = A00(pattern2, substring);
                            r0 = A07(A003.toString(), start);
                            if (r0 != null) {
                                break;
                            }
                            this.A01--;
                            int end = matcher2.end();
                            r0 = A07(A00(pattern2, charSequence2.substring(end)).toString(), start + end);
                            if (r0 != null) {
                                break;
                            }
                            long j = this.A01 - 1;
                            this.A01 = j;
                            if (j > 0) {
                                while (matcher2.find()) {
                                    end = matcher2.start();
                                }
                                z = false;
                                z = false;
                                z = false;
                                CharSequence A004 = A00(pattern2, charSequence2.substring(0, end));
                                if (!A004.equals(A003)) {
                                    r0 = A07(A004.toString(), start);
                                    if (r0 != null) {
                                        break;
                                    }
                                    this.A01--;
                                } else {
                                    continue;
                                }
                            } else {
                                z = false;
                            }
                        } else {
                            continue;
                        }
                    }
                    i = start + A002.length();
                    this.A01--;
                }
            }
            this.A02 = r0;
            if (r0 == null) {
                r1 = AnonymousClass1F8.DONE;
                this.A03 = r1;
            } else {
                this.A00 = r0.A02.length() + r0.A00;
                this.A03 = r6;
                r1 = r6;
            }
        }
        if (r1 == r6) {
            return true;
        }
        return z;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            AnonymousClass1F6 r1 = this.A02;
            this.A02 = null;
            this.A03 = AnonymousClass1F8.NOT_READY;
            return r1;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
