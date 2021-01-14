package X;

import android.app.Activity;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.2dN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53502dN implements AnonymousClass1O8 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ AnonymousClass0GG A02;
    public final /* synthetic */ UserJid A03;

    public /* synthetic */ C53502dN(Activity activity, AnonymousClass0GG r2, Intent intent, UserJid userJid) {
        this.A00 = activity;
        this.A02 = r2;
        this.A01 = intent;
        this.A03 = userJid;
    }

    @Override // X.AnonymousClass1O8
    public final void AQl() {
        Activity activity = this.A00;
        this.A02.A06(activity, new C53512dO(new WeakReference(activity), this.A01), new C27911Sc(false, this.A03));
    }
}
