package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;

/* renamed from: X.18j  reason: invalid class name and case insensitive filesystem */
public final class C239918j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 2:
                    j = AnonymousClass05S.A05(parcel, readInt);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
                case 4:
                    str = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 5:
                    i3 = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 6:
                    arrayList = AnonymousClass05S.A0A(parcel, readInt);
                    break;
                case 8:
                    j2 = AnonymousClass05S.A05(parcel, readInt);
                    break;
                case 10:
                    str3 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 11:
                    i2 = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 12:
                    str2 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 13:
                    str4 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 14:
                    i4 = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 15:
                    f = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                    j3 = AnonymousClass05S.A05(parcel, readInt);
                    break;
                case 17:
                    str5 = AnonymousClass05S.A09(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
