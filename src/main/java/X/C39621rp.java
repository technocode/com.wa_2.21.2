package X;

import android.view.View;
import com.whatsapp.Conversation;

/* renamed from: X.1rp  reason: invalid class name and case insensitive filesystem */
public class C39621rp extends AbstractView$OnClickListenerC08330av {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Conversation A01;

    public C39621rp(Conversation conversation, View view) {
        this.A01 = conversation;
        this.A00 = view;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        C27231Or r1;
        Conversation conversation = this.A01;
        C27241Os r0 = conversation.A0w.A00;
        if (r0 != null && (r1 = r0.A07) != null && r1.A02 != null) {
            String str = r1.A01;
            if ("video/mp4".equals(str) || "image/gif".equals(str)) {
                conversation.A0t.setProgressBarVisibility(true);
                this.A00.setVisibility(8);
                AnonymousClass00T r5 = conversation.A4R;
                AnonymousClass088 r4 = conversation.A27;
                C27231Or r02 = conversation.A0w.A00.A07;
                r5.ANC(new C40391tC(r4, r02.A02, r02.A01, new C39611ro(this)), new String[0]);
            }
        }
    }
}
