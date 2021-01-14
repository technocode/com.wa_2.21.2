package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1F3  reason: invalid class name */
public class AnonymousClass1F3 {
    public static final C12530iF A0M;
    public static final Pattern A0N = Pattern.compile("\\[([^\\[\\]])*\\]");
    public static final Pattern A0O = Pattern.compile(" ");
    public static final Pattern A0P = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    public static final Pattern A0Q = Pattern.compile("[- ]");
    public static final Pattern A0R = Pattern.compile("\\d(?=[^,}][^,}])");
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public C12530iF A03;
    public C12530iF A04;
    public C12460i8 A05 = new C12460i8(64);
    public String A06 = "";
    public String A07 = "";
    public String A08;
    public String A09 = "";
    public StringBuilder A0A = new StringBuilder();
    public StringBuilder A0B = new StringBuilder();
    public StringBuilder A0C = new StringBuilder();
    public StringBuilder A0D = new StringBuilder();
    public StringBuilder A0E = new StringBuilder();
    public List A0F = new ArrayList();
    public boolean A0G = true;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = false;
    public boolean A0K = false;
    public final C12440i6 A0L = C12440i6.A00();

    static {
        C12530iF r1 = new C12530iF();
        r1.hasInternationalPrefix = true;
        r1.internationalPrefix_ = "NA";
        A0M = r1;
    }

    public AnonymousClass1F3(String str) {
        this.A08 = str;
        C12530iF A002 = A00(str);
        this.A03 = A002;
        this.A04 = A002;
    }

    public final C12530iF A00(String str) {
        int i;
        C12440i6 r4 = this.A0L;
        if (str == null || !r4.A08.contains(str)) {
            Logger logger = C12440i6.A0G;
            Level level = Level.WARNING;
            StringBuilder A0S = AnonymousClass008.A0S("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            A0S.append(str);
            A0S.append(") provided.");
            logger.log(level, A0S.toString());
            i = 0;
        } else {
            C12530iF A0D2 = r4.A0D(str);
            if (A0D2 != null) {
                i = A0D2.countryCode_;
            } else {
                throw new IllegalArgumentException(AnonymousClass008.A0K("Invalid region code: ", str));
            }
        }
        C12530iF A0D3 = r4.A0D(r4.A0F(i));
        if (A0D3 != null) {
            return A0D3;
        }
        return A0M;
    }

    public final String A01() {
        C12530iF r1;
        List<C12540iG> list;
        StringBuilder sb = this.A0D;
        if (sb.length() < 3) {
            return A06(sb.toString());
        }
        String substring = sb.substring(0, 3);
        if (!this.A0I || this.A03.intlNumberFormat_.size() <= 0) {
            r1 = this.A03;
            list = r1.numberFormat_;
        } else {
            r1 = this.A03;
            list = r1.intlNumberFormat_;
        }
        boolean z = r1.hasNationalPrefix;
        for (C12540iG r2 : list) {
            if (z && !this.A0I && !r2.nationalPrefixOptionalWhenFormatting_) {
                if (!C12440i6.A0K.matcher(r2.nationalPrefixFormattingRule_).matches()) {
                }
            }
            if (A0P.matcher(r2.format_).matches()) {
                this.A0F.add(r2);
            }
        }
        A08(substring);
        return A0B() ? A02() : this.A0A.toString();
    }

    public final String A02() {
        String A042;
        int length = this.A0D.length();
        if (length <= 0) {
            return this.A0E.toString();
        }
        int i = 0;
        do {
            A042 = A04(this.A0D.charAt(i));
            i++;
        } while (i < length);
        return this.A0G ? A06(A042) : this.A0A.toString();
    }

    public final String A03() {
        int i = 1;
        if (this.A03.countryCode_ != 1 || this.A0D.charAt(0) != '1' || this.A0D.charAt(1) == '0' || this.A0D.charAt(1) == '1') {
            C12530iF r2 = this.A03;
            if (r2.hasNationalPrefixForParsing) {
                Matcher matcher = this.A05.A00(r2.nationalPrefixForParsing_).matcher(this.A0D);
                if (matcher.lookingAt()) {
                    this.A0I = true;
                    i = matcher.end();
                    this.A0E.append(this.A0D.substring(0, i));
                }
            }
            i = 0;
        } else {
            StringBuilder sb = this.A0E;
            sb.append('1');
            sb.append(' ');
            this.A0I = true;
        }
        String substring = this.A0D.substring(0, i);
        this.A0D.delete(0, i);
        return substring;
    }

    public final String A04(char c) {
        Matcher matcher = A0O.matcher(this.A0C);
        if (matcher.find(this.A00)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.A0C.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.A00 = start;
            return this.A0C.substring(0, start + 1);
        }
        if (this.A0F.size() == 1) {
            this.A0G = false;
        }
        this.A06 = "";
        return this.A0A.toString();
    }

    public final String A05(char c, boolean z) {
        String str;
        StringBuilder sb;
        StringBuilder sb2 = this.A0A;
        sb2.append(c);
        if (z) {
            this.A01 = sb2.length();
        }
        if (Character.isDigit(c) || (this.A0A.length() == 1 && C12440i6.A0N.matcher(Character.toString(c)).matches())) {
            if (c == '+') {
                sb = this.A0B;
                sb.append(c);
            } else {
                c = Character.forDigit(Character.digit(c, 10), 10);
                sb = this.A0B;
                sb.append(c);
                this.A0D.append(c);
            }
            if (z) {
                this.A02 = sb.length();
            }
        } else {
            this.A0G = false;
            this.A0H = true;
        }
        if (this.A0G) {
            int length = this.A0B.length();
            if (length == 0 || length == 1 || length == 2) {
                return this.A0A.toString();
            }
            if (length == 3) {
                if (A0A()) {
                    this.A0J = true;
                } else {
                    this.A09 = A03();
                    return A01();
                }
            }
            if (this.A0J) {
                if (A09()) {
                    this.A0J = false;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append((Object) this.A0E);
                sb3.append(this.A0D.toString());
                return sb3.toString();
            } else if (this.A0F.size() <= 0) {
                return A01();
            } else {
                String A042 = A04(c);
                Iterator it = this.A0F.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    C12540iG r4 = (C12540iG) it.next();
                    Matcher matcher = this.A05.A00(r4.pattern_).matcher(this.A0D);
                    if (matcher.matches()) {
                        this.A0K = A0Q.matcher(r4.nationalPrefixFormattingRule_).find();
                        str = A06(matcher.replaceAll(r4.format_));
                        break;
                    }
                }
                if (str.length() > 0) {
                    return str;
                }
                A08(this.A0D.toString());
                if (A0B()) {
                    return A02();
                }
                return this.A0G ? A06(A042) : this.A0A.toString();
            }
        } else if (this.A0H) {
            return this.A0A.toString();
        } else {
            if (!A0A()) {
                String str2 = this.A09;
                if (str2.length() > 0) {
                    this.A0D.insert(0, str2);
                    this.A0E.setLength(this.A0E.lastIndexOf(this.A09));
                }
                if (!this.A09.equals(A03())) {
                    this.A0E.append(' ');
                    this.A0G = true;
                    this.A0J = false;
                    this.A0F.clear();
                    return A01();
                }
            } else if (A09()) {
                this.A0G = true;
                this.A0J = false;
                this.A0F.clear();
                return A01();
            }
            return this.A0A.toString();
        }
    }

    public final String A06(String str) {
        StringBuilder sb = this.A0E;
        int length = sb.length();
        if (!this.A0K || length <= 0 || sb.charAt(length - 1) == ' ') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) this.A0E);
            sb2.append(str);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(new String(this.A0E));
        sb3.append(' ');
        sb3.append(str);
        return sb3.toString();
    }

    public void A07() {
        this.A07 = "";
        this.A0A.setLength(0);
        this.A0B.setLength(0);
        this.A0C.setLength(0);
        this.A00 = 0;
        this.A06 = "";
        this.A0E.setLength(0);
        this.A09 = "";
        this.A0D.setLength(0);
        this.A0G = true;
        this.A0H = false;
        this.A02 = 0;
        this.A01 = 0;
        this.A0I = false;
        this.A0J = false;
        this.A0F.clear();
        this.A0K = false;
        if (!this.A03.equals(this.A04)) {
            this.A03 = A00(this.A08);
        }
    }

    public final void A08(String str) {
        int length = str.length() - 3;
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            C12540iG r2 = (C12540iG) it.next();
            if (r2.leadingDigitsPattern_.size() > length && !this.A05.A00((String) r2.leadingDigitsPattern_.get(length)).matcher(str).lookingAt()) {
                it.remove();
            }
        }
    }

    public final boolean A09() {
        StringBuilder sb;
        C12440i6 r3;
        int A062;
        StringBuilder sb2 = this.A0D;
        if (sb2.length() == 0 || (A062 = (r3 = this.A0L).A06(sb2, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        this.A0D.setLength(0);
        this.A0D.append((CharSequence) sb);
        String A0F2 = r3.A0F(A062);
        if ("001".equals(A0F2)) {
            this.A03 = r3.A0B(A062);
        } else if (!A0F2.equals(this.A08)) {
            this.A03 = A00(A0F2);
        }
        String num = Integer.toString(A062);
        StringBuilder sb3 = this.A0E;
        sb3.append(num);
        sb3.append(' ');
        return true;
    }

    public final boolean A0A() {
        C12460i8 r2 = this.A05;
        StringBuilder A0S = AnonymousClass008.A0S("\\+|");
        A0S.append(this.A03.internationalPrefix_);
        Matcher matcher = r2.A00(A0S.toString()).matcher(this.A0B);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.A0I = true;
        int end = matcher.end();
        this.A0D.setLength(0);
        this.A0D.append(this.A0B.substring(end));
        this.A0E.setLength(0);
        this.A0E.append(this.A0B.substring(0, end));
        if (this.A0B.charAt(0) != '+') {
            this.A0E.append(' ');
        }
        return true;
    }

    public final boolean A0B() {
        String replaceAll;
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            C12540iG r4 = (C12540iG) it.next();
            String str = r4.pattern_;
            if (this.A06.equals(str)) {
                return false;
            }
            if (str.indexOf(124) == -1) {
                String replaceAll2 = A0R.matcher(A0N.matcher(str).replaceAll("\\\\d")).replaceAll("\\\\d");
                this.A0C.setLength(0);
                String str2 = r4.format_;
                Matcher matcher = this.A05.A00(replaceAll2).matcher("999999999999999");
                matcher.find();
                String group = matcher.group();
                if (group.length() < this.A0D.length()) {
                    replaceAll = "";
                } else {
                    replaceAll = group.replaceAll(replaceAll2, str2).replaceAll("9", " ");
                }
                if (replaceAll.length() > 0) {
                    this.A0C.append(replaceAll);
                    this.A06 = str;
                    this.A0K = A0Q.matcher(r4.nationalPrefixFormattingRule_).find();
                    this.A00 = 0;
                    return true;
                }
            }
            it.remove();
        }
        this.A0G = false;
        return false;
    }
}
