package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0HL  reason: invalid class name */
public class AnonymousClass0HL {
    public static volatile AnonymousClass0HL A03;
    public final Map A00 = new AnonymousClass04h(5);
    public final Map A01 = new AnonymousClass04h(100);
    public final Map A02 = new HashMap();

    public static AnonymousClass0HL A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0HL.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0HL();
                }
            }
        }
        return A03;
    }

    public AnonymousClass2KY A01(UserJid userJid) {
        synchronized (this) {
            AnonymousClass1Rs r0 = (AnonymousClass1Rs) this.A00.get(userJid);
            if (r0 == null) {
                return null;
            }
            return r0.A00;
        }
    }

    public C48052Ks A02(String str) {
        UserJid userJid;
        AnonymousClass1Rs r3;
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Map map = this.A01;
            C48052Ks r4 = (C48052Ks) map.get(str);
            if (!(r4 != null || (userJid = (UserJid) this.A02.get(str)) == null || (r3 = (AnonymousClass1Rs) this.A00.get(userJid)) == null)) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = r3.A01;
                    if (i >= arrayList.size()) {
                        break;
                    } else if (((C48052Ks) arrayList.get(i)).A06.equals(str)) {
                        r4 = (C48052Ks) arrayList.get(i);
                        break;
                    } else {
                        i++;
                    }
                }
                if (r4 != null) {
                    map.put(str, r4);
                }
            }
            return r4;
        }
    }

    public C48072Ku A03(UserJid userJid) {
        synchronized (this) {
            List A04 = A04(userJid);
            C48072Ku r0 = null;
            if (A04 == null) {
                return null;
            }
            Iterator it = A04.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C48052Ks r3 = (C48052Ks) it.next();
                boolean z = false;
                if (r3.A02.A00 == 0) {
                    z = true;
                }
                if (z) {
                    List list = r3.A0A;
                    if (list.size() > 0) {
                        r0 = (C48072Ku) list.get(0);
                        break;
                    }
                }
            }
            return r0;
        }
    }

    public List A04(UserJid userJid) {
        List list;
        synchronized (this) {
            AnonymousClass1Rs r0 = (AnonymousClass1Rs) this.A00.get(userJid);
            if (r0 == null) {
                list = null;
            } else {
                list = Collections.unmodifiableList(r0.A01);
            }
        }
        return list;
    }

    public void A05(C48052Ks r7, UserJid userJid) {
        synchronized (this) {
            Map map = this.A01;
            String str = r7.A06;
            map.put(str, r7);
            if (userJid != null || (userJid = (UserJid) this.A02.get(str)) != null) {
                Map map2 = this.A00;
                AnonymousClass1Rs r4 = (AnonymousClass1Rs) map2.get(userJid);
                if (r4 == null) {
                    r4 = new AnonymousClass1Rs();
                    map2.put(userJid, r4);
                }
                int i = 0;
                while (true) {
                    ArrayList arrayList = r4.A01;
                    if (i >= arrayList.size()) {
                        arrayList.add(0, r7);
                        this.A02.put(str, userJid);
                        break;
                    } else if (((C48052Ks) arrayList.get(i)).A06.equals(str)) {
                        arrayList.set(i, r7);
                        return;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(com.whatsapp.jid.UserJid r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x0017 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0017 }
            X.1Rs r0 = (X.AnonymousClass1Rs) r0     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            java.util.ArrayList r0 = r0.A01     // Catch:{ all -> 0x0017 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0017 }
            r0 = 1
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HL.A06(com.whatsapp.jid.UserJid):boolean");
    }
}
