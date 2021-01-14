package X;

import com.whatsapp.util.Log;

/* renamed from: X.3MW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3MW implements AbstractC011806y {
    public final /* synthetic */ AnonymousClass30Q A00;

    public /* synthetic */ AnonymousClass3MW(AnonymousClass30Q r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC011806y
    public final void AFt(Exception exc) {
        AnonymousClass30Q r1 = this.A00;
        Log.e("verifysms/smsretriever/failure registering sms retriever client/ ", exc);
        AnonymousClass00D r2 = r1.A01;
        AnonymousClass0JE.A0H(r2, "timeout-waiting-for-sms");
        AnonymousClass008.A0k(r2, "sms_retriever_retry_count", 0);
    }
}
