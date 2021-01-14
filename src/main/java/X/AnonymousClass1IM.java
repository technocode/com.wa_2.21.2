package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.Conversation;
import com.whatsapp.LiveLocationPrivacyActivity;

/* renamed from: X.1IM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IM implements AdapterView.OnItemClickListener {
    public final /* synthetic */ LiveLocationPrivacyActivity A00;

    public /* synthetic */ AnonymousClass1IM(LiveLocationPrivacyActivity liveLocationPrivacyActivity) {
        this.A00 = liveLocationPrivacyActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        LiveLocationPrivacyActivity liveLocationPrivacyActivity = this.A00;
        int i2 = i - 1;
        if (i2 >= 0 && i2 < liveLocationPrivacyActivity.A07.getCount()) {
            liveLocationPrivacyActivity.startActivity(Conversation.A04(liveLocationPrivacyActivity, (C007003k) liveLocationPrivacyActivity.A07.A00.A0F.get(i2)));
        }
    }
}
