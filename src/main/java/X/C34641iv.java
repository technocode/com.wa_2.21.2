package X;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

/* renamed from: X.1iv  reason: invalid class name and case insensitive filesystem */
public final class C34641iv implements AbstractC235916n {
    public final /* synthetic */ Account A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ String A02 = "oauth2:https://www.googleapis.com/auth/drive.appdata https://www.googleapis.com/auth/drive.file";

    public C34641iv(Account account, Bundle bundle) {
        this.A00 = account;
        this.A01 = bundle;
    }

    @Override // X.AbstractC235916n
    public final Object AS9(IBinder iBinder) {
        AbstractC241319b r1;
        if (iBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof AbstractC241319b) {
                r1 = (AbstractC241319b) queryLocalInterface;
            } else {
                r1 = new C35621kf(iBinder);
            }
        }
        Bundle ARi = r1.ARi(this.A00, this.A02, this.A01);
        C235816m.A03(ARi);
        ARi.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle = ARi.getBundle("tokenDetails");
        AnonymousClass19Y r12 = null;
        if (bundle != null) {
            bundle.setClassLoader(TokenData.class.getClassLoader());
            Parcelable parcelable = bundle.getParcelable("TokenData");
            if (parcelable != null) {
                return parcelable;
            }
        }
        String string = ARi.getString("Error");
        Intent intent = (Intent) ARi.getParcelable("userRecoveryIntent");
        AnonymousClass19Y[] values = AnonymousClass19Y.values();
        for (AnonymousClass19Y r3 : values) {
            if (r3.zzek.equals(string)) {
                r12 = r3;
            }
        }
        if (AnonymousClass19Y.BAD_AUTHENTICATION.equals(r12) || AnonymousClass19Y.CAPTCHA.equals(r12) || AnonymousClass19Y.NEED_PERMISSION.equals(r12) || AnonymousClass19Y.NEED_REMOTE_CONSENT.equals(r12) || AnonymousClass19Y.NEEDS_BROWSER.equals(r12) || AnonymousClass19Y.USER_CANCEL.equals(r12) || AnonymousClass19Y.DEVICE_MANAGEMENT_REQUIRED.equals(r12) || AnonymousClass19Y.DM_INTERNAL_ERROR.equals(r12) || AnonymousClass19Y.DM_SYNC_DISABLED.equals(r12) || AnonymousClass19Y.DM_ADMIN_BLOCKED.equals(r12) || AnonymousClass19Y.DM_ADMIN_PENDING_APPROVAL.equals(r12) || AnonymousClass19Y.DM_STALE_SYNC_REQUIRED.equals(r12) || AnonymousClass19Y.DM_DEACTIVATED.equals(r12) || AnonymousClass19Y.DM_REQUIRED.equals(r12) || AnonymousClass19Y.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(r12) || AnonymousClass19Y.DM_SCREENLOCK_REQUIRED.equals(r12)) {
            AnonymousClass18U r5 = C235816m.A01;
            String valueOf = String.valueOf(r12);
            StringBuilder sb = new StringBuilder(valueOf.length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            Log.w("Auth", r5.A00("GoogleAuthUtil", sb.toString()));
            throw new C34541ih(string, intent);
        } else if (AnonymousClass19Y.NETWORK_ERROR.equals(r12) || AnonymousClass19Y.SERVICE_UNAVAILABLE.equals(r12) || AnonymousClass19Y.INTNERNAL_ERROR.equals(r12)) {
            throw new IOException(string);
        } else {
            throw new AnonymousClass16O(string);
        }
    }
}
