package X;

import android.view.ViewTreeObserver;
import com.whatsapp.Conversation;

/* renamed from: X.1LB  reason: invalid class name */
public class AnonymousClass1LB implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Conversation A02;
    public final /* synthetic */ AbstractC007503q A03;

    public AnonymousClass1LB(Conversation conversation, AbstractC007503q r2, int i, int i2) {
        this.A02 = conversation;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
    }

    public void onGlobalLayout() {
        Conversation conversation = this.A02;
        conversation.A0Y.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        AnonymousClass2HL r2 = conversation.A0q;
        r2.A0Q.add(this.A03.A0n);
        conversation.A0m();
        conversation.A0z(this.A00, this.A01);
    }
}
