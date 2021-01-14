package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.280  reason: invalid class name */
public class AnonymousClass280 extends AnonymousClass018 {
    public final AnonymousClass08B A00 = AnonymousClass08B.A00;
    public final AnonymousClass0AC A01 = AnonymousClass0AC.A00;
    public final C04490Ko A02 = C04490Ko.A00();
    public final C28631Vd A03 = C28631Vd.A00();
    public final C28661Vg A04;

    @Override // X.AnonymousClass1P5
    public void AHI() {
    }

    public AnonymousClass280() {
        if (C28661Vg.A03 == null) {
            synchronized (C28661Vg.class) {
                if (C28661Vg.A03 == null) {
                    C28751Vp A002 = C28751Vp.A00();
                    C28841Vy A003 = C28841Vy.A00();
                    if (C28681Vi.A02 == null) {
                        synchronized (C28681Vi.class) {
                            if (C28681Vi.A02 == null) {
                                HashSet hashSet = new HashSet();
                                hashSet.add(new C02180Ay(AnonymousClass21X.A00, null));
                                hashSet.add(new C02180Ay(AnonymousClass21Z.A00, null));
                                HashMap hashMap = new HashMap();
                                hashMap.put("com.facebook.stella", new C02180Ay(AnonymousClass21Y.A00, null));
                                C28681Vi.A02 = new C28681Vi(new C05350Oe(hashSet, null), new AnonymousClass0PU(hashMap, null));
                            }
                        }
                    }
                    C28661Vg.A03 = new C28661Vg(A002, A003, C28681Vi.A02);
                }
            }
        }
        this.A04 = C28661Vg.A03;
    }

    @Override // X.AnonymousClass1P5
    public void AHJ() {
        if (this.A03.A01()) {
            Log.d("InstrumentationObserverImpl/onLocalAccountDeletionStarted");
            this.A04.A01();
        }
    }
}
