package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Se  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72263Se implements AbstractC000900m {
    public final /* synthetic */ C74313ac A00;

    public /* synthetic */ C72263Se(C74313ac r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC000900m
    public final void AEa(AnonymousClass0JF r6) {
        AnonymousClass34N r2;
        C74313ac r4 = this.A00;
        if (!r4.A02.isFinishing() && r6.A02 && (r2 = r4.A0E) != null && r2.A00() == 4 && r2.A08()) {
            Log.i("MediaViewStreamingVideoPlayer/auto-retry");
            AnonymousClass3SW r1 = r4.A00;
            if (r1 != null) {
                r1.A00("", true, 2);
            }
        }
    }
}
