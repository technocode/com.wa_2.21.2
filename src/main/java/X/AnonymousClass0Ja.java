package X;

import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.0Ja  reason: invalid class name */
public class AnonymousClass0Ja {
    public static volatile AnonymousClass0Ja A06;
    public final C04100Jb A00 = new C04100Jb();
    public final C03550Gr A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass04h A03 = new AnonymousClass04h(10);
    public final HashMap A04 = new HashMap();
    public final HashSet A05 = new HashSet();

    public AnonymousClass0Ja(AnonymousClass00S r3, C03550Gr r4) {
        this.A02 = r3;
        this.A01 = r4;
    }

    public static AnonymousClass0Ja A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0Ja.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0Ja(AnonymousClass00S.A00(), C03550Gr.A00());
                }
            }
        }
        return A06;
    }

    public static C04130Je A01(C04110Jc r4, String str) {
        C04140Jf r2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C04130Je r3 : r4.A02) {
            int i = r3.A01;
            if (i == 1) {
                if (i == 1) {
                    r2 = (C04140Jf) r3.A04;
                } else {
                    r2 = C04140Jf.A09;
                }
                if ((r2.A00 & 2) == 2 && r2.A06.equals(str)) {
                    return r3;
                }
            }
        }
        return null;
    }

    public static Locale[] A02(AnonymousClass01X r6, Locale locale) {
        Locale A0I = r6.A0I();
        if (locale == null || TextUtils.isEmpty(locale.getLanguage())) {
            locale = Locale.ENGLISH;
        }
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            int size = localeList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(localeList.get(i));
            }
            if (!arrayList.contains(A0I)) {
                arrayList.add(0, A0I);
            }
        } else {
            arrayList.add(A0I);
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            arrayList.add(size2 + 1, new Locale(((Locale) arrayList.get(size2)).getLanguage(), ""));
        }
        if (!arrayList.contains(locale)) {
            arrayList.add(locale);
        }
        return (Locale[]) arrayList.toArray(new Locale[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f3, code lost:
        if (r2 != null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f9, code lost:
        com.whatsapp.util.Log.d("languagepackmanager/request-language-pack no pack found for any locale");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ff, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r1 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r1.A02.size() <= 0) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        com.whatsapp.util.Log.d("languagepackmanager/request-language-pack cache shows no packs for any locale");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r7 >= r8) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r6 = r28[r7];
        r5 = new X.C04150Jg(r6, r29);
        r2 = r27.A01;
        r18 = (r2.A01.A05() - 604800000) / 1000;
        r14 = r2.A00;
        r20 = r14.A01();
        r4 = new java.lang.String[3];
        r4[r13] = "hash";
        r4[1] = "timestamp";
        r4[2] = "data";
        r2 = new java.lang.String[3];
        r2[r13] = r6.getLanguage();
        r2[1] = r6.getCountry();
        r2[2] = r29;
        r2 = r20.A08("packs", r4, "lg = ? AND lc = ? AND namespace = ?", r2, null, "loadLanguagePack/QUERY_PACKS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if (r2.moveToNext() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
        r17 = r2.getString(0);
        r15 = r2.getLong(1);
        r4 = r2.getBlob(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        r15 = 0;
        r4 = null;
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        if (android.text.TextUtils.isEmpty(r17) != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        if (r4 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c9, code lost:
        if (r4.length != 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        if (r15 >= r18) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        if (r4 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        if (r4.length <= 0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d6, code lost:
        if (r4 == null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d9, code lost:
        if (r4.length != 0) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        r1 = X.AnonymousClass008.A0S("languagepackmanager/request-language-pack server missing pack for loc=");
        r1.append(X.AbstractC002201f.A05(r6));
        com.whatsapp.util.Log.d(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ef, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2 = (X.C04180Jj) X.C04110Jc.A07.AQb();
        r2.A02();
        r1 = (X.C04110Jc) r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ff, code lost:
        if (r29 == null) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0101, code lost:
        r1.A00 |= 1;
        r1.A06 = r29;
        r9.put(r5, r2.A01());
        r27.A05.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0115, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0116, code lost:
        r7 = r7 + 1;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r2 = (X.C04110Jc) X.AnonymousClass078.A02(X.C04110Jc.A07, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0124, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0125, code lost:
        com.whatsapp.util.Log.w("languagepackmanager/request-language-pack/invalidproto:", r4);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ce, code lost:
        r1 = X.AnonymousClass008.A0S("languagepackmanager/request-language-pack no pack for loc=");
        r1.append(X.AbstractC002201f.A05(r6));
        com.whatsapp.util.Log.d(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e2, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r9.remove(r5);
        r27.A05.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01eb, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ec, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C04110Jc A03(java.util.Locale[] r28, java.lang.String r29) {
        /*
        // Method dump skipped, instructions count: 515
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Ja.A03(java.util.Locale[], java.lang.String):X.0Jc");
    }
}
