package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.LinksGalleryFragment;
import java.util.Set;

/* renamed from: X.2dk  reason: invalid class name and case insensitive filesystem */
public class C53732dk extends AbstractC11910hD {
    public C12030hR A00;
    public AbstractC007503q A01;
    public String A02;
    public Set A03;
    public final View A04;
    public final View A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final /* synthetic */ LinksGalleryFragment A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53732dk(LinksGalleryFragment linksGalleryFragment, View view) {
        super(view);
        this.A0B = linksGalleryFragment;
        this.A07 = (TextView) view.findViewById(R.id.message_text);
        this.A04 = view.findViewById(R.id.message_text_holder);
        this.A05 = view.findViewById(R.id.starred_status);
        this.A06 = (ImageView) view.findViewById(R.id.thumb);
        this.A09 = (TextView) view.findViewById(R.id.title);
        this.A0A = (TextView) view.findViewById(R.id.url);
        this.A08 = (TextView) view.findViewById(R.id.suspicious_link_indicator);
        this.A04.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 4));
        view.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 5));
        view.setOnLongClickListener(new AnonymousClass2OW(this));
    }
}
