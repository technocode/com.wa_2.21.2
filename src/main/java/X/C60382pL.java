package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
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
import java.io.File;
import java.util.Collections;

/* renamed from: X.2pL  reason: invalid class name and case insensitive filesystem */
public final class C60382pL extends AbstractC59162nB {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularProgressBar A05;
    public final TextEmojiLabel A06;
    public final AnonymousClass1PN A07;
    public final ConversationRowVideo$RowVideoView A08;
    public final AnonymousClass0D9 A09;
    public final C02580Cq A0A;

    public C60382pL(Context context, AnonymousClass0ZC r4) {
        super(context, r4);
        AnonymousClass1PN A002;
        C02580Cq r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass1PN.A00();
        }
        this.A07 = A002;
        this.A0A = !isInEditMode() ? C02580Cq.A01() : r1;
        this.A09 = new C51692Zs(this);
        this.A03 = (TextView) findViewById(R.id.control_btn);
        this.A08 = (ConversationRowVideo$RowVideoView) findViewById(R.id.thumb);
        this.A05 = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A04 = (TextView) findViewById(R.id.info);
        this.A02 = (ImageView) findViewById(R.id.button_image);
        this.A00 = findViewById(R.id.control_frame);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.caption);
        this.A06 = textEmojiLabel;
        AnonymousClass008.A0d(textEmojiLabel);
        this.A01 = findViewById(R.id.text_and_date);
        this.A05.setMax(100);
        this.A05.A0B = 0;
        A09(true);
    }

    private void A09(boolean z) {
        AnonymousClass01X r8;
        String A1Y;
        AnonymousClass0M3 fMessage = super.getFMessage();
        AnonymousClass0M4 r4 = fMessage.A02;
        if (r4 != null) {
            if (z) {
                this.A03.setTag(Collections.singletonList(fMessage));
            }
            TextView textView = this.A04;
            textView.setVisibility(8);
            ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A08;
            boolean z2 = ((AnonymousClass2I2) this).A0K;
            conversationRowVideo$RowVideoView.A07 = z2;
            conversationRowVideo$RowVideoView.A06 = z2;
            AnonymousClass0Q7.A0g(conversationRowVideo$RowVideoView, AnonymousClass008.A0K("thumb-transition-", fMessage.A0n.toString()));
            AnonymousClass0Q7.A0g(((AbstractC51572Zg) this).A0R, AbstractC59162nB.A05(fMessage));
            ImageView imageView = ((AbstractC51572Zg) this).A0Q;
            if (imageView != null) {
                AnonymousClass0Q7.A0g(imageView, AbstractC59162nB.A06(fMessage));
            }
            if (((AnonymousClass2I2) this).A0K) {
                int A002 = C02580Cq.A00(fMessage, C002301g.A0K.A09);
                int i = C002301g.A0K.A09;
                if (A002 <= 0) {
                    A002 = (i * 9) >> 4;
                }
                conversationRowVideo$RowVideoView.A00(i, A002, true);
            }
            if (AnonymousClass0FI.A0q(getFMessage())) {
                View view = this.A00;
                CircularProgressBar circularProgressBar = this.A05;
                ImageView imageView2 = this.A02;
                TextView textView2 = this.A03;
                AbstractC59162nB.A08(true, !z, false, view, circularProgressBar, imageView2, textView2);
                conversationRowVideo$RowVideoView.setVisibility(0);
                r8 = this.A0n;
                conversationRowVideo$RowVideoView.setContentDescription(r8.A06(R.string.video_transfer_in_progress));
                conversationRowVideo$RowVideoView.setOnClickListener(null);
                AbstractView$OnClickListenerC08330av r0 = ((AbstractC59162nB) this).A06;
                textView2.setOnClickListener(r0);
                circularProgressBar.setOnClickListener(r0);
            } else if (AnonymousClass0FI.A0r(getFMessage())) {
                conversationRowVideo$RowVideoView.setVisibility(0);
                View view2 = this.A00;
                CircularProgressBar circularProgressBar2 = this.A05;
                ImageView imageView3 = this.A02;
                TextView textView3 = this.A03;
                AbstractC59162nB.A08(false, false, false, view2, circularProgressBar2, imageView3, textView3);
                textView3.setVisibility(8);
                imageView3.setVisibility(0);
                imageView3.setImageResource(R.drawable.ic_video_play_conv);
                r8 = this.A0n;
                imageView3.setContentDescription(r8.A06(R.string.play_video));
                conversationRowVideo$RowVideoView.setContentDescription(r8.A0D(R.string.video_duration_seconds, C002001d.A1S(r8, fMessage.A00, 0)));
                AbstractView$OnClickListenerC08330av r02 = ((AbstractC59162nB) this).A09;
                imageView3.setOnClickListener(r02);
                textView3.setOnClickListener(r02);
                conversationRowVideo$RowVideoView.setOnClickListener(r02);
            } else {
                TextView textView4 = this.A03;
                A0X(textView4, Collections.singletonList(fMessage), fMessage.A01);
                textView4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                AbstractView$OnClickListenerC08330av r03 = ((AbstractC59162nB) this).A07;
                textView4.setOnClickListener(r03);
                conversationRowVideo$RowVideoView.setOnClickListener(r03);
                r8 = this.A0n;
                conversationRowVideo$RowVideoView.setContentDescription(r8.A06(R.string.button_download));
                textView4.setVisibility(0);
                ImageView imageView4 = this.A02;
                imageView4.setVisibility(8);
                AbstractC59162nB.A08(false, !z, false, this.A00, this.A05, imageView4, textView4);
            }
            A0O();
            conversationRowVideo$RowVideoView.setOnLongClickListener(((AbstractC51572Zg) this).A0M);
            Context context = getContext();
            if (context != null) {
                conversationRowVideo$RowVideoView.A05 = C28051Sr.A0N(context);
                this.A0A.A0D(fMessage, conversationRowVideo$RowVideoView, this.A09, false);
                int i2 = fMessage.A00;
                if (i2 == 0) {
                    i2 = C02230Bd.A08(r4.A0F);
                    fMessage.A00 = i2;
                }
                if (i2 != 0) {
                    A1Y = C002001d.A1W(r8, (long) i2);
                } else {
                    A1Y = C002001d.A1Y(r8, fMessage.A01);
                }
                textView.setText(A1Y);
                textView.setVisibility(0);
                if (r8.A0M()) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mark_video, 0, 0, 0);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new C06470Tj(r8, C004302a.A03(getContext(), R.drawable.mark_video)), (Drawable) null);
                }
                A0k(this.A01, this.A06);
                return;
            }
            throw null;
        }
        throw null;
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
    public void A0O() {
        int A002;
        CircularProgressBar circularProgressBar = this.A05;
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
        boolean z2;
        AnonymousClass03S r1 = ((AbstractC59162nB) this).A02;
        if (r1 == null || RequestPermissionActivity.A0N(getContext(), r1)) {
            AnonymousClass0M3 fMessage = super.getFMessage();
            AnonymousClass0M4 r5 = fMessage.A02;
            if (r5 == null) {
                throw null;
            } else if (r5.A0P) {
                int i = 1;
                if (r5.A07 == 1) {
                    ((AbstractC51572Zg) this).A0V.A04(R.string.gallery_unsafe_video_removed, 1);
                    return;
                }
                boolean z3 = false;
                File file = r5.A0F;
                if (file != null) {
                    z3 = new File(Uri.fromFile(file).getPath()).exists();
                }
                StringBuilder A0S = AnonymousClass008.A0S("viewmessage/ from_me:");
                C007303n r6 = fMessage.A0n;
                A0S.append(r6.A02);
                A0S.append(" type:");
                A0S.append((int) fMessage.A0m);
                A0S.append(" name:");
                A0S.append(fMessage.A08);
                A0S.append(" url:");
                A0S.append(C28051Sr.A15(fMessage.A09));
                A0S.append(" file:");
                A0S.append(r5.A0F);
                A0S.append(" progress:");
                A0S.append(r5.A0C);
                A0S.append(" transferred:");
                A0S.append(r5.A0P);
                A0S.append(" transferring:");
                A0S.append(r5.A0a);
                A0S.append(" fileSize:");
                A0S.append(r5.A0A);
                A0S.append(" media_size:");
                A0S.append(fMessage.A01);
                A0S.append(" timestamp:");
                AnonymousClass008.A1P(A0S, fMessage.A0E);
                if (!z3) {
                    Log.w("viewmessage/ no file");
                    if (!A0m()) {
                        if (!(((AnonymousClass2I2) this).A0T instanceof C59272nN)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
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
                        intent.putExtra("jid", AnonymousClass1VY.A0D(r6.A00));
                        intent.putExtra("key", r6.hashCode());
                        getContext().startActivity(intent);
                        return;
                    }
                    return;
                }
                if (!(((AnonymousClass2I2) this).A0T instanceof C59272nN)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i = 3;
                }
                AnonymousClass2UQ r12 = new AnonymousClass2UQ(getContext());
                r12.A07 = z;
                AnonymousClass02N r0 = r6.A00;
                if (r0 != null) {
                    r12.A03 = r0;
                    r12.A04 = r6;
                    r12.A01 = i;
                    ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A08;
                    r12.A02 = conversationRowVideo$RowVideoView;
                    r12.A06 = C002001d.A0O(getContext()) instanceof Conversation;
                    AnonymousClass2UT.A03(getContext(), this.A07, r12.A00(), conversationRowVideo$RowVideoView, AnonymousClass008.A0K("thumb-transition-", r6.toString()));
                    return;
                }
                throw null;
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

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_legacy_video_left;
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB, X.AbstractC59162nB
    public AnonymousClass0ZC getFMessage() {
        return (AnonymousClass0ZC) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_legacy_video_left;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        return (AbstractC59162nB.A04(getContext()) * 72) / 100;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        throw new IllegalStateException("this row type does not support outgoing messages");
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
}
