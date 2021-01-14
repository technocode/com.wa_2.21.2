package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.3Tt  reason: invalid class name and case insensitive filesystem */
public class C72663Tt extends AnonymousClass390 {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public MultiContactThumbnail A03;
    public final C000300f A04;
    public final AnonymousClass01A A05;
    public final C014308b A06;
    public final AbstractC12270hp A07 = new C72653Ts();
    public final AnonymousClass0YX A08;
    public final AnonymousClass01X A09;
    public final AnonymousClass01T A0A;
    public final CallsFragment A0B;
    public final C09200cS A0C;

    public C72663Tt(C000300f r2, CallsFragment callsFragment, C09200cS r4, AnonymousClass01X r5, AnonymousClass01A r6, C014308b r7, AnonymousClass01T r8, View view, AnonymousClass0YX r10) {
        this.A04 = r2;
        this.A0B = callsFragment;
        this.A0C = r4;
        this.A09 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A0A = r8;
        this.A02 = (TextView) AnonymousClass0Q7.A0D(view, R.id.participant_names);
        this.A01 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.call_type_icon);
        AnonymousClass0Q7.A0D(view, R.id.join_container);
        this.A00 = AnonymousClass0Q7.A0D(view, R.id.call_row_container);
        this.A03 = (MultiContactThumbnail) AnonymousClass0Q7.A0D(view, R.id.multi_contact_photo);
        C002301g.A03(this.A02);
        this.A08 = r10;
    }
}
