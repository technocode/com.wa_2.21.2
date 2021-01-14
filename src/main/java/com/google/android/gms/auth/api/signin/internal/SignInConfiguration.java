package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass066;
import X.AnonymousClass16g;
import X.C001801b;
import X.C008805h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration extends AnonymousClass066 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass16g();
    public GoogleSignInOptions A00;
    public final String A01;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        C001801b.A1T(str);
        this.A01 = str;
        this.A00 = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.A01.equals(signInConfiguration.A01)) {
            GoogleSignInOptions googleSignInOptions = this.A00;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.A00;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        GoogleSignInOptions googleSignInOptions = this.A00;
        int i2 = (hashCode + 31) * 31;
        if (googleSignInOptions != null) {
            i = googleSignInOptions.hashCode();
        }
        return i2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 2, this.A01, false);
        C008805h.A0z(parcel, 5, this.A00, i, false);
        C008805h.A0r(parcel, A03);
    }
}
