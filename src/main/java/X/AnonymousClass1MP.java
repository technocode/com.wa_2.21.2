package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.LiveLocationPrivacyActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;

/* renamed from: X.1MP  reason: invalid class name */
public class AnonymousClass1MP extends BaseAdapter {
    public final /* synthetic */ LiveLocationPrivacyActivity A00;

    public boolean hasStableIds() {
        return true;
    }

    public AnonymousClass1MP(LiveLocationPrivacyActivity liveLocationPrivacyActivity) {
        this.A00 = liveLocationPrivacyActivity;
    }

    public int getCount() {
        return this.A00.A0F.size();
    }

    public Object getItem(int i) {
        return this.A00.A0F.get(i);
    }

    public long getItemId(int i) {
        return ((C007003k) this.A00.A0F.get(i)).A01();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass1MQ r3;
        if (view == null) {
            view = this.A00.getLayoutInflater().inflate(R.layout.live_location_privacy_row, viewGroup, false);
            r3 = new AnonymousClass1MQ(null);
            r3.A02 = (TextEmojiLabel) view.findViewById(R.id.name);
            r3.A01 = (TextView) view.findViewById(R.id.time_left);
            r3.A00 = (ImageView) view.findViewById(R.id.avatar);
            view.setTag(r3);
        } else {
            r3 = (AnonymousClass1MQ) view.getTag();
        }
        LiveLocationPrivacyActivity liveLocationPrivacyActivity = this.A00;
        C007003k r6 = (C007003k) liveLocationPrivacyActivity.A0F.get(i);
        if (r6 == null) {
            return view;
        }
        long A05 = liveLocationPrivacyActivity.A0B.A05();
        AnonymousClass01S r1 = liveLocationPrivacyActivity.A0E;
        Jid A02 = r6.A02(AnonymousClass02N.class);
        if (A02 != null) {
            long A04 = r1.A04((AnonymousClass02N) A02);
            r3.A03 = r6;
            AnonymousClass01X r2 = ((AnonymousClass2C0) liveLocationPrivacyActivity).A01;
            r3.A01.setText(C002001d.A1Z(r2, A04 - A05));
            r3.A02.setText(r2.A0E(liveLocationPrivacyActivity.A09.A08(r6, false)));
            AnonymousClass0Q7.A0W(r3.A00, 2);
            liveLocationPrivacyActivity.A08.A02(r3.A03, r3.A00);
            return view;
        }
        throw null;
    }
}
