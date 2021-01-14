package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import java.io.File;

/* renamed from: X.2pS  reason: invalid class name and case insensitive filesystem */
public class C60452pS extends AbstractC59162nB {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final FrameLayout A04;
    public final ImageView A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final CircularProgressBar A09;
    public final AnonymousClass088 A0A;
    public final TextEmojiLabel A0B;
    public final AnonymousClass1PN A0C;
    public final ConversationRowVideo$RowVideoView A0D;
    public final C02560Co A0E;
    public final AnonymousClass0D9 A0F;
    public final C02580Cq A0G;
    public final AbstractView$OnClickListenerC08330av A0H;

    public C60452pS(Context context, AnonymousClass0ZC r4) {
        super(context, r4);
        AnonymousClass088 A002;
        C02560Co r0;
        AnonymousClass1PN A003;
        C02580Cq r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass088.A00();
        }
        this.A0A = A002;
        if (isInEditMode()) {
            r0 = null;
        } else {
            r0 = C02560Co.A01;
        }
        this.A0E = r0;
        if (isInEditMode()) {
            A003 = null;
        } else {
            A003 = AnonymousClass1PN.A00();
        }
        this.A0C = A003;
        this.A0G = !isInEditMode() ? C02580Cq.A01() : r1;
        this.A0F = new C51792a2(this);
        this.A0H = new ViewOnClickCListenerShape12S0100000_I1_1(this, 37);
        this.A07 = (TextView) findViewById(R.id.control_btn);
        this.A0D = (ConversationRowVideo$RowVideoView) findViewById(R.id.thumb);
        this.A09 = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A08 = (TextView) findViewById(R.id.info);
        this.A04 = (FrameLayout) findViewById(R.id.play_frame);
        this.A06 = (ImageView) findViewById(R.id.play_button);
        this.A05 = (ImageView) findViewById(R.id.cancel_btn);
        this.A03 = (FrameLayout) findViewById(R.id.invisible_press_surface);
        this.A01 = findViewById(R.id.control_frame);
        this.A02 = findViewById(R.id.text_and_date);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.caption);
        this.A0B = textEmojiLabel;
        if (textEmojiLabel != null) {
            AnonymousClass008.A0d(textEmojiLabel);
        }
        this.A09.setMax(100);
        CircularProgressBar circularProgressBar = this.A09;
        circularProgressBar.A0B = 0;
        circularProgressBar.A06 = 6.0f;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.conversation_row_video_corner_progressbar_padding);
        this.A09.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        A09(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x023b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A09(boolean r24) {
        /*
        // Method dump skipped, instructions count: 578
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60452pS.A09(boolean):void");
    }

    @Override // X.AnonymousClass2I2
    public boolean A0C() {
        return AnonymousClass0FI.A0N(this.A0a, super.getFMessage());
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        return AnonymousClass0FI.A0j(super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public int A0F(int i) {
        if (!TextUtils.isEmpty(super.getFMessage().A0v())) {
            return super.A0F(i);
        }
        if (C12080hW.A00(i, 13) >= 0) {
            return R.drawable.message_got_read_receipt_from_target_onmedia;
        }
        if (C12080hW.A00(i, 5) >= 0) {
            return R.drawable.message_got_receipt_from_target_onmedia;
        }
        if (C12080hW.A00(i, 4) == 0) {
            return R.drawable.message_got_receipt_from_server_onmedia;
        }
        return R.drawable.message_unsent_onmedia;
    }

    @Override // X.AbstractC51572Zg
    public int A0G(int i) {
        if (!TextUtils.isEmpty(super.getFMessage().A0v())) {
            return super.A0G(i);
        }
        return 0;
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A09(false);
        A0e(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0L() {
        Log.d("conversation/row/video/refreshThumbnail");
        AnonymousClass0M3 fMessage = super.getFMessage();
        this.A00 = true;
        C02580Cq r0 = this.A0G;
        if (r0 != null) {
            r0.A0B(fMessage, this.A0D, this.A0F, fMessage.A0n, false);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC51572Zg
    public void A0O() {
        int A002;
        CircularProgressBar circularProgressBar = this.A09;
        if (A0j(circularProgressBar, super.getFMessage()) == 0) {
            A002 = C004302a.A00(getContext(), R.color.media_message_progress_indeterminate);
        } else {
            A002 = C004302a.A00(getContext(), R.color.media_message_progress_determinate);
        }
        circularProgressBar.A0C = A002;
    }

    @Override // X.AbstractC51572Zg
    public void A0P() {
        boolean z;
        String str;
        AnonymousClass03S r1 = ((AbstractC59162nB) this).A02;
        if (r1 == null || RequestPermissionActivity.A0N(getContext(), r1)) {
            AnonymousClass0M3 fMessage = super.getFMessage();
            AnonymousClass0M4 r6 = fMessage.A02;
            if (r6 == null) {
                throw null;
            } else if (r6.A07 == 1) {
                ((AbstractC51572Zg) this).A0V.A04(R.string.gallery_unsafe_video_removed, 1);
            } else {
                C60602pn A002 = this.A0E.A00(r6);
                C007303n r3 = fMessage.A0n;
                boolean z2 = r3.A02;
                if (z2 || !r6.A0a || A002 == null || A002.A0h == null) {
                    boolean z3 = r6.A0P;
                    if (!z2) {
                        if (!z3) {
                            return;
                        }
                    } else if (!z3 && !r6.A0O && ((str = r6.A0H) != null || (r6.A0D >= 0 && r6.A0E > 0))) {
                        if (r6.A0D > 0 && r6.A0E > 0) {
                            ((AbstractC51572Zg) this).A0V.A04(R.string.cannot_play_video_wait_until_processed, 1);
                            return;
                        } else if (C02230Bd.A0K(this.A0A, str).exists()) {
                            ((AbstractC51572Zg) this).A0V.A04(R.string.cannot_play_video_wait_until_processed, 1);
                            return;
                        }
                    }
                    boolean z4 = false;
                    File file = r6.A0F;
                    if (file != null) {
                        z4 = new File(Uri.fromFile(file).getPath()).exists();
                    }
                    StringBuilder A0S = AnonymousClass008.A0S("viewmessage/ from_me:");
                    A0S.append(z2);
                    A0S.append(" type:");
                    A0S.append((int) fMessage.A0m);
                    A0S.append(" name:");
                    A0S.append(fMessage.A08);
                    A0S.append(" url:");
                    A0S.append(C28051Sr.A15(fMessage.A09));
                    A0S.append(" file:");
                    A0S.append(r6.A0F);
                    A0S.append(" progress:");
                    A0S.append(r6.A0C);
                    A0S.append(" transferred:");
                    A0S.append(r6.A0P);
                    A0S.append(" transferring:");
                    A0S.append(r6.A0a);
                    A0S.append(" fileSize:");
                    A0S.append(r6.A0A);
                    A0S.append(" media_size:");
                    A0S.append(fMessage.A01);
                    A0S.append(" timestamp:");
                    AnonymousClass008.A1P(A0S, fMessage.A0E);
                    if (!z4) {
                        Log.w("viewmessage/ no file");
                        if (!A0m()) {
                            if (!(((AnonymousClass2I2) this).A0T instanceof C59272nN)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                Context A0O = C002001d.A0O(getContext());
                                if (A0O instanceof ActivityC004702f) {
                                    ((AnonymousClass2I2) this).A0X.A03((ActivityC004702f) A0O);
                                    return;
                                }
                                return;
                            }
                            Intent intent = new Intent(getContext(), MediaGalleryActivity.class);
                            intent.putExtra("pos", -1);
                            intent.putExtra("alert", true);
                            intent.putExtra("jid", AnonymousClass1VY.A0D(r3.A00));
                            intent.putExtra("key", r3.hashCode());
                            getContext().startActivity(intent);
                            return;
                        }
                        return;
                    }
                    A0n();
                    return;
                }
                A0n();
            }
        }
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

    public final void A0n() {
        boolean z;
        if (!(((AnonymousClass2I2) this).A0T instanceof C59272nN)) {
            z = false;
        } else {
            z = true;
        }
        int i = 1;
        if (z) {
            i = 3;
        }
        AnonymousClass0M3 fMessage = super.getFMessage();
        AnonymousClass2UQ r2 = new AnonymousClass2UQ(getContext());
        r2.A07 = z;
        C007303n r1 = fMessage.A0n;
        AnonymousClass02N r0 = r1.A00;
        if (r0 != null) {
            r2.A03 = r0;
            r2.A04 = r1;
            r2.A01 = i;
            ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0D;
            r2.A02 = conversationRowVideo$RowVideoView;
            r2.A06 = C002001d.A0O(getContext()) instanceof Conversation;
            AnonymousClass2UT.A03(getContext(), this.A0C, r2.A00(), conversationRowVideo$RowVideoView, AnonymousClass008.A0K("thumb-transition-", r1.toString()));
            return;
        }
        throw null;
    }

    @Override // X.AbstractC51572Zg
    public int getBroadcastDrawableId() {
        return TextUtils.isEmpty(super.getFMessage().A0v()) ? R.drawable.broadcast_status_icon_onmedia : R.drawable.broadcast_status_icon;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_video_left;
    }

    @Override // X.AbstractC59162nB
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB, X.AbstractC59162nB
    public AnonymousClass0ZC getFMessage() {
        return (AnonymousClass0ZC) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_video_left;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        return (AbstractC59162nB.A04(getContext()) * 72) / 100;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_video_right;
    }

    @Override // X.AbstractC51572Zg
    public Drawable getStarDrawable() {
        if (TextUtils.isEmpty(super.getFMessage().A0v())) {
            return C004302a.A03(getContext(), R.drawable.message_star_media);
        }
        return super.getStarDrawable();
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0ZC);
        super.setFMessage(r2);
    }

    public static void setThumbnail(C60452pS r0, Drawable drawable) {
        r0.A0D.setImageDrawable(drawable);
    }
}
