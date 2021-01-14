package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0i6  reason: invalid class name and case insensitive filesystem */
public class C12440i6 {
    public static C12440i6 A09;
    public static final String A0A = AnonymousClass008.A0Q(AnonymousClass008.A0a(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[", "xｘ#＃~～", "]|int|anexo|ｉｎｔ)", "[:\\.．]?[  \\t,-]*", "(\\p{Nd}{1,7})"), "#?|", "[- ]+(", "\\p{Nd}", "{1,5})#");
    public static final String A0B;
    public static final String A0C;
    public static final String A0D = AnonymousClass008.A0P(AnonymousClass008.A0S("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*"), A0C, "\\p{Nd}", "]*");
    public static final Map A0E;
    public static final Map A0F;
    public static final Logger A0G = Logger.getLogger(C12440i6.class.getName());
    public static final Pattern A0H = Pattern.compile("(\\p{Nd})");
    public static final Pattern A0I = Pattern.compile("\\$CC");
    public static final Pattern A0J;
    public static final Pattern A0K = Pattern.compile("\\(?\\$1\\)?");
    public static final Pattern A0L = Pattern.compile("(\\$\\d)");
    public static final Pattern A0M = Pattern.compile("(\\D+)");
    public static final Pattern A0N = Pattern.compile("[+＋]+");
    public static final Pattern A0O = Pattern.compile("[\\\\/] *x");
    public static final Pattern A0P = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
    public static final Pattern A0Q = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    public static final Pattern A0R = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    public static final Pattern A0S;
    public static final Pattern A0T = Pattern.compile("[+＋\\p{Nd}]");
    public C12460i8 A00 = new C12460i8(100);
    public AnonymousClass0CO A01;
    public String A02 = "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto";
    public Map A03 = null;
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Map A05 = Collections.synchronizedMap(new HashMap());
    public final Set A06 = new HashSet();
    public final Set A07 = new HashSet(35);
    public final Set A08 = new HashSet(320);

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('0', '0');
        hashMap.put('1', '1');
        hashMap.put('2', '2');
        hashMap.put('3', '3');
        hashMap.put('4', '4');
        hashMap.put('5', '5');
        hashMap.put('6', '6');
        hashMap.put('7', '7');
        hashMap.put('8', '8');
        hashMap.put('9', '9');
        HashMap hashMap2 = new HashMap(40);
        hashMap2.put('A', '2');
        hashMap2.put('B', '2');
        hashMap2.put('C', '2');
        hashMap2.put('D', '3');
        hashMap2.put('E', '3');
        hashMap2.put('F', '3');
        hashMap2.put('G', '4');
        hashMap2.put('H', '4');
        hashMap2.put('I', '4');
        hashMap2.put('J', '5');
        hashMap2.put('K', '5');
        hashMap2.put('L', '5');
        hashMap2.put('M', '6');
        hashMap2.put('N', '6');
        hashMap2.put('O', '6');
        hashMap2.put('P', '7');
        hashMap2.put('Q', '7');
        hashMap2.put('R', '7');
        hashMap2.put('S', '7');
        hashMap2.put('T', '8');
        hashMap2.put('U', '8');
        hashMap2.put('V', '8');
        hashMap2.put('W', '9');
        hashMap2.put('X', '9');
        hashMap2.put('Y', '9');
        hashMap2.put('Z', '9');
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
        A0E = unmodifiableMap;
        HashMap hashMap3 = new HashMap(100);
        hashMap3.putAll(unmodifiableMap);
        hashMap3.putAll(hashMap);
        A0F = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.putAll(hashMap);
        hashMap4.put('+', '+');
        hashMap4.put('*', '*');
        Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        for (Character ch : A0E.keySet()) {
            char charValue = ch.charValue();
            Character valueOf = Character.valueOf(Character.toLowerCase(charValue));
            Character valueOf2 = Character.valueOf(charValue);
            hashMap5.put(valueOf, valueOf2);
            hashMap5.put(valueOf2, valueOf2);
        }
        hashMap5.putAll(hashMap);
        hashMap5.put('-', '-');
        hashMap5.put((char) 65293, '-');
        hashMap5.put((char) 8208, '-');
        hashMap5.put((char) 8209, '-');
        hashMap5.put((char) 8210, '-');
        hashMap5.put((char) 8211, '-');
        hashMap5.put((char) 8212, '-');
        hashMap5.put((char) 8213, '-');
        hashMap5.put((char) 8722, '-');
        hashMap5.put('/', '/');
        hashMap5.put((char) 65295, '/');
        hashMap5.put(' ', ' ');
        hashMap5.put((char) 12288, ' ');
        hashMap5.put((char) 8288, ' ');
        hashMap5.put('.', '.');
        hashMap5.put((char) 65294, '.');
        Collections.unmodifiableMap(hashMap5);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(A0E.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(A0E.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        A0C = sb.toString();
        String A0Q2 = AnonymousClass008.A0Q(AnonymousClass008.A0a(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[", ",xｘ#＃~～", "]|int|anexo|ｉｎｔ)", "[:\\.．]?[  \\t,-]*", "(\\p{Nd}{1,7})"), "#?|", "[- ]+(", "\\p{Nd}", "{1,5})#");
        A0B = A0Q2;
        StringBuilder A0S2 = AnonymousClass008.A0S("(?:");
        A0S2.append(A0Q2);
        A0S2.append(")$");
        A0J = Pattern.compile(A0S2.toString(), 66);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A0D);
        sb2.append("(?:");
        sb2.append(A0B);
        sb2.append(")?");
        A0S = Pattern.compile(sb2.toString(), 66);
        Pattern.compile("\\$NP");
        Pattern.compile("\\$FG");
    }

    public C12440i6(AnonymousClass0CO r3) {
        this.A01 = r3;
    }

    public static synchronized C12440i6 A00() {
        synchronized (C12440i6.class) {
            C12440i6 r0 = A09;
            if (r0 != null) {
                return r0;
            }
            Map A1H = C001801b.A1H();
            if (A09 == null) {
                C12440i6 r3 = new C12440i6(AnonymousClass0CO.A00());
                A09 = r3;
                r3.A03 = A1H;
                r3.A02 = "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto";
                for (Map.Entry entry : A1H.entrySet()) {
                    List list = (List) entry.getValue();
                    if (list.size() != 1 || !"001".equals(list.get(0))) {
                        r3.A08.addAll(list);
                    } else {
                        r3.A06.add(entry.getKey());
                    }
                }
                if (r3.A08.remove("001")) {
                    A0G.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
                }
                r3.A07.addAll((Collection) r3.A03.get(1));
            }
            return A09;
        }
    }

    public static String A01(C12490iB r3) {
        String str;
        if (r3.italianLeadingZero_) {
            str = "0";
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(r3.nationalNumber_);
        return sb.toString();
    }

    public static StringBuilder A02(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            int digit = Character.digit(c, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (z) {
                sb.append(c);
            }
        }
        return sb;
    }

    public static final void A03(int i, EnumC12560iI r5, StringBuilder sb) {
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            sb.insert(0, i);
            sb.insert(0, '+');
        } else if (ordinal == 1) {
            sb.insert(0, " ");
            sb.insert(0, i);
            sb.insert(0, '+');
        } else if (ordinal == 3) {
            sb.insert(0, "-");
            sb.insert(0, i);
            sb.insert(0, '+');
            sb.insert(0, "tel:");
        }
    }

    public static void A04(StringBuilder sb) {
        String str;
        String obj = sb.toString();
        if (A0R.matcher(obj).matches()) {
            Map map = A0F;
            int length = obj.length();
            StringBuilder sb2 = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                Object obj2 = map.get(Character.valueOf(Character.toUpperCase(obj.charAt(i))));
                if (obj2 != null) {
                    sb2.append(obj2);
                }
            }
            str = sb2.toString();
        } else {
            str = A02(obj, false).toString();
        }
        sb.replace(0, sb.length(), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0101, code lost:
        if (r1 == X.AnonymousClass1FD.A03) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A05(java.lang.String r10, X.C12530iF r11, java.lang.StringBuilder r12, boolean r13, X.C12490iB r14) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12440i6.A05(java.lang.String, X.0iF, java.lang.StringBuilder, boolean, X.0iB):int");
    }

    public int A06(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            int i = 1;
            while (i <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i));
                if (!this.A03.containsKey(Integer.valueOf(parseInt))) {
                    i++;
                    if (i > 3) {
                        break;
                    }
                } else {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    public AnonymousClass1FB A07(C12490iB r9, C12490iB r10) {
        AnonymousClass1FB r7 = AnonymousClass1FB.SHORT_NSN_MATCH;
        AnonymousClass1FB r6 = AnonymousClass1FB.NO_MATCH;
        C12490iB r4 = new C12490iB();
        r4.A00(r9);
        C12490iB r3 = new C12490iB();
        r3.A00(r10);
        r4.hasRawInput = false;
        r4.rawInput_ = "";
        r4.hasCountryCodeSource = false;
        EnumC12500iC r0 = EnumC12500iC.FROM_NUMBER_WITH_PLUS_SIGN;
        r4.countryCodeSource_ = r0;
        r4.hasPreferredDomesticCarrierCode = false;
        r4.preferredDomesticCarrierCode_ = "";
        r3.hasRawInput = false;
        r3.rawInput_ = "";
        r3.hasCountryCodeSource = false;
        r3.countryCodeSource_ = r0;
        r3.hasPreferredDomesticCarrierCode = false;
        r3.preferredDomesticCarrierCode_ = "";
        if (r4.hasExtension && r4.extension_.length() == 0) {
            r4.hasExtension = false;
            r4.extension_ = "";
        }
        boolean z = r3.hasExtension;
        if (z && r3.extension_.length() == 0) {
            r3.hasExtension = false;
            z = false;
            r3.extension_ = "";
        }
        if (r4.hasExtension && z && !r4.extension_.equals(r3.extension_)) {
            return r6;
        }
        int i = r4.countryCode_;
        int i2 = r3.countryCode_;
        if (i == 0 || i2 == 0) {
            r4.hasCountryCode = true;
            r4.countryCode_ = i2;
            if (r4.A01(r3)) {
                return AnonymousClass1FB.NSN_MATCH;
            }
            String valueOf = String.valueOf(r4.nationalNumber_);
            String valueOf2 = String.valueOf(r3.nationalNumber_);
            return (valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf)) ? r7 : r6;
        } else if (r4.A01(r3)) {
            return AnonymousClass1FB.EXACT_MATCH;
        } else {
            if (i == i2) {
                String valueOf3 = String.valueOf(r4.nationalNumber_);
                String valueOf4 = String.valueOf(r3.nationalNumber_);
                if (valueOf3.endsWith(valueOf4) || valueOf4.endsWith(valueOf3)) {
                    return r7;
                }
            }
            return r6;
        }
    }

    public AnonymousClass1FB A08(C12490iB r10, String str) {
        try {
            return A07(r10, A0E(str, "ZZ"));
        } catch (AnonymousClass1F5 e) {
            if (e.errorType == EnumC12510iD.INVALID_COUNTRY_CODE) {
                String A0F2 = A0F(r10.countryCode_);
                try {
                    if (!A0F2.equals("ZZ")) {
                        AnonymousClass1FB A072 = A07(r10, A0E(str, A0F2));
                        return A072 == AnonymousClass1FB.EXACT_MATCH ? AnonymousClass1FB.NSN_MATCH : A072;
                    }
                    C12490iB r8 = new C12490iB();
                    A0J(str, null, false, false, r8);
                    return A07(r10, r8);
                } catch (AnonymousClass1F5 unused) {
                    return AnonymousClass1FB.NOT_A_NUMBER;
                }
            }
            return AnonymousClass1FB.NOT_A_NUMBER;
        }
    }

    public final AnonymousClass1FC A09(String str, C12530iF r6) {
        AnonymousClass1FC r3 = AnonymousClass1FC.FIXED_LINE_OR_MOBILE;
        AnonymousClass1FC r2 = AnonymousClass1FC.UNKNOWN;
        C12550iH r1 = r6.generalDesc_;
        if (r1.hasNationalNumberPattern && A0L(str, r1)) {
            if (A0L(str, r6.personalNumber_)) {
                return AnonymousClass1FC.PERSONAL_NUMBER;
            }
            if (A0L(str, r6.tollFree_)) {
                return AnonymousClass1FC.TOLL_FREE;
            }
            if (A0L(str, r6.sharedCost_)) {
                return AnonymousClass1FC.SHARED_COST;
            }
            if (A0L(str, r6.voip_)) {
                return AnonymousClass1FC.VOIP;
            }
            if (A0L(str, r6.premiumRate_)) {
                return AnonymousClass1FC.PREMIUM_RATE;
            }
            if (A0L(str, r6.pager_)) {
                return AnonymousClass1FC.PAGER;
            }
            if (A0L(str, r6.uan_)) {
                return AnonymousClass1FC.UAN;
            }
            if (A0L(str, r6.voicemail_)) {
                return AnonymousClass1FC.VOICEMAIL;
            }
            if (A0L(str, r6.fixedLine_)) {
                if (!r6.sameMobileAndFixedLinePattern_ && !A0L(str, r6.mobile_)) {
                    return AnonymousClass1FC.FIXED_LINE;
                }
                return r3;
            } else if (!r6.sameMobileAndFixedLinePattern_ && A0L(str, r6.mobile_)) {
                return AnonymousClass1FC.MOBILE;
            }
        }
        return r2;
    }

    public C12540iG A0A(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12540iG r3 = (C12540iG) it.next();
            int size = r3.leadingDigitsPattern_.size();
            if (size != 0) {
                if (!this.A00.A00((String) r3.leadingDigitsPattern_.get(size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (this.A00.A00(r3.pattern_).matcher(str).matches()) {
                return r3;
            }
        }
        return null;
    }

    public C12530iF A0B(int i) {
        Map map = this.A04;
        synchronized (map) {
            Map map2 = this.A03;
            Integer valueOf = Integer.valueOf(i);
            if (!map2.containsKey(valueOf)) {
                return null;
            }
            if (!map.containsKey(valueOf)) {
                A0I("001", i);
            }
            return (C12530iF) map.get(valueOf);
        }
    }

    public final C12530iF A0C(int i, String str) {
        if ("001".equals(str)) {
            return A0B(i);
        }
        return A0D(str);
    }

    public C12530iF A0D(String str) {
        if (str == null || !this.A08.contains(str)) {
            return null;
        }
        Map map = this.A05;
        synchronized (map) {
            if (!map.containsKey(str)) {
                A0I(str, 0);
            }
        }
        return (C12530iF) map.get(str);
    }

    public C12490iB A0E(String str, String str2) {
        C12490iB r5 = new C12490iB();
        A0J(str, str2, false, true, r5);
        return r5;
    }

    public String A0F(int i) {
        List list = (List) this.A03.get(Integer.valueOf(i));
        if (list == null) {
            return "ZZ";
        }
        return (String) list.get(0);
    }

    public String A0G(C12490iB r7, EnumC12560iI r8) {
        List list;
        if (r7.nationalNumber_ == 0 && r7.hasRawInput) {
            String str = r7.rawInput_;
            if (str.length() > 0) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        EnumC12560iI r1 = EnumC12560iI.E164;
        sb.setLength(0);
        int i = r7.countryCode_;
        String A012 = A01(r7);
        if (r8 == r1) {
            sb.append(A012);
            A03(i, r1, sb);
        } else if (!this.A03.containsKey(Integer.valueOf(i))) {
            sb.append(A012);
        } else {
            C12530iF A0C2 = A0C(i, A0F(i));
            if (A0C2 != null) {
                if (A0C2.intlNumberFormat_.size() == 0 || r8 == EnumC12560iI.NATIONAL) {
                    list = A0C2.numberFormat_;
                } else {
                    list = A0C2.intlNumberFormat_;
                }
                C12540iG A0A2 = A0A(list, A012);
                if (A0A2 != null) {
                    A012 = A0H(A012, A0A2, r8);
                }
                sb.append(A012);
                if (r7.hasExtension) {
                    String str2 = r7.extension_;
                    if (str2.length() > 0) {
                        if (r8 == EnumC12560iI.RFC3966) {
                            sb.append(";ext=");
                            sb.append(str2);
                        } else if (A0C2.hasPreferredExtnPrefix) {
                            sb.append(A0C2.preferredExtnPrefix_);
                            sb.append(str2);
                        } else {
                            sb.append(" ext. ");
                            sb.append(str2);
                        }
                    }
                }
                A03(i, r8, sb);
            } else {
                throw null;
            }
        }
        return sb.toString();
    }

    public final String A0H(String str, C12540iG r7, EnumC12560iI r8) {
        String replaceAll;
        EnumC12560iI r4 = EnumC12560iI.NATIONAL;
        String str2 = r7.format_;
        Matcher matcher = this.A00.A00(r7.pattern_).matcher(str);
        String str3 = r7.nationalPrefixFormattingRule_;
        if (r8 != r4 || str3 == null || str3.length() <= 0) {
            replaceAll = matcher.replaceAll(str2);
        } else {
            replaceAll = matcher.replaceAll(A0L.matcher(str2).replaceFirst(str3));
        }
        if (r8 != EnumC12560iI.RFC3966) {
            return replaceAll;
        }
        Matcher matcher2 = A0P.matcher(replaceAll);
        if (matcher2.lookingAt()) {
            replaceAll = matcher2.replaceFirst("");
        }
        return matcher2.reset(replaceAll).replaceAll("-");
    }

    public void A0I(String str, int i) {
        boolean equals = "001".equals(str);
        C12520iE A012 = this.A01.A01(str);
        if (A012 != null) {
            C12530iF r2 = new C12530iF();
            String str2 = A012.A02;
            r2.hasId = true;
            r2.id_ = str2;
            int i2 = A012.A00;
            r2.hasCountryCode = true;
            r2.countryCode_ = i2;
            String str3 = A012.A01;
            r2.hasInternationalPrefix = true;
            r2.internationalPrefix_ = str3;
            LinkedList linkedList = new LinkedList();
            String[] strArr = A012.A0A;
            if (strArr != null) {
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    C12540iG r9 = new C12540iG();
                    String str4 = strArr[i3];
                    r9.hasPattern = true;
                    r9.pattern_ = str4;
                    String str5 = A012.A08[i3];
                    r9.hasFormat = true;
                    r9.format_ = str5;
                    String[] strArr2 = A012.A09;
                    if (strArr2 != null && i3 < strArr2.length && strArr2[i3] != null && !strArr2[i3].equals("N/A")) {
                        String[] split = TextUtils.split(strArr2[i3], "#");
                        for (String str6 : split) {
                            if (str6 != null) {
                                r9.leadingDigitsPattern_.add(str6);
                            } else {
                                throw null;
                            }
                        }
                        continue;
                    }
                    r2.intlNumberFormat_.add(r9);
                    r2.numberFormat_.add(r9);
                    StringBuilder sb = new StringBuilder("(");
                    sb.append(r9.pattern_);
                    sb.append(")");
                    linkedList.add(sb.toString());
                }
            }
            C12550iH r1 = new C12550iH();
            String join = TextUtils.join("|", linkedList);
            r1.hasNationalNumberPattern = true;
            r1.nationalNumberPattern_ = join;
            r1.hasPossibleNumberPattern = true;
            r1.possibleNumberPattern_ = join;
            r2.hasGeneralDesc = true;
            r2.generalDesc_ = r1;
            r2.hasPersonalNumber = true;
            r2.personalNumber_ = r1;
            if (equals) {
                this.A04.put(Integer.valueOf(i), r2);
            } else {
                this.A05.put(str, r2);
            }
        } else {
            throw new RuntimeException(AnonymousClass008.A0K("empty metadata: ", str));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(java.lang.String r21, java.lang.String r22, boolean r23, boolean r24, X.C12490iB r25) {
        /*
        // Method dump skipped, instructions count: 587
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12440i6.A0J(java.lang.String, java.lang.String, boolean, boolean, X.0iB):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (r1 != r0.countryCode_) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(X.C12490iB r10) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12440i6.A0K(X.0iB):boolean");
    }

    public final boolean A0L(String str, C12550iH r5) {
        return this.A00.A00(r5.possibleNumberPattern_).matcher(str).matches() && this.A00.A00(r5.nationalNumberPattern_).matcher(str).matches();
    }

    public boolean A0M(StringBuilder sb, C12530iF r12, StringBuilder sb2) {
        int length = sb.length();
        String str = r12.nationalPrefixForParsing_;
        if (!(length == 0 || str.length() == 0)) {
            Matcher matcher = this.A00.A00(str).matcher(sb);
            if (matcher.lookingAt()) {
                Pattern A002 = this.A00.A00(r12.generalDesc_.nationalNumberPattern_);
                boolean matches = A002.matcher(sb).matches();
                int groupCount = matcher.groupCount();
                String str2 = r12.nationalPrefixTransformRule_;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (matches && !A002.matcher(sb3.toString()).matches()) {
                        return false;
                    }
                    if (sb2 != null && groupCount > 1) {
                        sb2.append(matcher.group(1));
                    }
                    sb.replace(0, sb.length(), sb3.toString());
                    return true;
                } else if (matches && !A002.matcher(sb.substring(matcher.end())).matches()) {
                    return false;
                } else {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }
}
