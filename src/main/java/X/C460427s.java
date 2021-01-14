package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.27s  reason: invalid class name and case insensitive filesystem */
public final class C460427s extends AbstractC39391rQ {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C009305w A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C460427s(int i, View view, C009305w r5) {
        super(i, -65536, 1711315404);
        this.A00 = view;
        this.A01 = r5;
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        C42991xc r1 = (C42991xc) this.A00.getTag(R.id.on_text_clicked_listener);
        if (r1 != null) {
            C009305w r0 = this.A01;
            C46552Az r4 = r1.A01;
            AnonymousClass05q r3 = r1.A00;
            AbstractC009505y r2 = r0.A02;
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() == 0) {
                arrayList.add(C008805h.A0T(r4));
                C008805h.A0P(r2, new C010106g(arrayList), r3);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }
}
