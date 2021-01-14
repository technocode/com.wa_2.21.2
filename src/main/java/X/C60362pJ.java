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
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;

/* renamed from: X.2pJ  reason: invalid class name and case insensitive filesystem */
public class C60362pJ extends AbstractC59162nB {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final CircularProgressBar A05;
    public final TextEmojiLabel A06;
    public final AnonymousClass1PN A07;
    public final ConversationRowImage$RowImageView A08;
    public final AnonymousClass0D9 A09;
    public final C02580Cq A0A;

    public C60362pJ(Context context, AnonymousClass0MI r4) {
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
        this.A09 = new C51662Zp(this);
        this.A04 = (TextView) findViewById(R.id.control_btn);
        this.A08 = (ConversationRowImage$RowImageView) findViewById(R.id.image);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A05 = circularProgressBar;
        circularProgressBar.A0B = 0;
        this.A03 = (ImageView) findViewById(R.id.cancel_download);
        this.A01 = findViewById(R.id.control_frame);
        this.A02 = findViewById(R.id.text_and_date);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.caption);
        this.A06 = textEmojiLabel;
        if (textEmojiLabel != null) {
            AnonymousClass008.A0d(textEmojiLabel);
            this.A06.setAutoLinkMask(0);
            this.A06.setLinksClickable(false);
            this.A06.setFocusable(false);
            this.A06.setClickable(false);
            this.A06.setLongClickable(false);
        }
        A09(true);
    }

    private void A09(boolean z) {
        int i;
        ImageView.ScaleType scaleType;
        AnonymousClass0M3 fMessage = super.getFMessage();
        AnonymousClass0M4 r6 = fMessage.A02;
        if (r6 != null) {
            if (z) {
                this.A04.setTag(Collections.singletonList(fMessage));
                this.A08.setImageBitmap(null);
            }
            ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A08;
            conversationRowImage$RowImageView.A04 = r6;
            conversationRowImage$RowImageView.A06 = ((AnonymousClass2I2) this).A0K;
            C007303n r2 = fMessage.A0n;
            AnonymousClass0Q7.A0g(conversationRowImage$RowImageView, AnonymousClass008.A0K("thumb-transition-", r2.toString()));
            AnonymousClass0Q7.A0g(((AbstractC51572Zg) this).A0R, AbstractC59162nB.A05(fMessage));
            ImageView imageView = ((AbstractC51572Zg) this).A0Q;
            if (imageView != null) {
                AnonymousClass0Q7.A0g(imageView, AbstractC59162nB.A06(fMessage));
            }
            C002001d.A2j(conversationRowImage$RowImageView);
            if (AnonymousClass0FI.A0q(getFMessage())) {
                View view = this.A01;
                view.setVisibility(0);
                CircularProgressBar circularProgressBar = this.A05;
                ImageView imageView2 = this.A03;
                TextView textView = this.A04;
                AbstractC59162nB.A08(true, !z, false, view, circularProgressBar, imageView2, textView);
                conversationRowImage$RowImageView.setContentDescription(this.A0n.A06(R.string.image_transfer_in_progress));
                if (r2.A02) {
                    conversationRowImage$RowImageView.setOnClickListener(((AbstractC59162nB) this).A09);
                } else {
                    conversationRowImage$RowImageView.setOnClickListener(null);
                }
                AbstractView$OnClickListenerC08330av r0 = ((AbstractC59162nB) this).A06;
                textView.setOnClickListener(r0);
                circularProgressBar.setOnClickListener(r0);
            } else {
                boolean A0r = AnonymousClass0FI.A0r(getFMessage());
                View view2 = this.A01;
                if (A0r) {
                    view2.setVisibility(8);
                    CircularProgressBar circularProgressBar2 = this.A05;
                    ImageView imageView3 = this.A03;
                    TextView textView2 = this.A04;
                    AbstractC59162nB.A08(false, false, false, view2, circularProgressBar2, imageView3, textView2);
                    conversationRowImage$RowImageView.setContentDescription(this.A0n.A06(R.string.action_open_image));
                    AbstractView$OnClickListenerC08330av r02 = ((AbstractC59162nB) this).A09;
                    textView2.setOnClickListener(r02);
                    conversationRowImage$RowImageView.setOnClickListener(r02);
                } else {
                    view2.setVisibility(0);
                    CircularProgressBar circularProgressBar3 = this.A05;
                    ImageView imageView4 = this.A03;
                    TextView textView3 = this.A04;
                    AbstractC59162nB.A08(false, !z, false, view2, circularProgressBar3, imageView4, textView3);
                    if (!AnonymousClass0FI.A0p(getFMessage())) {
                        AnonymousClass01X r1 = this.A0n;
                        textView3.setText(r1.A06(R.string.retry));
                        textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
                        textView3.setOnClickListener(((AbstractC59162nB) this).A08);
                        conversationRowImage$RowImageView.setOnClickListener(((AbstractC59162nB) this).A09);
                        conversationRowImage$RowImageView.setContentDescription(r1.A06(R.string.action_open_image));
                    } else {
                        A0X(textView3, Collections.singletonList(fMessage), fMessage.A01);
                        textView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                        View.OnClickListener onClickListener = ((AbstractC59162nB) this).A07;
                        textView3.setOnClickListener(onClickListener);
                        conversationRowImage$RowImageView.setOnClickListener(onClickListener);
                        AnonymousClass01X r8 = this.A0n;
                        conversationRowImage$RowImageView.setContentDescription(r8.A0D(R.string.conversation_row_image_not_downloaded_content_description, textView3.getText()));
                        C002001d.A2w(r8, conversationRowImage$RowImageView, R.string.button_download);
                    }
                }
            }
            A0O();
            conversationRowImage$RowImageView.setOnLongClickListener(((AbstractC51572Zg) this).A0M);
            A0k(this.A02, this.A06);
            conversationRowImage$RowImageView.A05 = TextUtils.isEmpty(fMessage.A0v());
            conversationRowImage$RowImageView.setOutgoing(r2.A02);
            conversationRowImage$RowImageView.A07 = false;
            int i2 = r6.A08;
            if (i2 == 0 || (i = r6.A06) == 0) {
                int A002 = C02580Cq.A00(fMessage, 100);
                if (A002 > 0) {
                    conversationRowImage$RowImageView.A01 = 100;
                    conversationRowImage$RowImageView.A00 = A002;
                } else {
                    int i3 = C002301g.A0K.A09;
                    conversationRowImage$RowImageView.A01 = i3;
                    conversationRowImage$RowImageView.A00 = (i3 * 9) >> 4;
                }
                conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                conversationRowImage$RowImageView.A01 = i2;
                conversationRowImage$RowImageView.A00 = i;
                if (((AnonymousClass2I2) this).A0K || (this instanceof C60712q0)) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                } else {
                    scaleType = ImageView.ScaleType.MATRIX;
                }
                conversationRowImage$RowImageView.setScaleType(scaleType);
            }
            C02580Cq r62 = this.A0A;
            if (r62 != null) {
                if (!this.A00 || z) {
                    this.A00 = false;
                    r62.A0D(fMessage, conversationRowImage$RowImageView, this.A09, false);
                } else {
                    this.A00 = false;
                    r62.A0B(fMessage, conversationRowImage$RowImageView, this.A09, r2, false);
                }
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
        return AnonymousClass0FI.A0j(super.getFMessage());
    }

    @Override // X.AnonymousClass2I2
    public boolean A0E() {
        C000300f r1 = this.A0a;
        if (r1.A0D(AbstractC000400g.A2G) && r1.A0D(AbstractC000400g.A2A) && AnonymousClass0FI.A0r(getFMessage())) {
            boolean z = false;
            if (((AbstractC007503q) super.getFMessage()).A03 >= 127) {
                z = true;
            }
            return z && A0g();
        }
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
        A0e(false);
        A09(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0L() {
        Log.d("conversation/row/image/refreshThumbnail");
        AnonymousClass0M3 fMessage = super.getFMessage();
        this.A00 = true;
        C02580Cq r0 = this.A0A;
        if (r0 != null) {
            r0.A0B(fMessage, this.A08, this.A09, fMessage.A0n, false);
            return;
        }
        throw null;
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
        boolean z3;
        AnonymousClass03S r1 = ((AbstractC59162nB) this).A02;
        if (r1 == null || RequestPermissionActivity.A0N(getContext(), r1)) {
            AnonymousClass0M3 fMessage = super.getFMessage();
            AnonymousClass0M4 r5 = fMessage.A02;
            if (r5 != null) {
                C007303n r6 = fMessage.A0n;
                boolean z4 = r6.A02;
                if (z4 || r5.A0P) {
                    File file = r5.A0F;
                    boolean z5 = false;
                    if (file != null) {
                        z = new File(Uri.fromFile(file).getPath()).exists();
                    } else {
                        z = false;
                    }
                    StringBuilder A0S = AnonymousClass008.A0S("viewmessage/ from_me:");
                    A0S.append(z4);
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
                    if (!z) {
                        Log.w("viewmessage/ no file");
                        if (!A0m()) {
                            if (!(((AnonymousClass2I2) this).A0T instanceof C59272nN)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
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
                    C51822a5 r0 = ((AnonymousClass2I2) this).A0T;
                    if (r0 != null) {
                        if (!(r0 instanceof C59272nN)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            z5 = true;
                        }
                    }
                    AnonymousClass2UQ r12 = new AnonymousClass2UQ(getContext());
                    r12.A07 = z5;
                    AnonymousClass02N r02 = r6.A00;
                    if (r02 != null) {
                        r12.A03 = r02;
                        r12.A04 = r6;
                        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A08;
                        r12.A02 = conversationRowImage$RowImageView;
                        r12.A06 = C002001d.A0O(getContext()) instanceof Conversation;
                        AnonymousClass2UT.A03(getContext(), this.A07, r12.A00(), conversationRowImage$RowImageView, AnonymousClass008.A0K("thumb-transition-", r6.toString()));
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw null;
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

    @Override // X.AbstractC51572Zg
    public int getBroadcastDrawableId() {
        return TextUtils.isEmpty(super.getFMessage().A0v()) ? R.drawable.broadcast_status_icon_onmedia : R.drawable.broadcast_status_icon;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_image_left;
    }

    @Override // X.AbstractC59162nB
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB, X.AbstractC59162nB
    public AnonymousClass0MI getFMessage() {
        return (AnonymousClass0MI) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_image_left;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        int A042 = AbstractC59162nB.A04(getContext());
        int i = 72;
        if (((AnonymousClass2I2) this).A0K) {
            i = 100;
        }
        return (A042 * i) / 100;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_image_right;
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
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0MI);
        super.setFMessage(r2);
    }
}
