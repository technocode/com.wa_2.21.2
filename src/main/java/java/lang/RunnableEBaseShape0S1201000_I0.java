package java.lang;

import X.AbstractC02620Cu;
import X.AnonymousClass004;
import X.AnonymousClass008;
import X.AnonymousClass010;
import X.AnonymousClass0CZ;
import X.AnonymousClass0FC;
import X.AnonymousClass0FD;
import X.AnonymousClass0PF;
import X.AnonymousClass0XK;
import X.AnonymousClass10H;
import X.AnonymousClass1X7;
import X.AnonymousClass1X8;
import X.AnonymousClass2NI;
import X.C12600iM;
import X.C449422g;
import X.C449522h;
import android.app.Application;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import com.whatsapp.jobqueue.job.SendStatusPrivacyListJob;
import com.whatsapp.perf.ProfiloUploadService;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RunnableEBaseShape0S1201000_I0 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableEBaseShape0S1201000_I0(Object obj, int i, Object obj2, String str, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
    }

    public final void run() {
        AnonymousClass10H r3;
        switch (this.A04) {
            case 0:
                AnonymousClass0XK r1 = (AnonymousClass0XK) this.A01;
                int i = this.A00;
                Collection collection = (Collection) this.A02;
                String str = this.A03;
                r1.A0j.A0D(i, collection);
                r1.A0F.A00.A01(new SendStatusPrivacyListJob(i, collection, str));
                return;
            case 1:
                AnonymousClass0FD r12 = (AnonymousClass0FD) this.A01;
                int i2 = this.A00;
                String str2 = this.A03;
                Number number = (Number) this.A02;
                r12.A00(false);
                AnonymousClass0FC r5 = r12.A01;
                StringBuilder sb = new StringBuilder("sync-response-handler/onGlobalError request failed with global error code=");
                sb.append(i2);
                sb.append(", text=");
                sb.append(str2);
                sb.append(", backoffMs=");
                sb.append(number);
                Log.e(sb.toString());
                if (i2 == 404) {
                    r5.A00(2);
                    return;
                }
                Long l = null;
                boolean z = !AnonymousClass0FC.A0E.contains(Integer.valueOf(i2));
                if (z) {
                    l = r5.A0D.A01();
                    StringBuilder sb2 = new StringBuilder("sync-response-handler/onGlobalError request sync with delay based on the max of server provided ");
                    sb2.append(number);
                    sb2.append(" and client calculated delay ");
                    sb2.append(l);
                    Log.d(sb2.toString());
                    if (!(number == null || l == null)) {
                        l = Long.valueOf(Math.max(number.longValue(), l.longValue()));
                    }
                }
                r5.A05(z, false, l);
                return;
            case 2:
                AbstractC02620Cu r4 = (AbstractC02620Cu) this.A01;
                r4.A0A((AnonymousClass2NI) this.A02, this.A00, this.A03, r4.A08.A05(), new AnonymousClass0CZ(1, 987));
                return;
            case 3:
                AnonymousClass010 r0 = (AnonymousClass010) this.A01;
                String str3 = this.A03;
                int i3 = this.A00;
                Runnable runnable = (Runnable) this.A02;
                if (r0.A00 != -1) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    AnonymousClass004 r32 = r0.A0I;
                    long j = elapsedRealtime - r32.A00;
                    long uptimeMillis = SystemClock.uptimeMillis() - r32.A01;
                    if (r0.A07) {
                        if (r0.A04 != null) {
                            HashMap hashMap = new HashMap(4);
                            hashMap.put("from", r0.A05);
                            hashMap.put("to", str3);
                            AnonymousClass1X8 r13 = r0.A0J;
                            Long l2 = r0.A04;
                            int i4 = r0.A00;
                            if (r13 == null) {
                                throw null;
                            } else if (!(AnonymousClass1X7.A00 != 2 || (r3 = AnonymousClass10H.A07) == null || r3.A03.get() == 0)) {
                                long longValue = Long.valueOf(l2.longValue() | ((long) 2)).longValue();
                                if (hashMap != null && !hashMap.isEmpty()) {
                                    int i5 = 0;
                                    for (Map.Entry entry : hashMap.entrySet()) {
                                        if (entry.getKey() != null && !((String) entry.getKey()).isEmpty() && entry.getValue() != null && !((String) entry.getValue()).isEmpty()) {
                                            i5 += ((String) entry.getKey()).length() + ((String) entry.getKey()).length();
                                            if (((long) i5) <= 2048) {
                                                int i6 = C449422g.A00;
                                                if ((TraceEvents.sProviders & i6) != 0) {
                                                    String str4 = (String) entry.getKey();
                                                    int writeStandardEntry = Logger.writeStandardEntry(i6, 7, 59, 0, 0, i4, 0, longValue);
                                                    if (str4 != null) {
                                                        writeStandardEntry = Logger.writeBytesEntry(i6, 1, 56, writeStandardEntry, str4);
                                                    }
                                                    Logger.writeBytesEntry(i6, 1, 57, writeStandardEntry, (String) entry.getValue());
                                                }
                                            } else {
                                                throw new IllegalArgumentException(String.format(Locale.US, "Maximum Length(%d) of Profilo annotations exceeded %d", 2048L, Integer.valueOf(i5)));
                                            }
                                        }
                                    }
                                }
                                Logger.writeStandardEntry(0, 7, 47, 0, 0, i4, 0, longValue);
                                r13.A01();
                            }
                        }
                        int i7 = r0.A00;
                        if (AnonymousClass1X7.A00 == 2) {
                            AnonymousClass10H r23 = AnonymousClass10H.A07;
                            if (r23 == null) {
                                Log.d("profilo/control not enabled");
                            } else {
                                r23.A03(C449522h.A00, 1, (long) i7, 0);
                            }
                        }
                        Application application = r0.A0G.A00;
                        AnonymousClass0PF.A01(application, ProfiloUploadService.class, 8, new Intent(application, ProfiloUploadService.class));
                    }
                    StringBuilder A0S = AnonymousClass008.A0S("startuptracker/startup completed/");
                    A0S.append(r0.A05);
                    A0S.append("/");
                    A0S.append(str3);
                    Log.d(A0S.toString());
                    C12600iM r42 = new C12600iM();
                    r42.A01 = Integer.valueOf(r0.A01);
                    r42.A03 = Long.valueOf(j);
                    r42.A02 = Long.valueOf(uptimeMillis);
                    r42.A00 = Integer.valueOf(i3);
                    r0.A0H.A0B(r42, r0.A03, false);
                    r0.A0R.ANF(new RunnableEBaseShape3S0100000_I0_3(r0, 39));
                    r0.A00 = -1;
                    r0.A05 = null;
                    r0.A07 = false;
                    r0.A04 = null;
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
