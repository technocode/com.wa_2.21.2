package X;

import android.content.Intent;
import com.whatsapp.instrumentation.service.InstrumentationFGService;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Vs  reason: invalid class name and case insensitive filesystem */
public class C28781Vs {
    public static volatile C28781Vs A03;
    public final AnonymousClass00G A00;
    public final AnonymousClass0C5 A01;
    public final Set A02 = new HashSet();

    public C28781Vs(AnonymousClass00G r2, AnonymousClass0C5 r3) {
        this.A00 = r2;
        this.A01 = r3;
    }

    public static C28781Vs A00() {
        if (A03 == null) {
            synchronized (C28781Vs.class) {
                if (A03 == null) {
                    A03 = new C28781Vs(AnonymousClass00G.A01, AnonymousClass0C5.A00());
                }
            }
        }
        return A03;
    }

    public final synchronized void A01(int i) {
        this.A02.add(Integer.valueOf(i));
        this.A01.A03(this.A00.A00, InstrumentationFGService.class, new Intent());
    }

    public final synchronized void A02(int i) {
        Set set = this.A02;
        set.remove(Integer.valueOf(i));
        if (set.isEmpty()) {
            this.A01.A02(this.A00.A00, InstrumentationFGService.class);
        }
    }
}
