package X;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.accountsync.LoginActivity;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.1P9  reason: invalid class name */
public class AnonymousClass1P9 extends AbstractAccountAuthenticator {
    public final Context A00;

    public AnonymousClass1P9(Context context) {
        super(context);
        this.A00 = context;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Log.i("account/sync/addAccount");
        Bundle bundle2 = new Bundle();
        Intent intent = new Intent(this.A00, LoginActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        Log.i("account/sync/confirmCredentials");
        return null;
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        Log.i("account/sync/editProperties");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i("account/sync/getAuthToken");
        return null;
    }

    public String getAuthTokenLabel(String str) {
        Log.i("account/sync/getAuthTokenLabel");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        AnonymousClass008.A1U(AnonymousClass008.A0S("account/sync/hasFeatures: "), Arrays.toString(strArr));
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i("account/sync/updateCredentials");
        return null;
    }
}
