package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.DocumentsGalleryFragment;

/* renamed from: X.2df  reason: invalid class name and case insensitive filesystem */
public class C53682df extends AbstractC11910hD {
    public AnonymousClass0M2 A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final /* synthetic */ DocumentsGalleryFragment A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53682df(DocumentsGalleryFragment documentsGalleryFragment, View view) {
        super(view);
        this.A0A = documentsGalleryFragment;
        this.A04 = (ImageView) view.findViewById(R.id.icon);
        this.A08 = (TextView) view.findViewById(R.id.title);
        this.A05 = (TextView) view.findViewById(R.id.date);
        this.A07 = (TextView) view.findViewById(R.id.size);
        this.A02 = view.findViewById(R.id.bullet_size);
        this.A06 = (TextView) view.findViewById(R.id.info);
        this.A01 = view.findViewById(R.id.bullet_info);
        this.A09 = (TextView) view.findViewById(R.id.type);
        this.A03 = view.findViewById(R.id.starred_status);
        view.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 3));
        view.setOnLongClickListener(new AnonymousClass2OV(this));
    }
}
