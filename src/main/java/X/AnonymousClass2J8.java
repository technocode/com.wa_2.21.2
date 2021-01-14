package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.2J8  reason: invalid class name */
public class AnonymousClass2J8 extends LinearLayout {
    public final View A00;
    public final C02780Dk A01 = C02780Dk.A02();
    public final WaImageView A02;
    public final WaTextView A03;

    public AnonymousClass2J8(Context context) {
        super(context, null, 0);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.conversations_archive_header_view, (ViewGroup) this, false);
        this.A00 = inflate;
        this.A02 = (WaImageView) AnonymousClass0Q7.A0D(inflate, R.id.archived_row_image);
        WaTextView waTextView = (WaTextView) AnonymousClass0Q7.A0D(this.A00, R.id.archived_row);
        this.A03 = waTextView;
        C002301g.A03(waTextView);
        C28051Sr.A1P(this.A00);
        this.A00.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 22));
        addView(this.A00);
    }

    public void setEnableState(boolean z) {
        int i = R.color.archive_header_disable_state_text_color;
        int i2 = R.color.archive_header_disable_state_icon_color;
        if (z) {
            i = R.color.list_item_title;
            i2 = R.color.archive_header_icon_color;
        }
        C002001d.A2m(this.A02, C004302a.A00(getContext(), i2));
        this.A03.setTextColor(C004302a.A00(getContext(), i));
        this.A00.setClickable(z);
    }

    public void setVisibility(boolean z) {
        View view = this.A00;
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }
}
