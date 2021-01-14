package com.google.android.gms.auth.api.signin;

import X.AnonymousClass066;
import X.C001801b;
import X.C008805h;
import X.C235716l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount extends AnonymousClass066 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C235716l();
    public GoogleSignInAccount A00;
    public String A01;
    public String A02;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.A00 = googleSignInAccount;
        C001801b.A1V(str, "8.3 and 8.4 SDKs require non-null email");
        this.A01 = str;
        C001801b.A1V(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.A02 = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A10(parcel, 4, this.A01, false);
        C008805h.A0z(parcel, 7, this.A00, i, false);
        C008805h.A10(parcel, 8, this.A02, false);
        C008805h.A0r(parcel, A03);
    }
}
