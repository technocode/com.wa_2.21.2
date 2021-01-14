package X;

import android.hardware.Camera;
import android.util.Log;
import java.util.List;
import java.util.UUID;

/* renamed from: X.0yP  reason: invalid class name and case insensitive filesystem */
public class C21230yP implements Camera.ErrorCallback {
    public final /* synthetic */ C33081gA A00;

    public C21230yP(C33081gA r1) {
        this.A00 = r1;
    }

    public void onError(int i, Camera camera) {
        String str;
        boolean z;
        if (i != 1) {
            if (i == 2) {
                str = "Camera evicted. Camera service was likely given to another customer. Camera resources will be released.";
            } else if (i != 100) {
                str = AnonymousClass008.A0F("Unknown error code: ", i);
            } else {
                str = "Camera server died. Camera resources will be released.";
            }
            z = true;
            C33081gA r2 = this.A00;
            List list = r2.A0G.A00;
            UUID uuid = r2.A0Q.A03;
            Log.e("Camera1Device", str);
            r2.A0R.A05(uuid, new RunnableEBaseShape0S1311000_I1(r2, list, i, str, z, uuid, 0));
        }
        str = "Unknown error";
        z = false;
        C33081gA r22 = this.A00;
        List list2 = r22.A0G.A00;
        UUID uuid2 = r22.A0Q.A03;
        Log.e("Camera1Device", str);
        r22.A0R.A05(uuid2, new RunnableEBaseShape0S1311000_I1(r22, list2, i, str, z, uuid2, 0));
    }
}
