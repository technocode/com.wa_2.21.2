package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.Html;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

/* renamed from: X.0dC  reason: invalid class name and case insensitive filesystem */
public class C09590dC extends FrameLayout {
    public static final AnonymousClass00S A0L = AnonymousClass00S.A00();
    public static final AnonymousClass00D A0M = AnonymousClass00D.A00();
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public String A04;
    public int[] A05 = {12, 3, 11, 13};
    public final C02780Dk A06;
    public final AnonymousClass01I A07 = AnonymousClass01I.A00();
    public final C000300f A08;
    public final C017009c A09;
    public final C09600dD A0A;
    public final AnonymousClass0HJ A0B;
    public final AnonymousClass00C A0C;
    public final AnonymousClass01X A0D;
    public final AnonymousClass01Q A0E;
    public final C002701k A0F = C002701k.A00();
    public final AnonymousClass00Y A0G;
    public final C71403Ov A0H;
    public final C09070cF A0I;
    public final AnonymousClass0HG A0J;
    public final AnonymousClass0HE A0K;

    public C09590dC(Context context) {
        super(context, null, 0);
        if (C71403Ov.A00 == null) {
            synchronized (C71403Ov.class) {
                if (C71403Ov.A00 == null) {
                    C71403Ov.A00 = new C71403Ov();
                }
            }
        }
        this.A0H = C71403Ov.A00;
        this.A0G = AnonymousClass00Y.A00();
        this.A08 = C000300f.A00();
        this.A06 = C02780Dk.A02();
        this.A0B = AnonymousClass0HJ.A02();
        this.A0D = AnonymousClass01X.A00();
        this.A0J = AnonymousClass0HG.A00();
        this.A0C = AnonymousClass00C.A00();
        this.A0K = AnonymousClass0HE.A00();
        this.A0E = AnonymousClass01Q.A00();
        this.A09 = C017009c.A00();
        this.A0I = C09070cF.A00();
        AnonymousClass00Y r1 = this.A0G;
        AnonymousClass00D r2 = A0M;
        this.A0A = new C09600dD(r1, r2);
        AnonymousClass0Q7.A0d(this, new C07910a5());
        if (this.A02 == null && C28051Sr.A1q(this.A08, this.A0C, r2)) {
            addView(getStorageBanner());
        }
    }

    public static boolean A00() {
        AnonymousClass00D r7 = A0M;
        if (r7.A00.getInt("education_banner_count", 0) < 3) {
            return true;
        }
        if (!r7.A0n(((long) 7) * 86400000, "education_banner_timestamp")) {
            return false;
        }
        AnonymousClass008.A0k(r7, "education_banner_count", 0);
        return true;
    }

    public void A01() {
        AnonymousClass00Y r0 = this.A0G;
        AnonymousClass204 r1 = new AnonymousClass204();
        r0.A09(r1, 1);
        AnonymousClass00Y.A01(r1, "");
        A03(3);
        AnonymousClass00D r2 = A0M;
        AnonymousClass008.A0k(r2, "education_banner_count", 3);
        getGenericBanner().setVisibility(8);
        SharedPreferences sharedPreferences = r2.A00;
        sharedPreferences.edit().putInt("create_group_tip_count", sharedPreferences.getInt("create_group_tip_count", 0) + 1).putLong("create_group_tip_time", A0L.A05()).apply();
    }

    public void A02() {
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.A02;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.A03;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.A00;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        int bannerType = getBannerType();
        if (bannerType == 12) {
            if (this.A03 == null) {
                addView(getUserNoticeBanner());
                this.A0J.A01(1);
            }
            View userNoticeBanner = getUserNoticeBanner();
            AnonymousClass3S1 A012 = this.A0K.A01();
            if (A012 != null) {
                ((TextView) userNoticeBanner.findViewById(R.id.user_notice_banner_text)).setText(C28051Sr.A0Q(getContext(), A012.A04, true, null));
                ((AnonymousClass3c7) userNoticeBanner.findViewById(R.id.user_notice_banner_icon)).A03(A012);
                String str = A012.A01;
                userNoticeBanner.setOnClickListener(new C40001sS(this, C28051Sr.A13(str), C28051Sr.A1C(str), userNoticeBanner));
                Log.i("EducationBannerView/updateUserNoticeBanner/banner shown");
                userNoticeBanner.setVisibility(0);
                return;
            }
            throw null;
        } else if (bannerType == 0) {
        } else {
            if (bannerType == 3) {
                if (this.A01 == null) {
                    addView(getGenericBanner());
                }
                View genericBanner = getGenericBanner();
                setBackgroundResource(R.color.education_banner);
                TextView textView = (TextView) genericBanner.findViewById(R.id.banner_title);
                textView.setVisibility(0);
                TextView textView2 = (TextView) genericBanner.findViewById(R.id.banner_description);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                this.A0B.A05((ImageView) genericBanner.findViewById(R.id.banner_image), R.drawable.new_group_banner);
                AnonymousClass01X r1 = this.A0D;
                textView.setText(r1.A06(R.string.start_group_chat));
                textView2.setText(r1.A06(R.string.start_group_chat_explanation));
                setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 14));
                genericBanner.findViewById(R.id.cancel).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 16));
                A03(1);
                AnonymousClass00D r3 = A0M;
                if (r3.A0n(86400000, "education_banner_timestamp")) {
                    AnonymousClass008.A0k(r3, "education_banner_count", r3.A00.getInt("education_banner_count", 0) + 1);
                    r3.A0B("education_banner_timestamp");
                }
                getGenericBanner().setVisibility(0);
            } else if (bannerType == 11) {
                getStorageBanner().setVisibility(0);
                setBackgroundResource(R.color.storage_usage_banner_almost_full_background_color);
                if (this.A04 == null) {
                    this.A04 = C28051Sr.A0o(3, this.A0G);
                }
            } else if (bannerType == 13) {
                C09600dD r6 = this.A0A;
                if (r6.A01(this.A08, getContext()) && this.A00 == null) {
                    addView(getBizAppUpsellBanner());
                }
                View bizAppUpsellBanner = getBizAppUpsellBanner();
                ((TextEmojiLabel) bizAppUpsellBanner.findViewById(R.id.smb_upsell_chat_banner_description)).A02(Spannable.Factory.getInstance().newSpannable(Html.fromHtml(this.A0D.A06(R.string.smb_upsell_chat_banner_description))));
                setBackgroundResource(R.color.chat_banner_background);
                setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 17));
                bizAppUpsellBanner.findViewById(R.id.close).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 15));
                bizAppUpsellBanner.setVisibility(0);
                r6.A00(1);
            } else {
                throw new IllegalStateException(AnonymousClass008.A0F("Unhandled banner type: ", bannerType));
            }
        }
    }

    public final void A03(int i) {
        C44051zQ r2 = new C44051zQ();
        r2.A00 = Integer.valueOf(i);
        r2.A01 = 1;
        this.A0G.A09(r2, 1);
        AnonymousClass00Y.A01(r2, "");
    }

    public boolean A04() {
        if (this.A0K.A01() != null) {
            return true;
        }
        if (A00() && getBannerType() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x000f, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getBannerType() {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09590dC.getBannerType():int");
    }

    private View getBizAppUpsellBanner() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.coversations_biz_app_upsell_chat_banner, (ViewGroup) null, false);
        this.A00 = inflate;
        return inflate;
    }

    private View getGenericBanner() {
        if (this.A01 == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.education_banner_row, (ViewGroup) null, false);
            this.A01 = inflate;
            inflate.findViewById(R.id.banner_image);
            C002301g.A03((TextView) this.A01.findViewById(R.id.banner_title));
            this.A01.setBackgroundResource(R.drawable.selector_orange_gradient);
        }
        return this.A01;
    }

    private View getStorageBanner() {
        if (this.A02 == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.storage_usage_banner, (ViewGroup) null, false);
            this.A02 = inflate;
            inflate.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 18));
            AnonymousClass0Q7.A0D(this.A02, R.id.storage_usage_full_close_container).setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 13));
        }
        return this.A02;
    }

    private View getUserNoticeBanner() {
        View view = this.A03;
        if (view != null) {
            return view;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.conversations_user_notice_banner, (ViewGroup) null, false);
        this.A03 = inflate;
        return inflate;
    }
}
