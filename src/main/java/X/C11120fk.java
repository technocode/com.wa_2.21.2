package X;

import android.view.View;
import com.whatsapp.VideoTimelineView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.0fk  reason: invalid class name and case insensitive filesystem */
public class C11120fk extends AnonymousClass0JW {
    public long A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final File A04;
    public final WeakReference A05;

    public C11120fk(VideoTimelineView videoTimelineView, File file, int i, float f, float f2) {
        this.A05 = new WeakReference(videoTimelineView);
        this.A04 = file;
        this.A03 = i;
        this.A02 = f;
        this.A01 = f2;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        VideoTimelineView videoTimelineView = (VideoTimelineView) this.A05.get();
        if (videoTimelineView != null) {
            ArrayList arrayList = videoTimelineView.A0L;
            if (arrayList != null) {
                Collections.addAll(arrayList, objArr);
            }
            if (System.currentTimeMillis() > this.A00 + 500) {
                this.A00 = System.currentTimeMillis();
                videoTimelineView.invalidate();
            }
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        View view = (View) this.A05.get();
        if (view != null) {
            view.invalidate();
        }
    }
}
