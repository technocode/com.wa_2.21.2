package X;

import android.os.Handler;

/* renamed from: X.1jV  reason: invalid class name and case insensitive filesystem */
public final class C34961jV implements AnonymousClass05Z {
    public final /* synthetic */ AnonymousClass17J A00;

    public C34961jV(AnonymousClass17J r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass05Z
    public final void ADH(boolean z) {
        Handler handler = this.A00.A05;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
