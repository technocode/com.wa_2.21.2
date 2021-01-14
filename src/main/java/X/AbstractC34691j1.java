package X;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: X.1j1  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC34691j1 extends C236516y {
    public AbstractC34701j2 A00(Context context, Looper looper, C238417u r16, Object obj, AnonymousClass176 r18, AnonymousClass177 r19) {
        if (this instanceof C458726r) {
            return new AnonymousClass29M(context, looper, r18, r19, r16);
        }
        if (this instanceof C458326n) {
            throw new NoSuchMethodError();
        } else if (this instanceof C458226m) {
            return new AnonymousClass29K(context, looper, r16, r18, r19);
        } else {
            if (this instanceof C458026k) {
                return new AnonymousClass29I(context, looper, r16, r18, r19);
            }
            if (this instanceof C457326b) {
                return new AnonymousClass2AS(context, looper, r18, r19, r16);
            }
            if (this instanceof AnonymousClass26A) {
                return new AnonymousClass29A(context, looper, r16, r18, r19);
            }
            if (this instanceof C456925x) {
                return new AnonymousClass295(context, looper, r16, (GoogleSignInOptions) obj, r18, r19);
            }
            if (this instanceof C456825w) {
                return new AnonymousClass29C(context, looper, r16, (C34551ii) obj, r18, r19);
            }
            if (!(this instanceof C456425r)) {
                return new AnonymousClass29E(context, looper, r16, r18, r19);
            }
            return new AnonymousClass29B(context, looper, r16, r18, r19);
        }
    }
}
