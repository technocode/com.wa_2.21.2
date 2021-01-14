package com.google.android.gms.common.api;

import X.AnonymousClass066;
import X.C001801b;
import X.C008805h;
import X.C237317i;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends AnonymousClass066 implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C237317i();
    public final int A00;
    public final String A01;

    public Scope(int i, String str) {
        C001801b.A1V(str, "scopeUri must not be null or empty");
        this.A00 = i;
        this.A01 = str;
    }

    public Scope(String str) {
        C001801b.A1V(str, "scopeUri must not be null or empty");
        this.A00 = 1;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.A01.equals(((Scope) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A10(parcel, 2, this.A01, false);
        C008805h.A0r(parcel, A03);
    }
}
