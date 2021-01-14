package X;

import com.whatsapp.util.Log;

/* renamed from: X.2iU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56352iU implements AbstractC03150Ez {
    public final /* synthetic */ C56862jJ A00;

    public /* synthetic */ C56352iU(C56862jJ r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        C56862jJ r2 = this.A00;
        StringBuilder sb = new StringBuilder("mediajobmanager/optimistic/transcode finished; job=");
        sb.append(r2);
        Log.d(sb.toString());
    }
}
