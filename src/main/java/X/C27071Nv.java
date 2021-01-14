package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContactStatusThumbnail;
import com.whatsapp.StatusesFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Nv  reason: invalid class name and case insensitive filesystem */
public class C27071Nv {
    public int A00;
    public UserJid A01;
    public final View A02;
    public final View A03;
    public final FrameLayout A04;
    public final ImageView A05;
    public final ImageView A06;
    public final TextView A07;
    public final ContactStatusThumbnail A08;
    public final C11930hF A09;
    public final /* synthetic */ StatusesFragment A0A;

    public C27071Nv(StatusesFragment statusesFragment, View view) {
        this.A0A = statusesFragment;
        ContactStatusThumbnail contactStatusThumbnail = (ContactStatusThumbnail) view.findViewById(R.id.contact_photo);
        this.A08 = contactStatusThumbnail;
        contactStatusThumbnail.setClickable(false);
        View findViewById = view.findViewById(R.id.contact_selector);
        this.A03 = findViewById;
        findViewById.setClickable(false);
        C014308b r7 = statusesFragment.A0V;
        AnonymousClass01X r8 = statusesFragment.A0e;
        this.A09 = new C11930hF(view, R.id.contact_name, r7, r8, statusesFragment.A0n);
        this.A07 = (TextView) view.findViewById(R.id.date_time);
        this.A04 = (FrameLayout) view.findViewById(R.id.action);
        this.A05 = (ImageView) view.findViewById(R.id.action_icon);
        this.A06 = (ImageView) view.findViewById(R.id.contact_mark);
        View findViewById2 = view.findViewById(R.id.divider);
        this.A02 = findViewById2;
        findViewById2.setBackgroundDrawable(new C06470Tj(r8, C004302a.A03(view.getContext(), R.drawable.conversations_list_divider)));
        this.A02.setVisibility(0);
        C002301g.A03(this.A09.A00);
    }
}
