package X;

import java.util.List;

/* renamed from: X.2id  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56442id implements AbstractC03150Ez {
    public final /* synthetic */ C04420Kh A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ C56442id(C04420Kh r1, List list, Runnable runnable) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = runnable;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C04420Kh r5 = this.A00;
        List<AnonymousClass0M3> list = this.A02;
        Runnable runnable = this.A01;
        for (AnonymousClass0M3 r2 : list) {
            if (C04430Ki.A00(r2, true)) {
                r5.A05.A06(r2, -1);
            }
        }
        runnable.run();
    }
}
