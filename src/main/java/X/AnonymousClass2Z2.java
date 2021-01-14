package X;

import android.view.ViewGroup;
import com.whatsapp.Conversation;

/* renamed from: X.2Z2  reason: invalid class name */
public abstract class AnonymousClass2Z2 extends AnonymousClass2HI {
    public final float A00;
    public final ViewGroup A01;

    public AnonymousClass2Z2(Conversation conversation, ViewGroup viewGroup, int i) {
        super(conversation, i);
        this.A01 = viewGroup;
        AnonymousClass0S2 A09 = conversation.A09();
        if (A09 != null) {
            this.A00 = A09.A00();
            return;
        }
        throw null;
    }

    public final void A05(C51472Yw r6) {
        ViewGroup viewGroup = this.A01;
        if (viewGroup.getVisibility() != 8) {
            AnonymousClass0S2 A09 = super.A01.A09();
            if (A09 != null) {
                float A002 = A09.A00();
                float f = this.A00;
                if (A002 != f) {
                    A09.A02(f);
                    AnonymousClass0Q7.A0Q(viewGroup, 0.0f);
                }
                viewGroup.setVisibility(8);
                if (this instanceof C59002mt) {
                    ((C59002mt) this).A00 = true;
                }
                r6.A00.A01 = null;
                return;
            }
            throw null;
        }
    }
}
