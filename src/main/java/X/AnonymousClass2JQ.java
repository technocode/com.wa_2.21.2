package X;

import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2JQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JQ extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C59382nY A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass2JQ(C59382nY r1, String str, int i, String str2) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
    }

    public final void run() {
        C59382nY r0 = this.A01;
        String str = this.A02;
        int i = this.A00;
        String str2 = this.A03;
        ConversationsFragment conversationsFragment = r0.A04;
        conversationsFragment.A07.setProgress(i);
        conversationsFragment.A0A.setText(str2);
        conversationsFragment.A09.setText(str);
    }
}
