package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

/* renamed from: X.12Y  reason: invalid class name */
public final class AnonymousClass12Y {
    public static final AnonymousClass12Y A02 = new AnonymousClass12Y(new int[]{2}, 8);
    public final int A00;
    public final int[] A01;

    public AnonymousClass12Y(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.A01 = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i;
    }

    public static AnonymousClass12Y A00(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return A02;
        }
        return new AnonymousClass12Y(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass12Y)) {
            return false;
        }
        AnonymousClass12Y r4 = (AnonymousClass12Y) obj;
        if (!Arrays.equals(this.A01, r4.A01) || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("AudioCapabilities[maxChannelCount=");
        A0S.append(this.A00);
        A0S.append(", supportedEncodings=");
        A0S.append(Arrays.toString(this.A01));
        A0S.append("]");
        return A0S.toString();
    }
}
