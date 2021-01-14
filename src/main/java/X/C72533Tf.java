package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.3Tf  reason: invalid class name and case insensitive filesystem */
public class C72533Tf extends AnonymousClass390 {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final SelectionCheckView A08;
    public final C11930hF A09;
    public final AnonymousClass01A A0A;
    public final AnonymousClass0YX A0B;
    public final MultiContactThumbnail A0C;
    public final CallsFragment A0D;
    public final C09200cS A0E;

    public C72533Tf(C09200cS r8, AnonymousClass01A r9, C014308b r10, AnonymousClass01X r11, AnonymousClass31y r12, AnonymousClass0YX r13, CallsFragment callsFragment, View view) {
        this.A03 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.contact_photo);
        this.A09 = new C11930hF(view, R.id.contact_name, r10, r11, r12);
        this.A07 = (TextView) AnonymousClass0Q7.A0D(view, R.id.date_time);
        this.A02 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.call_type_icon);
        this.A06 = (TextView) AnonymousClass0Q7.A0D(view, R.id.count);
        this.A05 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.voice_call);
        this.A04 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.video_call);
        this.A08 = (SelectionCheckView) AnonymousClass0Q7.A0D(view, R.id.selection_check);
        this.A00 = AnonymousClass0Q7.A0D(view, R.id.call_row_container);
        MultiContactThumbnail multiContactThumbnail = (MultiContactThumbnail) AnonymousClass0Q7.A0D(view, R.id.multi_contact_photo);
        this.A0C = multiContactThumbnail;
        AnonymousClass0Q7.A0W(multiContactThumbnail, 2);
        C002301g.A03(this.A09.A00);
        this.A01 = AnonymousClass0Q7.A0D(view, R.id.divider);
        this.A0E = r8;
        this.A0A = r9;
        this.A0B = r13;
        this.A0D = callsFragment;
        this.A03.setVisibility(0);
        this.A0C.setVisibility(8);
        this.A07.setVisibility(8);
        this.A06.setVisibility(8);
        this.A02.setVisibility(8);
        this.A08.setVisibility(8);
    }
}
