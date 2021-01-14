package X;

import android.content.Intent;
import com.whatsapp.notification.DirectReplyService;

/* renamed from: X.2Vw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC50742Vw extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C007003k A01;
    public final /* synthetic */ C58652mH A02;
    public final /* synthetic */ DirectReplyService A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ RunnableC50742Vw(DirectReplyService directReplyService, C58652mH r2, String str, C007003k r4, Intent intent) {
        this.A03 = directReplyService;
        this.A02 = r2;
        this.A04 = str;
        this.A01 = r4;
        this.A00 = intent;
    }

    public final void run() {
        this.A03.A03(this.A02, this.A04, this.A01, this.A00);
    }
}
