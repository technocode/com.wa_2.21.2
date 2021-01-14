package X;

import android.widget.AbsListView;
import com.whatsapp.LiveLocationPrivacyActivity;

/* renamed from: X.1MO  reason: invalid class name */
public class AnonymousClass1MO implements AbsListView.OnScrollListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LiveLocationPrivacyActivity A01;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public AnonymousClass1MO(LiveLocationPrivacyActivity liveLocationPrivacyActivity, int i) {
        this.A01 = liveLocationPrivacyActivity;
        this.A00 = i;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (i + i2 == i3) {
            int bottom = absListView.getChildAt(i2 - 1).getBottom();
            LiveLocationPrivacyActivity liveLocationPrivacyActivity = this.A01;
            if (bottom == liveLocationPrivacyActivity.A04.getBottom() - liveLocationPrivacyActivity.A04.getPaddingBottom()) {
                liveLocationPrivacyActivity.A00.setElevation(0.0f);
            } else {
                liveLocationPrivacyActivity.A00.setElevation((float) this.A00);
            }
        } else {
            this.A01.A00.setElevation((float) this.A00);
        }
    }
}
