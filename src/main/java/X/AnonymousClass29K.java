package X;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.29K  reason: invalid class name */
public class AnonymousClass29K extends AnonymousClass269 implements AbstractC458426o {
    public Integer A00;
    public final Bundle A01;
    public final C238417u A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass29K(Context context, Looper looper, C238417u r14, AnonymousClass176 r15, AnonymousClass177 r16) {
        super(context, looper, 44, r14, r15, r16);
        C36121lc r4 = r14.A01;
        Integer num = r14.A00;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (r4 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        this.A03 = true;
        this.A02 = r14;
        this.A01 = bundle;
        this.A00 = r14.A00;
    }

    @Override // X.AbstractC238217s, X.AbstractC34701j2
    public boolean AMw() {
        return true;
    }

    @Override // X.AbstractC458426o
    public final void ARS(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((AbstractC24531Bi) A01()).ARR(iAccountAccessor, this.A00.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // X.AbstractC458426o
    public final void ARV(AbstractC24521Bh r5) {
        C001801b.A1R(r5, "Expecting a valid ISignInCallbacks");
        try {
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C234916a.A00(this.A0F).A02();
            }
            ((AbstractC24531Bi) A01()).ARW(new C36161lg(new C35201jx(account, this.A00.intValue(), googleSignInAccount)), r5);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                r5.ARZ(new C36171lh());
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // X.AbstractC458426o
    public final void ARc() {
        try {
            ((AbstractC24531Bi) A01()).ARd(this.A00.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // X.AbstractC458426o
    public final void connect() {
        A2x(new C35131jq(this));
    }
}
