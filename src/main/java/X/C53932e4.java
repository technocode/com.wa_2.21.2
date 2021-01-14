package X;

import android.graphics.Rect;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.gallerypicker.MediaPreviewFragment;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.2e4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53932e4 implements AnonymousClass0TF {
    public final /* synthetic */ MediaPreviewActivity A00;

    public /* synthetic */ C53932e4(MediaPreviewActivity mediaPreviewActivity) {
        this.A00 = mediaPreviewActivity;
    }

    @Override // X.AnonymousClass0TF
    public final C06730Um ACw(View view, C06730Um r8) {
        MediaPreviewActivity mediaPreviewActivity = this.A00;
        Rect rect = mediaPreviewActivity.A0e;
        rect.set(r8.A02(), r8.A04(), r8.A03(), r8.A01());
        Iterator it = ((AbstractCollection) mediaPreviewActivity.A0D()).iterator();
        while (it.hasNext()) {
            AnonymousClass037 r1 = (AnonymousClass037) it.next();
            if (r1 instanceof MediaPreviewFragment) {
                ((MediaPreviewFragment) r1).A0s(rect);
            }
        }
        View findViewById = mediaPreviewActivity.findViewById(R.id.filter_swipe);
        findViewById.setPadding(-rect.left, findViewById.getPaddingTop(), -rect.right, findViewById.getPaddingBottom());
        return r8;
    }
}
