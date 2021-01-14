package X;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;

/* renamed from: X.1is  reason: invalid class name and case insensitive filesystem */
public final class C34611is implements AbstractC15630oP {
    public final /* synthetic */ SignInHubActivity A00;

    @Override // X.AbstractC15630oP
    public final void AHG(C15650oR r1) {
    }

    public C34611is(SignInHubActivity signInHubActivity) {
        this.A00 = signInHubActivity;
    }

    @Override // X.AbstractC15630oP
    public final C15650oR AEk(int i, Bundle bundle) {
        SignInHubActivity signInHubActivity = this.A00;
        Set set = AnonymousClass178.A00;
        synchronized (set) {
        }
        return new C456525s(signInHubActivity, set);
    }

    @Override // X.AbstractC15630oP
    public final /* synthetic */ void AHA(C15650oR r4, Object obj) {
        SignInHubActivity signInHubActivity = this.A00;
        signInHubActivity.setResult(signInHubActivity.A00, signInHubActivity.A01);
        signInHubActivity.finish();
    }
}
