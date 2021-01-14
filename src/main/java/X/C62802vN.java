package X;

import java.util.Comparator;

/* renamed from: X.2vN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62802vN implements Comparator {
    public final /* synthetic */ C10060dy A00;

    public /* synthetic */ C62802vN(C10060dy r1) {
        this.A00 = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AnonymousClass1VM r11 = (AnonymousClass1VM) obj2;
        AbstractC460627w r0 = (AbstractC460627w) ((AnonymousClass1VM) obj).A06;
        long j = Long.MAX_VALUE;
        if (r0 != null) {
            long j2 = r0.A06;
            if (j2 >= 0) {
                j = j2;
            }
        }
        AbstractC460627w r02 = (AbstractC460627w) r11.A06;
        long j3 = Long.MAX_VALUE;
        if (r02 != null) {
            long j4 = r02.A06;
            if (j4 >= 0) {
                j3 = j4;
            }
        }
        return (j > j3 ? 1 : (j == j3 ? 0 : -1));
    }
}
