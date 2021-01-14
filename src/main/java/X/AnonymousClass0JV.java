package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.messaging.CaptivePortalActivity;

/* renamed from: X.0JV  reason: invalid class name */
public final class AnonymousClass0JV extends AnonymousClass0JW {
    public final Context A00;
    public final AnonymousClass09K A01 = AnonymousClass09K.A07;

    public AnonymousClass0JV(Context context) {
        this.A00 = context;
    }

    @Override // X.AnonymousClass0JW
    public /* bridge */ /* synthetic */ void A03(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Context context = this.A00;
            Intent intent = new Intent(context, CaptivePortalActivity.class);
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
    }
}
