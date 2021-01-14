package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.3TO  reason: invalid class name */
public class AnonymousClass3TO extends AnonymousClass390 {
    public final View.OnTouchListener A00 = new AnonymousClass2PR(0.15f, 0.15f, 0.15f, 0.15f);
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final SelectionCheckView A09;
    public final C000300f A0A;
    public final C11930hF A0B;
    public final AnonymousClass01A A0C;
    public final C014308b A0D;
    public final AbstractC12270hp A0E = new AnonymousClass3TN();
    public final AnonymousClass0YX A0F;
    public final AnonymousClass0YX A0G;
    public final AnonymousClass03P A0H;
    public final AnonymousClass01X A0I;
    public final AnonymousClass01T A0J;
    public final MultiContactThumbnail A0K;
    public final AbstractView$OnClickListenerC08330av A0L = new ViewOnClickCListenerShape14S0100000_I1_3(this, 18);
    public final CallsFragment A0M;
    public final C09200cS A0N;

    public AnonymousClass3TO(C000300f r8, C09200cS r9, AnonymousClass01A r10, AnonymousClass03P r11, C014308b r12, AnonymousClass01X r13, AnonymousClass31y r14, AnonymousClass01T r15, AnonymousClass0YX r16, AnonymousClass0YX r17, CallsFragment callsFragment, View view) {
        this.A0A = r8;
        this.A0N = r9;
        this.A0C = r10;
        this.A0H = r11;
        this.A0D = r12;
        this.A0I = r13;
        this.A0J = r15;
        this.A0G = r16;
        this.A0F = r17;
        this.A0M = callsFragment;
        this.A04 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.contact_photo);
        this.A0B = new C11930hF(view, R.id.contact_name, r12, r13, r14);
        this.A08 = (TextView) AnonymousClass0Q7.A0D(view, R.id.date_time);
        this.A03 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.call_type_icon);
        this.A07 = (TextView) AnonymousClass0Q7.A0D(view, R.id.count);
        this.A06 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.voice_call);
        this.A05 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.video_call);
        this.A09 = (SelectionCheckView) AnonymousClass0Q7.A0D(view, R.id.selection_check);
        this.A01 = AnonymousClass0Q7.A0D(view, R.id.call_row_container);
        MultiContactThumbnail multiContactThumbnail = (MultiContactThumbnail) AnonymousClass0Q7.A0D(view, R.id.multi_contact_photo);
        this.A0K = multiContactThumbnail;
        AnonymousClass0Q7.A0W(multiContactThumbnail, 2);
        C002301g.A03(this.A0B.A00);
        this.A02 = AnonymousClass0Q7.A0D(view, R.id.divider);
    }
}
