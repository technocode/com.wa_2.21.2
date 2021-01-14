package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;

/* renamed from: X.0SQ  reason: invalid class name */
public class AnonymousClass0SQ extends AnonymousClass0O1 implements AbstractC005302m, AnonymousClass02o {
    public final Activity A00;
    public final Context A01;
    public final Handler A02;
    public final AnonymousClass0LW A03 = new AnonymousClass0SR();
    public final /* synthetic */ ActivityC004902h A04;

    public AnonymousClass0SQ(ActivityC004902h r3) {
        this.A04 = r3;
        Handler handler = new Handler();
        this.A00 = r3;
        this.A01 = r3;
        this.A02 = handler;
    }

    @Override // X.AbstractC005102k
    public AbstractC013907w A75() {
        return this.A04.A08;
    }

    @Override // X.AnonymousClass02o
    public AnonymousClass0S8 A7i() {
        return ((AnonymousClass02i) this.A04).A02;
    }

    @Override // X.AbstractC005302m
    public AnonymousClass0O5 A9n() {
        return this.A04.A9n();
    }
}
