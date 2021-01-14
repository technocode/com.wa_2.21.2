package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2ik  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56512ik implements AbstractC03150Ez {
    public final /* synthetic */ C40531tQ A00;
    public final /* synthetic */ C04420Kh A01;
    public final /* synthetic */ C56862jJ A02;

    public /* synthetic */ C56512ik(C04420Kh r1, C40531tQ r2, C56862jJ r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C04420Kh r4 = this.A01;
        C40531tQ r5 = this.A00;
        C56862jJ r3 = this.A02;
        StringBuilder A0S = AnonymousClass008.A0S("mediajobmanager/processmedia/response for ");
        CopyOnWriteArrayList copyOnWriteArrayList = r5.A01;
        A0S.append(copyOnWriteArrayList.size());
        A0S.append(" messages; job=");
        A0S.append(r3);
        Log.d(A0S.toString());
        C04430Ki.A01(obj, r5, new C56552io(r4.A08));
        for (AbstractC007503q r2 : Collections.unmodifiableList(copyOnWriteArrayList)) {
            r4.A04.A0Q(r2, -1);
        }
    }
}
