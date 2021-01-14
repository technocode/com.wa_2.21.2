package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1iQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C34401iQ implements AbstractC233015f {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;

    public /* synthetic */ C34401iQ(int i, long j, long j2) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // X.AbstractC233015f
    public final void ANo(Object obj) {
        AnonymousClass12T r0;
        C33851hU r3 = (C33851hU) ((AnonymousClass15A) obj);
        ArrayList arrayList = r3.A02.A05;
        if (arrayList.isEmpty()) {
            r0 = null;
        } else {
            r0 = (AnonymousClass12T) arrayList.get(arrayList.size() - 1);
        }
        r3.A04(r0);
        Iterator it = r3.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }
}
