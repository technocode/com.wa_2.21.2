package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;

/* renamed from: X.2pQ  reason: invalid class name and case insensitive filesystem */
public class C60432pQ extends AbstractC59162nB implements AbstractC661433b {
    public boolean A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final AnonymousClass2IK A04;
    public final C04420Kh A05;
    public final AnonymousClass0CH A06 = AnonymousClass0CH.A00();

    public C60432pQ(Context context, AnonymousClass0ZE r13, AnonymousClass0D1 r14) {
        super(context, r13);
        C04420Kh A002 = C04420Kh.A00();
        this.A05 = A002;
        this.A04 = new AnonymousClass2IK(this, r14, this.A0Z, this.A0a, this.A0b, this.A0n, this.A1E, ((AbstractC59162nB) this).A02, this.A06, A002);
        this.A02 = findViewById(R.id.name_in_group);
        this.A03 = findViewById(R.id.sticker_bubble_header);
        A09(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r0 == false) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A09(boolean r8) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60432pQ.A09(boolean):void");
    }

    @Override // X.AnonymousClass2I2
    public int A0A() {
        if (this.A01) {
            if (super.getFMessage().A09() != null || super.getFMessage().A0H != null) {
                return super.A0A();
            }
            View view = this.A03;
            if (view != null) {
                return view.getBottom() + ((AnonymousClass2I2) this).A0C.getTop();
            }
        }
        return super.A0A();
    }

    @Override // X.AnonymousClass2I2
    public int A0B() {
        View view;
        if (!this.A01 || (view = this.A03) == null) {
            return super.A0B();
        }
        return view.getPaddingTop() + ((AnonymousClass2I2) this).A0C.getTop();
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        return AnonymousClass0FI.A0j(super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A09(false);
        A0e(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0O() {
        int A002;
        CircularProgressBar circularProgressBar = this.A04.A0C;
        if (A0j(circularProgressBar, super.getFMessage()) == 0) {
            A002 = C004302a.A00(getContext(), R.color.media_message_progress_indeterminate);
        } else {
            A002 = C004302a.A00(getContext(), R.color.media_message_progress_determinate);
        }
        circularProgressBar.A0C = A002;
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != super.getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A09(z2);
        }
    }

    @Override // X.AbstractC661433b
    public void AQ2() {
        this.A04.A0M.A00();
    }

    @Override // X.AnonymousClass2I2
    public int getBubbleAlpha() {
        if (this.A01) {
            return super.getBubbleAlpha();
        }
        return 0;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_sticker_right;
    }

    @Override // X.AnonymousClass2I2
    public int getContentWidth() {
        View view;
        if (!this.A01 || super.getFMessage().A09() != null || super.getFMessage().A0H != null || this.A03 == null || (view = this.A02) == null) {
            return super.getContentWidth();
        }
        return view.getMeasuredWidth();
    }

    @Override // X.AbstractC59162nB
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB, X.AbstractC59162nB
    public AnonymousClass0ZE getFMessage() {
        return (AnonymousClass0ZE) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_sticker_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_sticker_right;
    }

    private void setDateWrapperBackground(Drawable drawable) {
        ViewGroup viewGroup = ((AbstractC51572Zg) this).A0P;
        int dimensionPixelOffset = viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.conversation_row_sticker_date_padding_horizontal);
        int paddingBottom = viewGroup.getPaddingBottom();
        int paddingTop = viewGroup.getPaddingTop();
        viewGroup.setBackgroundDrawable(drawable);
        viewGroup.setPadding(dimensionPixelOffset, paddingTop, dimensionPixelOffset, paddingBottom);
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0ZE);
        super.setFMessage(r2);
    }
}
