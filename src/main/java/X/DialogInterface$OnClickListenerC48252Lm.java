package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.deeplink.DeepLinkActivity;

/* renamed from: X.2Lm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC48252Lm implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeepLinkActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC48252Lm(DeepLinkActivity deepLinkActivity) {
        this.A00 = deepLinkActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeepLinkActivity deepLinkActivity = this.A00;
        deepLinkActivity.A01.A05(deepLinkActivity, new Intent("android.intent.action.VIEW", deepLinkActivity.A05.A01()));
        deepLinkActivity.finish();
        deepLinkActivity.overridePendingTransition(0, 0);
    }
}
