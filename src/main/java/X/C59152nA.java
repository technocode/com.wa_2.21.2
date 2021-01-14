package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.location.WaMapView;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import com.whatsapp.util.ViewOnClickCListenerShape2S1100000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2nA  reason: invalid class name and case insensitive filesystem */
public class C59152nA extends AbstractC51572Zg {
    public static final Set A0D;
    public AnonymousClass2IP A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextEmojiLabel A0A;
    public final WaMapView A0B;
    public final C02580Cq A0C;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("www.facebook.com");
        hashSet.add("maps.google.com");
        hashSet.add("foursquare.com");
        A0D = Collections.unmodifiableSet(hashSet);
    }

    public C59152nA(Context context, C05470Or r4) {
        super(context, r4);
        C02580Cq A012;
        if (isInEditMode()) {
            A012 = null;
        } else {
            A012 = C02580Cq.A01();
        }
        this.A0C = A012;
        this.A06 = (ImageView) findViewById(R.id.thumb);
        this.A05 = findViewById(R.id.thumb_button);
        this.A07 = (TextView) findViewById(R.id.control_btn);
        this.A02 = findViewById(R.id.control_frame);
        this.A04 = findViewById(R.id.progress_bar);
        this.A0B = (WaMapView) findViewById(R.id.map_holder);
        this.A0A = (TextEmojiLabel) findViewById(R.id.place_name);
        this.A09 = (TextView) findViewById(R.id.place_address);
        this.A08 = (TextView) findViewById(R.id.host_view);
        this.A03 = findViewById(R.id.message_info_holder);
        TextEmojiLabel textEmojiLabel = this.A0A;
        if (textEmojiLabel != null) {
            AnonymousClass008.A0d(textEmojiLabel);
            this.A0A.setAutoLinkMask(0);
            this.A0A.setLinksClickable(false);
            this.A0A.setFocusable(false);
            this.A0A.setClickable(false);
            this.A0A.setLongClickable(false);
        }
        A0j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1.A02 == 2) goto L_0x0012;
     */
    @Override // X.AnonymousClass2I2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C() {
        /*
            r3 = this;
            X.03q r1 = super.getFMessage()
            X.0Dt r1 = (X.AbstractC02860Dt) r1
            X.03n r0 = r1.A0n
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0012
            int r2 = r1.A02
            r1 = 2
            r0 = 1
            if (r2 != r1) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59152nA.A0C():boolean");
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        return AnonymousClass0FI.A0j(super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0j();
        A0e(false);
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
        TextView textView;
        C05470Or r9 = (C05470Or) super.getFMessage();
        if (!(((AbstractC02860Dt) r9).A01 == 0.0d && ((AbstractC02860Dt) r9).A00 == 0.0d)) {
            View view = this.A05;
            view.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r9, 20));
            view.setOnLongClickListener(((AbstractC51572Zg) this).A0M);
        }
        WaMapView waMapView = this.A0B;
        C02770Dj r5 = ((AnonymousClass2I2) this).A0W;
        if (r5 == null) {
            throw null;
        } else if (waMapView != null) {
            LatLng latLng = new LatLng(((AbstractC02860Dt) r9).A00, ((AbstractC02860Dt) r9).A01);
            waMapView.A01(r5, latLng, null);
            waMapView.A00(latLng);
            View view2 = this.A02;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.A03;
            if (view3 != null) {
                String str = r9.A01;
                CharSequence charSequence = r9.A00;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(charSequence)) {
                    String A0w = r9.A0w();
                    if (!TextUtils.isEmpty(str)) {
                        TextEmojiLabel textEmojiLabel = this.A0A;
                        textEmojiLabel.setVisibility(0);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                        C05690Pr r0 = new C05690Pr(getContext(), ((AbstractC51572Zg) this).A0V, this.A0k, ((AbstractC51572Zg) this).A0W, A0w);
                        if (str != null) {
                            spannableStringBuilder.setSpan(r0, 0, str.length(), 18);
                            textEmojiLabel.setText(A0I(spannableStringBuilder), TextView.BufferType.SPANNABLE);
                        } else {
                            throw null;
                        }
                    } else {
                        this.A0A.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        textView = this.A09;
                        textView.setText(A0I(charSequence));
                        textView.setVisibility(0);
                    } else {
                        textView = this.A09;
                        textView.setVisibility(8);
                    }
                    textView.setOnClickListener(new ViewOnClickCListenerShape2S1100000_I1(this, A0w, 0));
                    String host = Uri.parse(A0w).getHost();
                    if (TextUtils.isEmpty(host) || A0D.contains(host)) {
                        this.A08.setVisibility(8);
                    } else {
                        TextView textView2 = this.A08;
                        textView2.setText(host);
                        textView2.setVisibility(0);
                    }
                } else {
                    this.A0A.setVisibility(8);
                    this.A09.setVisibility(8);
                    this.A08.setVisibility(8);
                }
                view3.setVisibility(0);
            }
            TextView textView3 = this.A07;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            if (((AbstractC02860Dt) r9).A02 == 1) {
                View view4 = this.A04;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                if (r9.A0n.A02) {
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    this.A05.setOnClickListener(null);
                }
            } else {
                AbstractC02860Dt r1 = (AbstractC02860Dt) super.getFMessage();
                if (!r1.A0n.A02 || r1.A02 == 2) {
                    View view5 = this.A04;
                    if (view5 != null) {
                        view5.setVisibility(8);
                    }
                } else {
                    View view6 = this.A04;
                    if (view6 != null) {
                        view6.setVisibility(8);
                    }
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                        textView3.setText(this.A0n.A06(R.string.retry));
                        textView3.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this));
                    }
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    this.A05.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this));
                }
            }
            C51732Zw r2 = new C51732Zw(this);
            if (waMapView.getVisibility() == 0) {
                C02580Cq r12 = this.A0C;
                if (r12 != null) {
                    r12.A0D(r9, this.A06, r2, false);
                } else {
                    throw null;
                }
            } else {
                C02580Cq r13 = this.A0C;
                if (r13 != null) {
                    r13.A09(r9, this.A06, r2);
                } else {
                    throw null;
                }
            }
            if (r9.A0H != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.web_page_preview_holder);
                if (viewGroup != null) {
                    C64192xm A002 = C64192xm.A00(r9);
                    viewGroup.setVisibility(0);
                    if (this.A00 == null) {
                        AnonymousClass2IP r02 = new AnonymousClass2IP(getContext(), A0H());
                        this.A00 = r02;
                        viewGroup.addView(r02.A0A, -1, -2);
                        this.A00.A0A.setOnLongClickListener(((AbstractC51572Zg) this).A0M);
                    }
                    boolean A0i = A0i(A002.A03);
                    this.A01 = A0i;
                    this.A00.A01(r9, A0i, this, A002);
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.web_page_preview_holder);
            if (viewGroup2 != null) {
                AnonymousClass2IP r03 = this.A00;
                if (r03 != null) {
                    viewGroup2.removeView(r03.A0A);
                    this.A00 = null;
                }
                viewGroup2.setVisibility(8);
            }
        } else {
            throw null;
        }
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return getIncomingLayoutId();
    }

    @Override // X.AnonymousClass2I2
    public C05470Or getFMessage() {
        return (C05470Or) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_location_left_large;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        if (this.A01) {
            return (AbstractC59162nB.A04(getContext()) * 72) / 100;
        }
        return super.getMainChildMaxWidth();
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_location_right_large;
    }

    @Override // X.AnonymousClass2I2
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AbstractC02860Dt);
        super.setFMessage(r2);
    }
}
