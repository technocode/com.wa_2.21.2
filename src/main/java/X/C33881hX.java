package X;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: X.1hX  reason: invalid class name and case insensitive filesystem */
public final class C33881hX implements AbstractC226312o {
    public final /* synthetic */ C33891hY A00;

    public C33881hX(C33891hY r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC226312o
    public void AGo(long j) {
        StringBuilder sb = new StringBuilder("Ignoring impossibly large audio latency: ");
        sb.append(j);
        Log.w("AudioTrack", sb.toString());
    }

    @Override // X.AbstractC226312o
    public void AIa(long j, long j2, long j3, long j4) {
        long j5;
        StringBuilder A0V = AnonymousClass008.A0V("Spurious audio timestamp (frame position mismatch): ", j, ", ");
        A0V.append(j2);
        A0V.append(", ");
        A0V.append(j3);
        A0V.append(", ");
        A0V.append(j4);
        A0V.append(", ");
        C33891hY r6 = this.A00;
        if (r6.A0X) {
            j5 = r6.A0J / ((long) r6.A0B);
        } else {
            j5 = r6.A0I;
        }
        A0V.append(j5);
        A0V.append(", ");
        A0V.append(r6.A00());
        Log.w("AudioTrack", A0V.toString());
    }

    @Override // X.AbstractC226312o
    public void AKt(long j, long j2, long j3, long j4) {
        long j5;
        StringBuilder A0V = AnonymousClass008.A0V("Spurious audio timestamp (system clock mismatch): ", j, ", ");
        A0V.append(j2);
        A0V.append(", ");
        A0V.append(j3);
        A0V.append(", ");
        A0V.append(j4);
        A0V.append(", ");
        C33891hY r6 = this.A00;
        if (r6.A0X) {
            j5 = r6.A0J / ((long) r6.A0B);
        } else {
            j5 = r6.A0I;
        }
        A0V.append(j5);
        A0V.append(", ");
        A0V.append(r6.A00());
        Log.w("AudioTrack", A0V.toString());
    }

    @Override // X.AbstractC226312o
    public void ALO(int i, long j) {
        C33891hY r0 = this.A00;
        AbstractC225912j r2 = r0.A0Q;
        if (r2 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - r0.A0E;
            C33911ha r22 = (C33911ha) r2;
            C225512f r4 = r22.A00.A0F;
            if (r4.A01 != null) {
                r4.A00.post(new RunnableEBaseShape0S0101200_I1(r4, i, j, elapsedRealtime, 0));
            }
            if (r22.A00 == null) {
                throw null;
            }
        }
    }
}
