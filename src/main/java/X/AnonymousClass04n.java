package X;

import android.content.Context;
import com.whatsapp.util.Log;
import com.whatsapp.util.crash.SigquitBasedANRDetector;

/* renamed from: X.04n  reason: invalid class name */
public class AnonymousClass04n {
    public int A00 = 0;
    public long A01;
    public AnonymousClass36T A02;
    public final int A03 = 120;
    public final int A04 = 500;
    public final Context A05;

    public AnonymousClass04n(Context context) {
        this.A05 = context;
    }

    public final synchronized void A00(int i, AnonymousClass3SK r7, String str, String str2) {
        if (this.A02.A02 == this.A01) {
            if (i != 0) {
                if (i == 1) {
                    this.A00 = 2;
                    AnonymousClass3SK r72 = r7;
                    StringBuilder sb = new StringBuilder("SigquitBasedANRDetector/On error detected ");
                    sb.append(str);
                    sb.append(" ");
                    sb.append(str2);
                    Log.i(sb.toString());
                    SigquitBasedANRDetector sigquitBasedANRDetector = r72.A01;
                    if (sigquitBasedANRDetector.A09 != null) {
                        sigquitBasedANRDetector.A09.post(new RunnableEBaseShape13S0100000_I1_8(r72, 25));
                    }
                } else if (i == 2) {
                    this.A00 = 0;
                    Log.d("SigquitBasedANRDetector/On max checks reached before error");
                    r7.A00();
                } else if (i == 3) {
                    this.A00 = 0;
                    Log.d("SigquitBasedANRDetector/On monitoring stop");
                    r7.A00();
                } else if (i == 4) {
                    this.A00 = 0;
                    Log.e("SigquitBasedANRDetector/onCheckFailed");
                    r7.A00();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unexpected state change reason: ");
                    sb2.append(i);
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (r7 != null) {
                Log.i("SigquitBasedANRDetector/Started monitoring");
            } else {
                throw null;
            }
        }
    }
}
