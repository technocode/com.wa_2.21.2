package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.39b  reason: invalid class name and case insensitive filesystem */
public class C675539b extends OrientationEventListener {
    public int A00 = -1;
    public final Handler A01 = new Handler(Looper.getMainLooper(), new AnonymousClass38O(this));
    public final /* synthetic */ VoipActivityV2 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C675539b(VoipActivityV2 voipActivityV2, Context context) {
        super(context);
        this.A02 = voipActivityV2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r4 >= (r1 + 270)) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChanged(int r7) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C675539b.onOrientationChanged(int):void");
    }
}
