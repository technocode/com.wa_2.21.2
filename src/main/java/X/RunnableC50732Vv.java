package X;

import com.whatsapp.notification.DirectReplyService;

/* renamed from: X.2Vv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC50732Vv extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C007003k A00;
    public final /* synthetic */ C58652mH A01;
    public final /* synthetic */ DirectReplyService A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ RunnableC50732Vv(DirectReplyService directReplyService, C58652mH r2, C007003k r3, String str, String str2) {
        this.A02 = directReplyService;
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void run() {
        this.A02.A02(this.A01, this.A00, this.A03, this.A04);
    }
}
