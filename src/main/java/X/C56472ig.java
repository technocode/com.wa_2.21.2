package X;

import com.whatsapp.util.Log;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2ig  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56472ig implements AbstractC03150Ez {
    public final /* synthetic */ C40531tQ A00;
    public final /* synthetic */ C04420Kh A01;
    public final /* synthetic */ C56862jJ A02;

    public /* synthetic */ C56472ig(C04420Kh r1, C40531tQ r2, C56862jJ r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C04420Kh r5 = this.A01;
        C40531tQ r4 = this.A00;
        C56862jJ r3 = this.A02;
        StringBuilder A0S = AnonymousClass008.A0S("mediajobmanager/upload/enqueued for ");
        CopyOnWriteArrayList copyOnWriteArrayList = r4.A01;
        A0S.append(copyOnWriteArrayList.size());
        A0S.append(" messages; job=");
        A0S.append(r3);
        Log.d(A0S.toString());
        C04430Ki.A01(obj, r4, new C56582ir(r5.A08));
        r5.A05.A07(copyOnWriteArrayList, -1);
    }
}
