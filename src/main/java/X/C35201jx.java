package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.1jx  reason: invalid class name and case insensitive filesystem */
public class C35201jx extends AnonymousClass066 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass18N();
    public final int A00;
    public final int A01;
    public final Account A02;
    public final GoogleSignInAccount A03;

    public C35201jx(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.A00 = i;
        this.A02 = account;
        this.A01 = i2;
        this.A03 = googleSignInAccount;
    }

    public C35201jx(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this.A00 = 2;
        this.A02 = account;
        this.A01 = i;
        this.A03 = googleSignInAccount;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A0z(parcel, 2, this.A02, i, false);
        C008805h.A0u(parcel, 3, this.A01);
        C008805h.A0z(parcel, 4, this.A03, i, false);
        C008805h.A0r(parcel, A032);
    }
}
