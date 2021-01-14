package com.google.android.gms.common.api;

import X.AnonymousClass05S;
import X.AnonymousClass066;
import X.AnonymousClass0N2;
import X.AnonymousClass17C;
import X.AnonymousClass185;
import X.C008805h;
import X.C237417j;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Arrays;

public final class Status extends AnonymousClass066 implements AnonymousClass17C, ReflectedParcelable {
    public static final Status A04 = new Status(1, 16, null, null);
    public static final Status A05 = new Status(1, 8, null, null);
    public static final Status A06 = new Status(1, 14, null, null);
    public static final Status A07 = new Status(1, 0, null, null);
    public static final Status A08 = new Status(1, 15, null, null);
    public static final Parcelable.Creator CREATOR = new C237417j();
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str;
        this.A02 = pendingIntent;
    }

    @Override // X.AnonymousClass17C
    public final Status A9C() {
        return this;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.A00 != status.A00 || this.A01 != status.A01 || !AnonymousClass05S.A0H(this.A03, status.A03) || !AnonymousClass05S.A0H(this.A02, status.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A03, this.A02});
    }

    public final String toString() {
        AnonymousClass185 r2 = new AnonymousClass185(this);
        String str = this.A03;
        if (str == null) {
            str = AnonymousClass0N2.A0q(this.A01);
        }
        r2.A00("statusCode", str);
        r2.A00("resolution", this.A02);
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A01);
        C008805h.A10(parcel, 2, this.A03, false);
        C008805h.A0z(parcel, 3, this.A02, i, false);
        C008805h.A0u(parcel, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, this.A00);
        C008805h.A0r(parcel, A032);
    }
}
