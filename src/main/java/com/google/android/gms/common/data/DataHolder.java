package com.google.android.gms.common.data;

import X.AnonymousClass066;
import X.AnonymousClass17l;
import X.C001801b;
import X.C008805h;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.Closeable;

@KeepName
public final class DataHolder extends AnonymousClass066 implements Closeable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass17l();
    public int A00;
    public Bundle A01;
    public boolean A02 = false;
    public boolean A03 = true;
    public int[] A04;
    public final int A05;
    public final int A06;
    public final Bundle A07;
    public final CursorWindow[] A08;
    public final String[] A09;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.A05 = i;
        this.A09 = strArr;
        this.A08 = cursorWindowArr;
        this.A06 = i2;
        this.A07 = bundle;
    }

    static {
        C001801b.A1Q(new String[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.A02) {
                this.A02 = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.A08;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    @Override // java.lang.Object
    public final void finalize() {
        boolean z;
        try {
            if (this.A08.length > 0) {
                synchronized (this) {
                    z = this.A02;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                    sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb.append(obj);
                    sb.append(")");
                    Log.e("DataBuffer", sb.toString());
                }
            }
        } finally {
            super.finalize();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        String[] strArr = this.A09;
        if (strArr != null) {
            int A033 = C008805h.A03(parcel, 1);
            parcel.writeStringArray(strArr);
            C008805h.A0r(parcel, A033);
        }
        C008805h.A15(parcel, 2, this.A08, i);
        C008805h.A0u(parcel, 3, this.A06);
        C008805h.A0x(parcel, 4, this.A07);
        C008805h.A0u(parcel, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, this.A05);
        C008805h.A0r(parcel, A032);
        if ((i & 1) != 0) {
            close();
        }
    }
}
