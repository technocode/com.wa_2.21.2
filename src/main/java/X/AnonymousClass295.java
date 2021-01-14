package X;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.295  reason: invalid class name */
public final class AnonymousClass295 extends AnonymousClass269 {
    public final GoogleSignInOptions A00;

    @Override // X.AbstractC238217s, X.AbstractC34701j2
    public final boolean AMD() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass295(Context context, Looper looper, C238417u r24, GoogleSignInOptions googleSignInOptions, AnonymousClass176 r26, AnonymousClass177 r27) {
        super(context, looper, 91, r24, r26, r27);
        GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
        if (googleSignInOptions == null) {
            HashSet hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            if (hashSet.contains(GoogleSignInOptions.A0E)) {
                Scope scope = GoogleSignInOptions.A0D;
                if (hashSet.contains(scope)) {
                    hashSet.remove(scope);
                }
            }
            googleSignInOptions2 = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap);
        }
        Set<Object> set = r24.A06;
        if (!set.isEmpty()) {
            C001801b.A1Q(googleSignInOptions2);
            HashSet hashSet2 = new HashSet(googleSignInOptions2.A06);
            boolean z = googleSignInOptions2.A08;
            boolean z2 = googleSignInOptions2.A07;
            boolean z3 = googleSignInOptions2.A04;
            String str = googleSignInOptions2.A01;
            Account account = googleSignInOptions2.A00;
            String str2 = googleSignInOptions2.A02;
            Map A002 = GoogleSignInOptions.A00(googleSignInOptions2.A03);
            for (Object obj : set) {
                hashSet2.add(obj);
                hashSet2.addAll(Arrays.asList(new Scope[0]));
            }
            if (hashSet2.contains(GoogleSignInOptions.A0E)) {
                Scope scope2 = GoogleSignInOptions.A0D;
                if (hashSet2.contains(scope2)) {
                    hashSet2.remove(scope2);
                }
            }
            if (z3 && (account == null || !hashSet2.isEmpty())) {
                hashSet2.add(GoogleSignInOptions.A0C);
            }
            googleSignInOptions2 = new GoogleSignInOptions(3, new ArrayList(hashSet2), account, z3, z, z2, str, str2, A002);
        }
        this.A00 = googleSignInOptions2;
    }

    @Override // X.AbstractC238217s, X.AbstractC34701j2
    public final Intent A95() {
        Context context = this.A0F;
        GoogleSignInOptions googleSignInOptions = this.A00;
        AnonymousClass18U r4 = AnonymousClass16c.A00;
        Object[] objArr = new Object[0];
        if (r4.A00 <= 3) {
            Log.d("GoogleSignInCommon", r4.A00("getSignInIntent()", objArr));
        }
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }
}
