package X;

import java.io.File;
import java.util.HashSet;

/* renamed from: X.1YG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1YG extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AnonymousClass00L A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ HashSet A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ AnonymousClass1YG(AnonymousClass00L r1, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, HashSet hashSet, File file, String str) {
        this.A00 = r1;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A07 = z4;
        this.A08 = z5;
        this.A03 = hashSet;
        this.A01 = file;
        this.A02 = str;
    }

    public final void run() {
        AnonymousClass00L r2 = this.A00;
        boolean z = this.A04;
        boolean z2 = this.A05;
        boolean z3 = this.A06;
        boolean z4 = this.A07;
        boolean z5 = this.A08;
        HashSet hashSet = this.A03;
        File file = this.A01;
        String str = this.A02;
        if (z) {
            synchronized (AnonymousClass00L.A0E) {
                r2.A07(z2, z3, z4, z5, hashSet, file, str);
            }
            return;
        }
        r2.A07(z2, z3, z4, z5, hashSet, file, str);
    }
}
