package X;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import com.whatsapp.Conversation;

/* renamed from: X.1L0  reason: invalid class name */
public class AnonymousClass1L0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38521q1 A01;
    public final /* synthetic */ Conversation A02;
    public final /* synthetic */ C51812a4 A03;
    public final /* synthetic */ C007303n A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Bitmap[] A06;

    public AnonymousClass1L0(Conversation conversation, C38521q1 r2, String str, C007303n r4, C51812a4 r5, int i, Bitmap[] bitmapArr) {
        this.A02 = conversation;
        this.A01 = r2;
        this.A05 = str;
        this.A04 = r4;
        this.A03 = r5;
        this.A00 = i;
        this.A06 = bitmapArr;
    }

    public void onGlobalLayout() {
        Conversation conversation = this.A02;
        conversation.A1C.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        conversation.A1C.setVisibility(0);
        AnonymousClass377 r4 = new AnonymousClass377(conversation, conversation.A1C, this.A01, conversation.A0Q);
        conversation.A1D = r4;
        r4.A0C(this.A05, this.A04, this.A03, this.A00, this.A06);
    }
}
