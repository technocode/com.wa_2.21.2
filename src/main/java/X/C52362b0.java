package X;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.2b0  reason: invalid class name and case insensitive filesystem */
public final class C52362b0 extends AnonymousClass0JW {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C04360Kb A01;
    public final /* synthetic */ AnonymousClass00D A02;
    public final /* synthetic */ AnonymousClass0A8 A03;
    public final /* synthetic */ WeakReference A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public C52362b0(List list, C04360Kb r2, boolean z, long j, WeakReference weakReference, AnonymousClass00D r7, AnonymousClass0A8 r8) {
        this.A05 = list;
        this.A01 = r2;
        this.A06 = z;
        this.A00 = j;
        this.A04 = weakReference;
        this.A02 = r7;
        this.A03 = r8;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ActivityC004702f r1 = (ActivityC004702f) this.A04.get();
        if (r1 != null && !r1.isFinishing()) {
            r1.AMi();
        }
        AnonymousClass00D r3 = this.A02;
        r3.A0N(this.A05.size() + r3.A00.getInt("delete_chat_count", 0));
        this.A03.A03(0);
    }
}
