package X;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16a  reason: invalid class name and case insensitive filesystem */
public class C234916a {
    public static C234916a A02;
    public static final Lock A03 = new ReentrantLock();
    public final SharedPreferences A00;
    public final Lock A01 = new ReentrantLock();

    public C234916a(Context context) {
        this.A00 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C234916a A00(Context context) {
        C001801b.A1Q(context);
        Lock lock = A03;
        lock.lock();
        try {
            C234916a r1 = A02;
            if (r1 == null) {
                r1 = new C234916a(context.getApplicationContext());
                A02 = r1;
            }
            return r1;
        } finally {
            lock.unlock();
        }
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + str.length() + 1);
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public GoogleSignInAccount A02() {
        String A04;
        String A042 = A04("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A042) && (A04 = A04(A01("googleSignInAccount", A042))) != null) {
            try {
                if (!TextUtils.isEmpty(A04)) {
                    JSONObject jSONObject = new JSONObject(A04);
                    String optString = jSONObject.optString("photoUrl", null);
                    Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
                    long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        hashSet.add(new Scope(jSONArray.getString(i)));
                    }
                    String optString2 = jSONObject.optString("id");
                    String optString3 = jSONObject.optString("tokenId", null);
                    String optString4 = jSONObject.optString("email", null);
                    String optString5 = jSONObject.optString("displayName", null);
                    String optString6 = jSONObject.optString("givenName", null);
                    String optString7 = jSONObject.optString("familyName", null);
                    Long valueOf = Long.valueOf(parseLong);
                    String string = jSONObject.getString("obfuscatedIdentifier");
                    if (valueOf == null) {
                        valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                    }
                    long longValue = valueOf.longValue();
                    C001801b.A1T(string);
                    C001801b.A1Q(hashSet);
                    GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
                    googleSignInAccount.A06 = jSONObject.optString("serverAuthCode", null);
                    return googleSignInAccount;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions A03() {
        String A04;
        String A042 = A04("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(A042) && (A04 = A04(A01("googleSignInOptions", A042))) != null) {
            try {
                if (!TextUtils.isEmpty(A04)) {
                    JSONObject jSONObject = new JSONObject(A04);
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArray = jSONObject.getJSONArray("scopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        hashSet.add(new Scope(jSONArray.getString(i)));
                    }
                    String optString = jSONObject.optString("accountName", null);
                    return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap());
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String A04(String str) {
        Lock lock = this.A01;
        lock.lock();
        try {
            return this.A00.getString(str, null);
        } finally {
            lock.unlock();
        }
    }

    public final void A05(String str) {
        Lock lock = this.A01;
        lock.lock();
        try {
            this.A00.edit().remove(str).apply();
        } finally {
            lock.unlock();
        }
    }

    public final void A06(String str, String str2) {
        Lock lock = this.A01;
        lock.lock();
        try {
            this.A00.edit().putString(str, str2).apply();
        } finally {
            lock.unlock();
        }
    }
}
