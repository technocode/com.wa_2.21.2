package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2Ym  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51382Ym implements AnonymousClass0RN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0IL A01;
    public final /* synthetic */ EnumC03840Hy A02;
    public final /* synthetic */ AnonymousClass0RE A03;
    public final /* synthetic */ Collection A04;

    public /* synthetic */ C51382Ym(AnonymousClass0IL r1, EnumC03840Hy r2, int i, Collection collection, AnonymousClass0RE r5) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = collection;
        this.A03 = r5;
    }

    @Override // X.AnonymousClass0RN
    public final Object A20(Object obj) {
        String str;
        StringBuilder sb;
        String str2;
        long j;
        AnonymousClass0IL r8 = this.A01;
        EnumC03840Hy r11 = this.A02;
        int i = this.A00;
        Collection collection = this.A04;
        AnonymousClass0RE r2 = this.A03;
        String str3 = (String) obj;
        AnonymousClass0QK r17 = AnonymousClass0QK.UP_TO_DATE_UNCHANGED;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass0R7 r1 = r11.scope;
        AnonymousClass0R7 r3 = AnonymousClass0R7.DEVICES;
        if (r1 == r3) {
            str = "devices";
        } else {
            str = r1 == AnonymousClass0R7.PAYMENT ? "payment" : "";
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (collection != null) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C007003k r12 = (C007003k) it.next();
                    if (!C002001d.A3V(r12.A09)) {
                        C47172Gt r122 = new C47172Gt(r12);
                        UserJid userJid = r122.A0G;
                        if (userJid != null) {
                            AnonymousClass0R7 r13 = r11.scope;
                            if (r13 != r3) {
                                if (r13 != AnonymousClass0R7.PAYMENT) {
                                    Log.e("sync/syncQuerySingleProtocol/request invalid scope");
                                    sb = new StringBuilder();
                                    break;
                                }
                                r122.A0B = true;
                                r122.A04 = (String) r8.A0J.get(userJid);
                            } else {
                                AnonymousClass01L r132 = r8.A0E;
                                boolean A032 = r132.A05.A03();
                                r122.A09 = A032;
                                if (A032) {
                                    str2 = r132.A04(userJid);
                                } else {
                                    str2 = null;
                                }
                                r122.A03 = str2;
                                if (r122.A09) {
                                    j = r132.A01(userJid);
                                } else {
                                    j = 0;
                                }
                                r122.A00 = j;
                            }
                            arrayList.add(r122);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("sync/syncQuerySingleProtocol/request invalid jid, contact=");
                            sb2.append(r122.A0H);
                            sb2.append(" scope=");
                            sb2.append(str);
                            Log.e(sb2.toString());
                        }
                    }
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("sync/syncQuerySingleProtocol/request/count ");
            sb3.append(arrayList.size());
            sb3.append(" scope=");
            sb3.append(str);
            Log.d(sb3.toString());
            r2.A09 = Long.valueOf((long) arrayList.size());
            if (arrayList.isEmpty()) {
                sb = new StringBuilder();
            } else {
                AnonymousClass0IP A022 = r8.A02();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("sync_sid_");
                sb4.append(str);
                if (!r8.A04(A022.A01(C002001d.A1p(sb4.toString()), new AnonymousClass2LA(r11, arrayList, false, i), 64000), str3)) {
                    r17 = AnonymousClass0QK.FAILED;
                    sb = new StringBuilder();
                } else {
                    r8.A05.A02(r8.A01.A00, r8.A0K, r8.A0L, arrayList);
                    r17 = AnonymousClass0QK.UP_TO_DATE_CHANGED_NO_PHONEBOOK;
                    sb = new StringBuilder();
                }
            }
            sb.append("sync/syncQuerySingleProtocol/time/");
            sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            sb.append(" scope=");
            sb.append(str);
            Log.i(sb.toString());
            return r17;
        } catch (Throwable th) {
            StringBuilder A0S = AnonymousClass008.A0S("sync/syncQuerySingleProtocol/time/");
            A0S.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            A0S.append(" scope=");
            A0S.append(str);
            Log.i(A0S.toString());
            throw th;
        }
    }
}
