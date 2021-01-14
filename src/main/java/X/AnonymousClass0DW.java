package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0DW  reason: invalid class name */
public class AnonymousClass0DW {
    public static volatile AnonymousClass0DW A08;
    public int A00;
    public Runnable A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass0DX A05;
    public final AnonymousClass00T A06;
    public final Set A07;

    public AnonymousClass0DW(AnonymousClass00T r3, AnonymousClass0DX r4) {
        HashSet hashSet = new HashSet();
        this.A07 = hashSet;
        this.A06 = r3;
        this.A05 = r4;
        hashSet.add("Portal");
        this.A07.add("Unknown");
        this.A07.add("iPad");
    }

    public static AnonymousClass0DW A00() {
        if (A08 == null) {
            synchronized (AnonymousClass0DW.class) {
                if (A08 == null) {
                    A08 = new AnonymousClass0DW(C002101e.A00(), AnonymousClass0DX.A00());
                }
            }
        }
        return A08;
    }

    public final synchronized void A01() {
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A06.AMj(runnable);
        }
    }
}
