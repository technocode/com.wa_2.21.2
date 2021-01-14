package X;

import android.content.Intent;

/* renamed from: X.1aQ  reason: invalid class name and case insensitive filesystem */
public final class C29921aQ implements AbstractC14510mP {
    public final int A00;
    public final Intent A01;
    public final /* synthetic */ AnonymousClass0PF A02;

    public C29921aQ(AnonymousClass0PF r1, Intent intent, int i) {
        this.A02 = r1;
        this.A01 = intent;
        this.A00 = i;
    }

    @Override // X.AbstractC14510mP
    public void A2s() {
        this.A02.stopSelf(this.A00);
    }

    @Override // X.AbstractC14510mP
    public Intent getIntent() {
        return this.A01;
    }
}
