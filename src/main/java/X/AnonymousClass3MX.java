package X;

import com.whatsapp.util.Log;

/* renamed from: X.3MX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3MX implements AbstractC011906z {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass30Q A01;

    public /* synthetic */ AnonymousClass3MX(AnonymousClass30Q r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // X.AbstractC011906z
    public final void AKi(Object obj) {
        AnonymousClass30Q r2 = this.A01;
        int i = this.A00;
        Log.i("verifysms/smsretriever/re-registered sms retriever client");
        AnonymousClass008.A0k(r2.A01, "sms_retriever_retry_count", i + 1);
    }
}
