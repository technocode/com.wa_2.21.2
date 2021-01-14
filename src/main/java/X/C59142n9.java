package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.WaMapView;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;

/* renamed from: X.2n9  reason: invalid class name and case insensitive filesystem */
public class C59142n9 extends AbstractC51572Zg {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final ViewGroup A08;
    public final ImageView A09;
    public final ImageView A0A;
    public final ImageView A0B;
    public final ImageView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final TextEmojiLabel A0F;
    public final TextEmojiLabel A0G;
    public final ThumbnailButton A0H;
    public final AnonymousClass0HJ A0I;
    public final AnonymousClass0YX A0J;
    public final AnonymousClass01S A0K;
    public final WaMapView A0L;

    public C59142n9(Context context, C02850Ds r4, AnonymousClass0YX r5) {
        super(context, r4);
        AnonymousClass0HJ A022;
        AnonymousClass01S r1 = null;
        if (isInEditMode()) {
            A022 = null;
        } else {
            A022 = AnonymousClass0HJ.A02();
        }
        this.A0I = A022;
        this.A0K = !isInEditMode() ? AnonymousClass01S.A00() : r1;
        this.A0J = r5;
        this.A0C = (ImageView) findViewById(R.id.thumb);
        this.A07 = findViewById(R.id.thumb_button);
        this.A0D = (TextView) findViewById(R.id.control_btn);
        this.A01 = findViewById(R.id.control_frame);
        this.A04 = findViewById(R.id.progress_bar);
        this.A0E = (TextView) findViewById(R.id.live_location_label);
        this.A02 = findViewById(R.id.live_location_label_holder);
        this.A08 = (ViewGroup) findViewById(R.id.map_frame);
        this.A0H = (ThumbnailButton) findViewById(R.id.contact_thumbnail);
        this.A00 = findViewById(R.id.contact_thumbnail_overlay);
        this.A03 = findViewById(R.id.message_info_holder);
        this.A06 = findViewById(R.id.text_and_date);
        this.A05 = findViewById(R.id.btn_divider);
        this.A0G = (TextEmojiLabel) findViewById(R.id.stop_share_btn);
        this.A0F = (TextEmojiLabel) findViewById(R.id.live_location_caption);
        this.A09 = (ImageView) findViewById(R.id.live_location_icon_1);
        this.A0A = (ImageView) findViewById(R.id.live_location_icon_2);
        this.A0B = (ImageView) findViewById(R.id.live_location_icon_3);
        this.A0L = (WaMapView) findViewById(R.id.map_holder);
        AnonymousClass008.A0d(this.A0F);
        this.A0F.setAutoLinkMask(0);
        this.A0F.setLinksClickable(false);
        this.A0F.setFocusable(false);
        this.A0F.setClickable(false);
        this.A0F.setLongClickable(false);
        A0j();
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        return AnonymousClass0FI.A0j(super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0e(false);
        A0j();
    }

    @Override // X.AbstractC51572Zg
    public void A0Y(AnonymousClass02N r4) {
        AbstractC007503q fMessage = super.getFMessage();
        if (fMessage.A0n.A02) {
            AnonymousClass01I r1 = ((AbstractC51572Zg) this).A0X;
            if (r1.A09(r4)) {
                AnonymousClass0YX r2 = this.A0J;
                r1.A04();
                AnonymousClass0HR r12 = r1.A01;
                if (r12 != null) {
                    r2.A02(r12, this.A0H);
                    return;
                }
                throw null;
            }
            return;
        }
        UserJid A082 = fMessage.A08();
        if (r4.equals(A082)) {
            this.A0J.A02(this.A0o.A02(A082), this.A0H);
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
            A0j();
        }
    }

    public final void A0j() {
        long A052;
        ImageView imageView;
        ImageView imageView2;
        View view;
        int dimensionPixelSize;
        C02850Ds r0 = (C02850Ds) super.getFMessage();
        View view2 = this.A07;
        View.OnLongClickListener onLongClickListener = ((AbstractC51572Zg) this).A0M;
        view2.setOnLongClickListener(onLongClickListener);
        TextEmojiLabel textEmojiLabel = this.A0G;
        textEmojiLabel.setOnClickListener(new C51702Zt(this, r0));
        textEmojiLabel.setOnLongClickListener(onLongClickListener);
        View view3 = this.A01;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.A06;
        if (view4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
        this.A08.setVisibility(0);
        AnonymousClass00S r02 = this.A0l;
        long A053 = r02.A05();
        AnonymousClass01S r11 = this.A0K;
        if (r11 != null) {
            boolean z = r0.A0n.A02;
            if (z) {
                A052 = r11.A06(r0);
            } else {
                A052 = r11.A05(r0);
            }
            boolean A1w = C28051Sr.A1w(r0, A052, r02);
            View view5 = this.A03;
            if (view5 != null) {
                view5.setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.media_message_thumb));
            }
            ImageView imageView3 = this.A09;
            if (A1w) {
                imageView3.setVisibility(0);
                imageView = this.A0A;
                imageView.setVisibility(0);
                imageView2 = this.A0B;
                imageView2.setVisibility(0);
            } else {
                imageView3.setVisibility(8);
                imageView = this.A0A;
                imageView.setVisibility(8);
                imageView2 = this.A0B;
                imageView2.setVisibility(8);
            }
            imageView.clearAnimation();
            imageView2.clearAnimation();
            if (A1w && A052 > A053) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(1000);
                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                alphaAnimation.setAnimationListener(new C51712Zu());
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation2.setDuration(1000);
                alphaAnimation2.setStartOffset(300);
                alphaAnimation2.setInterpolator(new DecelerateInterpolator());
                alphaAnimation2.setRepeatCount(-1);
                alphaAnimation2.setRepeatMode(2);
                imageView.startAnimation(alphaAnimation);
                imageView2.startAnimation(alphaAnimation2);
            }
            this.A02.setVisibility(0);
            Context context = getContext();
            AnonymousClass01I r13 = ((AbstractC51572Zg) this).A0X;
            C02770Dj r12 = ((AnonymousClass2I2) this).A0W;
            if (r12 != null) {
                View.OnClickListener A0U = C28051Sr.A0U(r0, A1w, context, r13, r12);
                TextView textView = this.A0E;
                Resources resources = getResources();
                if (A1w) {
                    textView.setTextColor(resources.getColor(R.color.conversation_row_date));
                    View view6 = this.A05;
                    view = view6;
                    view6.setVisibility(0);
                    textEmojiLabel.setVisibility(0);
                } else {
                    textView.setTextColor(resources.getColor(R.color.live_location_expired_text));
                    View view7 = this.A05;
                    view = view7;
                    view7.setVisibility(8);
                    textEmojiLabel.setVisibility(8);
                }
                view2.setOnClickListener(A0U);
                AnonymousClass01X r9 = this.A0n;
                textView.setText(C28051Sr.A10(r0, A1w, r02, r9, r11));
                View view8 = this.A00;
                if (view8 != null) {
                    view8.setVisibility(8);
                }
                WaMapView waMapView = this.A0L;
                if (r12 != null) {
                    waMapView.A02(r12, r0, A1w);
                    if (waMapView.getVisibility() == 0) {
                        ThumbnailButton thumbnailButton = this.A0H;
                        AnonymousClass0HJ r14 = this.A0I;
                        if (r14 != null) {
                            AnonymousClass0YX r122 = this.A0J;
                            AnonymousClass0AQ r15 = this.A0o;
                            if (z) {
                                r13.A04();
                                AnonymousClass0HR r03 = r13.A01;
                                if (r03 != null) {
                                    r122.A02(r03, thumbnailButton);
                                } else {
                                    throw null;
                                }
                            } else {
                                UserJid A082 = r0.A08();
                                if (A082 != null) {
                                    r122.A02(r15.A02(A082), thumbnailButton);
                                } else {
                                    r14.A05(thumbnailButton, R.drawable.avatar_contact);
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    if (!TextUtils.isEmpty(r0.A03)) {
                        A0b(r0.A03, this.A0F, r0, true);
                        int i = 8;
                        if (A1w) {
                            i = 0;
                        }
                        view.setVisibility(i);
                        textEmojiLabel.setPadding(getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding_top), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding));
                    } else {
                        A0b("", this.A0F, r0, true);
                        view.setVisibility(8);
                        textEmojiLabel.setPadding(getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding_top_no_comment), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding), getResources().getDimensionPixelSize(R.dimen.conversation_live_location_button_padding_bottom_no_comment));
                    }
                    if (view4 != null) {
                        if (TextUtils.isEmpty(r0.A03)) {
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.addRule(11);
                            layoutParams.addRule(8, R.id.live_location_info_holder);
                            view4.setLayoutParams(layoutParams);
                            ViewGroup viewGroup = ((AbstractC51572Zg) this).A0P;
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.conversation_live_location_label_padding_right) + viewGroup.getMeasuredWidth();
                        } else {
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams2.addRule(11);
                            layoutParams2.addRule(3, R.id.live_location_info_holder);
                            view4.setLayoutParams(layoutParams2);
                            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.conversation_live_location_label_padding_right);
                        }
                        if (r9.A0M()) {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = dimensionPixelSize;
                        } else {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = dimensionPixelSize;
                        }
                    }
                    TextView textView2 = this.A0D;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    int i2 = ((AbstractC02860Dt) r0).A02;
                    if (i2 == 1) {
                        View view9 = this.A04;
                        if (z) {
                            view9.setVisibility(0);
                            if (view3 != null) {
                                view3.setVisibility(0);
                            }
                            view2.setOnClickListener(null);
                        } else {
                            view9.setVisibility(0);
                        }
                    } else if (!z || i2 == 2 || !A1w) {
                        View view10 = this.A04;
                        if (view10 != null) {
                            view10.setVisibility(8);
                        }
                    } else {
                        View view11 = this.A04;
                        if (view11 != null) {
                            view11.setVisibility(8);
                        }
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            textView2.setText(r9.A06(R.string.retry));
                            textView2.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this));
                        }
                        if (view3 != null) {
                            view3.setVisibility(0);
                        }
                        view.setVisibility(8);
                        textEmojiLabel.setVisibility(8);
                        view2.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this));
                    }
                    if (waMapView.getVisibility() == 8) {
                        this.A1E.A09(r0, this.A0C, new C51722Zv(this));
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return getIncomingLayoutId();
    }

    @Override // X.AnonymousClass2I2
    public C02850Ds getFMessage() {
        return (C02850Ds) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_live_location_left_large;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_live_location_right_large;
    }

    @Override // X.AnonymousClass2I2
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof C02850Ds);
        super.setFMessage(r2);
    }
}
