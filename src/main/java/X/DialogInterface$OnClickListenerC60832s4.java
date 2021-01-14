package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.WaInAppBrowsingActivity;

/* renamed from: X.2s4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC60832s4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass3DQ A01;

    public /* synthetic */ DialogInterface$OnClickListenerC60832s4(AnonymousClass3DQ r1, Context context) {
        this.A01 = r1;
        this.A00 = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass3DQ r1 = this.A01;
        Context context = this.A00;
        Intent intent = new Intent(context, WaInAppBrowsingActivity.class);
        r1.A01.A01();
        intent.putExtra("webview_url", "https://faq.whatsapp.com/payments/26000351");
        intent.putExtra("webview_javascript_enabled", true);
        context.startActivity(intent);
    }
}
