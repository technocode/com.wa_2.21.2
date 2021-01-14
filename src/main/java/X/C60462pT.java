package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.CircularDownloadProgressView;
import com.whatsapp.search.views.MessageThumbView;
import com.whatsapp.util.Log;

/* renamed from: X.2pT  reason: invalid class name and case insensitive filesystem */
public class C60462pT extends AbstractC59162nB {
    public boolean A00;
    public final View A01;
    public final Group A02;
    public final TextEmojiLabel A03;
    public final C04360Kb A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final AnonymousClass1PN A08;
    public final CircularDownloadProgressView A09;
    public final MessageThumbView A0A;

    public C60462pT(Context context, AnonymousClass0M3 r6) {
        super(context, r6);
        AnonymousClass1PN A002;
        C04360Kb r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass1PN.A00();
        }
        this.A08 = A002;
        this.A04 = !isInEditMode() ? C04360Kb.A00() : r1;
        this.A0A = (MessageThumbView) AnonymousClass0Q7.A0D(this, R.id.view_once_thumb);
        this.A05 = (WaTextView) AnonymousClass0Q7.A0D(this, R.id.view_once_file_size);
        this.A02 = (Group) AnonymousClass0Q7.A0D(this, R.id.download_group);
        this.A06 = (WaTextView) AnonymousClass0Q7.A0D(this, R.id.view_once_media_type);
        this.A01 = AnonymousClass0Q7.A0D(this, R.id.media_container);
        this.A03 = (TextEmojiLabel) AnonymousClass0Q7.A0D(this, R.id.expired_text);
        this.A09 = (CircularDownloadProgressView) AnonymousClass0Q7.A0D(this, R.id.view_once_download);
        this.A07 = (WaTextView) AnonymousClass0Q7.A0D(this, R.id.view_once_tap);
        CircularDownloadProgressView circularDownloadProgressView = this.A09;
        AbstractView$OnClickListenerC08330av r12 = ((AbstractC59162nB) this).A06;
        AbstractView$OnClickListenerC08330av r3 = ((AbstractC59162nB) this).A07;
        AbstractView$OnClickListenerC08330av r0 = ((AbstractC59162nB) this).A08;
        circularDownloadProgressView.A01 = r12;
        circularDownloadProgressView.A02 = r3;
        circularDownloadProgressView.A03 = r0;
        MessageThumbView messageThumbView = this.A0A;
        AbstractView$OnClickListenerC08330av r13 = ((AbstractC59162nB) this).A09;
        View.OnLongClickListener onLongClickListener = ((AbstractC51572Zg) this).A0M;
        messageThumbView.A02 = r13;
        messageThumbView.A01 = r3;
        messageThumbView.setOnLongClickListener(onLongClickListener);
        A09(this, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f2, code lost:
        if (r5 == 2) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(X.C60462pT r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 348
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60462pT.A09(X.2pT, boolean):void");
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0e(false);
        A09(this, false);
    }

    @Override // X.AbstractC51572Zg
    public void A0P() {
        AnonymousClass1PN r6;
        int i;
        String str;
        C04370Kc r2 = ((AnonymousClass2I2) this).A0X;
        if (r2 != null && (r6 = this.A08) != null && this.A04 != null) {
            AnonymousClass03S r1 = ((AbstractC59162nB) this).A02;
            if (r1 == null || RequestPermissionActivity.A0N(getContext(), r1)) {
                AnonymousClass0M3 fMessage = getFMessage();
                if (!fMessage.A10()) {
                    Log.w("conversation/row/viewOnce/no file");
                    if (!A0m()) {
                        Context A0O = C002001d.A0O(getContext());
                        if (A0O instanceof ActivityC004702f) {
                            r2.A03((ActivityC004702f) A0O);
                            return;
                        }
                        return;
                    }
                    return;
                }
                AnonymousClass2UQ r12 = new AnonymousClass2UQ(getContext());
                r12.A07 = true;
                C007303n r22 = fMessage.A0n;
                AnonymousClass02N r0 = r22.A00;
                if (r0 != null) {
                    r12.A03 = r0;
                    r12.A04 = r22;
                    MessageThumbView messageThumbView = this.A0A;
                    r12.A02 = messageThumbView;
                    r12.A00 = 3;
                    Intent A002 = r12.A00();
                    if (this.A0a.A0D(AbstractC000400g.A2c)) {
                        str = AnonymousClass008.A0K("thumb-transition-", r22.toString());
                        i = 0;
                    } else {
                        i = 440;
                        str = "";
                    }
                    AnonymousClass2UT.A03(getContext(), r6, A002, messageThumbView, str);
                    messageThumbView.postDelayed(new RunnableEBaseShape7S0200000_I1_2(this, fMessage, 19), (long) i);
                    return;
                }
                throw null;
            }
        }
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r4, boolean z) {
        boolean z2 = false;
        if (r4 != getFMessage()) {
            z2 = true;
            this.A00 = false;
        }
        super.A0Z(r4, z);
        if (z || z2) {
            A09(this, z2);
        }
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_view_once_media_left;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_view_once_media_left;
    }

    private int getMediaTypeExpiredString() {
        if (getFMessage() instanceof AnonymousClass0MK) {
            return R.string.view_once_expired_video;
        }
        return R.string.view_once_expired_photo;
    }

    private int getMediaTypeString() {
        if (getFMessage() instanceof AnonymousClass0MK) {
            return R.string.conversations_most_recent_video;
        }
        return R.string.conversations_most_recent_image;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_view_once_media_right;
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0M3);
        super.setFMessage(r2);
    }
}
