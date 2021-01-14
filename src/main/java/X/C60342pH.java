package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.2pH  reason: invalid class name and case insensitive filesystem */
public class C60342pH extends AbstractC59162nB {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final CircularProgressBar A0A;
    public final TextEmojiLabel A0B;
    public final WaImageView A0C;
    public final AnonymousClass0D9 A0D = new C51622Zl(this);
    public final C02580Cq A0E;

    public C60342pH(Context context, AnonymousClass0M2 r4) {
        super(context, r4);
        C02580Cq A012;
        if (isInEditMode()) {
            A012 = null;
        } else {
            A012 = C02580Cq.A01();
        }
        this.A0E = A012;
        this.A05 = (ImageView) findViewById(R.id.icon);
        this.A0C = (WaImageView) findViewById(R.id.control_btn);
        this.A03 = findViewById(R.id.control_btn_holder);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progressbar);
        this.A0A = circularProgressBar;
        circularProgressBar.setMax(100);
        this.A0A.A0C = C004302a.A00(context, R.color.media_message_progress_determinate);
        this.A0A.A0B = 536870912;
        this.A0B = (TextEmojiLabel) findViewById(R.id.title);
        this.A02 = findViewById(R.id.content);
        this.A09 = (TextView) findViewById(R.id.info);
        this.A01 = findViewById(R.id.bullet_info);
        this.A07 = (TextView) findViewById(R.id.file_size);
        this.A00 = findViewById(R.id.bullet_file_size);
        this.A08 = (TextView) findViewById(R.id.file_type);
        this.A06 = (ImageView) findViewById(R.id.preview);
        this.A04 = findViewById(R.id.preview_separator);
        A0n();
    }

    @Override // X.AnonymousClass2I2
    public boolean A0C() {
        return AnonymousClass0FI.A0N(this.A0a, super.getFMessage());
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        if (!(this instanceof C60682px)) {
            return AnonymousClass0FI.A0j(super.getFMessage());
        }
        return AnonymousClass0FI.A0j((AnonymousClass0M2) super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0n();
        A0e(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0L() {
        Log.d("ConversationRowDocument/refreshThumbnail");
        if (super.getFMessage().A0B().A05()) {
            C02580Cq r4 = this.A0E;
            if (r4 != null) {
                r4.A0D(super.getFMessage(), this.A06, this.A0D, false);
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC51572Zg
    public void A0O() {
        A0j(this.A0A, super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public void A0P() {
        Activity A002 = C02780Dk.A00(getContext());
        if (A002 instanceof ActivityC004702f) {
            AnonymousClass0M2 r0 = (AnonymousClass0M2) super.getFMessage();
            C04370Kc r1 = ((AnonymousClass2I2) this).A0X;
            if (r1 != null) {
                AnonymousClass02M r2 = ((AbstractC51572Zg) this).A0V;
                if (r2 != null) {
                    AnonymousClass009 r3 = ((AbstractC51572Zg) this).A0U;
                    if (r3 != null) {
                        AnonymousClass00T r4 = this.A1F;
                        if (r4 != null) {
                            C000300f r5 = this.A0a;
                            if (r5 != null) {
                                C02780Dk r6 = ((AbstractC51572Zg) this).A0S;
                                if (r6 != null) {
                                    AnonymousClass0BW r7 = this.A0y;
                                    if (r7 != null) {
                                        ActivityC004702f r8 = (ActivityC004702f) A002;
                                        AnonymousClass03S r9 = ((AbstractC59162nB) this).A02;
                                        if (r9 == null) {
                                            throw null;
                                        } else if (C28051Sr.A09(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9) == 2) {
                                            A0m();
                                        }
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
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
            A0n();
        }
    }

    public final void A0n() {
        CharSequence A062;
        View view;
        AnonymousClass0M2 r2 = (AnonymousClass0M2) super.getFMessage();
        AnonymousClass0M4 r7 = ((AnonymousClass0M3) r2).A02;
        if (r7 != null) {
            this.A05.setImageDrawable(AnonymousClass0ZD.A03(getContext(), r2));
            TextEmojiLabel textEmojiLabel = this.A0B;
            if (!TextUtils.isEmpty(r2.A0w())) {
                A062 = A0I(r2.A0w());
            } else {
                A062 = this.A0n.A06(R.string.untitled_document);
            }
            textEmojiLabel.setText(A062);
            if (r2.A0B().A05()) {
                this.A0E.A0D(r2, this.A06, this.A0D, false);
            } else {
                ImageView imageView = this.A06;
                imageView.setTag(null);
                imageView.setVisibility(8);
                this.A04.setVisibility(8);
            }
            boolean z = true;
            if (AnonymousClass0FI.A0q(getFMessage())) {
                this.A03.setVisibility(0);
                WaImageView waImageView = this.A0C;
                waImageView.setImageResource(R.drawable.inline_audio_cancel);
                waImageView.setOnClickListener(((AbstractC59162nB) this).A06);
                C002001d.A2w(this.A0n, waImageView, R.string.cancel);
                boolean z2 = r2.A0n.A02;
                Context context = getContext();
                if (z2) {
                    waImageView.setContentDescription(context.getString(R.string.tb_button_uploading));
                    view = this.A02;
                    view.setOnClickListener(((AbstractC59162nB) this).A09);
                } else {
                    waImageView.setContentDescription(context.getString(R.string.tb_button_downloading));
                    view = this.A02;
                    view.setOnClickListener(null);
                }
            } else if (AnonymousClass0FI.A0r(getFMessage())) {
                C002001d.A2j(this.A0C);
                this.A03.setVisibility(8);
                view = this.A02;
                view.setOnClickListener(((AbstractC59162nB) this).A09);
                z = false;
            } else {
                WaImageView waImageView2 = this.A0C;
                C002001d.A2j(waImageView2);
                this.A03.setVisibility(0);
                if (!r2.A0n.A02 || r7.A0F == null) {
                    waImageView2.setImageResource(R.drawable.inline_audio_download);
                    waImageView2.setContentDescription(this.A0n.A06(R.string.button_download));
                    AbstractView$OnClickListenerC08330av r0 = ((AbstractC59162nB) this).A07;
                    waImageView2.setOnClickListener(r0);
                    view = this.A02;
                    view.setOnClickListener(r0);
                } else {
                    waImageView2.setImageResource(R.drawable.inline_audio_upload);
                    waImageView2.setContentDescription(this.A0n.A06(R.string.retry));
                    waImageView2.setOnClickListener(((AbstractC59162nB) this).A08);
                    view = this.A02;
                    view.setOnClickListener(((AbstractC59162nB) this).A09);
                }
            }
            A0O();
            TextView textView = this.A07;
            if (z) {
                textView.setVisibility(0);
                this.A00.setVisibility(0);
                textView.setText(C002001d.A1Y(this.A0n, ((AnonymousClass0M3) r2).A01));
            } else {
                textView.setVisibility(8);
                this.A00.setVisibility(8);
            }
            if (r2.A00 != 0) {
                TextView textView2 = this.A09;
                textView2.setVisibility(0);
                this.A01.setVisibility(0);
                textView2.setText(AnonymousClass0ZD.A06(this.A0n, ((AnonymousClass0M3) r2).A07, r2.A00));
            } else {
                this.A09.setVisibility(8);
                this.A01.setVisibility(8);
            }
            CharSequence upperCase = C02220Bc.A01(((AnonymousClass0M3) r2).A07).toUpperCase(Locale.US);
            if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(r2.A0w())) {
                upperCase = C006803i.A0K(r2.A0w()).toUpperCase(Locale.US);
            }
            this.A08.setText(A0I(upperCase));
            view.setOnLongClickListener(((AbstractC51572Zg) this).A0M);
            view.setOnTouchListener(((AbstractC51572Zg) this).A0N);
            A0l(r2);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_document_left;
    }

    @Override // X.AbstractC59162nB
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB, X.AbstractC59162nB
    public AnonymousClass0M2 getFMessage() {
        return (AnonymousClass0M2) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_document_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_document_right;
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0M2);
        super.setFMessage(r2);
    }
}
