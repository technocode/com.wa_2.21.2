package X;

import android.content.pm.PackageManager;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.1Vg  reason: invalid class name and case insensitive filesystem */
public class C28661Vg {
    public static volatile C28661Vg A03;
    public final C28681Vi A00;
    public final C28751Vp A01;
    public final C28841Vy A02;

    public C28661Vg(C28751Vp r1, C28841Vy r2, C28681Vi r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public final Iterable A00() {
        boolean z;
        C28751Vp r5 = this.A01;
        AbstractCollection abstractCollection = (AbstractCollection) r5.A02();
        if (abstractCollection.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        C28681Vi r3 = this.A00;
        Iterator it = r3.A01.iterator();
        while (true) {
            C28351Tz r1 = (C28351Tz) it;
            if (!r1.hasNext()) {
                break;
            }
            arrayList.add(((AbstractC02190Az) r1.next()).get());
        }
        AnonymousClass0PU r32 = r3.A00;
        Iterator it2 = abstractCollection.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            try {
                z = this.A02.A02(str).A03;
            } catch (PackageManager.NameNotFoundException unused) {
                z = false;
            }
            if (!z) {
                AnonymousClass008.A19("InstrumentationChangeDispatcher/verification failed, dropping event for package - ", str);
                r5.A03(str);
            } else {
                AbstractC02190Az r0 = (AbstractC02190Az) r32.A00.get(str);
                if (r0 != null) {
                    arrayList.add(r0.get());
                }
            }
        }
        return arrayList;
    }

    public void A01() {
        for (AbstractC28671Vh r0 : A00()) {
            r0.A00();
        }
        C28751Vp r2 = this.A01;
        Iterator it = ((AbstractCollection) r2.A02()).iterator();
        while (it.hasNext()) {
            r2.A03((String) it.next());
        }
    }
}
