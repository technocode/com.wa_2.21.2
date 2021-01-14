package com.google.android.gms.auth.api.signin;

import X.AbstractC240018k;
import X.AnonymousClass066;
import X.C008805h;
import X.C235416i;
import X.C35431kL;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoogleSignInAccount extends AnonymousClass066 implements ReflectedParcelable {
    public static AbstractC240018k A0D = C35431kL.A00;
    public static final Parcelable.Creator CREATOR = new C235416i();
    public long A00;
    public Uri A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public Set A0B = new HashSet();
    public final int A0C;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.A0C = i;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = uri;
        this.A06 = str5;
        this.A00 = j;
        this.A07 = str6;
        this.A0A = list;
        this.A08 = str7;
        this.A09 = str8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.A07.equals(this.A07)) {
            HashSet hashSet = new HashSet(googleSignInAccount.A0A);
            hashSet.addAll(googleSignInAccount.A0B);
            HashSet hashSet2 = new HashSet(this.A0A);
            hashSet2.addAll(this.A0B);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        HashSet hashSet = new HashSet(this.A0A);
        hashSet.addAll(this.A0B);
        return hashSet.hashCode() + ((this.A07.hashCode() + 527) * 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A0C);
        C008805h.A10(parcel, 2, this.A02, false);
        C008805h.A10(parcel, 3, this.A03, false);
        C008805h.A10(parcel, 4, this.A04, false);
        C008805h.A10(parcel, 5, this.A05, false);
        C008805h.A0z(parcel, 6, this.A01, i, false);
        C008805h.A10(parcel, 7, this.A06, false);
        C008805h.A0w(parcel, 8, this.A00);
        C008805h.A10(parcel, 9, this.A07, false);
        C008805h.A12(parcel, 10, this.A0A, false);
        C008805h.A10(parcel, 11, this.A08, false);
        C008805h.A10(parcel, 12, this.A09, false);
        C008805h.A0r(parcel, A032);
    }
}
