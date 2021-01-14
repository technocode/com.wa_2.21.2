package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.0Tx  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC06580Tx {
    public static Map A00 = new HashMap();

    static {
        A02("bm bo dz id ig ii in ja jbo jv jw kde kea km ko lkt lo ms my nqo osa root sah ses sg su th to vi wo yo yue zh", new AnonymousClass0UC());
        A02("am as bn fa gu hi kn zu", new AnonymousClass0UD());
        A02("ff fr hy kab", new AnonymousClass0UE());
        A01("pt", new AnonymousClass0UF());
        A02("ast ca de en et fi fy gl ia io it ji nl pt_PT sc scn sv sw ur yi", new AnonymousClass0UG());
        A01("si", new AnonymousClass0UH());
        A02("ak bho guw ln mg nso pa ti wa", new AnonymousClass0UI());
        A01("tzm", new AnonymousClass0UJ());
        A02("af an asa az bem bez bg brx ce cgg chr ckb dv ee el eo es eu fo fur gsw ha haw hu jgo jmc ka kaj kcg kk kkj kl ks ksb ku ky lb lg mas mgo ml mn mr nah nb nd ne nn nnh no nr ny nyn om or os pap ps rm rof rwk saq sd sdh seh sn so sq ss ssy st syr ta te teo tig tk tn tr ts ug uz ve vo vun wae xh xog", new AnonymousClass0UK());
        A01("da", new AnonymousClass0UL());
        A01("is", new AnonymousClass0UM());
        A01("mk", new AnonymousClass0UN());
        A02("ceb fil tl", new AnonymousClass0UO());
        A02("lv prg", new AnonymousClass0UP());
        A01("lag", new AnonymousClass0UQ());
        A01("ksh", new AnonymousClass0UR());
        A02("iu naq se sma smi smj smn sms", new AnonymousClass0US());
        A01("shi", new AnonymousClass0UT());
        A02("mo ro", new AnonymousClass0UU());
        A02("bs hr sh sr", new AnonymousClass0UV());
        A01("gd", new AnonymousClass0UW());
        A01("sl", new AnonymousClass0UX());
        A02("dsb hsb", new AnonymousClass0UY());
        A02("he iw", new AnonymousClass0UZ());
        A02("cs sk", new C06610Ua());
        A01("pl", new C06620Ub());
        A01("be", new C06630Uc());
        A01("lt", new C06640Ud());
        A01("mt", new C06650Ue());
        A02("ru uk", new C06660Uf());
        A01("br", new C06670Ug());
        A01("ga", new C06680Uh());
        A01("gv", new C06690Ui());
        A01("kw", new C06700Uj());
        A02("ar ars", new C06710Uk());
        A01("cy", new C06720Ul());
    }

    public static AbstractC06580Tx A00(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            Map map = A00;
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append("_");
            sb.append(country);
            AbstractC06580Tx r0 = (AbstractC06580Tx) map.get(sb.toString());
            if (r0 != null) {
                return r0;
            }
        }
        AbstractC06580Tx r02 = (AbstractC06580Tx) A00.get(language);
        if (r02 != null) {
            return r02;
        }
        AbstractC06580Tx r03 = (AbstractC06580Tx) A00.get("root");
        if (r03 != null) {
            return r03;
        }
        throw new NullPointerException("No plural rule found for 'root' locale.");
    }

    public static void A01(String str, AbstractC06580Tx r5) {
        A00.put(str, r5);
        if ("pt_PT".equals(str)) {
            Iterator it = C06600Tz.A00.iterator();
            while (true) {
                C06070Rp r1 = (C06070Rp) it;
                if (r1.hasNext()) {
                    Map map = A00;
                    StringBuilder sb = new StringBuilder("pt_");
                    sb.append((String) r1.next());
                    map.put(sb.toString(), r5);
                } else {
                    return;
                }
            }
        }
    }

    public static void A02(String str, AbstractC06580Tx r4) {
        for (String str2 : str.split(" ")) {
            A01(str2, r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x014e, code lost:
        if (r4 <= 19.0d) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0161, code lost:
        if (r4 <= 19) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x044a, code lost:
        if (r1 <= 19.0d) goto L_0x044e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x037a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(double r22, long r24, int r26, int r27, long r28, long r30) {
        /*
        // Method dump skipped, instructions count: 2078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC06580Tx.A03(double, long, int, int, long, long):int");
    }

    public int A04(Object obj) {
        long j;
        if (obj instanceof String) {
            String str = (String) obj;
            int indexOf = str.indexOf(46);
            if (indexOf == -1) {
                try {
                    long parseLong = Long.parseLong(str);
                    return A03((double) parseLong, parseLong, 0, 0, 0, 0);
                } catch (NumberFormatException unused) {
                    return 0;
                }
            } else {
                double parseDouble = Double.parseDouble(str);
                long j2 = 0;
                if (indexOf == 0) {
                    j = 0;
                } else {
                    j = Long.parseLong(str.substring(0, indexOf));
                }
                String substring = str.substring(indexOf + 1);
                int length = substring.length();
                int i = length;
                while (i > 0) {
                    int i2 = i - 1;
                    if (substring.charAt(i2) != '0') {
                        break;
                    }
                    i = i2;
                }
                long parseLong2 = Long.parseLong(substring);
                if (i != 0) {
                    j2 = Long.parseLong(substring.substring(0, i));
                }
                return A03(parseDouble, j, length, i, parseLong2, j2);
            }
        } else if (!(obj instanceof Long)) {
            return 0;
        } else {
            long longValue = ((Number) obj).longValue();
            return A03((double) longValue, longValue, 0, 0, 0, 0);
        }
    }
}
