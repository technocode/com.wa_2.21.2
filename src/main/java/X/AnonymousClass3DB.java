package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3DB  reason: invalid class name */
public class AnonymousClass3DB {
    public static final HashSet A0J = new HashSet(Arrays.asList("7BIT", "8BIT", "QUOTED-PRINTABLE", "BASE64", "B"));
    public static final HashSet A0K = new HashSet(Arrays.asList("BEGIN", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER"));
    public static final HashSet A0L = new HashSet(Arrays.asList("DOM", "INTL", "POSTAL", "PARCEL", "HOME", "WORK", "PREF", "VOICE", "FAX", "MSG", "CELL", "PAGER", "BBS", "MODEM", "CAR", "ISDN", "VIDEO", "AOL", "APPLELINK", "ATTMAIL", "CIS", "EWORLD", "INTERNET", "IBMMAIL", "MCIMAIL", "POWERSHARE", "PRODIGY", "TLX", "X400", "GIF", "CGM", "WMF", "BMP", "MET", "PMB", "DIB", "PICT", "TIFF", "PDF", "PS", "JPEG", "QTIME", "MPEG", "MPEG2", "AVI", "WAVE", "AIFF", "PCM", "X509", "PGP"));
    public static final HashSet A0M = new HashSet(Arrays.asList("INLINE", "URL", "CONTENT-ID", "CID"));
    public static final Pattern A0N = Pattern.compile("type=(.*?)[:;]");
    public static final Pattern A0O = Pattern.compile("waid=(.*?)[:;]");
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public String A0C = null;
    public String A0D;
    public String A0E;
    public HashSet A0F = new HashSet();
    public AnonymousClass3XG A0G = null;
    public AnonymousClass3D9 A0H;
    public boolean A0I = false;

    public static String A00(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        StringBuilder A0S = AnonymousClass008.A0S("matcher should have found ");
        A0S.append(pattern.pattern());
        A0S.append(" entry in vCard for line: ");
        A0S.append(str);
        Log.d(A0S.toString());
        return null;
    }

    public String A01() {
        if (!(this instanceof AnonymousClass3XK)) {
            return this.A0H.readLine();
        }
        AnonymousClass3XK r2 = (AnonymousClass3XK) this;
        String str = r2.A00;
        if (str == null) {
            return r2.A0H.readLine();
        }
        r2.A00 = null;
        return str;
    }

    public String A02() {
        if (this instanceof AnonymousClass3XK) {
            AnonymousClass3XK r6 = (AnonymousClass3XK) this;
            if (r6.A0I) {
                r6.A0I = false;
                return r6.A0D;
            }
            while (true) {
                StringBuilder sb = null;
                while (true) {
                    String readLine = r6.A0H.readLine();
                    if (readLine != null) {
                        int length = readLine.length();
                        if (length == 0 || length > 16384) {
                            if (sb != null) {
                                return sb.toString();
                            }
                            String str = r6.A00;
                            if (str != null) {
                                r6.A00 = null;
                                return str;
                            }
                        } else if (readLine.charAt(0) != ' ' && readLine.charAt(0) != '\t') {
                            String str2 = r6.A00;
                            r6.A00 = readLine;
                            if (str2 != null) {
                                return str2;
                            }
                            if (sb != null) {
                                return sb.toString();
                            }
                        } else if (sb != null) {
                            sb.append(readLine.substring(1));
                            if (sb.length() > 16384) {
                                break;
                            }
                        } else {
                            String str3 = r6.A00;
                            if (str3 != null) {
                                sb = new StringBuilder();
                                sb.append(str3);
                                r6.A00 = null;
                                sb.append(readLine.substring(1));
                                if (sb.length() > 16384) {
                                    break;
                                }
                            } else {
                                throw new AnonymousClass3D8("Space exists at the beginning of the line");
                            }
                        }
                    } else if (sb != null) {
                        return sb.toString();
                    } else {
                        String str4 = r6.A00;
                        if (str4 != null) {
                            r6.A00 = null;
                            return str4;
                        }
                        throw new AnonymousClass3D8("Reached end of buffer.");
                    }
                }
            }
        } else if (this.A0I) {
            this.A0I = false;
            return this.A0D;
        } else {
            String A012 = A01();
            if (A012 == null) {
                throw new AnonymousClass3D8("Reached end of buffer.");
            } else if (A012.length() >= 16384 || A012.trim().length() <= 0) {
                return A02();
            } else {
                return A012;
            }
        }
    }

    public String A03(String str) {
        if (!str.trim().endsWith("=")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, (str.length() - 1) + 1));
        sb.append("\r\n");
        while (true) {
            String A012 = A01();
            if (A012 == null) {
                throw new AnonymousClass3D8("File ended during parsing quoted-printable String");
            } else if (A012.trim().endsWith("=")) {
                sb.append(A012.substring(0, (A012.length() - 1) + 1));
                sb.append("\r\n");
            } else {
                sb.append(A012);
                return sb.toString();
            }
        }
    }

    public final String A04(String str, String str2) {
        String A022;
        boolean z = true;
        int indexOf = str.indexOf(".") + 1;
        if (indexOf <= 0) {
            return null;
        }
        if (this.A0I) {
            A022 = this.A0D;
        } else {
            A022 = A02();
            this.A0D = A022;
            if (A022 != null && A022.trim().length() > 0) {
                this.A0I = true;
            }
            return null;
        }
        if (A022 == null || A022.length() <= indexOf || !str.substring(0, indexOf).equals(A022.substring(0, indexOf))) {
            return null;
        }
        if (str2 != null) {
            if (A022.charAt(indexOf - 1) != '.') {
                z = false;
            }
            AnonymousClass00E.A07(z);
            int lastIndexOf = A022.lastIndexOf(":");
            if (lastIndexOf < indexOf || !str2.equals(A022.substring(indexOf, lastIndexOf))) {
                return null;
            }
        }
        this.A0I = false;
        return A022;
    }

    public void A05(String str) {
        boolean contains;
        String[] split = str.split("=", 2);
        if (split.length == 2) {
            String trim = split[0].trim();
            String trim2 = split[1].trim();
            if (trim.equalsIgnoreCase("TYPE")) {
                A06(trim2);
            } else if (trim.equals("VALUE")) {
                if (A0M.contains(trim2.toUpperCase(Locale.US)) || trim2.startsWith("X-")) {
                    AnonymousClass3XG r0 = this.A0G;
                    if (r0 != null) {
                        r0.A01 = "VALUE";
                        r0.A00(trim2);
                        return;
                    }
                    return;
                }
                throw new AnonymousClass3D8(AnonymousClass008.A0L("Unknown value \"", trim2, "\""));
            } else if (trim.equals("ENCODING")) {
                if (!(this instanceof AnonymousClass3XK)) {
                    contains = A0J.contains(trim2.toUpperCase(Locale.US));
                } else {
                    contains = AnonymousClass3XK.A01.contains(trim2.toUpperCase(Locale.US));
                }
                if (contains || trim2.startsWith("X-")) {
                    AnonymousClass3XG r02 = this.A0G;
                    if (r02 != null) {
                        r02.A01 = "ENCODING";
                        r02.A00(trim2);
                    }
                    this.A0C = trim2;
                    return;
                }
                throw new AnonymousClass3D8(AnonymousClass008.A0L("Unknown encoding \"", trim2, "\""));
            } else if (trim.equals("CHARSET")) {
                AnonymousClass3XG r03 = this.A0G;
                if (r03 != null) {
                    r03.A01 = "CHARSET";
                    r03.A00(trim2);
                }
            } else if (trim.equals("LANGUAGE")) {
                String[] split2 = trim2.split("-");
                if (split2.length <= 2) {
                    String str2 = split2[0];
                    int length = str2.length();
                    for (int i = 0; i < length; i++) {
                        char charAt = str2.charAt(i);
                        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                            throw new AnonymousClass3D8(AnonymousClass008.A0L("Invalid Language: \"", trim2, "\""));
                        }
                    }
                    if (split2.length > 1) {
                        String str3 = split2[1];
                        int length2 = str3.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            char charAt2 = str3.charAt(i2);
                            if ((charAt2 < 'a' || charAt2 > 'z') && (charAt2 < 'A' || charAt2 > 'Z')) {
                                throw new AnonymousClass3D8(AnonymousClass008.A0L("Invalid Language: \"", trim2, "\""));
                            }
                        }
                    }
                    AnonymousClass3XG r04 = this.A0G;
                    if (r04 != null) {
                        r04.A01 = "LANGUAGE";
                        r04.A00(trim2);
                        return;
                    }
                    return;
                }
                throw new AnonymousClass3D8(AnonymousClass008.A0L("Invalid Language: \"", trim2, "\""));
            } else if (trim.startsWith("X-")) {
                if (!(this instanceof AnonymousClass3XK)) {
                    AnonymousClass3XG r05 = this.A0G;
                    if (r05 != null) {
                        r05.A01 = trim;
                        r05.A00(trim2);
                        return;
                    }
                    return;
                }
                AnonymousClass3XG r06 = this.A0G;
                if (r06 != null) {
                    r06.A01 = trim;
                    r06.A00(trim2);
                }
            } else if (trim.equalsIgnoreCase("WAID")) {
                AnonymousClass3XG r1 = this.A0G;
                if (r1 != null) {
                    r1.A01 = "waId";
                    r1.A00(trim2);
                }
            } else {
                throw new AnonymousClass3D8(AnonymousClass008.A0L("Unknown type \"", trim, "\""));
            }
        } else {
            A06(split[0]);
        }
    }

    public void A06(String str) {
        if (!(this instanceof AnonymousClass3XK)) {
            if (!A0L.contains(str) && !str.startsWith("X-") && !this.A0F.contains(str)) {
                this.A0F.add(str);
                StringBuilder sb = new StringBuilder("Type unsupported by vCard 2.1: ");
                sb.append(str);
                Log.w(sb.toString());
            }
            AnonymousClass3XG r1 = this.A0G;
            if (r1 != null) {
                r1.A01 = "TYPE";
                r1.A00(str);
                return;
            }
            return;
        }
        String[] split = str.split(",");
        this.A0G.A01 = "TYPE";
        for (String str2 : split) {
            if (str2.length() < 2 || !str2.startsWith("\"") || !str2.endsWith("\"")) {
                this.A0G.A00(str2.replaceAll("[_$!<|>!$_]", ""));
            } else {
                this.A0G.A00(str2.substring(1, str2.length() - 1));
            }
        }
    }

    public boolean A07() {
        String valueOf;
        boolean z;
        String obj;
        String str;
        boolean z2;
        String A042;
        this.A0C = "8BIT";
        String A022 = A02();
        long currentTimeMillis = System.currentTimeMillis();
        int length = A022.length();
        String[] strArr = new String[2];
        if (A022.startsWith("item")) {
            String[] split = A022.split(":");
            int length2 = split.length;
            if (length2 < 2) {
                return true;
            }
            String str2 = split[0];
            StringBuilder sb = new StringBuilder();
            char c = '@';
            for (int indexOf = str2.indexOf(".") + 1; indexOf < str2.length(); indexOf++) {
                if (str2.charAt(indexOf) < 'A' || str2.charAt(indexOf) > 'Z') {
                    if (!(str2.charAt(indexOf) == '-' && c == 'X')) {
                        break;
                    }
                    sb.append(str2.charAt(indexOf));
                } else {
                    sb.append(str2.charAt(indexOf));
                    c = str2.charAt(indexOf);
                }
            }
            strArr[0] = sb.toString();
            strArr[1] = split[1].replaceAll("(\r\n|\r|\n|\n\r)", "");
            if (strArr[0].equals("ADR")) {
                if (A022.contains("type")) {
                    A06(A022.substring(A022.indexOf("=") + 1, A022.indexOf(":")));
                    z2 = false;
                } else {
                    z2 = true;
                }
                String A043 = A04(A022, "X-ABADR");
                if (A043 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strArr[1]);
                    sb2.append(";");
                    sb2.append(A043.substring(A043.lastIndexOf(":") + 1));
                    strArr[1] = sb2.toString();
                }
                if (z2 && (A042 = A04(A022, null)) != null) {
                    A06(A042.substring(A042.lastIndexOf(":") + 1));
                }
            } else {
                if (length2 > 2) {
                    StringBuilder sb3 = new StringBuilder(length);
                    sb3.append(strArr[1]);
                    for (int i = 2; i < length2; i++) {
                        sb3.append(":");
                        sb3.append(split[i]);
                    }
                    strArr[1] = sb3.toString();
                }
                if (A022.contains("waid")) {
                    if (A022.contains("type")) {
                        String A002 = A00(A0N, A022);
                        if (A002 != null) {
                            A06(A002);
                        }
                    } else {
                        String A044 = A04(A022, null);
                        if (A044 != null) {
                            A06(A044.substring(A044.lastIndexOf(":") + 1));
                        }
                    }
                    String A003 = A00(A0O, A022);
                    if (A003 != null) {
                        AnonymousClass3XG r1 = this.A0G;
                        if (r1 != null) {
                            r1.A01 = "waId";
                            r1.A00(A003);
                        }
                        try {
                            strArr[1] = C12420i4.A02(UserJid.getFromIdentifier(A003));
                        } catch (AnonymousClass02Y unused) {
                            strArr[1] = null;
                        }
                    }
                } else {
                    String A045 = A04(A022, "X-ABLabel");
                    if (A045 != null) {
                        A06(A045.substring(A045.lastIndexOf(":") + 1));
                    }
                }
            }
        } else {
            char c2 = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = A022.charAt(i3);
                if (c2 != 0) {
                    if (c2 != 1) {
                        if (c2 == 2) {
                            if (charAt != '\"') {
                            }
                        }
                    } else if (charAt == '\"') {
                        c2 = 2;
                    } else if (charAt == ';') {
                        A05(A022.substring(i2, i3));
                        i2 = i3 + 1;
                    } else if (charAt == ':') {
                        A05(A022.substring(i2, i3));
                        if (i3 < length - 1) {
                            strArr[1] = A022.substring(i3 + 1);
                        } else {
                            strArr[1] = "";
                        }
                    }
                } else if (charAt == ':') {
                    String substring = A022.substring(i2, i3);
                    if (substring.equalsIgnoreCase("END")) {
                        this.A0E = A022;
                        return true;
                    }
                    strArr[0] = substring;
                    if (i3 < length - 1) {
                        strArr[1] = A022.substring(i3 + 1);
                    } else {
                        strArr[1] = "";
                    }
                } else if (charAt == '.') {
                    String substring2 = A022.substring(i2, i3);
                    AnonymousClass3XG r0 = this.A0G;
                    if (r0 != null) {
                        r0.A05.A05.add(substring2);
                    }
                    i2 = i3 + 1;
                } else if (charAt == ';') {
                    String substring3 = A022.substring(i2, i3);
                    if (substring3.equalsIgnoreCase("END")) {
                        this.A0E = A022;
                        return true;
                    }
                    strArr[0] = substring3;
                    i2 = i3 + 1;
                } else {
                    continue;
                }
                c2 = 1;
            }
            throw new AnonymousClass3D8(AnonymousClass008.A0L("Invalid line: \"", A022, "\""));
        }
        if (2 == 2) {
            String upperCase = strArr[0].toUpperCase(Locale.US);
            String str3 = strArr[1];
            this.A05 = (System.currentTimeMillis() - currentTimeMillis) + this.A05;
            AnonymousClass3XG r02 = this.A0G;
            if (r02 != null) {
                r02.A05.A01 = upperCase;
            }
            if (upperCase.equals("ADR") || upperCase.equals("ORG") || upperCase.equals("N")) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (this.A0C.equalsIgnoreCase("QUOTED-PRINTABLE")) {
                    str3 = A03(str3);
                }
                if (this.A0G != null) {
                    StringBuilder sb4 = new StringBuilder();
                    ArrayList arrayList = new ArrayList();
                    int length3 = str3.length();
                    int i4 = 0;
                    while (i4 < length3) {
                        char charAt2 = str3.charAt(i4);
                        if (charAt2 == '\\') {
                            if (i4 < length3 - 1 && !upperCase.equals("ADR")) {
                                int i5 = i4 + 1;
                                char charAt3 = str3.charAt(i5);
                                if (!(this instanceof AnonymousClass3XK)) {
                                    valueOf = (charAt3 == '\\' || charAt3 == ';' || charAt3 == ':' || charAt3 == ',') ? String.valueOf(charAt3) : null;
                                } else {
                                    valueOf = (charAt3 == 'n' || charAt3 == 'N') ? "\r\n" : String.valueOf(charAt3);
                                }
                                if (valueOf != null) {
                                    sb4.append(valueOf);
                                    i4 = i5;
                                } else {
                                    sb4.append(charAt2);
                                }
                            }
                            sb4.append(charAt2);
                        } else {
                            if (charAt2 == ';') {
                                arrayList.add(sb4.toString());
                                sb4 = new StringBuilder();
                            }
                            sb4.append(charAt2);
                        }
                        i4++;
                    }
                    arrayList.add(sb4.toString());
                    this.A0G.A01(arrayList);
                }
                this.A07 = (System.currentTimeMillis() - currentTimeMillis2) + this.A07;
                return false;
            } else if (!upperCase.equals("AGENT")) {
                if (!(this instanceof AnonymousClass3XK)) {
                    if (!A0K.contains(upperCase.toUpperCase(Locale.US)) && !upperCase.startsWith("X-") && !this.A0F.contains(upperCase)) {
                        this.A0F.add(upperCase);
                        StringBuilder sb5 = new StringBuilder("Property name unsupported by vCard 2.1: ");
                        sb5.append(upperCase);
                        Log.w(sb5.toString());
                    }
                    z = true;
                } else {
                    if (!AnonymousClass3XK.A02.contains(upperCase) && !AnonymousClass3XK.A03.contains(upperCase) && !upperCase.startsWith("X-") && !this.A0F.contains(upperCase)) {
                        this.A0F.add(upperCase);
                    }
                    z = true;
                }
                if (!z) {
                    throw new AnonymousClass3D8(AnonymousClass008.A0L("Unknown property name: \"", upperCase, "\""));
                } else if (!upperCase.equals("BEGIN")) {
                    if (upperCase.equals("VERSION")) {
                        if (!(this instanceof AnonymousClass3XK)) {
                            str = "2.1";
                        } else {
                            str = "3.0";
                        }
                        if (!str3.equals(str)) {
                            StringBuilder A0Z = AnonymousClass008.A0Z("Incompatible version: ", str3, " != ");
                            A0Z.append(str);
                            throw new AnonymousClass3XL(A0Z.toString());
                        }
                    }
                    long currentTimeMillis3 = System.currentTimeMillis();
                    String str4 = this.A0C;
                    if (str4.equalsIgnoreCase("QUOTED-PRINTABLE")) {
                        long currentTimeMillis4 = System.currentTimeMillis();
                        String A032 = A03(str3);
                        AnonymousClass3XG r12 = this.A0G;
                        if (r12 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(A032);
                            r12.A01(arrayList2);
                        }
                        this.A03 = (System.currentTimeMillis() - currentTimeMillis4) + this.A03;
                    } else if (str4.equalsIgnoreCase("BASE64") || str4.equalsIgnoreCase("B")) {
                        long currentTimeMillis5 = System.currentTimeMillis();
                        try {
                            if (!(this instanceof AnonymousClass3XK)) {
                                StringBuilder A0S = AnonymousClass008.A0S(str3);
                                while (true) {
                                    String A012 = A01();
                                    if (A012 == null) {
                                        throw new AnonymousClass3D8("File ended during parsing BASE64 binary");
                                    } else if (A012.length() == 0) {
                                        obj = A0S.toString();
                                        break;
                                    } else {
                                        A0S.append(A012);
                                    }
                                }
                            } else {
                                AnonymousClass3XK r3 = (AnonymousClass3XK) this;
                                StringBuilder A0S2 = AnonymousClass008.A0S(str3);
                                while (true) {
                                    String A013 = r3.A01();
                                    if (A013 != null) {
                                        if (A013.length() == 0) {
                                            break;
                                        }
                                        if (!(A013.startsWith(" ") || A013.startsWith("\t"))) {
                                            r3.A00 = A013;
                                            break;
                                        }
                                        A0S2.append(A013);
                                    } else {
                                        throw new AnonymousClass3D8("File ended during parsing BASE64 binary");
                                    }
                                }
                                obj = A0S2.toString();
                            }
                            AnonymousClass3XG r13 = this.A0G;
                            if (r13 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(obj);
                                r13.A01(arrayList3);
                            }
                        } catch (OutOfMemoryError e) {
                            Log.e("vcardparser/out-of-memory ", e);
                            AnonymousClass3XG r14 = this.A0G;
                            if (r14 != null) {
                                r14.A01(null);
                            }
                        }
                        this.A04 = (System.currentTimeMillis() - currentTimeMillis5) + this.A04;
                    } else {
                        if (!str4.equalsIgnoreCase("7BIT") && !str4.equalsIgnoreCase("8BIT") && !str4.toUpperCase(Locale.US).startsWith("X-")) {
                            StringBuilder A0S3 = AnonymousClass008.A0S("The encoding unsupported by vCard spec: \"");
                            A0S3.append(str4);
                            A0S3.append("\".");
                            Log.w(A0S3.toString());
                        }
                        long currentTimeMillis6 = System.currentTimeMillis();
                        if (this.A0G != null) {
                            ArrayList arrayList4 = new ArrayList();
                            if (str3 != null) {
                                if (this instanceof AnonymousClass3XK) {
                                    StringBuilder sb6 = new StringBuilder();
                                    int length4 = str3.length();
                                    int i6 = 0;
                                    while (i6 < length4) {
                                        char charAt4 = str3.charAt(i6);
                                        if (charAt4 != '\\' || i6 >= length4 - 1) {
                                            sb6.append(charAt4);
                                        } else {
                                            i6++;
                                            char charAt5 = str3.charAt(i6);
                                            if (charAt5 == 'n' || charAt5 == 'N') {
                                                sb6.append("\r\n");
                                            } else {
                                                sb6.append(charAt5);
                                            }
                                        }
                                        i6++;
                                    }
                                    str3 = sb6.toString();
                                }
                                arrayList4.add(str3);
                                this.A0G.A01(arrayList4);
                            } else {
                                throw new AnonymousClass3D8("null property value is not supported");
                            }
                        }
                        this.A02 = (System.currentTimeMillis() - currentTimeMillis6) + this.A02;
                    }
                    this.A06 = (System.currentTimeMillis() - currentTimeMillis3) + this.A06;
                    return false;
                } else if (str3.equals("VCARD")) {
                    throw new AnonymousClass3XI();
                } else {
                    throw new AnonymousClass3D8(AnonymousClass008.A0K("Unknown BEGIN type: ", str3));
                }
            } else if (!(this instanceof AnonymousClass3XK)) {
                throw new AnonymousClass3D8("AGENT Property is not supported.");
            } else {
                throw new AnonymousClass3D8("AGENT in vCard 3.0 is not supported yet.");
            }
        } else {
            throw new AnonymousClass3D8(AnonymousClass008.A0L("Invalid line \"", A022, "\""));
        }
    }
}
