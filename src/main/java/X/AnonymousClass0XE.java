package X;

import android.os.Message;

/* renamed from: X.0XE  reason: invalid class name */
public class AnonymousClass0XE implements AnonymousClass0C0 {
    public static volatile AnonymousClass0XE A02;
    public final AnonymousClass03U A00;
    public final AnonymousClass00T A01;

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{101};
    }

    public AnonymousClass0XE(AnonymousClass00T r1, AnonymousClass03U r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        if (i != 101) {
            return false;
        }
        this.A01.ANF(new RunnableEBaseShape0S1100000_I0(this, (String) message.obj, 4));
        return true;
    }
}
