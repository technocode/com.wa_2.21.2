package X;

import android.view.Choreographer;

/* renamed from: X.0dS  reason: invalid class name and case insensitive filesystem */
public class C09740dS {
    public long A00 = -1;
    public long A01 = -1;
    public C09730dR A02;
    public boolean A03 = false;
    public final Choreographer.FrameCallback A04;
    public final Choreographer A05;

    public C09740dS(Choreographer choreographer, C09730dR r4) {
        this.A05 = choreographer;
        this.A02 = r4;
        this.A04 = new Choreographer$FrameCallbackC09750dT(this);
    }
}
