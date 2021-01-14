package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gallerypicker.MediaPreviewActivity;

/* renamed from: X.2eR  reason: invalid class name and case insensitive filesystem */
public class C54152eR extends AbstractC16380pi {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MediaPreviewActivity A01;

    public C54152eR(MediaPreviewActivity mediaPreviewActivity, int i) {
        this.A01 = mediaPreviewActivity;
        this.A00 = i;
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r6) {
        if (((AnonymousClass2C0) this.A01).A01.A0M()) {
            rect.set(0, 0, this.A00, 0);
        } else {
            rect.set(this.A00, 0, 0, 0);
        }
    }
}
