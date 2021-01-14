package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.WaInAppBrowsingActivity;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.3Xx  reason: invalid class name and case insensitive filesystem */
public class C73583Xx extends AbstractC68463Dh {
    public final /* synthetic */ C61582tP A00;
    public final /* synthetic */ AnonymousClass3HY A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73583Xx(C61582tP r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, AnonymousClass3HY r6) {
        super(context, r3, r4, r5);
        this.A00 = r1;
        this.A01 = r6;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r2) {
        this.A01.A00(r2);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r2) {
        this.A01.A00(r2);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r9) {
        try {
            AnonymousClass0M5 A0E = r9.A0E("account");
            C61072sS A002 = C61072sS.A00(A0E);
            if (A002 != null) {
                this.A01.A00(A002);
                return;
            }
            String str = null;
            String A0G = A0E.A0G("webview_url", null);
            if (TextUtils.isEmpty(A0G)) {
                this.A01.A00(new C61072sS());
                return;
            }
            AnonymousClass0OS A0A = A0E.A0A("callback_url");
            if (A0A != null) {
                str = A0A.A03;
            }
            AnonymousClass3HY r1 = this.A01;
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = r1.A00;
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A0r();
            }
            AbstractC63192w0 r4 = r1.A01;
            if (r4 != null) {
                ActivityC004602e r3 = r4.A04;
                Intent intent = new Intent(r3, WaInAppBrowsingActivity.class);
                AnonymousClass00E.A03(A0G);
                intent.putExtra("webview_url", A0G);
                if (!TextUtils.isEmpty(str)) {
                    intent.putExtra("webview_callback", str);
                }
                intent.putExtra("webview_javascript_enabled", true);
                intent.putExtra("webview_hide_url", true);
                r3.startActivityForResult(intent, r4.A00);
                return;
            }
            throw null;
        } catch (AnonymousClass1XC e) {
            this.A00.A05.A08("PAY: PaymentStepUpWebviewAction : invalid response", e);
            this.A01.A00(new C61072sS());
        }
    }
}
