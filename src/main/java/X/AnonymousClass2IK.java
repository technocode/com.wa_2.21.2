package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaButton;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;

/* renamed from: X.2IK  reason: invalid class name */
public class AnonymousClass2IK {
    public int A00 = 1;
    public int A01 = 3;
    public View A02;
    public AnonymousClass0M3 A03;
    public AbstractView$OnClickListenerC08330av A04 = new ViewOnClickCListenerShape12S0100000_I1_1(this, 33);
    public AbstractView$OnClickListenerC08330av A05 = new ViewOnClickCListenerShape12S0100000_I1_1(this, 34);
    public AbstractView$OnClickListenerC08330av A06 = new ViewOnClickCListenerShape12S0100000_I1_1(this, 35);
    public boolean A07;
    public boolean A08;
    public final View.OnClickListener A09 = new ViewOnClickCListenerShape12S0100000_I1_1(this, 36);
    public final View A0A;
    public final ImageView A0B;
    public final CircularProgressBar A0C;
    public final C04350Ka A0D;
    public final C000300f A0E;
    public final C04360Kb A0F;
    public final WaButton A0G;
    public final AnonymousClass03S A0H;
    public final AnonymousClass01X A0I;
    public final C04420Kh A0J;
    public final AnonymousClass0CH A0K;
    public final AnonymousClass0D1 A0L;
    public final StickerView A0M;
    public final AnonymousClass0D9 A0N = new C51772a0(this);
    public final C02580Cq A0O;

    public AnonymousClass2IK(View view, AnonymousClass0D1 r4, C04350Ka r5, C000300f r6, C04360Kb r7, AnonymousClass01X r8, C02580Cq r9, AnonymousClass03S r10, AnonymousClass0CH r11, C04420Kh r12) {
        this.A02 = view;
        this.A0M = (StickerView) view.findViewById(R.id.sticker_image);
        CircularProgressBar circularProgressBar = (CircularProgressBar) view.findViewById(R.id.progress_bar);
        this.A0C = circularProgressBar;
        circularProgressBar.A0B = 0;
        this.A0B = (ImageView) view.findViewById(R.id.cancel_download);
        this.A0A = view.findViewById(R.id.control_frame);
        this.A0G = (WaButton) view.findViewById(R.id.control_btn);
        this.A0L = r4;
        this.A0D = r5;
        this.A0E = r6;
        this.A0F = r7;
        this.A0I = r8;
        this.A0O = r9;
        this.A0H = r10;
        this.A0K = r11;
        this.A0J = r12;
        if (r6.A0D(AbstractC000400g.A1k)) {
            this.A00 = 7;
            this.A01 = 7;
        }
    }

    public void A00() {
        View view = this.A0A;
        view.setVisibility(0);
        CircularProgressBar circularProgressBar = this.A0C;
        ImageView imageView = this.A0B;
        WaButton waButton = this.A0G;
        AbstractC59162nB.A08(false, false, false, view, circularProgressBar, imageView, waButton);
        AnonymousClass0M3 r1 = this.A03;
        if (!r1.A0n.A02 || AnonymousClass0FI.A0p(r1)) {
            StickerView stickerView = this.A0M;
            AnonymousClass01X r2 = this.A0I;
            stickerView.setContentDescription(r2.A06(R.string.button_download));
            waButton.setText(AnonymousClass0FI.A0A(r2, this.A03.A01));
            waButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
            waButton.setOnClickListener(this.A05);
            stickerView.setOnClickListener(this.A05);
            return;
        }
        StickerView stickerView2 = this.A0M;
        AnonymousClass01X r22 = this.A0I;
        stickerView2.setContentDescription(r22.A06(R.string.retry));
        waButton.setText(r22.A06(R.string.retry));
        waButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
        waButton.setOnClickListener(this.A06);
        stickerView2.setOnClickListener(this.A06);
    }

    public void A01() {
        if (!this.A03.A0n.A02) {
            View view = this.A0A;
            view.setVisibility(0);
            CircularProgressBar circularProgressBar = this.A0C;
            ImageView imageView = this.A0B;
            WaButton waButton = this.A0G;
            AbstractC59162nB.A08(true, false, false, view, circularProgressBar, imageView, waButton);
            this.A0M.setContentDescription(this.A0I.A06(R.string.image_transfer_in_progress));
            waButton.setOnClickListener(this.A04);
            circularProgressBar.setOnClickListener(this.A04);
        } else {
            this.A0A.setVisibility(8);
        }
        this.A0M.setOnClickListener(null);
    }

    public void A02() {
        View view = this.A0A;
        view.setVisibility(8);
        CircularProgressBar circularProgressBar = this.A0C;
        ImageView imageView = this.A0B;
        WaButton waButton = this.A0G;
        AbstractC59162nB.A08(false, false, false, view, circularProgressBar, imageView, waButton);
        waButton.setOnClickListener(null);
        this.A0M.setOnClickListener(this.A09);
    }

    public void A03(AnonymousClass0ZE r13, boolean z) {
        this.A03 = r13;
        if (z) {
            this.A0M.setImageDrawable(null);
        }
        C29241Xq A11 = r13.A11();
        AnonymousClass0M4 r2 = ((AnonymousClass0M3) r13).A02;
        if (r2 != null) {
            StickerView stickerView = this.A0M;
            int dimensionPixelSize = stickerView.getContext().getResources().getDimensionPixelSize(R.dimen.conversation_row_sticker_size);
            stickerView.setOnClickListener(null);
            stickerView.setContentDescription(this.A0I.A06(R.string.sticker_message_content_description));
            if (A11.A0A == null || (r2.A0F == null && ((AnonymousClass0M3) r13).A08 == null)) {
                A04(r13, z);
            } else {
                this.A0L.A06(A11, 1, stickerView, dimensionPixelSize, dimensionPixelSize, true, false, new AnonymousClass2ZV(this, r2, r13, z));
            }
            this.A02.invalidate();
            return;
        }
        throw null;
    }

    public final void A04(AnonymousClass0ZE r9, boolean z) {
        if (!this.A07 || z) {
            this.A07 = false;
            this.A0O.A0D(r9, this.A0M, this.A0N, false);
            return;
        }
        this.A07 = false;
        this.A0O.A0B(r9, this.A0M, this.A0N, r9.A0n, false);
    }
}
