package X;

/* renamed from: X.1eu  reason: invalid class name and case insensitive filesystem */
public class C32411eu implements AbstractC21150yG {
    public final /* synthetic */ TextureView$SurfaceTextureListenerC32431ew A00;

    public C32411eu(TextureView$SurfaceTextureListenerC32431ew r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC21150yG
    public void AIn(C22070zn r9) {
        AnonymousClass0VV r0;
        TextureView$SurfaceTextureListenerC32431ew r2 = this.A00;
        AbstractC19820vf r7 = r2.A06;
        AbstractC21080y9 r1 = r2.A0M;
        C32441ex[] r6 = null;
        if (r1 != null && r1.isConnected()) {
            try {
                r0 = r1.A58();
            } catch (C21100yB unused) {
            }
            if (!(r7 == null || r0 == null)) {
                r0.A01();
                int i = r2.A02;
                if (r9 != null) {
                    C22060zm[] r5 = r9.A0B;
                    if (r5 != null) {
                        int length = r5.length;
                        r6 = new C32441ex[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            C22060zm r02 = r5[i2];
                            if (r02 != null) {
                                r6[i2] = new C32441ex(r02.A02, r02.A01);
                            }
                        }
                    }
                    r7.AIm(new C19810ve(r9.A09, r6, r9.A02, r9.A00));
                    return;
                }
                return;
            }
        }
        r0 = null;
        if (r7 == null) {
        }
    }
}
