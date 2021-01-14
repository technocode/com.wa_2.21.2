package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaButton;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.WaMapView;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.315  reason: invalid class name */
public class AnonymousClass315 extends FrameLayout {
    public FrameLayout A00 = ((FrameLayout) AnonymousClass0Q7.A0D(this, R.id.search_map_preview_avatar_container));
    public WaButton A01 = ((WaButton) AnonymousClass0Q7.A0D(this, R.id.search_map_preview_thumb_button));
    public ThumbnailButton A02 = ((ThumbnailButton) AnonymousClass0Q7.A0D(this, R.id.search_map_preview_contact_thumbnail));
    public AnonymousClass0YX A03;
    public final AnonymousClass01I A04;
    public final AnonymousClass0HJ A05;
    public final AnonymousClass00S A06;
    public final AnonymousClass01X A07;
    public final AnonymousClass0AQ A08;
    public final AnonymousClass01S A09;
    public final C02770Dj A0A;
    public final WaMapView A0B = ((WaMapView) AnonymousClass0Q7.A0D(this, R.id.search_map_preview_map));

    public AnonymousClass315(Context context, AnonymousClass00S r3, AnonymousClass01I r4, C02770Dj r5, AnonymousClass0HJ r6, AnonymousClass01X r7, AnonymousClass0YX r8, AnonymousClass01S r9, AnonymousClass0AQ r10) {
        super(context);
        this.A06 = r3;
        this.A04 = r4;
        this.A0A = r5;
        this.A05 = r6;
        this.A07 = r7;
        this.A03 = r8;
        this.A09 = r9;
        this.A08 = r10;
        FrameLayout.inflate(context, R.layout.search_row_location_map_preview, this);
    }

    private void setMessage(C02850Ds r8) {
        long A052;
        this.A00.setVisibility(0);
        AnonymousClass01S r1 = this.A09;
        boolean z = r8.A0n.A02;
        if (z) {
            A052 = r1.A06(r8);
        } else {
            A052 = r1.A05(r8);
        }
        boolean A1w = C28051Sr.A1w(r8, A052, this.A06);
        WaMapView waMapView = this.A0B;
        C02770Dj r12 = this.A0A;
        waMapView.A02(r12, r8, A1w);
        Context context = getContext();
        AnonymousClass01I r5 = this.A04;
        this.A01.setOnClickListener(C28051Sr.A0U(r8, A1w, context, r5, r12));
        this.A01.setContentDescription(this.A07.A06(R.string.conversation_row_live_location_button));
        ThumbnailButton thumbnailButton = this.A02;
        AnonymousClass0HJ r3 = this.A05;
        AnonymousClass0YX r2 = this.A03;
        AnonymousClass0AQ r13 = this.A08;
        if (z) {
            r5.A04();
            AnonymousClass0HR r0 = r5.A01;
            if (r0 != null) {
                r2.A02(r0, thumbnailButton);
                return;
            }
            throw null;
        }
        UserJid A082 = r8.A08();
        if (A082 != null) {
            r2.A02(r13.A02(A082), thumbnailButton);
        } else {
            r3.A05(thumbnailButton, R.drawable.avatar_contact);
        }
    }

    public void setMessage(AbstractC02860Dt r3) {
        this.A0B.setVisibility(0);
        if (r3 instanceof C05470Or) {
            setMessage((C05470Or) r3);
        } else {
            setMessage((C02850Ds) r3);
        }
    }

    private void setMessage(C05470Or r9) {
        this.A00.setVisibility(8);
        WaMapView waMapView = this.A0B;
        C02770Dj r6 = this.A0A;
        if (waMapView != null) {
            LatLng latLng = new LatLng(((AbstractC02860Dt) r9).A00, ((AbstractC02860Dt) r9).A01);
            waMapView.A01(r6, latLng, null);
            waMapView.A00(latLng);
            if (((AbstractC02860Dt) r9).A01 != 0.0d || ((AbstractC02860Dt) r9).A00 != 0.0d) {
                this.A01.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r9, 31));
                this.A01.setContentDescription(this.A07.A06(R.string.location_button));
                return;
            }
            return;
        }
        throw null;
    }
}
