package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.3RF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3RF implements AnonymousClass33J {
    public final /* synthetic */ C74203aL A00;

    public /* synthetic */ AnonymousClass3RF(C74203aL r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass33J
    public final void AKV(List list) {
        C74203aL r4 = this.A00;
        AnonymousClass3QG A002 = r4.A00();
        r4.A04 = list;
        A002.A08(list);
        ((AbstractC16300pa) A002).A01.A00();
        if (r4.A00 != null) {
            int A05 = r4.A00().A05();
            View view = r4.A00;
            int i = 8;
            if (A05 == 0) {
                i = 0;
            }
            view.setVisibility(i);
            if (r4.A05) {
                r4.A02.setText(r4.A06.A06(R.string.sticker_picker_no_sent_stickers));
                r4.A01.setVisibility(4);
                return;
            }
            r4.A02.setText(r4.A06.A06(R.string.sticker_picker_no_recent_no_installed));
            r4.A01.setVisibility(0);
        }
    }
}
