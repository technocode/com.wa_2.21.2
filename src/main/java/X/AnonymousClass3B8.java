package X;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3B8  reason: invalid class name */
public class AnonymousClass3B8 extends Exception {
    public AnonymousClass3B8(Context context, AnonymousClass01X r6, String str) {
        AnonymousClass008.A17("PAY: ", str);
        String A06 = r6.A06(R.string.npci_error_msg);
        Activity activity = (Activity) context;
        activity.findViewById(R.id.error_layout).setVisibility(0);
        ((TextView) activity.findViewById(R.id.error_message)).setText(A06);
    }
}
