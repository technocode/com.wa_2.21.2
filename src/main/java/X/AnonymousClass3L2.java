package X;

import android.os.HandlerThread;
import android.os.Looper;
import java.io.Writer;

/* renamed from: X.3L2  reason: invalid class name */
public final class AnonymousClass3L2 implements AnonymousClass0GO {
    public HandlerThread A00;
    public final AnonymousClass0GO A01;
    public final AnonymousClass0GO A02;
    public final AnonymousClass0GO A03;
    public final Writer A04;
    public final String A05;

    public AnonymousClass3L2(AnonymousClass0GO r2, AnonymousClass0GO r3, Writer writer, String str) {
        this.A02 = r2;
        this.A01 = r3;
        this.A04 = writer;
        this.A03 = new AnonymousClass3L5(writer);
        this.A05 = str;
    }

    public final void A00(AnonymousClass0M5 r4) {
        try {
            this.A04.write(this.A05);
            this.A03.ARM(r4);
        } catch (Exception unused) {
        }
        HandlerThread handlerThread = this.A00;
        if (handlerThread != null) {
            Looper looper = handlerThread.getLooper();
            boolean z = false;
            if (looper == Looper.myLooper()) {
                z = true;
            }
            AnonymousClass00E.A07(z);
        }
    }

    @Override // X.AnonymousClass0GO
    public void AQK() {
        this.A02.AQK();
        this.A04.write(this.A05);
        this.A03.AQK();
    }

    @Override // X.AnonymousClass0GO
    public void ARM(AnonymousClass0M5 r2) {
        this.A02.ARM(r2);
        A00(r2);
    }

    @Override // X.AnonymousClass0GO
    public void ARN(AnonymousClass0M5 r2, int i) {
        this.A02.ARN(r2, i);
        A00(r2);
    }

    @Override // X.AnonymousClass0GO
    public byte[] ARO(AnonymousClass0M5 r2) {
        A00(r2);
        return this.A01.ARO(r2);
    }
}
