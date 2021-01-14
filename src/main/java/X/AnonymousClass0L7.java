package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0L7  reason: invalid class name */
public class AnonymousClass0L7 {
    public static volatile AnonymousClass0L7 A05;
    public int A00;
    public C09690dN A01;
    public Boolean A02;
    public final AnonymousClass00Y A03;
    public final AnonymousClass0L8 A04;

    public AnonymousClass0L7(AnonymousClass00Y r1, AnonymousClass0L8 r2) {
        this.A03 = r1;
        this.A04 = r2;
    }

    public static AnonymousClass0L7 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0L7.class) {
                if (A05 == null) {
                    AnonymousClass00Y A002 = AnonymousClass00Y.A00();
                    if (AnonymousClass0L8.A01 == null) {
                        synchronized (AnonymousClass0L8.class) {
                            if (AnonymousClass0L8.A01 == null) {
                                AnonymousClass0L8.A01 = new AnonymousClass0L8(C002101e.A00());
                            }
                        }
                    }
                    A05 = new AnonymousClass0L7(A002, AnonymousClass0L8.A01);
                }
            }
        }
        return A05;
    }

    public void A01() {
        C09690dN r9 = this.A01;
        if (r9 != null) {
            C09720dQ r8 = r9.A02;
            if (r8.A05) {
                r8.A05 = false;
                C09740dS r0 = r8.A03;
                r0.A03 = false;
                r0.A05.removeFrameCallback(r0.A04);
                double min = Math.min(r8.A01, 3600.0d);
                double min2 = Math.min(r8.A00, 1000.0d);
                long millis = TimeUnit.NANOSECONDS.toMillis(Math.min(r8.A02, C09720dQ.A07));
                C09700dO r11 = (C09700dO) r8.A04;
                C09690dN r02 = r11.A00;
                Integer num = r02.A00;
                if (num != null) {
                    if (!r02.A05.containsKey(num)) {
                        C09690dN r03 = r11.A00;
                        r03.A05.put(r03.A00, new C63932xF());
                    }
                    C09690dN r10 = r11.A00;
                    C63932xF r112 = (C63932xF) r10.A05.get(r10.A00);
                    r112.A02++;
                    r112.A00 += min2;
                    r112.A01 += min;
                    r112.A03 += millis;
                    StringBuilder A0S = AnonymousClass008.A0S("scrollperf/surface=");
                    A0S.append(r10.A00);
                    A0S.append(",duration=");
                    A0S.append(millis);
                    A0S.append(",largeFrameDrop=");
                    A0S.append(min2);
                    A0S.append(",smallFrameDrop=");
                    A0S.append(min);
                    Log.d(A0S.toString());
                }
                if (r8.A04 != null) {
                    Log.d("scrollperf/stop");
                    r8.A01 = 0.0d;
                    r8.A00 = 0.0d;
                    r8.A02 = 0;
                } else {
                    throw null;
                }
            }
            r9.A00 = null;
        }
    }

    public void A02(int i) {
        C09690dN r6 = this.A01;
        if (r6 != null) {
            C09720dQ r5 = r6.A02;
            if (!r5.A05) {
                r5.A05 = true;
                C09740dS r2 = r5.A03;
                if (!r2.A03) {
                    r2.A00 = -1;
                }
                r2.A03 = true;
                r2.A05.postFrameCallback(r2.A04);
                if (r5.A04 != null) {
                    Log.d("scrollperf/start");
                } else {
                    throw null;
                }
            }
            r6.A00 = Integer.valueOf(i);
            if (r6.A04 == null) {
                throw null;
            }
        }
    }

    public void A03(Context context) {
        Boolean bool = this.A02;
        if (bool == null) {
            boolean z = false;
            if (new Random().nextInt(300) == 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            this.A02 = bool;
            this.A00 = 300;
        }
        if (bool.booleanValue() && this.A01 == null) {
            this.A01 = new C09690dN(this.A03, this.A04, context, this.A00);
        }
    }
}
