package X;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: X.1UW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1UW extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass01K A01;
    public final /* synthetic */ Collection A02;
    public final /* synthetic */ HashMap A03;
    public final /* synthetic */ HashMap A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ AnonymousClass1UW(AnonymousClass01K r1, int i, Collection collection, HashMap hashMap, boolean z, HashMap hashMap2) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = collection;
        this.A03 = hashMap;
        this.A05 = z;
        this.A04 = hashMap2;
    }

    public final void run() {
        AnonymousClass01K r8 = this.A01;
        int i = this.A00;
        Collection collection = this.A02;
        HashMap hashMap = this.A03;
        boolean z = this.A05;
        HashMap hashMap2 = this.A04;
        boolean z2 = false;
        if ((i & 2) == 2) {
            z2 = true;
        }
        AnonymousClass0AC r2 = r8.A0m;
        HashMap hashMap3 = null;
        if (z2) {
            hashMap3 = hashMap;
        }
        if (!z) {
            hashMap2 = null;
        }
        r2.A08(collection, hashMap3, hashMap2);
        for (AnonymousClass02N r1 : hashMap.keySet()) {
            r8.A01.A03(r1, false);
        }
    }
}
