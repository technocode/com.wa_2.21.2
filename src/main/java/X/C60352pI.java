package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2pI  reason: invalid class name and case insensitive filesystem */
public class C60352pI extends AbstractC59162nB {
    public int A00;
    public int A01;
    public long A02;
    public C72403Ss A03;
    public Runnable A04;
    public Runnable A05;
    public boolean A06;
    public final View A07;
    public final View A08;
    public final ViewGroup A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final TextView A0C;
    public final CircularProgressBar A0D;
    public final AnonymousClass088 A0E;
    public final TextEmojiLabel A0F;
    public final AnonymousClass1PN A0G;
    public final ConversationRowVideo$RowVideoView A0H;
    public final AnonymousClass0D9 A0I;
    public final C02580Cq A0J;
    public final AbstractView$OnClickListenerC08330av A0K = new ViewOnClickCListenerShape12S0100000_I1_1(this, 23);
    public final C670036v A0L;

    public C60352pI(Context context, AnonymousClass0ZB r5) {
        super(context, r5);
        AnonymousClass088 A002;
        AnonymousClass1PN A003;
        C02580Cq r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass088.A00();
        }
        this.A0E = A002;
        if (isInEditMode()) {
            A003 = null;
        } else {
            A003 = AnonymousClass1PN.A00();
        }
        this.A0G = A003;
        this.A0J = !isInEditMode() ? C02580Cq.A01() : r1;
        this.A0L = C670036v.A00();
        this.A02 = 0;
        this.A06 = false;
        this.A0I = new C51632Zm(this);
        this.A0C = (TextView) findViewById(R.id.control_btn);
        this.A0H = (ConversationRowVideo$RowVideoView) findViewById(R.id.thumb);
        this.A0D = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A0B = (ImageView) findViewById(R.id.button_image);
        this.A07 = findViewById(R.id.control_frame);
        this.A0F = (TextEmojiLabel) findViewById(R.id.caption);
        this.A09 = (ViewGroup) findViewById(R.id.video_containter);
        this.A08 = findViewById(R.id.text_and_date);
        this.A0A = (ImageView) findViewById(R.id.gif_attribution);
        TextEmojiLabel textEmojiLabel = this.A0F;
        if (textEmojiLabel != null) {
            AnonymousClass008.A0d(textEmojiLabel);
        }
        this.A0D.setMax(100);
        this.A0D.A0B = 0;
        A09(true);
    }

    private void A09(boolean z) {
        Drawable A0N;
        int i;
        AnonymousClass0M3 fMessage = super.getFMessage();
        StringBuilder A0S = AnonymousClass008.A0S("conversation/row/gif/fillView for ");
        C007303n r6 = fMessage.A0n;
        A0S.append(r6);
        A0S.append(" is-new = ");
        A0S.append(z);
        A0S.append(" conversationRowGif=");
        A0S.append(hashCode());
        Log.d(A0S.toString());
        AnonymousClass0M4 r5 = fMessage.A02;
        if (r5 != null) {
            if (z) {
                this.A0C.setTag(Collections.singletonList(fMessage));
            }
            TextView textView = this.A0C;
            textView.setVisibility(0);
            A0p();
            if (z) {
                A0r(true);
            }
            ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView = this.A0H;
            conversationRowVideo$RowVideoView.A07 = true;
            if (AnonymousClass0FI.A0q(getFMessage())) {
                textView.setVisibility(8);
                View view = this.A07;
                CircularProgressBar circularProgressBar = this.A0D;
                AbstractC59162nB.A08(true, !z, false, view, circularProgressBar, this.A0B, textView);
                conversationRowVideo$RowVideoView.setVisibility(0);
                if (r6.A02) {
                    AbstractView$OnClickListenerC08330av r1 = ((AbstractC59162nB) this).A09;
                    conversationRowVideo$RowVideoView.setOnClickListener(r1);
                    this.A09.setOnClickListener(r1);
                } else {
                    conversationRowVideo$RowVideoView.setOnClickListener(null);
                    this.A09.setOnClickListener(null);
                }
                View.OnClickListener onClickListener = ((AbstractC59162nB) this).A06;
                textView.setOnClickListener(onClickListener);
                circularProgressBar.setOnClickListener(onClickListener);
            } else if (AnonymousClass0FI.A0r(getFMessage())) {
                View view2 = this.A07;
                CircularProgressBar circularProgressBar2 = this.A0D;
                ImageView imageView = this.A0B;
                AbstractC59162nB.A08(false, false, false, view2, circularProgressBar2, imageView, textView);
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_gif_thumb);
                textView.setVisibility(8);
                ViewGroup viewGroup = this.A09;
                viewGroup.setOnClickListener(((AbstractC59162nB) this).A09);
                AnonymousClass01X r9 = this.A0n;
                viewGroup.setContentDescription(r9.A06(R.string.view_gif_content_description));
                View.OnClickListener viewOnClickEBaseShape1S0200000_I1_0 = new ViewOnClickEBaseShape1S0200000_I1_0(this, fMessage, 32);
                textView.setOnClickListener(viewOnClickEBaseShape1S0200000_I1_0);
                conversationRowVideo$RowVideoView.setOnClickListener(viewOnClickEBaseShape1S0200000_I1_0);
                conversationRowVideo$RowVideoView.setContentDescription(r9.A06(R.string.play_gif_descr));
                AbstractC43421yL rowsContainer = getRowsContainer();
                if (rowsContainer != null && rowsContainer.APY(r6)) {
                    A0o();
                }
            } else {
                ImageView imageView2 = this.A0B;
                imageView2.setVisibility(8);
                if (!AnonymousClass0FI.A0p(getFMessage())) {
                    AnonymousClass01X r11 = this.A0n;
                    textView.setText(r11.A06(R.string.retry));
                    textView.setContentDescription(r11.A06(R.string.retry));
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
                    textView.setOnClickListener(((AbstractC59162nB) this).A08);
                    conversationRowVideo$RowVideoView.setOnClickListener(((AbstractC59162nB) this).A09);
                } else {
                    A0X(textView, Collections.singletonList(fMessage), fMessage.A01);
                    textView.setContentDescription(this.A0n.A06(R.string.button_download));
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                    View.OnClickListener onClickListener2 = this.A0K;
                    textView.setOnClickListener(onClickListener2);
                    conversationRowVideo$RowVideoView.setOnClickListener(onClickListener2);
                }
                AbstractC59162nB.A08(false, !z, false, this.A07, this.A0D, imageView2, textView);
            }
            A0O();
            View.OnLongClickListener onLongClickListener = ((AbstractC51572Zg) this).A0M;
            conversationRowVideo$RowVideoView.setOnLongClickListener(onLongClickListener);
            this.A09.setOnLongClickListener(onLongClickListener);
            if (r6.A02) {
                Context context = getContext();
                if (context != null) {
                    A0N = C28051Sr.A0O(context);
                } else {
                    throw null;
                }
            } else {
                Context context2 = getContext();
                if (context2 != null) {
                    A0N = C28051Sr.A0N(context2);
                } else {
                    throw null;
                }
            }
            conversationRowVideo$RowVideoView.A05 = A0N;
            int A002 = C02580Cq.A00(fMessage, C002301g.A0K.A09);
            if (A002 > 0) {
                this.A00 = A002;
                i = C002301g.A0K.A09;
                this.A01 = i;
            } else {
                i = C002301g.A0K.A09;
                A002 = (i * 9) >> 4;
                this.A00 = A002;
                this.A01 = i;
            }
            conversationRowVideo$RowVideoView.A00(i, A002, true);
            this.A0J.A0D(fMessage, conversationRowVideo$RowVideoView, this.A0I, false);
            if (fMessage.A00 == 0) {
                fMessage.A00 = C02230Bd.A08(r5.A0F);
            }
            AnonymousClass0M4 r0 = super.getFMessage().A02;
            if (r0 != null) {
                int i2 = r0.A05;
                if (i2 == 1) {
                    ImageView imageView3 = this.A0A;
                    imageView3.setImageResource(R.drawable.ic_attributes_giphy);
                    imageView3.setVisibility(0);
                } else if (i2 != 2) {
                    this.A0A.setVisibility(8);
                } else {
                    ImageView imageView4 = this.A0A;
                    imageView4.setImageResource(R.drawable.ic_attributes_tenor);
                    imageView4.setVisibility(0);
                }
                A0k(this.A08, this.A0F);
                StringBuilder sb = new StringBuilder("conversation/row/gif/fillView/end for ");
                sb.append(r6);
                sb.append("conversationRowGif=");
                sb.append(hashCode());
                Log.d(sb.toString());
                A0l(fMessage);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass2I2
    public boolean A0C() {
        return AnonymousClass0FI.A0N(this.A0a, super.getFMessage());
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        if (!(this instanceof C60692py)) {
            return AnonymousClass0FI.A0j(super.getFMessage());
        }
        return AnonymousClass0FI.A0j((AnonymousClass0ZB) super.getFMessage());
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
        CircularProgressBar circularProgressBar = this.A0D;
        if (A0j(circularProgressBar, super.getFMessage()) == 0) {
            A002 = C004302a.A00(getContext(), R.color.media_message_progress_indeterminate);
        } else {
            A002 = C004302a.A00(getContext(), R.color.media_message_progress_determinate);
        }
        circularProgressBar.A0C = A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f3, code lost:
        if (r0 != false) goto L_0x00f5;
     */
    @Override // X.AbstractC51572Zg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P() {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60352pI.A0P():void");
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
        Log.w("viewmessage/ no file");
        AnonymousClass0M3 fMessage = super.getFMessage();
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
            C007303n r2 = fMessage.A0n;
            intent.putExtra("jid", AnonymousClass1VY.A0D(r2.A00));
            intent.putExtra("key", r2.hashCode());
            getContext().startActivity(intent);
        }
    }

    public final void A0o() {
        AnonymousClass0M4 r0 = super.getFMessage().A02;
        if (r0 != null) {
            File file = r0.A0F;
            if (file == null || !new File(Uri.fromFile(file).getPath()).exists()) {
                A0n();
            } else if (this.A05 == null && this.A04 == null) {
                RunnableEBaseShape9S0100000_I1_4 runnableEBaseShape9S0100000_I1_4 = new RunnableEBaseShape9S0100000_I1_4(this, 1);
                this.A05 = runnableEBaseShape9S0100000_I1_4;
                ((AbstractC51572Zg) this).A0V.A02.post(runnableEBaseShape9S0100000_I1_4);
            }
        } else {
            throw null;
        }
    }

    public final void A0p() {
        Runnable runnable = this.A05;
        if (runnable != null) {
            ((AbstractC51572Zg) this).A0V.A02.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.A04;
        if (runnable2 != null) {
            ((AbstractC51572Zg) this).A0V.A02.removeCallbacks(runnable2);
        }
        this.A05 = null;
        this.A04 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A0q() {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60352pI.A0q():void");
    }

    public final void A0r(boolean z) {
        C72403Ss r2 = this.A03;
        if (r2 != null) {
            StringBuilder A0S = AnonymousClass008.A0S("conversation/row/gif/releaseGifPlayer/videoPlayerId=");
            A0S.append(r2.hashCode());
            Log.d(A0S.toString());
            C72403Ss r4 = this.A03;
            ((AnonymousClass37M) r4).A04 = null;
            r4.A0B = null;
            if (z) {
                C669936u r1 = this.A0L.A00;
                if (r1 != null) {
                    AnonymousClass00E.A01();
                    if (r1.A07.remove(r4)) {
                        List list = r1.A06;
                        list.add(r4);
                        StringBuilder sb = new StringBuilder("ExoPlayerVideoPlayerPoolManager/releaseVideoPlayerInstance videoPlayerId=");
                        sb.append(r4.hashCode());
                        sb.append(" videoPlayersReleased=");
                        sb.append(list.size());
                        Log.d(sb.toString());
                    } else {
                        StringBuilder A0S2 = AnonymousClass008.A0S("ExoPlayerVideoPlayerPoolManager/releaseVideoPlayerInstance/playerNotProvidedByPool videoPlayerId=");
                        A0S2.append(r4.hashCode());
                        Log.e(A0S2.toString());
                    }
                } else {
                    throw null;
                }
            }
            this.A03 = null;
        }
        this.A0H.setVisibility(0);
        this.A07.setVisibility(0);
    }

    @Override // X.AbstractC51572Zg
    public int getBroadcastDrawableId() {
        return TextUtils.isEmpty(super.getFMessage().A0v()) ? R.drawable.broadcast_status_icon_onmedia : R.drawable.broadcast_status_icon;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_gif_left;
    }

    @Override // X.AbstractC59162nB
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB, X.AbstractC59162nB
    public AnonymousClass0ZB getFMessage() {
        return (AnonymousClass0ZB) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_gif_left;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        int A042 = (AbstractC59162nB.A04(getContext()) * 72) / 100;
        int i = this.A00;
        int i2 = this.A01;
        return i > i2 ? (int) ((((float) A042) / ((float) i)) * ((float) i2)) : A042;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_gif_right;
    }

    @Override // X.AbstractC51572Zg
    public Drawable getStarDrawable() {
        if (TextUtils.isEmpty(super.getFMessage().A0v())) {
            return C004302a.A03(getContext(), R.drawable.message_star_media);
        }
        return super.getStarDrawable();
    }

    public void onAttachedToWindow() {
        StringBuilder A0S = AnonymousClass008.A0S("conversation/row/gif/onAttachedToWindow");
        A0S.append(super.getFMessage().A0n.A01);
        A0S.append(" conversationRowGif=");
        A0S.append(hashCode());
        Log.d(A0S.toString());
        super.onAttachedToWindow();
    }

    @Override // X.AbstractC51572Zg
    public void onDetachedFromWindow() {
        AnonymousClass0M3 fMessage = super.getFMessage();
        StringBuilder A0S = AnonymousClass008.A0S("conversation/row/gif/onDetachedFromWindow/");
        C007303n r1 = fMessage.A0n;
        A0S.append(r1.A01);
        A0S.append(" conversationRowGif=");
        A0S.append(hashCode());
        Log.d(A0S.toString());
        super.onDetachedFromWindow();
        A0p();
        A0r(true);
        AbstractC43421yL rowsContainer = getRowsContainer();
        if (rowsContainer != null) {
            rowsContainer.A3i(r1);
        }
    }

    public void onFinishTemporaryDetach() {
        StringBuilder A0S = AnonymousClass008.A0S("conversation/row/gif/onFinishTemporaryDetach");
        A0S.append(super.getFMessage().A0n.A01);
        A0S.append(" conversationRowGif=");
        A0S.append(hashCode());
        Log.d(A0S.toString());
        super.onFinishTemporaryDetach();
    }

    public void onStartTemporaryDetach() {
        AnonymousClass0MO r7 = (AnonymousClass0MO) super.getFMessage();
        StringBuilder A0S = AnonymousClass008.A0S("conversation/row/gif/onStartTemporaryDetach");
        A0S.append(r7.A0n.A01);
        A0S.append(" conversationRowGif=");
        A0S.append(hashCode());
        Log.d(A0S.toString());
        super.onStartTemporaryDetach();
        AbstractC43421yL rowsContainer = getRowsContainer();
        if (this.A03 != null) {
            long j = this.A02;
            if (j > 0 && rowsContainer != null) {
                rowsContainer.AQt(r7, System.currentTimeMillis() - j);
                this.A02 = 0;
            }
        }
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0ZB);
        super.setFMessage(r2);
    }
}
