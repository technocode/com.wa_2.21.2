package X;

/* renamed from: X.2Wf  reason: invalid class name and case insensitive filesystem */
public class C50832Wf implements AbstractC46582Ea {
    public final AnonymousClass2EZ A00 = new AnonymousClass2EZ();
    public final /* synthetic */ SurfaceHolder$CallbackC50852Wi A01;

    public C50832Wf(SurfaceHolder$CallbackC50852Wi r2) {
        this.A01 = r2;
    }

    @Override // X.AbstractC46582Ea
    public synchronized AnonymousClass2EZ A4b() {
        AnonymousClass2EZ r3;
        r3 = this.A00;
        byte[] bArr = r3.A02;
        if (bArr != null) {
            SurfaceHolder$CallbackC50852Wi r1 = this.A01;
            if (r1.A07 != null && !r1.A0P && bArr == r1.A0X) {
                r1.A07.addCallbackBuffer(bArr);
            }
            r3.A02 = null;
        }
        while (r3.A02 == null) {
            wait();
        }
        return r3;
    }
}
