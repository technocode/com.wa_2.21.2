package X;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Arrays;

/* renamed from: X.1ix  reason: invalid class name and case insensitive filesystem */
public final class C34661ix extends AnonymousClass066 {
    public static final C34661ix A04 = new C34661ix(0);
    public static final Parcelable.Creator CREATOR = new C240618u();
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public C34661ix(int i) {
        this.A00 = 1;
        this.A01 = i;
        this.A02 = null;
        this.A03 = null;
    }

    public C34661ix(int i, int i2, PendingIntent pendingIntent, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = pendingIntent;
        this.A03 = str;
    }

    public C34661ix(int i, PendingIntent pendingIntent) {
        this.A00 = 1;
        this.A01 = i;
        this.A02 = pendingIntent;
        this.A03 = null;
    }

    public static String A00(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case AnonymousClass0PW.A01:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean A01() {
        return (this.A01 == 0 || this.A02 == null) ? false : true;
    }

    public final boolean A02() {
        return this.A01 == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C34661ix)) {
            return false;
        }
        C34661ix r5 = (C34661ix) obj;
        return this.A01 == r5.A01 && AnonymousClass05S.A0H(this.A02, r5.A02) && AnonymousClass05S.A0H(this.A03, r5.A03);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), this.A02, this.A03});
    }

    public final String toString() {
        AnonymousClass185 r2 = new AnonymousClass185(this);
        r2.A00("statusCode", A00(this.A01));
        r2.A00("resolution", this.A02);
        r2.A00("message", this.A03);
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A00);
        C008805h.A0u(parcel, 2, this.A01);
        C008805h.A0z(parcel, 3, this.A02, i, false);
        C008805h.A10(parcel, 4, this.A03, false);
        C008805h.A0r(parcel, A032);
    }
}
