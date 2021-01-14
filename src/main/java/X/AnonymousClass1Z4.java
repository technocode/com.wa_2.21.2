package X;

import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Z4  reason: invalid class name */
public class AnonymousClass1Z4 {
    public static HashMap A0F = new HashMap();
    public static HashMap A0G;
    public String A00;
    public String A01;
    public List A02;
    public List A03 = new ArrayList();
    public List A04;
    public List A05;
    public List A06;
    public Map A07;
    public AnonymousClass3D3 A08 = new AnonymousClass3D3();
    public byte[] A09;
    public final C017009c A0A;
    public final AnonymousClass01A A0B;
    public final AnonymousClass00G A0C;
    public final AnonymousClass01X A0D;
    public final AnonymousClass3D5 A0E = new AnonymousClass3D5();

    static {
        HashMap hashMap = new HashMap();
        A0G = hashMap;
        hashMap.put("X-AIM", 0);
        A0G.put("X-MSN", 1);
        A0G.put("X-YAHOO", 2);
        A0G.put("X-GOOGLE-TALK", 5);
        A0G.put("X-GOOGLE TAL", 5);
        A0G.put("X-ICQ", 6);
        A0G.put("X-JABBER", 7);
        A0G.put("X-SKYPE-USERNAME", 3);
        A0F.put("X-AIM", "AIM");
        A0F.put("X-MSN", "Windows Live");
        A0F.put("X-YAHOO", "YAHOO");
        A0F.put("X-GOOGLE-TALK", "Google Talk");
        A0F.put("X-GOOGLE TAL", "Google Talk");
        A0F.put("X-ICQ", "ICQ");
        A0F.put("X-JABBER", "Jabber");
        A0F.put("X-SKYPE-USERNAME", "Skype");
        A0F.put("NICKNAME", "Nickname");
        A0F.put("BDAY", "Birthday");
    }

    public AnonymousClass1Z4(AnonymousClass00G r2, AnonymousClass01A r3, AnonymousClass01X r4, C017009c r5) {
        this.A0C = r2;
        this.A0B = r3;
        this.A0D = r4;
        this.A0A = r5;
    }

    public static String A00(AnonymousClass00G r9, AnonymousClass01A r10, AnonymousClass01X r11, C017009c r12, String str) {
        AnonymousClass3D0 A042 = A04(str);
        if (A042 != null) {
            Iterator it = A042.A02.iterator();
            C68373Cy r4 = null;
            C68373Cy r3 = null;
            C68373Cy r2 = null;
            while (it.hasNext()) {
                C68373Cy r1 = (C68373Cy) it.next();
                String str2 = r1.A01;
                if (!TextUtils.isEmpty(r1.A02)) {
                    if ("FN".equals(str2)) {
                        r4 = r1;
                    } else if ("NAME".equals(str2)) {
                        r3 = r1;
                    } else if ("ORG".equals(str2) && r2 == null) {
                        r2 = r1;
                    }
                }
            }
            if (r4 != null) {
                return r4.A02;
            }
            if (r3 != null) {
                return r3.A02;
            }
            if (r2 != null) {
                return A01(r2.A03);
            }
            AnonymousClass1Z4 A062 = A06(r9, r10, r11, r12, A042);
            if (A062 != null) {
                return A062.A07();
            }
        }
        return null;
    }

    public static String A01(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static List A02(AnonymousClass00G r13, AnonymousClass01A r14, AnonymousClass01X r15, C017009c r16, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            AnonymousClass1Z4 A052 = A05(r13, r14, r15, r16, str);
            if (A052 != null) {
                arrayList.add(new AnonymousClass1Z5(str, A052));
                AnonymousClass3D5 r11 = A052.A0E;
                i += r11.A01;
                i2 += r11.A00;
                j += r11.A04;
                j2 += r11.A02;
                j3 += r11.A03;
            }
        }
        if (i > 0 || i2 > 0) {
            StringBuilder sb = new StringBuilder("contactstruct/construct/too_long=");
            sb.append(i);
            sb.append("; exceed_max=");
            sb.append(i2);
            Log.w(sb.toString());
        }
        StringBuilder A0V = AnonymousClass008.A0V("contactstruct/construct/parse_time=", j, "; construct_time=");
        A0V.append(j2);
        A0V.append("; select_time=");
        A0V.append(j3);
        Log.d(A0V.toString());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map A03(java.lang.String r13, android.content.Context r14) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Z4.A03(java.lang.String, android.content.Context):java.util.Map");
    }

    public static AnonymousClass3D0 A04(String str) {
        if (str == null) {
            return null;
        }
        AnonymousClass3XG r0 = new AnonymousClass3XG();
        try {
            C05500Ov.A01(str, r0);
            List list = r0.A04;
            if (list.size() <= 0 || !((AnonymousClass3D0) list.get(0)).A01.equals("VCARD")) {
                return null;
            }
            return (AnonymousClass3D0) list.get(0);
        } catch (AnonymousClass3D8 e) {
            StringBuilder sb = new StringBuilder("Error parsing vcard:");
            sb.append(str);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    public static AnonymousClass1Z4 A05(AnonymousClass00G r10, AnonymousClass01A r11, AnonymousClass01X r12, C017009c r13, String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass3D0 A042 = A04(str);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (A042 == null) {
            return null;
        }
        AnonymousClass1Z4 A062 = A06(r10, r11, r12, r13, A042);
        long uptimeMillis3 = SystemClock.uptimeMillis();
        if (A062 == null) {
            return null;
        }
        AnonymousClass3D5 r2 = A062.A0E;
        r2.A04 = uptimeMillis2 - uptimeMillis;
        r2.A02 = uptimeMillis3 - uptimeMillis2;
        return A062;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03de, code lost:
        if (r1.equals("WORK") == false) goto L_0x03e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1Z4 A06(X.AnonymousClass00G r19, X.AnonymousClass01A r20, X.AnonymousClass01X r21, X.C017009c r22, X.AnonymousClass3D0 r23) {
        /*
        // Method dump skipped, instructions count: 1522
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Z4.A06(X.00G, X.01A, X.01X, X.09c, X.3D0):X.1Z4");
    }

    public String A07() {
        String str = this.A08.A01;
        if (str != null) {
            return str;
        }
        List list = this.A04;
        if (list != null && list.size() > 0) {
            return ((AnonymousClass3D4) this.A04.get(0)).A00;
        }
        List list2 = this.A05;
        if (list2 != null && list2.size() > 0) {
            for (AnonymousClass1Z3 r1 : this.A05) {
                if (r1.A04) {
                    return r1.A02;
                }
            }
        }
        List list3 = this.A02;
        if (list3 == null || list3.size() <= 0) {
            return "";
        }
        for (AnonymousClass3D2 r2 : this.A02) {
            if (r2.A01 == ContactsContract.CommonDataKinds.Email.class && r2.A05) {
                return r2.A02;
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b5, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
        // Method dump skipped, instructions count: 440
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Z4.A08():void");
    }

    public void A09(int i, UserJid userJid, String str, String str2, boolean z) {
        if (str == null) {
            StringBuilder sb = new StringBuilder("contactstruct/addphone/data is null; skipping (type=");
            sb.append(i);
            sb.append(" jidFromWaId=");
            sb.append(userJid);
            sb.append(" label=");
            sb.append(str2);
            sb.append(" isPrimary=");
            sb.append(z);
            sb.append(")");
            Log.w(sb.toString());
        } else if (str.length() > 30) {
            this.A0E.A01++;
        } else {
            List list = this.A05;
            if (list == null) {
                list = new ArrayList();
                this.A05 = list;
            }
            if (list.size() >= 10) {
                this.A0E.A00++;
                return;
            }
            AnonymousClass1Z3 r1 = new AnonymousClass1Z3();
            r1.A00 = i;
            r1.A01 = userJid;
            r1.A02 = str;
            r1.A03 = str2;
            r1.A04 = z;
            this.A05.add(r1);
        }
    }

    public void A0A(int i, String str) {
        List list = this.A06;
        if (list == null) {
            list = new ArrayList();
            this.A06 = list;
        }
        AnonymousClass3D6 r0 = new AnonymousClass3D6();
        r0.A00 = i;
        if (str != null) {
            r0.A01 = str;
            list.add(r0);
            return;
        }
        throw null;
    }

    public void A0B(int i, String str, String str2, boolean z) {
        List list = this.A02;
        if (list == null) {
            list = new ArrayList();
            this.A02 = list;
        }
        AnonymousClass3D2 r0 = new AnonymousClass3D2();
        r0.A01 = ContactsContract.CommonDataKinds.Email.class;
        r0.A00 = i;
        r0.A02 = str;
        r0.A03 = str2;
        r0.A05 = z;
        list.add(r0);
    }

    public void A0C(String str) {
        List list = this.A04;
        if (list == null) {
            list = new ArrayList();
            this.A04 = list;
        }
        int size = list.size();
        if (size == 0) {
            A0D("", null);
            size = 1;
        }
        ((AnonymousClass3D4) this.A04.get(size - 1)).A01 = str;
    }

    public void A0D(String str, String str2) {
        List list = this.A04;
        if (list == null) {
            list = new ArrayList();
            this.A04 = list;
        }
        AnonymousClass3D4 r0 = new AnonymousClass3D4();
        r0.A00 = str;
        r0.A01 = str2;
        list.add(r0);
    }

    public void A0E(C68373Cy r4) {
        List list;
        String str = r4.A02;
        if (str != null && str.length() != 0) {
            String str2 = r4.A01;
            Map map = this.A07;
            if (map == null) {
                map = new HashMap();
                this.A07 = map;
            }
            if (!map.containsKey(str2)) {
                list = new ArrayList();
                this.A07.put(str2, list);
            } else {
                list = (List) this.A07.get(str2);
            }
            list.add(r4);
        }
    }
}
