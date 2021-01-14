package X;

import android.util.Pair;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.0Fd  reason: invalid class name and case insensitive filesystem */
public class C03190Fd {
    public static final AnonymousClass05V A06;
    public static final Charset A07 = Charset.forName("UTF-8");
    public static final Pattern A08 = Pattern.compile("\t");
    public static volatile C03190Fd A09;
    public AnonymousClass0GF A00 = new AnonymousClass0GF(0);
    public String A01 = "";
    public final AnonymousClass0CO A02;
    public final AnonymousClass01I A03;
    public final AnonymousClass00G A04;
    public final Object A05 = new Object();

    static {
        AnonymousClass05V r2 = new AnonymousClass05V(59);
        A06 = r2;
        r2.put("af", Arrays.asList("ZA", "NA"));
        AnonymousClass05V r22 = A06;
        r22.put("ar", Arrays.asList("EG", "SA", "SY", "IQ"));
        r22.put("sq", Arrays.asList("AL", "XK", "GR", "MK", "IT"));
        r22.put("az", Collections.singletonList("AZ"));
        r22.put("bn", Arrays.asList("IN", "BD"));
        r22.put("bg", Collections.singletonList("BG"));
        r22.put("ca", Arrays.asList("ES", "AD"));
        r22.put("zh-Hans", Arrays.asList("MY", "SG", "CN", "HK"));
        r22.put("zh-Hant", Arrays.asList("HK", "TW", "MY", "MO"));
        r22.put("hr", Arrays.asList("HR", "BA"));
        r22.put("cs", Collections.singletonList("CZ"));
        r22.put("da", Collections.singletonList("DK"));
        r22.put("nl", Arrays.asList("NL", "BE", "SR"));
        r22.put("en", Arrays.asList("IN", "PK", "ZA", "GB", "US"));
        r22.put("et", Collections.singletonList("EE"));
        r22.put("fil", Collections.singletonList("PH"));
        r22.put("fi", Collections.singletonList("FI"));
        r22.put("fr", Collections.singletonList("FR"));
        r22.put("de", Arrays.asList("DE", "AT", "CH"));
        r22.put("el", Arrays.asList("GR", "CY"));
        r22.put("gu", Collections.singletonList("IN"));
        r22.put("he", Collections.singletonList("IL"));
        r22.put("hi", Collections.singletonList("IN"));
        r22.put("hu", Arrays.asList("HU", "RO"));
        r22.put("id", Collections.singletonList("ID"));
        r22.put("ga", Arrays.asList("IE", "GB"));
        r22.put("it", Arrays.asList("IT", "CH"));
        r22.put("ja", Collections.singletonList("JP"));
        r22.put("kn", Collections.singletonList("IN"));
        r22.put("kk", Arrays.asList("KZ", "UZ", "MN"));
        r22.put("ko", Collections.singletonList("KR"));
        r22.put("lo", Collections.singletonList("LA"));
        r22.put("lv", Collections.singletonList("LV"));
        r22.put("lt", Collections.singletonList("LT"));
        r22.put("mk", Collections.singletonList("MK"));
        r22.put("ms", Collections.singletonList("MY"));
        r22.put("ml", Collections.singletonList("IN"));
        r22.put("mr", Collections.singletonList("IN"));
        r22.put("nb", Collections.singletonList("NO"));
        r22.put("fa", Arrays.asList("IR", "AF"));
        r22.put("pl", Collections.singletonList("PL"));
        r22.put("pt-BR", Collections.singletonList("BR"));
        r22.put("pt-PT", Arrays.asList("PT", "AO", "BR", "MZ"));
        r22.put("pa", Collections.singletonList("IN"));
        r22.put("ro", Arrays.asList("RO", "MD"));
        r22.put("ru", Arrays.asList("RU", "KZ", "KG", "UA"));
        r22.put("sr", Arrays.asList("RS", "BA", "ME"));
        r22.put("sk", Collections.singletonList("SK"));
        r22.put("sl", Collections.singletonList("SI"));
        r22.put("es", Arrays.asList("MX", "AR", "CL", "CO", "ES", "PE"));
        r22.put("sw", Arrays.asList("TZ", "KE", "RW", "BI"));
        r22.put("sv", Arrays.asList("SE", "FI"));
        r22.put("ta", Arrays.asList("IN", "LK", "MY", "SG"));
        r22.put("te", Collections.singletonList("IN"));
        r22.put("th", Arrays.asList("TH", "LA"));
        r22.put("tr", Collections.singletonList("TR"));
        r22.put("uk", Collections.singletonList("UA"));
        r22.put("ur", Arrays.asList("PK", "IN"));
        r22.put("uz", Arrays.asList("UZ", "RU", "KZ", "KG"));
        r22.put("vi", Collections.singletonList("VN"));
    }

    public C03190Fd(AnonymousClass00G r3, AnonymousClass01I r4, AnonymousClass0CO r5) {
        this.A04 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public static C03190Fd A00() {
        if (A09 == null) {
            synchronized (C03190Fd.class) {
                if (A09 == null) {
                    A09 = new C03190Fd(AnonymousClass00G.A01, AnonymousClass01I.A00(), AnonymousClass0CO.A00());
                }
            }
        }
        return A09;
    }

    public static String A01(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = (String) AbstractC05840Ql.A01.get(parseInt);
            return "ZZ".equals(str2) ? (String) AbstractC05840Ql.A00.get(parseInt) : str2;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String A02(String str, String str2) {
        Pattern pattern;
        try {
            int parseInt = Integer.parseInt(str);
            String str3 = (String) AbstractC05840Ql.A01.get(parseInt);
            if (str3 == null) {
                return "ZZ";
            }
            if (!str3.equals("ZZ")) {
                return str3;
            }
            List list = (List) AbstractC05840Ql.A02.get(parseInt);
            for (int i = 0; i < list.size(); i++) {
                Pair pair = (Pair) list.get(i);
                Object obj = pair.second;
                if (obj instanceof String) {
                    pattern = Pattern.compile((String) obj);
                    list.set(i, Pair.create(pair.first, pattern));
                } else {
                    pattern = (Pattern) obj;
                }
                if (pattern.matcher(str2).matches()) {
                    return (String) pair.first;
                }
            }
            return "ZZ";
        } catch (NumberFormatException unused) {
            return "ZZ";
        }
    }

    public String A03(AnonymousClass01X r7, String str) {
        String str2;
        synchronized (this.A05) {
            String A042 = AbstractC002201f.A04(r7.A0I());
            if (!A042.equals(this.A01)) {
                List<AnonymousClass1Y1> A043 = A04(A042);
                if (A043.isEmpty()) {
                    A043 = A04("en");
                }
                this.A00 = new AnonymousClass0GF(A043.size());
                for (AnonymousClass1Y1 r0 : A043) {
                    this.A00.A03(r0.A00, r0.A01);
                }
                this.A01 = A042;
            }
            str2 = (String) this.A00.A01(str);
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A04(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03190Fd.A04(java.lang.String):java.util.List");
    }

    public boolean A05() {
        AnonymousClass01I r0 = this.A03;
        r0.A04();
        Me me = r0.A00;
        if (me == null) {
            return false;
        }
        try {
            return "eu".equals(this.A02.A03(me.cc));
        } catch (IOException e) {
            StringBuilder A0S = AnonymousClass008.A0S("countryutils/is-eu failed for ");
            A0S.append(me.cc);
            Log.e(A0S.toString(), e);
            return false;
        }
    }

    public boolean A06() {
        AnonymousClass01I r0 = this.A03;
        r0.A04();
        Me me = r0.A00;
        if (me == null) {
            return false;
        }
        return "IN".equals(A02(me.cc, me.number));
    }

    public boolean A07(String str) {
        return "eu".equals(str) || A05();
    }
}
